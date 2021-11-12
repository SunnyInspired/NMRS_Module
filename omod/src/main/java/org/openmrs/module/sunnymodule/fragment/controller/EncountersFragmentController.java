package org.openmrs.module.sunnymodule.fragment.controller;

import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.EncounterService;
import org.openmrs.api.PatientService;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.fragment.FragmentModel;

import java.util.List;

public class EncountersFragmentController {
	
	public void controller(FragmentModel model, @SpringBean("encounterService") EncounterService encounterService,
	        @SpringBean("patientService") PatientService patientService) {
		Patient patient = patientService.getPatient(9);
		List<Encounter> encounters = encounterService.getEncountersByPatient(patient);
		model.addAttribute("encounters", encounters);
	}
	
}
