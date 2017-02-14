package Button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class GrossBorderDecorator extends JButton {
	
    public GrossBorderDecorator(JButton bouton) {
        super(bouton.getText());
        
        for(ActionListener actionListener : bouton.getActionListeners()){
            this.addActionListener(actionListener);
        }        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	Border border = new LineBorder(Color.BLACK, 15);
            	setBorder(border);
            }
        });
    }
}
