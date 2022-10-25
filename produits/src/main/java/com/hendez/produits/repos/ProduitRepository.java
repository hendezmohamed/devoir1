package com.hendez.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hendez.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
