package tn.enig.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magasin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String lieu;
	public Magasin() {
		// TODO Auto-generated constructor stub
	}

	public Magasin(Integer id, String nom, String lieu) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	

}
