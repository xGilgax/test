package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveLoad {
	public static String URL = "jdbc:sqlite:C:/Users/JAVA/Desktop/Logiciels/SQL/SQLiteStudio/baseJeuDe";

	private final static String QUERY_SAVE_PARTIE = "INSERT INTO JeuDe (prenom, score, joueurActif,d1,d2,tricheur,nombreDeTour);";
	private final static String QUERY_FIND_PARTIE = "SELECT * FROM eleve ";

	public static void insertPartie(PartieBean partie, JoueurBean joueur, GobeletBean gobelet) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL); // La connexion
			stmt = con.prepareStatement(QUERY_SAVE_PARTIE);
			// Remplir la requête
			stmt.setString(1, joueur.getPrenom());
			stmt.setInt(2, joueur.getScorePartie());
			stmt.setString(3, partie.getJoueurActif().getPrenom());
			stmt.setInt(4, gobelet.getD1().valeur);
			stmt.setInt(5, gobelet.getD2().valeur);
			stmt.setBoolean(6, joueur.isTricheur());
			stmt.setInt(7, partie.getTourEnCours());

			// Lancer la requête
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// On ferme la connexion
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
