import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Button.AlertOnClickDecorator;
import Button.GrossBorderDecorator;
import Button.HideOnClickDecorator;
import Button.TextUpperCaseDecorator;


public class Fenetre extends JFrame {

	public Fenetre(){
		JButton boutonHide = new HideOnClickDecorator(new JButton("cacher"));
		JButton boutonAlert = new AlertOnClickDecorator(new JButton("message alerte"));
		JButton boutonUpper = new TextUpperCaseDecorator(new JButton("majuscule"));
		JButton boutonBorder = new GrossBorderDecorator(new JButton("bordure"));
		JPanel panel = new JPanel();
		panel.add(boutonHide);
		panel.add(boutonAlert);
		panel.add(boutonUpper);
		panel.add(boutonBorder);
		this.setContentPane(panel);
		this.setTitle("Decorator");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Fenetre();
	}
}
