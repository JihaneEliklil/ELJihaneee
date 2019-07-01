package fst.hns.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sector")
public class Sector implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idSector")
	private long idSector;
	@Column(name="sectorDescription")
    private String sectorDescription;
    
	public Sector() {
		super();
	}
	public Sector(String sectorDescription) {
		super();
		this.sectorDescription = sectorDescription;
	}
	public long getIdSector() {
		return idSector;
	}
	public void setIdSector(long idSector) {
		this.idSector = idSector;
	}
	public String getSectorDescription() {
		return sectorDescription;
	}
	public void setSectorDescription(String sectorDescription) {
		this.sectorDescription = sectorDescription;
	}
    
    
    
}
