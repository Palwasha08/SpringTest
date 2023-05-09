package com.hcc.advweb;

import java.util.ArrayList;

public class PatientsList {

	private static ArrayList<Patient> patientsList;

	public static ArrayList<Patient> getPatientsList() {
		if ((patientsList == null) || (patientsList.size() == 0)) {
			patientsList = new ArrayList<>();
			patientsList.add(new Patient(1,"Palwasha","Khan"));
			patientsList.add(new Patient(2,"Jose","Gonzales"));
			patientsList.add(new Patient(3,"Bob","Smith"));
			patientsList.add(new Patient(4,"Adrian","Shah"));
			patientsList.add(new Patient(5,"Kelly","Branco"));
		}
		System.out.println("Patient List ---->"+patientsList);
		return patientsList;
	}
	public static void setPatientsList(ArrayList<Patient> patientsList) {
		patientsList = patientsList;
	}

	public static ArrayList<Patient> addPatient(Patient patient) {
		getPatientsList().add(patient);
		return patientsList;
	}


}
