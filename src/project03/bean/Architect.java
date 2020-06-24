package project03.bean;

public class Architect extends Designer {
	private int stock;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public Architect() {
		super();
	}

	@Override
	public String toString() {
		return getBasicinfo()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+getStock()+"\t"+getEquipment();
	}
	
	@Override
	public String getMemberInfo() {
		return getMemberId()+"/"+getBasicinfo()+"\t架构师"+"\t"+getBonus()+"\t"+getStock();
		
	}
	
	
}
