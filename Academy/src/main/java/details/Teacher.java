package details;

public class Teacher {
	private int id;
	private String Name;
	private String subject;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher(int id, String fName, String Subject, int age) {
		super();
		this.id = id;
		this.Name = fName;
		this.subject = Subject;
		this.age = age;
	}



}