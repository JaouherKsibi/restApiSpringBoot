package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IMagasin;
import tn.enig.dao.IProduit;
import tn.enig.model.Magasin;
import tn.enig.model.Produit;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class ServiceMagasin {
	
	@Autowired
	IMagasin daoMagasin;
	public void setDaoMagasin(IMagasin daoMagasin) {
		this.daoMagasin = daoMagasin;
	}
	
	@Autowired
	IProduit daoProduit;
	public void setDaoProduit(IProduit daoProduit) {
		this.daoProduit = daoProduit;
	}
	
	
	
	@RequestMapping("/getAllMagasin")
	public List<Magasin> fn1(){
		return daoMagasin.findAll();
	}
	
	@RequestMapping("/getAllProducts")
	public List<Produit> fn2(){
		return daoProduit.findAll();
	}
	
	
	@PostMapping("/addProduit")
	public void gn(@RequestBody Produit p ) {
		System.out.println("jjjjj");
		daoProduit.save(p);
		
	}
	@PostMapping("/addMagasin")
	public void gn1(@RequestBody Magasin m ) {
		daoMagasin.save(m);
		
	}
	
	
	@RequestMapping("/getProductsByIdMagasin/{id}")
	public List<Produit> f(@PathVariable("id") int id){
		return daoProduit.getAllProductsByIdMagasin(id);
	}
	
	
	
	
	

}
