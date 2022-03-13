package details;

public class subjects {

	private int Id;
	private String Name;
	private String shortcut;

	public subjects(int id, String name, String shortcut) {
		super();
		this.Id = id;
		this.Name = name;
		this.shortcut = shortcut;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}

}