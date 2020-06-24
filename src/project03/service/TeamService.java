package project03.service;

import project03.TeamException;
import project03.bean.Architect;
import project03.bean.Designer;
import project03.bean.Employe;
import project03.bean.Programmer;
import project03.bean.Status;
public class TeamService {
	private Programmer[] tmEmploye;
	private int total = 0;
	private int currentMemberId = 1;
	private static final int MAX_MEMBER = 5;
	private int progammernum = 0;
	private int designernum = 0;
	private int architectnum = 0;

	public TeamService() {
		super();
		tmEmploye = new Programmer[MAX_MEMBER];
	}

	public Programmer[] getTmEmploye() {
		return tmEmploye;
	}

	public void addMember(Employe employe) throws TeamException {
		if (total >= MAX_MEMBER) {
			throw new TeamException("团队成员已满，不能再添加");
		}
		if (!(employe instanceof Programmer)) {
			throw new TeamException("该雇员不是开发人员，无法添加");
		}
		Programmer p = (Programmer) employe;
		switch (p.getStatus()) {
		case BUSY:
			throw new TeamException("该员工已经在团队中");
		case VOCATION:			
			throw new TeamException("该员工正在休假");
		}
		if (employe instanceof Architect) {
			architectnum++;
		} else if (employe instanceof Designer) {
			designernum++;
		} else if (employe instanceof Programmer ) {
			progammernum++;
		}
		if (architectnum > 1) {
			architectnum--;
			throw new TeamException("团队中最多只能有一名架构师");
		} else if (designernum > 2) {
			designernum--;
			throw new TeamException("团队中最多只能有两名设计师");
		} else if (progammernum > 3) {
			progammernum--;
			throw new TeamException("团队中最多只能有三名软件工程师");
		}
		
		p.setStatus(Status.BUSY);
		p.setMemberId(currentMemberId);
		tmEmploye[total] = p;
		
		currentMemberId++;
		total++;
	}
	
	public void removeMemberByTid(int tid) throws TeamException {
		int index =-1;
		for (int i = 0; i < total; i++) {
			if(tmEmploye[i].getMemberId()==tid) {
				index= i;
				break;
			}		
		}
		
		if(index==-1) {
			throw new TeamException("要删除的成员不在团队中");
		}
		
		System.arraycopy(tmEmploye, index+1, tmEmploye, index, total-1-index);
		tmEmploye[index].setStatus(Status.FREE);
		tmEmploye[total]=null;
		total--;
	}

}
