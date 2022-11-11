package Model;

public class CriminalDet {
	
	private int CrimeID;
	private String CriminalName;
	
	private String DateofCrime;
	private String CrimePlace;
	private String CrimeType;
	
	

	public CriminalDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CriminalDet(int crimeID, String criminalName,  String dateofCrime, String crimePlace,
			String crimeType) {
		super();
		CrimeID = crimeID;
		CriminalName=criminalName;

		DateofCrime = dateofCrime;
		CrimePlace = crimePlace;
		CrimeType = crimeType;
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
		this.CriminalName = criminalName;
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

	@Override
	public String toString() {
		return "CriminalDet [CrimeID=" + CrimeID + ", criminalName=" + CriminalName +  ", DateofCrime=" + DateofCrime + ", CrimePlace=" + CrimePlace + ", CrimeType=" + CrimeType
				+ "]";
	}
	
	
	
	  
	
	
	
	
}
