package myProject.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import myJdbcUtil.myJdbcUtil;

/*
create table admin(
ID varchar2(10) not null,
PW varchar2(20) not null
);
insert into admin values ('admin', 'admin123');
 */
/*
create table if not exists members(
no number not null primary key auto_increment,
name varchar2(10) not null,
phone varchar2(11),
favorite varchar2(50),
mileage number,
grade varchar2(10) not null
);
insert into members(name, phone, favorite, mileage, grade) values ('김준완', 01012345678, '빵', 50125, 'VIP'), ('이익준', 01012345678, '아메리카노 차가운거', 1245,'GOLD'), ('채송화', 01012345678, '아메리카노', 9900, 'VIP');
insert into members(name, phone, mileage, grade) values ('안정원', 01012345678, 200, 'SILVER'), ('양석형', 01012345678, 2400, 'SILVER');
 */

public class DAO {
	public File logInfoFile = new File("logInfo.json");
	public File menuFile = new File("menu.xlsx");
	public File cartFile = new File("cart.xlsx");
	
	public Calendar cal = Calendar.getInstance();
	
	public Connection con;
	public Statement stm;
	public PreparedStatement pst;
	public ResultSet rst;
	
	String sql_admin_selectAll = "SELECT * FROM ADMIN";
	String sql_members_selectAll = "SELECT * FROM MEMBERS";
	String sql_members_insert = "INSERT INTO MEMBERS(NAME,PHONE,FAVORITE,MILEAGE,GRADE) VALUES (?,?,?,?,?)";
	String sql_members_select = "SELECT * FROM MEMBERS WHERE NO=?";
	String sql_members_update =  "UPDATE MEMBERS SET NAME=?, PHONE=?, FAVORITE=?, MILEAGE=?, GRADE=? WHERE NO=?";
	String sql_members_delete = "DELETE FROM MEMBERS WHERE NO=?";
	String sql_members_after = "SET @COUNT = 0; UPDATE MEMBERS SET NO = @COUNT:=@COUNT+1;";
	String sql_members_search = "SELECT * FROM MEMBERS WHERE NAME LIKE ?";
	
	public Object[] colArr = { "No", "Name", "Phone", "Favorite", "Mileage", "Grade" };
	
	public int numberCount = 0;
	public int todayOrder = 0;
	
	private DAO(){}
	private static DAO instance;
	public static DAO getInstance(){
		if(instance == null)	instance = new DAO();
		return instance;
	}
	
