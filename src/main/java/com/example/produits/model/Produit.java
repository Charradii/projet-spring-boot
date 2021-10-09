package com.example.produits.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Produit {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreation;


    public Produit() {
    }

    public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreation = dateCreation;
    }

    /**
     * @return Long return the idProduit
     */
    public Long getIdProduit() {
        return idProduit;
    }

    /**
     * @param idProduit the idProduit to set
     */
    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    /**
     * @return String return the nomProduit
     */
    public String getNomProduit() {
        return nomProduit;
    }

    /**
     * @param nomProduit the nomProduit to set
     */
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    /**
     * @return Double return the prixProduit
     */
    public Double getPrixProduit() {
        return prixProduit;
    }

    /**
     * @param prixProduit the prixProduit to set
     */
    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    /**
     * @return Date return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Produit [dateCreation=" + dateCreation + ", idProduit=" + idProduit + ", nomProduit=" + nomProduit
                + ", prixProduit=" + prixProduit + "]";
    }

    
}
