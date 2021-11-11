package com.boockstore.shopping.entities;



import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private   String nom;
    private String prenom;
    private  String login;
    private  String pwd;
    private String email;
    private String roles;
    private boolean active;
        public User() {
        }

    public User(int id, String nom, String prenom, String login, String pwd, String email, String roles, boolean active) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
        this.email = email;
        this.roles = roles;
        this.active = active;
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
       public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
        public String toString() {
            return "User{" +
                    "login='" + login + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }


