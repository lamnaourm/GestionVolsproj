package ma.ismo.crjj.ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ma.ismo.crjj.metier.IMetier;
import ma.ismo.crjj.metier.MetierAvion;
import ma.ismo.crjj.models.Avion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reports extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	IMetier<Avion> metier = new MetierAvion();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reports frame = new Reports();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reports() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showReport();
			}
		});
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel);
	}
	
	
	public void showReport(){
        
        //Path to your .jasper file in your package
        String reportName = "ReportAvion.jasper";
         
        //Get a stream to read the file
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(reportName);
 
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(metier.getAll());  
        

        try {
     //Fill the report with parameter, connection and the stream reader     
            JasperPrint jp = JasperFillManager.fillReport(is,null,beanColDataSource);
         
     //Viewer for JasperReport
            JRViewer jv = new JRViewer(jp);
     
     //Insert viewer to a JFrame to make it showable
            panel.setLayout(new BorderLayout());
            panel.repaint();
            panel.add(jv);
            panel.revalidate();

        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
}
