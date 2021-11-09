package com.boockstore.shopping.service;

import com.boockstore.shopping.entities.Categorie;
import com.boockstore.shopping.entities.Livre;
import com.boockstore.shopping.repository.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreService implements LivreServiceInterface {


    @Autowired LivreRepo livre;


    @Override
    public List<Livre> retrieveAllLivres() {
        ArrayList<Livre> listlivre= (ArrayList<Livre>)livre.findAll();
        return  listlivre;
    }

    @Override
    public Livre addLivre(Livre l) {
       livre.save(l);
       return l;
    }

    @Override
    public void deleteLivre(int id) {
    livre.deleteById(id);
    }

    @Override
    public Livre updateLivre(Livre l) {
        livre.save(l);
        return l;
    }

    @Override
    public Livre retrieveLivrebyID (int id) {
        Livre l1= livre.findById(id).orElse(null);
        return l1;
    }

    @Override
    public Livre retrieveLivrebyCat(Categorie cat) {
        return null;
    }

    @Override
    public Livre retrieveLivrebyAuthor(String author) {
        return null;
    }
}
