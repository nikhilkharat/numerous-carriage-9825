package Model;

public class FullDetail {
	
	private int CrimeID;
	private String CriminalName;
	private int Age;
	private String Gender;
	private String Identity;
	private String DateofCrime;
	private String CrimePlace;
	private String CrimeType;
	private String CrimeDescription;
	private String Victims;
	private String CaseStatus;
	
	
	public FullDetail() {
		// TODO Auto-generated constructor stub
	}


	public FullDetail(int crimeID, String criminalName, int age, String gender, String identity, String dateofCrime,
			String crimePlace, String crimeType, String crimeDescription, String victims, String caseStatus) {
		super();
		CrimeID = crimeID;
		CriminalName = criminalName;
		Age = age;
		Gender = gender;
		Identity = identity;
		DateofCrime = dateofCrime;
		CrimePlace = crimePlace;
		CrimeType = crimeType;
		CrimeDescription = crimeDescription;
		Victims = victims;
		CaseStatus = caseStatus;
	}


	public int getCrimeID() {
		return CrimeID;
	}


	public void setCrimeID(int crimeID) {
		CrimeID = crimeID;
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


	public String getDateofCrime() {
		return DateofCrime;
	}


	public void setDateofCrime(String dateofCrime) {
		DateofCrime = dateofCrime;
	}


	public String getCrimePlace() {
		return CrimePlace;
	}


	public void setCrimePlace(String crimePlace) {
		CrimePlace = crimePlace;
	}


	public String getCrimeType() {
		return CrimeType;
	}


	public void setCrimeType(String crimeType) {
		CrimeType = crimeType;
	}


	public String getCrimeDescription() {
		return CrimeDescription;
	}


	public void setCrimeDescription(String crimeDescription) {
		CrimeDescription = crimeDescription;
	}


	public String getVictims() {
		return Victims;
	}


	public void setVictims(String victims) {
		Victims = victims;
	}


	public String getCaseStatus() {
		return CaseStatus;
	}


	public void setCaseStatus(String caseStatus) {
		CaseStatus = caseStatus;
	}


	@Override
	public String toString() {
		return "FullDetail [CrimeID=" + CrimeID + ", CriminalName=" + CriminalName + ", Age=" + Age + ", Gender="
				+ Gender + ", Identity=" + Identity + ", DateofCrime=" + DateofCrime + ", CrimePlace=" + CrimePlace
				+ ", CrimeType=" + CrimeType + ", CrimeDescription=" + CrimeDescription + ", Victims=" + Victims
				+ ", CaseStatus=" + CaseStatus + "]";
	}
	
	

}
