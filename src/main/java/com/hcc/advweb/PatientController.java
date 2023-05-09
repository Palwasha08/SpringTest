package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PatientController {

	@Autowired
	private PatientService patientService;

	public PatientController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/")
	public String index() {
	    return "hello";
	}

	@RequestMapping(value="/patientslist", method= RequestMethod.GET)
	public ModelAndView getPatientsList(ModelAndView model) {
		ArrayList<Patient> patientsList = patientService.getPatientsList();
		model.addObject("patientsList",patientsList);
		model.setViewName("patientslist");
		return model;
	}

	@RequestMapping(value="/newspringpatient",method=RequestMethod.GET)
	public ModelAndView newSpringPatient(ModelAndView modelView) {
		Patient patient = new Patient();
		modelView.addObject("patient",patient);
		modelView.setViewName("addnewpatient");
		return modelView;
	}

	@RequestMapping(value="/addspringpatient", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringPatient(@ModelAttribute Patient patient) {
		System.out.println("----------");
		if (patient.getId() == 0) {
			patientService.addPatient(patient);
		} else {
			patientService.updatePatient(patient);
		}
		ArrayList<Patient> patientsList = patientService.getPatientsList();

		return new ModelAndView("patientslist","patientsList",patientsList);
	}
}
