package com.example.produits;

import java.util.Date;
import java.util.List;

import com.example.produits.model.Produit;
import com.example.produits.repos.ProduitRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit(){

		produitRepository.save(new Produit("PC Dell",2200.500,new Date()));
	}
	@Test
	public void testUpdateProduit(){
		Produit p = produitRepository.findById(3L).get();
		p.setPrixProduit(3000.500);
		produitRepository.save(p);
		System.out.println(p);
	}
	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(2L);
	}
	@Test
	public void testListerTousProduits() {
		List<Produit> prods = produitRepository.findAll();
		for(Produit p : prods){
			System.out.println(p);
		}
	}
}
