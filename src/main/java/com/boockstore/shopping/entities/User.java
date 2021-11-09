package com.boockstore.shopping.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private   String nom;
    private String prenom;
    private  String login;
    private  String pwd;
    private String email;

        public User() {
        }

        public User(int id, String nom, String prenom, String login, String pwd, String email) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.login = login;
            this.pwd = pwd;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getLogin() {
            return login;
        }

        public String getPwd() {
            return pwd;
        }

        public String getEmail() {
            return email;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "login='" + login + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }


