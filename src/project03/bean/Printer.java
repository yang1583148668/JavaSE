package project03.bean;

public class Printer implements Equipment {
	private String type;
	private String name;
	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return name+"("+type+")";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	@Override
	public String toString() {
		return getDescrption();
	}
	

}
