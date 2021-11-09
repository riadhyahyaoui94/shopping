package com.boockstore.shopping.repository;

import com.boockstore.shopping.entities.Categorie;
import com.boockstore.shopping.entities.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepo extends CrudRepository<Livre,Integer> {
}

