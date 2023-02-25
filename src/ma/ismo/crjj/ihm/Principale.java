package ma.ismo.crjj.ihm;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principale extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JPanel body;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale frame = new Principale();
					frame.setVisible(true);
					frame.pack();
					frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principale() {
		setTitle("Application de gestion des vols");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel menu = new JPanel();
		menu.setBorder(new EmptyBorder(0, 0, 0, 0));
		menu.setBackground(new Color(0, 0, 0));
		contentPane.add(menu, BorderLayout.WEST);
		GridBagLayout gbl_menu = new GridBagLayout();
		gbl_menu.columnWidths = new int[] { 159 };
		gbl_menu.rowHeights = new int[] { 14, 10, 10, 10, 10, 10, 10, 0 };
		gbl_menu.columnWeights = new double[] { 0.0 };
		gbl_menu.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		menu.setLayout(gbl_menu);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		ImageIcon image = new ImageIcon(getClass().getResource("/icon.jpg"));
		lblNewLabel.setIcon(image);
		menu.add(lblNewLabel, gbc_lblNewLabel);

		MyButton btnNewButton = new MyButton("Dashboard","/dashboard.png");
		btnNewButton.addActionListener(this);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		menu.add(btnNewButton, gbc_btnNewButton);

		MyButton btnLesPiotes = new MyButton("Les pilotes", "/pilote.png");
		btnLesPiotes.addActionListener(this);
		GridBagConstraints gbc_btnLesPiotes = new GridBagConstraints();
		gbc_btnLesPiotes.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesPiotes.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesPiotes.gridx = 0;
		gbc_btnLesPiotes.gridy = 2;
		menu.add(btnLesPiotes, gbc_btnLesPiotes);

		MyButton btnLesAvions = new MyButton("Les avions","/plane.png");
		btnLesAvions.addActionListener(this);
		GridBagConstraints gbc_btnLesAvions = new GridBagConstraints();
		gbc_btnLesAvions.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesAvions.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesAvions.gridx = 0;
		gbc_btnLesAvions.gridy = 3;
		menu.add(btnLesAvions, gbc_btnLesAvions);

		MyButton btnLesTrajets = new MyButton("Les trajets", "/trajet.png");
		btnLesTrajets.addActionListener(this);
		GridBagConstraints gbc_btnLesTrajets = new GridBagConstraints();
		gbc_btnLesTrajets.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesTrajets.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesTrajets.gridx = 0;
		gbc_btnLesTrajets.gridy = 4;
		menu.add(btnLesTrajets, gbc_btnLesTrajets);

		MyButton btnLesVols = new MyButton("Les vols","/vol.png");
		btnLesVols.addActionListener(this);
		GridBagConstraints gbc_btnLesVols = new GridBagConstraints();
		gbc_btnLesVols.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesVols.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesVols.gridx = 0;
		gbc_btnLesVols.gridy = 5;
		menu.add(btnLesVols, gbc_btnLesVols);

		MyButton btnReporting = new MyButton("Reporting", "/reporting.png");
		btnReporting.addActionListener(this);
		GridBagConstraints gbc_btnReporting = new GridBagConstraints();
		gbc_btnReporting.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReporting.gridx = 0;
		gbc_btnReporting.gridy = 6;
		menu.add(btnReporting, gbc_btnReporting);

		body = new JPanel();
		contentPane.add(body, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel("Gestion des vols");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel.add(lblNewLabel_1);
		body.setLayout(new BorderLayout(0, 0));
		
		panelDashboard panelDashboard_ = new panelDashboard();
		body.add(panelDashboard_);
		panelDashboard_.setLayout(null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		b.setBackground(new Color(255, 128, 0));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		b.setBackground(new Color(0, 0, 128));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();

		body.removeAll();
		body.revalidate();
		body.repaint();

		switch (b.getText().toLowerCase()) {
		case "dashboard":
			body.add(new panelDashboard(), BorderLayout.CENTER);
			break;
		case "les avions":
			body.add(new panelAvion(), BorderLayout.CENTER);
			break;
		case "les pilotes":
			body.add(new panelPilote(), BorderLayout.CENTER);
			break;
		case "les trajets":
			body.add(new panelTrajet(), BorderLayout.CENTER);
			break;
		case "reporting":
			body.add(new panelReporting(), BorderLayout.CENTER);
			break;
		case "les vols":
			body.add(new panelVol(), BorderLayout.CENTER);
			break;
		}

	}
}
