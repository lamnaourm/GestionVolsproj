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

		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(this);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addMouseListener(this);
		ImageIcon image2 = new ImageIcon(getClass().getResource("/dashboard.png"));
		btnNewButton.setIcon(image2);
		btnNewButton.setIconTextGap(30);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setPreferredSize(new Dimension(85, 40));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		menu.add(btnNewButton, gbc_btnNewButton);

		JButton btnLesPiotes = new JButton("Les pilotes");
		btnLesPiotes.addActionListener(this);
		btnLesPiotes.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon image3 = new ImageIcon(getClass().getResource("/pilote.png"));
		btnLesPiotes.setIcon(image3);
		btnLesPiotes.setIconTextGap(30);
		btnLesPiotes.addMouseListener(this);
		btnLesPiotes.setForeground(new Color(255, 255, 255));
		btnLesPiotes.setBackground(new Color(0, 0, 128));
		btnLesPiotes.setPreferredSize(new Dimension(81, 40));
		btnLesPiotes.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnLesPiotes = new GridBagConstraints();
		gbc_btnLesPiotes.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesPiotes.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesPiotes.gridx = 0;
		gbc_btnLesPiotes.gridy = 2;
		menu.add(btnLesPiotes, gbc_btnLesPiotes);

		JButton btnLesAvions = new JButton("Les avions");
		btnLesAvions.setHorizontalAlignment(SwingConstants.LEFT);
		btnLesAvions.setIconTextGap(30);
		btnLesAvions.addMouseListener(this);
		ImageIcon image1 = new ImageIcon(getClass().getResource("/plane.png"));
		btnLesAvions.setIcon(image1);
		btnLesAvions.setForeground(new Color(255, 255, 255));
		btnLesAvions.setBackground(new Color(0, 0, 128));
		btnLesAvions.setPreferredSize(new Dimension(100, 40));
		btnLesAvions.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnLesAvions = new GridBagConstraints();
		gbc_btnLesAvions.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesAvions.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesAvions.gridx = 0;
		gbc_btnLesAvions.gridy = 3;
		menu.add(btnLesAvions, gbc_btnLesAvions);

		JButton btnLesTrajets = new JButton("Les trajets");
		btnLesTrajets.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon image4 = new ImageIcon(getClass().getResource("/trajet.png"));
		btnLesTrajets.setIcon(image4);
		btnLesTrajets.setIconTextGap(30);
		btnLesTrajets.addMouseListener(this);
		btnLesTrajets.addActionListener(this);
		btnLesTrajets.setForeground(new Color(255, 255, 255));
		btnLesTrajets.setBackground(new Color(0, 0, 128));
		btnLesTrajets.setPreferredSize(new Dimension(83, 40));
		btnLesTrajets.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnLesTrajets = new GridBagConstraints();
		gbc_btnLesTrajets.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesTrajets.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesTrajets.gridx = 0;
		gbc_btnLesTrajets.gridy = 4;
		menu.add(btnLesTrajets, gbc_btnLesTrajets);

		JButton btnLesVols = new JButton("Les vols");
		btnLesVols.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon image5 = new ImageIcon(getClass().getResource("/vol.png"));
		btnLesVols.setIcon(image5);
		btnLesVols.setIconTextGap(30);
		btnLesVols.addMouseListener(this);
		btnLesVols.addActionListener(this);
		btnLesVols.setForeground(new Color(255, 255, 255));
		btnLesVols.setBackground(new Color(0, 0, 128));
		btnLesVols.setPreferredSize(new Dimension(71, 40));
		btnLesVols.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnLesVols = new GridBagConstraints();
		gbc_btnLesVols.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLesVols.insets = new Insets(0, 0, 5, 0);
		gbc_btnLesVols.gridx = 0;
		gbc_btnLesVols.gridy = 5;
		menu.add(btnLesVols, gbc_btnLesVols);

		JButton btnReporting = new JButton("Reporting");
		btnReporting.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon image6 = new ImageIcon(getClass().getResource("/reporting.png"));
		btnReporting.setIcon(image6);
		btnReporting.setIconTextGap(30);
		btnReporting.addMouseListener(this);
		btnReporting.addActionListener(this);
		btnReporting.setForeground(new Color(255, 255, 255));
		btnReporting.setBackground(new Color(0, 0, 128));
		btnReporting.setPreferredSize(new Dimension(79, 40));
		btnReporting.setFont(new Font("Verdana", Font.BOLD, 14));
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
