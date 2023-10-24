package org.example.Service;


import java.sql.*;
import javax.jws.*;
import java.util.*;
import java.util.Date;
import org.example.Entity.Compte;
import java.text.SimpleDateFormat;
import org.example.DataBase.DataBase;
import org.jasypt.util.password.StrongPasswordEncryptor;


@WebService(serviceName = "banquews")
public class BanqueService {

    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    private static Connection conn;
    private Compte c;
    private ArrayList<Compte> ListCompte;

    public BanqueService() {
        DataBase db = new DataBase();
        conn = db.getConnection();
    }

    /*---------------------------------addCompte-------------------------------------------*/
    @WebMethod(operationName = "add")
    public void addCompte(@WebParam(name = "code") Long code, @WebParam(name = "dateCreation") String dateCreationStr, @WebParam(name = "solde") Double solde,@WebParam(name = "MDP")String mdp) {
        try {

            StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
            String pc = passwordEncryptor.encryptPassword(mdp);
            if (ListCompte == null) {
                ListCompte = new ArrayList<Compte>();
            }
            Date dateCreation = dateFormat.parse(dateCreationStr);
            String query = "INSERT INTO banque (code, dateCreation, solde,mdp) VALUES (?, ?, ?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, code);
            ps.setDate(2, new java.sql.Date(dateCreation.getTime()));
            ps.setDouble(3, solde);
            ps.setString(4, pc);
            ps.executeUpdate();
            Compte c = new Compte(code, dateCreation, solde,mdp);
            ListCompte.add(c);
            System.out.println("Compte ajouté avec succès : " );
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors de l'ajout du compte : " + e.getMessage());
        }
    }


    /*---------------------------------retirerCompte-------------------------------------------*/

    @WebMethod(operationName = "retirerCompte")
    public void retirerCompte(@WebParam(name = "code") Long code) {
        try {
            String query = "DELETE FROM banque   WHERE code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setLong(1, code);
            pstmt.executeUpdate();
            System.out.println("Compte  deleted SUCCESSFULLY .");
        } catch (Exception e) {
            System.out.println("failed to delete Compte : " + e.getMessage());
        }
    }



    /*---------------------------------afficherlisteComptes-------------------------------------------*/
    @WebMethod(operationName = "afficherlisteComptes")
    public String afficherlisteComptes() {
        try {
            String query = "SELECT * FROM banque";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String a = "";
            while (rs.next()) {
                Long code = rs.getLong("code");
                Date dateCreation = rs.getDate("dateCreation");
                Double solde = rs.getDouble("solde");
                String mdp = rs.getString("MDP");
                a += "Code: " + code + ", Date of Creation: " + dateCreation + ", Solde: " + solde + ",mot de passe : " + mdp + '\n';
            }

            rs.close();
            stmt.close();
            return a;
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the account list: " + e.getMessage());
        }
        return null;
    }


    /*---------------------------------ajouterMontant-------------------------------------------*/
    @WebMethod(operationName = "ajouterMontant")
    public void ajouterMontant(@WebParam(name = "code") Long code, @WebParam(name = "montant") double mnt) {
        try {
            String query = "UPDATE banque SET solde = solde + ? WHERE code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, mnt);
            pstmt.setLong(2, code);
            pstmt.executeUpdate();
            System.out.println("Montant ajouté avec succès.");
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors de l'ajout du montant : " + e.getMessage());
        }
    }


    /*---------------------------------retirerMontant-------------------------------------------*/
    @WebMethod(operationName = "retirerMontant")
    public void retirerMontant(@WebParam(name = "code") Long code, @WebParam(name = "montant") double mnt) {
        try {
            String query = "UPDATE banque SET solde = solde - ? WHERE code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, mnt);
            pstmt.setLong(2, code);
            pstmt.executeUpdate();
            System.out.println("Montant retiré avec succès.");
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors du retrait du montant : " + e.getMessage());
        }
    }



    /*---------------------------------convertir-------------------------------------------*/
    @WebMethod(operationName = "convertir")
    public double ConvertirEuroToDT(@WebParam(name = "montant") double mnt) {
        try {
            return mnt *= 3.36;
        } catch (Exception e) {
            return 0;
        }

    }

}