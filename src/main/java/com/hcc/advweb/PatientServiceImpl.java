package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;

	public PatientServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addPatient(Patient patient) {
		patientDAO.addPatient(patient);
	}

	@Override
	@Transactional
	public ArrayList<Patient> getPatientsList() {
		return patientDAO.getPatientsList();
	}

	@Override
	@Transactional
	public Patient getPatient(int Id) {
		return patientDAO.getPatient(Id);
	}

	@Override
	@Transactional
	public Patient updatePatient(Patient patient) {
		return patientDAO.updatePatient(patient);
	}



}
