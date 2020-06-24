package project03.bean;

public class NoteBook implements Equipment{
	private String model;
	private double price;
	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return model+"("+price+")";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return getDescrption();
	}
	
	

}
