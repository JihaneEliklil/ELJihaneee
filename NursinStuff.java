package fst.hns.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@Entity(name="nursinStuff")
public class NursinStuff implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNursingStuff;
	private String firstNameN;
	private String LastNameN;
	private Date birthDateN;
	private int SocialSecurityNumberN;
	private String TypeN;
	private String adressN,buildingN;
	private int floorN,doorNumberN,accessCodeN;
	private String referentNameN;
	private Sector rattachementSector;
	public NursinStuff(String firstNameN, String lastNameN, Date birthDateN, int socialSecurityNumberN, String typeN,
			String adressN, String buildingN, int floorN, int doorNumberN, int accessCodeN, String referentNameN,
			Sector rattachementSector) {
		super();
		this.firstNameN = firstNameN;
		LastNameN = lastNameN;
		this.birthDateN = birthDateN;
		SocialSecurityNumberN = socialSecurityNumberN;
		TypeN = typeN;
		this.adressN = adressN;
		this.buildingN = buildingN;
		this.floorN = floorN;
		this.doorNumberN = doorNumberN;
		this.accessCodeN = accessCodeN;
		this.referentNameN = referentNameN;
		this.rattachementSector = rattachementSector;
	}
	public long getIdNursingStuff() {
		return idNursingStuff;
	}
	public void setIdNursingStuff(long idNursingStuff) {
		this.idNursingStuff = idNursingStuff;
	}
	public String getFirstNameN() {
		return firstNameN;
	}
	public void setFirstNameN(String firstNameN) {
		this.firstNameN = firstNameN;
	}
	public String getLastNameN() {
		return LastNameN;
	}
	public void setLastNameN(String lastNameN) {
		LastNameN = lastNameN;
	}
	public Date getBirthDateN() {
		return birthDateN;
	}
	public void setBirthDateN(Date birthDateN) {
		this.birthDateN = birthDateN;
	}
	public int getSocialSecurityNumberN() {
		return SocialSecurityNumberN;
	}
	public void setSocialSecurityNumberN(int socialSecurityNumberN) {
		SocialSecurityNumberN = socialSecurityNumberN;
	}
	public String getTypeN() {
		return TypeN;
	}
	public void setTypeN(String typeN) {
		TypeN = typeN;
	}
	public String getAdressN() {
		return adressN;
	}
	public void setAdressN(String adressN) {
		this.adressN = adressN;
	}
	public String getBuildingN() {
		return buildingN;
	}
	public void setBuildingN(String buildingN) {
		this.buildingN = buildingN;
	}
	public int getFloorN() {
		return floorN;
	}
	public void setFloorN(int floorN) {
		this.floorN = floorN;
	}
	public int getDoorNumberN() {
		return doorNumberN;
	}
	public void setDoorNumberN(int doorNumberN) {
		this.doorNumberN = doorNumberN;
	}
	public int getAccessCodeN() {
		return accessCodeN;
	}
	public void setAccessCodeN(int accessCodeN) {
		this.accessCodeN = accessCodeN;
	}
	public String getReferentNameN() {
		return referentNameN;
	}
	public void setReferentNameN(String referentNameN) {
		this.referentNameN = referentNameN;
	}
	public Sector getRattachementSector() {
		return rattachementSector;
	}
	public void setRattachementSector(Sector rattachementSector) {
		this.rattachementSector = rattachementSector;
	}
	

}
