package ma.ismo.crjj.ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class panelDashboard extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public panelDashboard() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 5, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setBounds(244, 8, 52, 14);
		add(lblNewLabel);

	}

}
