package fst.hns.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import fst.hns.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{
@Query("select p from patient p where p.keyHNS like :x")
public Patient searchPatient(@PathVariable("x")int Key);
}
