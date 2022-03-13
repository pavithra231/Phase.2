package details;

public class Students {

	private int id;
	private String fName;
	private String lName;
	private int age;
	private int Class;
	public Students(int id, String fName, String lName, int age, int class1) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.Class = class1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClassId() {
		return Class;
	}
	public void setClass(int class1) {
		Class = class1;
	}


}