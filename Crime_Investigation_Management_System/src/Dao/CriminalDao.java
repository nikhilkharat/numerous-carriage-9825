package Dao;

import java.util.List;

import Exception.CrimeException;
import Model.CriminalDet;
import Model.CriminalDetails;
import Model.FullDetail;

public interface CriminalDao {

	public List<CriminalDet> getAllCriminalByCrime()throws CrimeException;
	
	public List<CriminalDet> getAllCriminalByPlace(String CrimePlace) throws CrimeException;
	
	public List<CriminalDet> getAllCriminalByType(String CrimeType) throws CrimeException;
	
	public List<CriminalDet> getAllCriminalByMonth() throws CrimeException;
	
	public List<CriminalDet> getAllCaseStatus(String CaseStatus) throws CrimeException;
	
	public List<FullDetail> getAllDetails() throws CrimeException;
	
	
}
