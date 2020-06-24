package project03.view;

import project03.TeamException;
import project03.bean.Employe;
import project03.bean.Programmer;
import project03.service.NameListService;
import project03.service.TeamService;
import project03.util.TSUtility;

public class TeamView {
	private Employe[] allEmployes;
	private Programmer[] tmEmployes;
	NameListService nlservice = new NameListService();
	TeamService tService = new TeamService();
	public void menu(){
		System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
		System.out.println("ID\t姓名 \t年龄\t工资\t职位\t状态 \t奖金\t股票\t领用设备");
		getAllEmploye();
		
		//System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
		
		while(true) {
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			char select = TSUtility.readMenuSelection();
			switch(select) {
			case '1':
				list();
				break;
			case '2':
				add();
				break;
			case '3':
				remove();
				break;
			case '4':
				System.out.println("请确认是否退出？（Y/N");
				char confirm = TSUtility.readConfirmSelection();
				
				if(confirm=='Y') {
					return;
				}
				break;
			}
			
		}
	}
	
	
	
	private void add() {
		// TODO Auto-generated method stub
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try {
			Employe emp = nlservice.getEmployeById(id);
			tService.addMember(emp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("添加失败，原因："+e.getMessage());
		}
		TSUtility.readReturn();
		
	}
	
	private void remove() {
		System.out.println("---------------------移除成员---------------------");
		System.out.print("请输入要移除的员工团队ID：");
		int tid =TSUtility.readInt();
		try {
			tService.removeMemberByTid(tid);
			System.out.println("成功移除");
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("移除失败，原因："+e.getMessage());
		}
		
	}



	private void list() {
		// TODO Auto-generated method stub
		tmEmployes  = tService.getTmEmploye();
		System.out.println("--------------------团队成员列表---------------------");
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		for (int i = 0; i < tService.getTotal(); i++) {
			System.out.println(tmEmployes[i].getMemberInfo());
		}
	}



	public void getAllEmploye() {
		//NameListService nlservice = new NameListService();
		allEmployes = nlservice.getAllEmployes();
		
		for (int i = 0; i < allEmployes.length; i++) {
			System.out.println(allEmployes[i]);
		}
	}
}
