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

    public static String getNomPiece() {
        return nomPiece;
    }

    public static void setNomPiece(String nomPiece) {
        Piece.nomPiece = nomPiece;
    }

    public static StatutPiece getStatut() {
        return statut;
    }

    public static void setStatut(StatutPiece statut) {
        Piece.statut = statut;
    }
}

// ================= CONTROLE =================
class ControlePiece {

    static boolean verifierPiece(String pieceId) {

        if (pieceId.equals("P001") ||
            pieceId.equals("P002") ||
            pieceId.equals("P003")) {

            Piece.setStatut(StatutPiece.AUTORISEE);
            return true;
        }

        Piece.setStatut(StatutPiece.REFUSEE);
        return false;
    }
}
//sonyi kaji jael
 class  PieceStatut{
    private static StatutPiece statut;
    public PieceStatut(StatutPiece statut){
        PieceStatut.statut=statut;

    }


    public static StatutPiece getStatut() {
        return statut;
    }

    public static void setStatut(StatutPiece statut) {
        PieceStatut.statut = statut;
    }
}
// damaris Kazadi catalogue class
 class  cataloguePiece {
    private static String codeCatalogue;

    public cataloguePiece(String codeCatalogue) {

    }


    public static String getCodeCatalogue() {
        return codeCatalogue;
    }

    public static void setCodeCatalogue(String codeCatalogue) {
        cataloguePiece.codeCatalogue = codeCatalogue;
    }
}
public class Configuration {
    
    public static final String NOM_PROJET = "TP Pointage Production";
    public static final String VERSION = "1.0";
    public static final String GROUPE = "Groupe 10";
    
    // Constructeur privé pour éviter l'instanciation
    private Configuration() {
        // Classe utilitaire
    }
}

public
// ================= MAIN =================
public class Main {
    public static void main(String[] args) {

        if (!ControlePiece.verifierPiece("P001")) {
            System.out.println("Pièce refusée");
        } else {
            System.out.println("Pièce autorisée");
        }
    }
}
