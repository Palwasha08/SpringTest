package com.hcc.advweb;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public PatientDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPatient(Patient patient) {
		sessionFactory.getCurrentSession().saveOrUpdate(patient);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Patient> getPatientsList() {
		ArrayList<Patient> patientsList =
				(ArrayList<Patient>)sessionFactory.
				getCurrentSession().createQuery("FROM Patient").
				list();
		return patientsList;
	}

	@Override
	public Patient getPatient(int Id) {
		Patient patient = sessionFactory.getCurrentSession().get(Patient.class, Id);
		return patient;
	}

	@Override
	public Patient updatePatient(Patient patient) {

		return null;
	}

}
