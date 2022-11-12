package Model;

public class CriminalDet {
	
	private int CrimeID;
	private String CriminalName;
	
	private String DateofCrime;
	private String CrimePlace;
	private String CrimeType;
	private String CaseStatus;
	
	

	public CriminalDet() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CriminalDet(int crimeID, String criminalName, String dateofCrime, String crimePlace, String crimeType,
			String caseStatus) {
		super();
		CrimeID = crimeID;
		CriminalName = criminalName;
		DateofCrime = dateofCrime;
		CrimePlace = crimePlace;
		CrimeType = crimeType;
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



	public String getCaseStatus() {
		return CaseStatus;
	}



	public void setCaseStatus(String caseStatus) {
		CaseStatus = caseStatus;
	}



	@Override
	public String toString() {
		return "CriminalDet [CrimeID=" + CrimeID + ", CriminalName=" + CriminalName + ", DateofCrime=" + DateofCrime
				+ ", CrimePlace=" + CrimePlace + ", CrimeType=" + CrimeType + ", CaseStatus=" + CaseStatus + "]";
	}
	
	
	
	
	
	
}
