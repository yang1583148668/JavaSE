package project03.bean;

public class Programmer extends Employe {
	private int memberId;
	private Status status = Status.FREE;
	private Equipment equipment;

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public Programmer() {
		super();
	}
	
	@Override
	public String toString() {
		return getBasicinfo()+"\t程序员\t"+getStatus()+"\t\t\t"+equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
