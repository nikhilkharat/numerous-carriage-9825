package Model;

import java.sql.*;

import Colors.ConsoleColors;

public class CrimeDetails {

	private int CrimeId;
	private String DateOfCrime;
	private String CrimePlace;
	private String CrimeType;
	private String CrimeDescription;
	private String Victims;
	
	
	public CrimeDetails() {
		// TODO Auto-generated constructor stub
	}


	public CrimeDetails(int crimeId, String dateOfCrime, String crimePlace, String crimeType, String crimeDescription,
			String victims) {
		super();
		CrimeId = crimeId;
		DateOfCrime = dateOfCrime;
		CrimePlace = crimePlace;
		CrimeType = crimeType;
		CrimeDescription = crimeDescription;
		Victims = victims;
	}


	public int getCrimeId() {
		return CrimeId;
	}


	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}


	public String getDateOfCrime() {
		return DateOfCrime;
	}


	public void setDateOfCrime(String dateOfCrime) {
		DateOfCrime = dateOfCrime;
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


	@Override
	public String toString() {
		return "CrimeDetails [CrimeId=" + CrimeId + ", DateOfCrime=" + DateOfCrime + ", CrimePlace=" + CrimePlace
				+ ", CrimeType=" + CrimeType + ", CrimeDescription=" + CrimeDescription + ", Victims=" + Victims + "]";
	}

	

	
	
}
