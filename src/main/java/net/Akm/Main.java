package org.example;

public class Piece {
    private String idPiece;
    private String nomPiece;
    private String fournisseur;    // NOUVEAU : ajout d'un attribut
    private StatutPiece statut;

    // Constructeur amélioré
    public Piece(String idPiece, String nomPiece, String fournisseur, StatutPiece statut) {
        this.idPiece = idPiece;
        this.nomPiece = nomPiece;
        this.fournisseur = fournisseur;  // NOUVEAU
        this.statut = statut;
    }

    // Getters
    public String getIdPiece() { return idPiece; }
    public String getNomPiece() { return nomPiece; }
    public String getFournisseur() { return fournisseur; }  // NOUVEAU
    public StatutPiece getStatut() { return statut; }

    // Setters
    public void setFournisseur(String fournisseur) {  // NOUVEAU
        this.fournisseur = fournisseur;
    }
    
    // Méthode toString améliorée
    @Override
    public String toString() {
        return idPiece + " - " + nomPiece + " (" + fournisseur + ") - " + statut;
    }
}