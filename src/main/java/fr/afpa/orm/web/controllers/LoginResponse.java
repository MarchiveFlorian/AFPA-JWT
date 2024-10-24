package fr.afpa.orm.web.controllers;

public class LoginResponse {
    private String token;

    private long expiresIn;
    
    // Getters and setters...
    public String getToken() {
        return token;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    // Setters avec retour de l'instance courante pour permettre l'enchaînement
    public LoginResponse setToken(String token) {
        this.token = token;
        return this; // Retourne l'objet courant pour l'enchaînement
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this; // Retourne l'objet courant pour l'enchaînement
    }
}
