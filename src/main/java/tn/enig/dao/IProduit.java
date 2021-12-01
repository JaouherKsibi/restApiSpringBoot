package tn.enig.dao;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Parent;
import org.hibernate.query.QueryParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import tn.enig.model.Produit;
@Repository
public interface IProduit extends JpaRepository<Produit, Integer> {
	
	@Query("select p from Produit p where p.magasin.id=?1")
	public List<Produit> getAllProductsByIdMagasin(int id);

}
