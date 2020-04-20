package myProject.model;

public class Member {
	int no;
	String name;
	String phone;
	String favorite;
	int mileage;
	String grade;
	
	public Member() {
		no = 1;
		name = "";
		phone = "";
		favorite = "";
		mileage = 0;
		grade = "silver";
	}
	
	public Member(String name, String grade) {
		no = 1;
		this.name = name;
		phone = "";
		favorite = "";
		mileage = 0;
		this.grade = grade;
	}
	
	public Member(int no, String name, String phone, String favorite, int mileage, String grade) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.favorite = favorite;
		this.mileage = mileage;
		this.grade = grade;
	}
	
	public Member(String name, String phone, String favorite, int mileage, String grade) {
		no = 0;
		this.name = name;
		this.phone = phone;
		this.favorite = favorite;
		this.mileage = mileage;
		this.grade = grade;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", phone=" + phone + ", favorite=" + favorite + ", mileage="
				+ mileage + ", grade=" + grade + "]";
	}
	
}
