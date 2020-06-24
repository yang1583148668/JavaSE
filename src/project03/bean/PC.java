package project03.bean;

public class PC implements Equipment {
	private String model;
	private String display;
	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return model+"("+display +")";
	}
	@Override
	public String toString() {
		return getDescrption();
	}
	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
	
}
