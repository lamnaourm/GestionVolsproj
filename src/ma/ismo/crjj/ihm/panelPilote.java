package ma.ismo.crjj.ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class panelPilote extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelPilote() {
		setBackground(new Color(0, 255, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("pilote");
		lblNewLabel.setBounds(212, 5, 26, 14);
		add(lblNewLabel);

	}

}
