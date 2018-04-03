package pack;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interface {

	private JFrame frame;
	private JTextField textFieldScoreJ1;
	private JTextField textFieldScoreJ2;
	private JTextField textFieldScoreDe1;
	private JTextField textFieldScoreDe2;
	private JLabel lblJoueur1;
	private JLabel lblJoueur2;
	private JButton btnLancerJ1;
	private JButton btnLancerJ2;
	private PartieBean p;
	private JTextField textFieldNombreTour;
	private JTextField txtFieldGagnePerduJ1;
	private JTextField txtFieldGagnePerduJ2;
	private JCheckBox chckbxTricherJ1;
	private JCheckBox chckbxTricherJ2;
	private JButton btnRestart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		p = new PartieBean("Jean", "Bob");
		// p.getJ1().setTricheur(true);

		initialize();
		refreshScreen();

	}

	private void refreshScreen() {

		txtFieldGagnePerduJ2.setVisible(false);
		txtFieldGagnePerduJ1.setVisible(false);

		// Joueur 1

		lblJoueur1.setText(p.getJ1().getPrenom());
		textFieldScoreJ1.setText("" + p.getJ1().getScorePartie());
		chckbxTricherJ1.setSelected(p.getJ1().isTricheur());

		// Joueur 2

		lblJoueur2.setText(p.getJ2().getPrenom());
		textFieldScoreJ2.setText("" + p.getJ2().getScorePartie());
		chckbxTricherJ2.setSelected(p.getJ2().isTricheur());

		// Le nombre de tours

		textFieldNombreTour.setText("" + p.getTourEnCours());

		if (p.finPartie()) {
			btnLancerJ2.setVisible(false);
			btnLancerJ1.setVisible(false);
			btnRestart.setVisible(true);

			if (p.getJ1().getScorePartie() > p.getJ2().getScorePartie()) {
				txtFieldGagnePerduJ1.setText("GAGNE!!!");
				txtFieldGagnePerduJ1.setBackground(Color.green);
				txtFieldGagnePerduJ1.setVisible(true);
				txtFieldGagnePerduJ2.setText("PERDU!!!");
				txtFieldGagnePerduJ2.setBackground(Color.red);
				txtFieldGagnePerduJ2.setVisible(true);
			}

			else if (p.getJ2().getScorePartie() > p.getJ1().getScorePartie()) {
				txtFieldGagnePerduJ2.setText("GAGNE!!!");
				txtFieldGagnePerduJ2.setBackground(Color.green);
				txtFieldGagnePerduJ2.setVisible(true);
				txtFieldGagnePerduJ1.setText("PERDU!!!");
				txtFieldGagnePerduJ1.setBackground(Color.red);
				txtFieldGagnePerduJ1.setVisible(true);
			} else {
				txtFieldGagnePerduJ2.setText("EGALITE!!!");
				txtFieldGagnePerduJ2.setBackground(Color.orange);
				txtFieldGagnePerduJ2.setVisible(true);
				txtFieldGagnePerduJ1.setText("EGALITE!!!");
				txtFieldGagnePerduJ1.setBackground(Color.orange);
				txtFieldGagnePerduJ1.setVisible(true);
			}
		} else {
			btnRestart.setVisible(false);
			if (p.getJoueurActif() == p.getJ1()) {
				btnLancerJ2.setVisible(false);
				btnLancerJ1.setVisible(true);
				textFieldScoreDe1.setText("" + p.getJ2().getGobelet().getD1().getValeur());
				textFieldScoreDe2.setText("" + p.getJ2().getGobelet().getD2().getValeur());
			} else {
				btnLancerJ1.setVisible(false);
				btnLancerJ2.setVisible(true);
				textFieldScoreDe1.setText("" + p.getJ1().getGobelet().getD1().getValeur());
				textFieldScoreDe2.setText("" + p.getJ1().getGobelet().getD2().getValeur());
			}
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnLancerJ1 = new JButton("Lancer");
		btnLancerJ1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// lancer J1

				p.getJ1().lancer();
				if (p.getJ1().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
					p.getJ1().ajouterPts();

				}
				p.setJoueurActif(p.getJ2());
				//SaveLoad.insertPartie(p, p.getJ1(), p.getJ1().getGobelet());
				refreshScreen();

			}
		});
		btnLancerJ1.setBounds(47, 138, 89, 23);
		frame.getContentPane().add(btnLancerJ1);

		btnLancerJ2 = new JButton("Lancer");
		btnLancerJ2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p.getJ2().lancer();
				if (p.getJ2().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
					p.getJ2().ajouterPts();

				}
				p.setJoueurActif(p.getJ1());
				p.setTourEnCours(p.getTourEnCours() + 1);
				refreshScreen();
			}
		});
		btnLancerJ2.setBounds(311, 138, 89, 23);
		frame.getContentPane().add(btnLancerJ2);

		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p = new PartieBean("Jean", "Bob");
				refreshScreen();
			}
		});
		btnRestart.setBounds(179, 207, 89, 23);
		frame.getContentPane().add(btnRestart);

		JLabel lblScoreJ1 = new JLabel("Score");
		lblScoreJ1.setBounds(47, 65, 36, 29);
		frame.getContentPane().add(lblScoreJ1);

		JLabel lblScoreJ2 = new JLabel("Score");
		lblScoreJ2.setBounds(311, 65, 36, 29);
		frame.getContentPane().add(lblScoreJ2);

		textFieldScoreJ1 = new JTextField();
		textFieldScoreJ1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreJ1.setText("42");
		textFieldScoreJ1.setBounds(88, 69, 31, 20);
		frame.getContentPane().add(textFieldScoreJ1);
		textFieldScoreJ1.setColumns(10);

		textFieldScoreJ2 = new JTextField();
		textFieldScoreJ2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreJ2.setText("42");
		textFieldScoreJ2.setColumns(10);
		textFieldScoreJ2.setBounds(352, 69, 31, 20);
		frame.getContentPane().add(textFieldScoreJ2);

		textFieldScoreDe1 = new JTextField();
		textFieldScoreDe1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreDe1.setText("42");
		textFieldScoreDe1.setBounds(147, 87, 53, 46);
		frame.getContentPane().add(textFieldScoreDe1);
		textFieldScoreDe1.setColumns(10);

		textFieldScoreDe2 = new JTextField();
		textFieldScoreDe2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreDe2.setText("42");
		textFieldScoreDe2.setColumns(10);
		textFieldScoreDe2.setBounds(230, 87, 53, 46);
		frame.getContentPane().add(textFieldScoreDe2);

		JLabel lblDe1 = new JLabel("DE 1");
		lblDe1.setBounds(147, 65, 46, 14);
		frame.getContentPane().add(lblDe1);

		JLabel lblDe2 = new JLabel("DE 2 ");
		lblDe2.setBounds(230, 65, 46, 14);
		frame.getContentPane().add(lblDe2);

		lblJoueur1 = new JLabel("Joueur 1 ");
		lblJoueur1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJoueur1.setBounds(64, 25, 53, 14);
		frame.getContentPane().add(lblJoueur1);

		JLabel lblTour = new JLabel("Tour :");
		lblTour.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTour.setBounds(181, 24, 53, 14);
		frame.getContentPane().add(lblTour);

		lblJoueur2 = new JLabel("Joueur 2");
		lblJoueur2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJoueur2.setBounds(327, 25, 56, 14);
		frame.getContentPane().add(lblJoueur2);

		textFieldNombreTour = new JTextField();
		textFieldNombreTour.setText("42");
		textFieldNombreTour.setBounds(223, 22, 24, 20);
		frame.getContentPane().add(textFieldNombreTour);
		textFieldNombreTour.setColumns(10);

		txtFieldGagnePerduJ1 = new JTextField();
		txtFieldGagnePerduJ1.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldGagnePerduJ1.setBackground(Color.RED);
		txtFieldGagnePerduJ1.setText("PERDU!!!");
		txtFieldGagnePerduJ1.setBounds(98, 22, 62, 20);
		frame.getContentPane().add(txtFieldGagnePerduJ1);
		txtFieldGagnePerduJ1.setColumns(10);

		txtFieldGagnePerduJ2 = new JTextField();
		txtFieldGagnePerduJ2.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldGagnePerduJ2.setText("PERDU!!!");
		txtFieldGagnePerduJ2.setColumns(10);
		txtFieldGagnePerduJ2.setBackground(Color.RED);
		txtFieldGagnePerduJ2.setBounds(255, 22, 62, 20);
		frame.getContentPane().add(txtFieldGagnePerduJ2);

		chckbxTricherJ1 = new JCheckBox("Tricher");
		chckbxTricherJ1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				p.getJ1().setTricheur(chckbxTricherJ1.isSelected());
				refreshScreen();
			}
		});

		chckbxTricherJ1.setBounds(22, 101, 97, 23);
		frame.getContentPane().add(chckbxTricherJ1);

		chckbxTricherJ2 = new JCheckBox("Tricher");
		chckbxTricherJ2.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				p.getJ2().setTricheur(chckbxTricherJ2.isSelected());
				refreshScreen();
			}
		});

		chckbxTricherJ2.setBounds(303, 101, 97, 23);
		frame.getContentPane().add(chckbxTricherJ2);
	}
}
