package Model;

import Colors.ConsoleColors;

public class CriminalDetails {
	
	private String CriminalName;
	private int Age;
	private String Gender;
	private String Identity;
	
	public CriminalDetails() {
		// TODO Auto-generated constructor stub
	}

	public CriminalDetails(String criminalName, int age, String gender, String identity) {
		super();
		CriminalName = criminalName;
		Age = age;
		Gender = gender;
		Identity = identity;
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

	@Override
	public String toString() {
		return "CriminalDetails [CriminalName=" +CriminalName + ", Age=" + Age + ", Gender=" + Gender + ", Identity="
				+ Identity + "]";
	}
	
	

}
