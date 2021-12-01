package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private int quantite;
	private float prixAchat;
	private float prixVente;
	@ManyToOne
	@JoinColumn(name="mag_id")
	private Magasin magasin;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(Integer id, String description, int quantite, float prixAchat, float prixVente, Magasin magasin) {
		super();
		this.id = id;
		this.description = description;
		this.quantite = quantite;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.magasin = magasin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	public float getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
	


	
	
	
	

}
