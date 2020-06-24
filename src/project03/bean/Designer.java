package project03.bean;

public class Designer extends Programmer {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public Designer() {
		super();
	}

	@Override
	public String toString() {
		return getBasicinfo()+"\t设计师\t"+getStatus()+"\t"+getBonus()+"\t\t"+getEquipment();
	}
	@Override
	public String getMemberInfo() {
		return getMemberId()+"/"+getBasicinfo()+"\t设计师"+"\t"+getBonus();
		
	}
	
}
