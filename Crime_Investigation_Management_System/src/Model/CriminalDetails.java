package Model;

import Colors.ConsoleColors;

public class CriminalDetails {
	
	private String CriminalName;
	private int Age;
	private String Gender;
	private String Identity;
	private String CaseStatus;
	
	public CriminalDetails() {
		// TODO Auto-generated constructor stub
	}

	public CriminalDetails(String criminalName, int age, String gender, String identity, String caseStatus) {
		super();
		CriminalName = criminalName;
		Age = age;
		Gender = gender;
		Identity = identity;
		CaseStatus = caseStatus;
	}

	public String getCriminalName() {
		return CriminalName;
	}

	public void setCriminalName(String criminalName) {
		CriminalName = criminalName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getIdentity() {
		return Identity;
	}

	public void setIdentity(String identity) {
		Identity = identity;
	}

	public String getCaseStatus() {
		return CaseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		CaseStatus = caseStatus;
	}

	@Override
	public String toString() {
		return "CriminalDetails [CriminalName=" + CriminalName + ", Age=" + Age + ", Gender=" + Gender + ", Identity="
				+ Identity + ", CaseStatus=" + CaseStatus + "]";
	}

	
	
	

}
