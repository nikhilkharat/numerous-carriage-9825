package Dao;

import java.util.List;

import Exception.CrimeException;
import Model.CriminalDet;
import Model.CriminalDetails;

public interface CriminalDao {

	public List<CriminalDet> getAllCriminalByCrime()throws CrimeException;
}
