package com.boockstore.shopping.service;

import com.boockstore.shopping.entities.Categorie;
import com.boockstore.shopping.entities.Livre;

import java.util.List;

public interface LivreServiceInterface {

    List<Livre> retrieveAllLivres();

    Livre addLivre(Livre l);

    void deleteLivre(int id);

    Livre updateLivre(Livre c);

    Livre retrieveLivrebyID(int id);

    Livre retrieveLivrebyCat(Categorie cat);

    Livre retrieveLivrebyAuthor(String author);

}
