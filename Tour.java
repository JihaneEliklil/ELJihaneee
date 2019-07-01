package fst.hns.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
@Entity(name="tour")
public class Tour implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTour;
//	@OneToMany(mappedBy = "nursinStuff")
//	@JoinColumn(name="idNursingStuff")
	private long idNursingStuff;
	//@OneToMany(mappedBy = "patient")
	//@JoinColumn(name="idPatient")
	private long idPatient;
	public Tour(long idNursingStuff, long idPatient) {
		super();
		this.idNursingStuff = idNursingStuff;
		this.idPatient = idPatient;
	}
	public long getIdTour() {
		return idTour;
	}
	public void setIdTour(long idTour) {
		this.idTour = idTour;
	}
	public long getIdNursingStuff() {
		return idNursingStuff;
	}
	public void setIdNursingStuff(long idNursingStuff) {
		this.idNursingStuff = idNursingStuff;
	}
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
}
