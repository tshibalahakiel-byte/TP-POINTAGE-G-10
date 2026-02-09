package net.Akm;

package org.example;

// ================= ENUM =================
enum StatutPiece {
    AUTORISEE,
    REFUSEE
}

// ================= 1. PIECE =================S
class Piece {
    private static String idPiece;
    private static String nomPiece;

    public Piece(String idPiece, String nomPiece) {
        Piece.idPiece = idPiece;
        Piece.nomPiece = nomPiece;
    }

    static String getIdPiece() {
        return idPiece;
    }

    static void setIdPiece(String idPiece) {
        Piece.idPiece = idPiece;
    }

    static String getNomPiece() {
        return nomPiece;
    }

    static void setNomPiece(String nomPiece) {
        Piece.nomPiece = nomPiece;
    }
}

// ================= 2. CATALOGUE PIECE =================
class CataloguePiece {
    private static String codeCatalogue;

    public CataloguePiece(String codeCatalogue) {
        CataloguePiece.codeCatalogue = codeCatalogue;
    }

    static String getCodeCatalogue() {
        return codeCatalogue;
    }

    static void setCodeCatalogue(String codeCatalogue) {
        CataloguePiece.codeCatalogue = codeCatalogue;
    }
}

// ================= 3. CONTROLE PIECE =================
class ControlePiece {
    static boolean verifierPiece(String pieceId) {
        if (pieceId.equals("P001") ||
                pieceId.equals("P002") ||
                pieceId.equals("P003")) {
            return true;
        }
        return false;
    }
}

// ================= 4. PIECE STATUT =================
class PieceStatut {
    private static StatutPiece statut;

    public PieceStatut(StatutPiece statut) {
        PieceStatut.statut = statut;
    }

    static StatutPiece getStatut() {
        return statut;
    }

    static void setStatut(StatutPiece statut) {
        PieceStatut.statut = statut;
    }
}

// ================= 5. PIECE SERVICE =================
class PieceService {
    static boolean autoriser(String id) {
        return ControlePiece.verifierPiece(id);
    }
}

// ================= 6. PIECE VALIDATION =================
class PieceValidation {
    static boolean valider(String id) {
        return id != null && !id.isEmpty();
    }
}

// ================= 7. PIECE IDENTIFIANT =================
class PieceIdentifiant {
    private static String identifiant;

    public PieceIdentifiant(String identifiant) {
        PieceIdentifiant.identifiant = identifiant;
    }

    static String getIdentifiant() {
        return identifiant;
    }

    static void setIdentifiant(String identifiant) {
        PieceIdentifiant.identifiant = identifiant;
    }
}

// ================= 8. PIECE NOM =================
class PieceNom {
    private static String nom;

    public PieceNom(String nom) {
        PieceNom.nom = nom;
    }

    static String getNom() {
        return nom;
    }

    static void setNom(String nom) {
        PieceNom.nom = nom;
    }
}

// ================= 9. PIECE REGLE =================
class PieceRegle {
    static boolean regleAutorisation(String id) {
        return id.startsWith("P");
    }
}

// ================= 10. PIECE CONTEXT =================
class PieceContext {
    static boolean traiterPiece(String id) {
        if (!PieceValidation.valider(id)) return false;
        if (!PieceRegle.regleAutorisation(id)) return false;
        return PieceService.autoriser(id);
    }
}

// ================= MAIN =================
public class Main {
    public static void main(String[] args) {

        boolean resultat = PieceContext.traiterPiece("P001");

        if (resultat) {
            System.out.println("Pièce autorisée");
        } else {
            System.out.println("Pièce refusée");
        }
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        }
    }
}
