package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView viewPatientDetails(ModelMap model) {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("greetings", "This is Spring Framework, How can I help you?");
	    modelAndView.setViewName("hello");
	    return modelAndView;
	}

	@RequestMapping(value = "/fine", method = RequestMethod.GET)
	public ModelAndView viewPatientDetails2(ModelMap model) {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("greetingsFine", "Choose from the following");
	    modelAndView.setViewName("fine");
	    return modelAndView;
	}

	@RequestMapping(value = "/getpatienttdetails", method = RequestMethod.GET)
	public ModelAndView getPatientDetail(@RequestParam(name = "id") String patientId) {
		System.out.println("---------Here is my ID from the form text box -------"+patientId);
	    ArrayList<Patient> patientsList = PatientsList.getPatientsList();
	    Patient thisPatient = null;
	    for (Patient patient:patientsList) {
	    	if (patient.getId() == Integer.parseInt(patientId)) {
	    		thisPatient = patient;
	    	}
	    }
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("patientDetails", thisPatient);
	    modelAndView.setViewName("getpatientdetails");
	    return modelAndView;
	}

	@RequestMapping(value = "/addnewpatient2", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addNewPatient(@RequestParam(name = "id") String patientId,
			@RequestParam(name = "fname") String fName,
			@RequestParam(name = "lname") String lName
			) {
		System.out.println("---------Here is all the info for adding this patient -------"+
			patientId + "," + fName + "," + lName );
		// Create a new patient and add the new patient to the list
		Patient patient = new Patient(Integer.parseInt(patientId), fName, lName);

		// get the latest patient list and set the model with the list
		ArrayList<Patient> patientsList = PatientsList.addPatient(patient);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("patientsList", patientsList);
		modelAndView.setViewName("patientslist");
	    return modelAndView;
	}
}

