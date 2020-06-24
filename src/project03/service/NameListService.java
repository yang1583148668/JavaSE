package project03.service;

import project03.TeamException;
import project03.bean.Architect;
import project03.bean.Designer;
import project03.bean.Employe;
import project03.bean.Equipment;
import project03.bean.NoteBook;
import project03.bean.PC;
import project03.bean.Printer;
import project03.bean.Programmer;
import project03.util.Data;

public class NameListService {
	private  Employe[] allEmployes;
	
	

	public  Employe[] getAllEmployes() {
		return allEmployes;
	}
	
	
	
	public NameListService() {
		super();
		init();
	}



	public void init() {
		allEmployes = new Employe[Data.EMPLOYEES.length];

		for (int i = 0; i < allEmployes.length; i++) {
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.EMPLOYEE) {
				allEmployes[i] = new Employe(id, name, age, salary);
			} else if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.PROGRAMMER) {
				Equipment eqm = getEquipmentForUser(i);
				allEmployes[i] = new Programmer(id, name, age, salary, eqm);

			} else if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.DESIGNER) {
				Equipment eqm = getEquipmentForUser(i);
				double bonus =Double.parseDouble(Data.EMPLOYEES[i][5]) ;
				allEmployes[i]= new Designer(id, name, age, salary, eqm, 0);
			} else if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.ARCHITECT) {
				Equipment eqm = getEquipmentForUser(i);
				double bonus =Double.parseDouble(Data.EMPLOYEES[i][5]) ;
				int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				allEmployes[i] = new Architect(id, name, age, salary, eqm, bonus, stock);
			}
		}

	}

	private Equipment getEquipmentForUser(int index) {
		if(Data.EQIPMENTS[index]!=null) {
			
			int eqmtype =Integer.parseInt(Data.EQIPMENTS[index][0]);
			switch (eqmtype) {
			case Data.PC:
				return new PC(Data.EQIPMENTS[index][1],Data.EQIPMENTS[index][2]);
			case Data.NOTEBOOK:
				return new NoteBook(Data.EQIPMENTS[index][1],Double.parseDouble(Data.EQIPMENTS[index][2]));
			case Data.PRINTER:
				return new Printer(Data.EQIPMENTS[index][1],Data.EQIPMENTS[index][2]);
			}
		}
		return null;
	}
	
	
	
	public Employe getEmployeById(int id) throws TeamException {
		int index = -1;
		for (int i = 0; i < allEmployes.length; i++) {
			if(allEmployes[i].getId()==id) {
				index =i;
				break;
			}
		}
		
		if(index ==-1) {
			throw new TeamException("所选员工不存在");
		}
		
		return allEmployes[index];
	}
}
