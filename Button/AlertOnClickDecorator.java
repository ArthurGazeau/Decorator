package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AlertOnClickDecorator extends JButton {

	public AlertOnClickDecorator(JButton bouton) {
		super(bouton.getText());
		
		for (ActionListener actionListener : bouton.getActionListeners()) {
			this.addActionListener(actionListener);
		}
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(null, "ça va péter!");
			}
		});
	}
}
