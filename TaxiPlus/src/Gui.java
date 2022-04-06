import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui extends JFrame {
	
	private JPanel panel = new JPanel();
	private JButton button1 = new JButton("Εμφάνιση Αυτονομίας");
	private JButton button2 = new JButton("Αποθήκευση σε Αρχείο");
	private JTextField text = new JTextField(30);
	private ArrayList<Fleet> Fleetlist;
	
	public Gui(ArrayList<Fleet> list) {
		Fleetlist = list;
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		this.setContentPane(panel);	
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 200);
		this.setTitle("TAXI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(button1)) {
				for(Fleet f : Fleetlist) {
					if(f.getName().equals(text.getText())) {
						System.out.println("Onoma: "+f.getName());
						System.out.println("Plythos taxi: "+f.plythos());
						System.out.println("Synolikh autonomia: "+f.sumAuton());
					}
				}
			}else {
				for(Fleet f : Fleetlist) {
					if(f.getName().equals(text.getText())) {
						f.save();
					}
				}
			}
		}
	}
}
