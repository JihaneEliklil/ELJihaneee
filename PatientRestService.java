package fst.hns.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fst.hns.entities.Patient;

@RestController
public class PatientRestService {
    @Autowired
	private PatientRepository PR;
    @RequestMapping(value="/patients",method = RequestMethod.GET)
	public List<Patient> Listpatients(){
		return PR.findAll();
	}
    @RequestMapping(value="/SearchPatient",method = RequestMethod.GET)
	public Patient FindPatientBykey(int key){
		return PR.searchPatient(key);
	}

	/*
	 * @RequestMapping(value="/newPatient",method = RequestMethod.POST) public
	 * Patient save(Patient p) { return PR.save(p);
	 * 
	 * }
	 */
    
    @RequestMapping(value="/UpdatePatient",method = RequestMethod.PUT)
    public Patient update(@RequestBody Patient p) {   
    	 return PR.saveAndFlush(p);
    	
    }
	
}
