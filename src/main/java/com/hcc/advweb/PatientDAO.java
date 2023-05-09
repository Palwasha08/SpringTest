package com.hcc.advweb;

import java.util.ArrayList;

public interface PatientDAO {

	public void addPatient(Patient patient);

	public ArrayList<Patient> getPatientsList();

	public Patient getPatient(int Id);

	public Patient updatePatient(Patient patient);

}