	//JDBC를 활용하여 고객정보 불러오기
	public Vector<Vector> membersSelectAll(){
		con = myJdbcUtil.getConnection(); 
		Vector<Vector> memberList = null;
		try {
			stm = con.createStatement();
			rst = stm.executeQuery(sql_members_selectAll);
			memberList = new Vector<Vector>();
			numberCount = 0;
			while(rst.next()) {
				Vector member = new Vector();
				for(int i=0; i < colArr.length; i++) {
					member.add(rst.getString((String)colArr[i]));
				}
				memberList.add(member);
				numberCount++;
			}
			return memberList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stm != null)
				try { stm.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(rst != null)
				try { rst.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(con != null)
				try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		return memberList;
	}
	
	//membersSelectAll 메소드에서 작업한 내용으로 회원수 반환
	public int memberCount() {
		return numberCount+1;
	}

	//JDBC를 활용하여 고객정보 입력하기
	public void membersInsert(Member newMem) {
		con = myJdbcUtil.getConnection(); 
		try {
			pst = con.prepareStatement(sql_members_insert);
			pst.setString(1, newMem.getName());
			pst.setString(2, newMem.getPhone());
			pst.setString(3, newMem.getFavorite());
			pst.setInt(4, newMem.getMileage());
			pst.setString(5, newMem.getGrade());
			System.out.println(pst.executeUpdate());
			pst = con.prepareStatement(sql_members_after);
			System.out.println(pst.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pst != null)
				try { pst.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(con != null)
				try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
	//JDBC를 활용하여 고객정보 삭제하기
	public void membersDelete(int selectedRow) {
		con = myJdbcUtil.getConnection(); 
		try {
			pst = con.prepareStatement(sql_members_delete);
			pst.setInt(1, selectedRow);
			System.out.println(pst.executeUpdate());
			pst = con.prepareStatement(sql_members_after);
			System.out.println(pst.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pst != null)
				try { pst.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(con != null)
				try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
	//JDBC를 활용하여 고객정보 수정하기
	public void membersUpdate(int selectedRow, Member newInfo) {
		con = myJdbcUtil.getConnection(); 
		try {
			pst = con.prepareStatement(sql_members_update);
			pst.setString(1, newInfo.getName());
			pst.setString(2, newInfo.getPhone());
			pst.setString(3, newInfo.getFavorite());
			pst.setInt(4, newInfo.getMileage());
			pst.setString(5, newInfo.getGrade());
			pst.setInt(6, selectedRow);
			System.out.println(pst.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pst != null)
				try { pst.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(con != null)
				try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
	//선택한 줄에 해당하는 고객 정보 가져오기
	public Member membersSelect(int selectedRow) {
		con = myJdbcUtil.getConnection(); 
		try {
			pst = con.prepareStatement(sql_members_select);
			pst.setInt(1, selectedRow);
			rst = pst.executeQuery();
			Member member = new Member();
			while(rst.next()) {
				member.setNo(rst.getInt("no"));
				member.setName(rst.getString("name"));
				member.setPhone(rst.getString("phone"));
				member.setFavorite(rst.getNString("favorite"));
				member.setMileage(Integer.valueOf(rst.getString("mileage")));
				member.setGrade(rst.getString("grade"));
			}
			return member;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stm != null)
				try { stm.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(rst != null)
				try { rst.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(con != null)
				try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		return null;
	}

	//3자리마다 구분자 콤마를 넣은 금액 출력형태
	public String moneyType(double ugly) {
		String money = new Double(ugly).toString();
		
		String format = "#,###,###,#00";
		DecimalFormat df = new DecimalFormat(format);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setGroupingSeparator(',');
		df.setGroupingSize(3);
		df.setDecimalFormatSymbols(dfs);
		
		return (df.format(Double.parseDouble(money))).toString();
	}
	
	//excel을 활용하여 카드에 담긴 총 금액을 계산
	public double cartSum() {
		double sum = 0;
		if(!cartFile.exists()) return sum;
		FileInputStream is = null;
		XSSFWorkbook wb = null;
		try {
			is = new FileInputStream(cartFile);
			wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheetAt(0);
			for(int rowIdx = 1; rowIdx < sheet.getPhysicalNumberOfRows(); rowIdx++) {
				XSSFRow row = sheet.getRow(rowIdx);
				if(row != null) {
					XSSFCell cell = sheet.getRow(rowIdx).getCell(3);
					sum += cell.getNumericCellValue();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (is != null) {
				try {is.close();} catch (IOException e) {e.printStackTrace();}
			}
			if (wb != null) {
				try {wb.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		return sum;
	}
	
	//excel을 활용하여 결제할 물건을 입력
	public void cartInsert(String inputItem) {
		File cartFile = new File("cart.xlsx");
		FileInputStream is = null;
		FileOutputStream os = null;
		XSSFWorkbook wb = null;
		
		Item newItem = new Item();
		String name = inputItem;

		XSSFRow row = null;
		XSSFCell cell = null;
		String[] colArr = { "NAME", "PRICE", "QUANTITY", "SUM"};
		
		newItem.setName(name);
		newItem.setPrice(getPrice(name));
		newItem.setQuantity(getQuantity(name));
		
		try {
			if(cartFile.exists()) {
				is = new FileInputStream(cartFile);
				wb = new XSSFWorkbook(is);
				
				// 기존 파일에 수량만 변경되는 경우
				boolean flag = false;
				XSSFSheet sheet = wb.getSheetAt(0);
				for(int rowIdx = 0; rowIdx < sheet.getPhysicalNumberOfRows(); rowIdx++) {
					XSSFRow oldRow = sheet.getRow(rowIdx);
					if(oldRow != null) {
						if(name.equalsIgnoreCase(oldRow.getCell(0).getStringCellValue())) {
							oldRow.getCell(2).setCellValue(newItem.getQuantity());
							oldRow.getCell(3).setCellValue(newItem.getPrice() * newItem.getQuantity());
							flag = true;
						}
					}
				}
				// 기존 파일에 새롭게 추가된 경우
				if(flag == false) {
					int inputIdx = sheet.getLastRowNum();
					row = sheet.createRow(++inputIdx);
					cell = row.createCell(0);
					cell.setCellValue(newItem.getName());
					cell = row.createCell(1);
					cell.setCellValue(newItem.getPrice());
					cell = row.createCell(2);
					cell.setCellValue(newItem.getQuantity());
					cell = row.createCell(3);
					cell.setCellValue(newItem.getPrice() * newItem.getQuantity());
				}
			// 새 파일에 입력하는 경우
			}else if(!cartFile.exists()) {
				cartFile.createNewFile();
				
				wb = new XSSFWorkbook();
				XSSFSheet sheet = wb.createSheet();
				
				row = sheet.createRow(0);
				for (int i = 0; i < colArr.length; i++) {
					cell = row.createCell(i);
					cell.setCellValue(colArr[i]);
				}
				row = sheet.createRow(1);
				cell = row.createCell(0);
				cell.setCellValue(newItem.getName());
				cell = row.createCell(1);
				cell.setCellValue(newItem.getPrice());
				cell = row.createCell(2);
				cell.setCellValue(newItem.getQuantity());
				cell = row.createCell(3);
				cell.setCellValue(newItem.getPrice() * newItem.getQuantity());
			}
			os = new FileOutputStream(cartFile);
			wb.write(os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (wb != null) {
				try {wb.close();} catch (IOException e) {e.printStackTrace();}
			}
			if (is != null) {
				try {is.close();} catch (IOException e) {e.printStackTrace();}
			}
			if (os != null) {
				try {os.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
	}
	
	//excel를 활용하여 cart를 출력
		public Vector<Vector> cartSelectAll(){
			if(!cartFile.exists()) return null;
			FileInputStream is = null;
			XSSFWorkbook wb = null;
			Vector<Vector> cartList = new Vector<Vector>();
			try {
				is = new FileInputStream(cartFile);
				wb = new XSSFWorkbook(is);
				XSSFSheet sheet = wb.getSheetAt(0);
				for(int rowIdx = 1; rowIdx < sheet.getPhysicalNumberOfRows() ; rowIdx++) {
					Vector cartItem = new Vector();
					XSSFRow row = sheet.getRow(rowIdx);
					if(row != null && row.getCell(2).getNumericCellValue() != 0) {
						for(int colIdx = 0; colIdx<=row.getPhysicalNumberOfCells(); colIdx++) {
							XSSFCell cell = sheet.getRow(rowIdx).getCell(colIdx);
							if(cell == null) continue;
							else {
								if(cell.getCellType() == CellType.STRING) {
									cartItem.add(cell.getStringCellValue());
								}else if(cell.getCellType() == CellType.NUMERIC) {
									cartItem.add((int)cell.getNumericCellValue());
								}
							}
						}
					}
					cartList.add(cartItem);
				}
				return cartList;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if (wb != null) {
					try {wb.close();} catch (IOException e) {e.printStackTrace();}
				}
				if (is != null) {
					try {is.close();} catch (IOException e) {e.printStackTrace();}
				}
			}
			return null;
		}
		
	//excel을 활용하여 선택한 메뉴의 가격을 확인
	public int getPrice(String inputItem) {
		File menuFile = new File("menu.xlsx");
		FileInputStream is = null;
		XSSFWorkbook wb = null;
		try {
			is = new FileInputStream(menuFile);
			wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheetAt(0);
			here: for(int rowIdx = 1; rowIdx < sheet.getPhysicalNumberOfRows() ; rowIdx++) {
				XSSFRow row = sheet.getRow(rowIdx);
				if(row != null) {
					for(int colIdx = 0; colIdx<=row.getPhysicalNumberOfCells(); colIdx++) {
						XSSFCell cell = sheet.getRow(rowIdx).getCell(colIdx);
						if(cell == null) continue;
						else {
							if(cell.getCellType() == CellType.STRING) {
								String name = cell.getStringCellValue();
								if(!name.equalsIgnoreCase(inputItem)) continue here;
							}else {
								return (int)cell.getNumericCellValue();
							}
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (wb != null) {
				try {wb.close();} catch (IOException e) {e.printStackTrace();}
			}
			if (is != null) {
				try {is.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		return 0;
	}
		
	//excel을 활용하여 cart에서 기존 갯수를 확인	
	private int getQuantity(String inputItem) {
		if(!cartFile.exists()) return 1;
		FileInputStream is = null;
		XSSFWorkbook wb = null;
		try {
			is = new FileInputStream(cartFile);
			wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheetAt(0);
			here: for(int rowIdx = 1; rowIdx < sheet.getPhysicalNumberOfRows() ; rowIdx++) {
				XSSFRow row = sheet.getRow(rowIdx);
				if(row != null) {
					XSSFCell cell = sheet.getRow(rowIdx).getCell(0);
					String name = cell.getStringCellValue();
					if(!name.equalsIgnoreCase(inputItem)) continue here;
					else {
						cell = sheet.getRow(rowIdx).getCell(2);
						if(cell.getCellType() == CellType.NUMERIC) 
							return ((int) cell.getNumericCellValue())+1;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (wb != null) {
				try {wb.close();} catch (IOException e){e.printStackTrace();}
				
			}
			if (is != null) {
				try {is.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		return 1;
	}
	
	private String getOrderIdx() {
		return "04190600" + todayOrder;
	}

	// 1, 5, 10 버튼에 따라서 수량 변경
	public void changeQuantity(int num, int selectedRow){
		FileOutputStream os = null;
		FileInputStream is = null;
		XSSFWorkbook wb = null;
		try {
			is = new FileInputStream(cartFile);
			wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheetAt(0);
			XSSFRow row = sheet.getRow(selectedRow);
			if(row != null) {
				XSSFCell cell = row.getCell(2);
				cell = sheet.getRow(selectedRow).getCell(2);
				int price = (int) row.getCell(1).getNumericCellValue();
				double before = 0;
				if(cell.getCellType() == CellType.NUMERIC) 
					before = cell.getNumericCellValue();
				double after = before + num;
				if(after <= -1) {
					cell = row.createCell(2);
					cell.setCellValue(0);
					cell = row.createCell(3);
					cell.setCellValue(0);
				}else {
					cell = row.createCell(2);
					cell.setCellValue(after);
					cell = row.createCell(3);
					cell.setCellValue(price*after);
				}
			}
			os = new FileOutputStream(cartFile);
			wb.write(os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (wb != null) {
				try {wb.close();} catch (IOException e) {e.printStackTrace();}
			}
			if (is != null) {
				try {is.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
	}
	
	// JDBC를 활용하는 admin login
	public boolean adminLogin(String id, String pw) {
		con = myJdbcUtil.getConnection();
		try {
			stm = con.createStatement();
			rst = stm.executeQuery(sql_admin_selectAll);
			while(rst.next()){
				if(id.equalsIgnoreCase(rst.getString("ID")) && pw.equals(rst.getString("PW")))
					return true;
				else return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rst.close();
				stm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	//로그인 버튼 눌렸을 때 체크박스 상태에 따라 정보 기억
	public void adminRemeberInfo(JSONObject logInfo) { 
		FileWriter fw = null;
		try {
			if(!logInfoFile.exists()) logInfoFile.createNewFile();
			fw = new FileWriter(logInfoFile);
			fw.write(logInfo.toString(2));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {fw.close();} catch (IOException e) { e.printStackTrace(); }
			}
		}
	}
	//JSON을 활용하여 이전에 저장한 로그인 정보가 있다면 로드
	public String[] adminSetInfo() {
		if(logInfoFile.exists()){
			FileReader fr = null;
			String[] logInfo = new String[2];
			try {
				fr = new FileReader(logInfoFile);
				JSONTokener jt = new JSONTokener(fr);
				JSONObject obj = new JSONObject(jt);
				logInfo[0] = obj.getString("ID");
				logInfo[1] = obj.getString("PW");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (JSONException e) {
			} finally {
				if(fr != null) {
					try {fr.close();} catch (IOException e) {e.printStackTrace();}
				}
			}
			return logInfo;
		}
		return null;
	}

	// 쿠폰에 입력될 유효기간 
	public String couponGetDate() {
		String date = "";
		date = cal.get(cal.YEAR)+"/"+(cal.get(cal.MONTH)+4)+"/"+cal.get(cal.DATE);
		return date;
	}

	// 쿠폰에 입력될 일련번호
	public String couponGetCode() {
		Random rd = new Random();
		String c1 = "";
		for(int i=0; i<4; i++){
			c1 += String.valueOf(rd.nextInt(10)); 
		}
		String c2 = "";
		for(int i=0; i<4; i++){
			c2 += String.valueOf(rd.nextInt(10)); 
		}
		SimpleDateFormat df = new SimpleDateFormat("MMdd");
		String c3 = df.format(cal.getTime());
		df = new SimpleDateFormat("mmHH");
		String c4 = df.format(cal.getTime());
		return c1+"-"+c2+"-"+c3+"-"+c4; 
	}

	// 쿠폰을 보낼 사용자가 데이터베이스에 있는지 확인
	public boolean checkMember(String memName) {
		con = myJdbcUtil.getConnection();
		try {
			pst = con.prepareStatement(sql_members_search);
			pst.setString(1, memName);
			rst = pst.executeQuery();
			if(rst != null)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rst.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// 쿠폰을 보낼 사용자 전화번호 반환
	public String getPhone(String memName) {
		String phone = "";
		con = myJdbcUtil.getConnection();
		try {
			pst = con.prepareStatement(sql_members_search);
			pst.setString(1, memName);
			rst = pst.executeQuery();
			while(rst.next()){
				phone = rst.getString("phone");
			}
			return phone;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rst.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return phone;
	}
}
