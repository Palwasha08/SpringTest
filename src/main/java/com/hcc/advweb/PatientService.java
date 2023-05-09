package com.hcc.advweb;

import java.util.ArrayList;

public interface PatientService {


	public void addPatient(Patient student);

	public Patient getPatient(int Id);

	public ArrayList<Patient> getPatientsList();

	public Patient updatePatient(Patient patient);

}
