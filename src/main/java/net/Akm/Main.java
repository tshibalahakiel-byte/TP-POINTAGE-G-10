package org.example;

// ================= ENUM =================
enum StatutPiece {
    AUTORISEE,
    REFUSEE
}

// ================= CLASSE PIECE =================
class Piece {

    private static String idPiece;
    private static String nomPiece;
    private static StatutPiece statut;

    public Piece(String idPiece, String nomPiece, StatutPiece statut) {
        Piece.idPiece = idPiece;
        Piece.nomPiece = nomPiece;
        Piece.statut = statut;
    }

    public static String getIdPiece() {
        return idPiece;
    }

    public static void setIdPiece(String idPiece) {
        Piece.idPiece = idPiece;
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
// damaris Kazadi catalogue class
public class  cataloguePiece {
    private static String codeCatalogue;

    public cataloguePiece(String codeCatalogue)
    {

    }

    public static String getCodeCatalogue()
    {
        return codeCatalogue;
    }

    public static void setCodeCatalogue(String codeCatalogue)
    {
        cataloguePiece.codeCatalogue = codeCatalogue;
    }
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
