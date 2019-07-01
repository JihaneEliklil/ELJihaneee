package fst.hns.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="patient")
@Table(name="patient")
public class Patient implements Serializable{
	public Patient(String firstNameP, String lastNameP, int keyHNS) {
		super();
		this.firstNameP = firstNameP;
		this.lastNameP = lastNameP;
		this.keyHNS = keyHNS;
	}
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPatient;
	@Column(name="firstNameP")
	private String firstNameP;
	@Column(name="lastNameP")
	private String lastNameP;
	private Date birthDateP;
	private int socialSecurityNumberP;
	private String adressP,buildingP;
	private int floorP,doorNumberP,accessCodeP;
	private int phoneNumberP;
	private String referentNameP;
	private int referentphoneP;
	@Column(name="keyHNS")
	private int keyHNS;
	private String doctorsName,doctorsAdress;
	private int doctorsPhone;
	private String pharmacyName;
	private int pharmacyPhone;
	private String laboratoryName;
	private int laboratoryPhone;
	private String priorityOrder;
	private Date passDay;
	private String typeOfNursingStuff;
	private int numberOfNursingStuff;
	private String rattachementSector;
	public Patient() {
		super();
	}
	public Patient(String firstNameP, String lastNameP, Date birthDateP, int socialSecurityNumberP, String adressP,
			String buildingP, int floorP, int doorNumberP, int accessCodeP, int phoneNumberP, String referentNameP,
			int referentphoneP, int keyHNS, String doctorsName, String doctorsAdress, int doctorsPhone,
			String pharmacyName, int pharmacyPhone, String laboratoryName, int laboratoryPhone, String priorityOrder,
			Date passDay, String typeOfNursingStuff, int numberOfNursingStuff, String rattachementSector) {
		super();
		this.firstNameP = firstNameP;
		this.lastNameP = lastNameP;
		this.birthDateP = birthDateP;
		this.socialSecurityNumberP = socialSecurityNumberP;
		this.adressP = adressP;
		this.buildingP = buildingP;
		this.floorP = floorP;
		this.doorNumberP = doorNumberP;
		this.accessCodeP = accessCodeP;
		this.phoneNumberP = phoneNumberP;
		this.referentNameP = referentNameP;
		this.referentphoneP = referentphoneP;
		this.keyHNS = keyHNS;
		this.doctorsName = doctorsName;
		this.doctorsAdress = doctorsAdress;
		this.doctorsPhone = doctorsPhone;
		this.pharmacyName = pharmacyName;
		this.pharmacyPhone = pharmacyPhone;
		this.laboratoryName = laboratoryName;
		this.laboratoryPhone = laboratoryPhone;
		this.priorityOrder = priorityOrder;
		this.passDay = passDay;
		this.typeOfNursingStuff = typeOfNursingStuff;
		this.numberOfNursingStuff = numberOfNursingStuff;
		this.rattachementSector = rattachementSector;
	}
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	public String getFirstNameP() {
		return firstNameP;
	}
	public void setFirstNameP(String firstNameP) {
		this.firstNameP = firstNameP;
	}
	public String getLastNameP() {
		return lastNameP;
	}
	public void setLastNameP(String lastNameP) {
		this.lastNameP = lastNameP;
	}
	public Date getBirthDateP() {
		return birthDateP;
	}
	public void setBirthDateP(Date birthDateP) {
		this.birthDateP = birthDateP;
	}
	public Patient(String firstNameP, String lastNameP) {
		super();
		this.firstNameP = firstNameP;
		this.lastNameP = lastNameP;
	}
	public int getSocialSecurityNumberP() {
		return socialSecurityNumberP;
	}
	public void setSocialSecurityNumberP(int socialSecurityNumberP) {
		this.socialSecurityNumberP = socialSecurityNumberP;
	}
	public String getAdressP() {
		return adressP;
	}
	public void setAdressP(String adressP) {
		this.adressP = adressP;
	}
	public String getBuildingP() {
		return buildingP;
	}
	public void setBuildingP(String buildingP) {
		this.buildingP = buildingP;
	}
	public int getFloorP() {
		return floorP;
	}
	public void setFloorP(int floorP) {
		this.floorP = floorP;
	}
	public int getDoorNumberP() {
		return doorNumberP;
	}
	public void setDoorNumberP(int doorNumberP) {
		this.doorNumberP = doorNumberP;
	}
	public int getAccessCodeP() {
		return accessCodeP;
	}
	public void setAccessCodeP(int accessCodeP) {
		this.accessCodeP = accessCodeP;
	}
	public int getPhoneNumberP() {
		return phoneNumberP;
	}
	public void setPhoneNumberP(int phoneNumberP) {
		this.phoneNumberP = phoneNumberP;
	}
	public String getReferentNameP() {
		return referentNameP;
	}
	public void setReferentNameP(String referentNameP) {
		this.referentNameP = referentNameP;
	}
	public int getReferentphoneP() {
		return referentphoneP;
	}
	public void setReferentphoneP(int referentphoneP) {
		this.referentphoneP = referentphoneP;
	}
	public int getKeyHNS() {
		return keyHNS;
	}
	public void setKeyHNS(int keyHNS) {
		this.keyHNS = keyHNS;
	}
	public String getDoctorsName() {
		return doctorsName;
	}
	public void setDoctorsName(String doctorsName) {
		this.doctorsName = doctorsName;
	}
	public String getDoctorsAdress() {
		return doctorsAdress;
	}
	public void setDoctorsAdress(String doctorsAdress) {
		this.doctorsAdress = doctorsAdress;
	}
	public int getDoctorsPhone() {
		return doctorsPhone;
	}
	public void setDoctorsPhone(int doctorsPhone) {
		this.doctorsPhone = doctorsPhone;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public int getPharmacyPhone() {
		return pharmacyPhone;
	}
	public void setPharmacyPhone(int pharmacyPhone) {
		this.pharmacyPhone = pharmacyPhone;
	}
	public String getLaboratoryName() {
		return laboratoryName;
	}
	public void setLaboratoryName(String laboratoryName) {
		this.laboratoryName = laboratoryName;
	}
	public int getLaboratoryPhone() {
		return laboratoryPhone;
	}
	public void setLaboratoryPhone(int laboratoryPhone) {
		this.laboratoryPhone = laboratoryPhone;
	}
	public String getPriorityOrder() {
		return priorityOrder;
	}
	public void setPriorityOrder(String priorityOrder) {
		this.priorityOrder = priorityOrder;
	}
	public Date getPassDay() {
		return passDay;
	}
	public void setPassDay(Date passDay) {
		this.passDay = passDay;
	}
	public String getTypeOfNursingStuff() {
		return typeOfNursingStuff;
	}
	public void setTypeOfNursingStuff(String typeOfNursingStuff) {
		this.typeOfNursingStuff = typeOfNursingStuff;
	}
	public int getNumberOfNursingStuff() {
		return numberOfNursingStuff;
	}
	public void setNumberOfNursingStuff(int numberOfNursingStuff) {
		this.numberOfNursingStuff = numberOfNursingStuff;
	}
	public String getRattachementSector() {
		return rattachementSector;
	}
	public void setRattachementSector(String rattachementSector) {
		this.rattachementSector = rattachementSector;
	}
	
}

