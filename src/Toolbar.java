import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Toolbar extends JPanel implements ActionListener {
	private JButton nettoButton;
	private JButton bruttoButton;
	private StringListener textListener;
	
	
	public Toolbar() {
		nettoButton = new JButton (" brutto-> netto");
		bruttoButton = new JButton (" netto-> brutto");
	
		nettoButton.addActionListener(this);
		bruttoButton.addActionListener(this);
			setLayout(new FlowLayout());
		add(nettoButton);
		add(bruttoButton);
		
	}
		
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == nettoButton)
			if(textListener != null) {
				textListener.textEmitted("wprowadz kwasiu ¿eby po naciœniêciu tego by³o brutto-> netto\n");
			 
			}
		if(clicked == bruttoButton)
			if(textListener != null) {
				textListener.textEmitted("wprowadz kwasiu ¿eby po naciœniêciu tego by³o netto-> brutto\n");
	}
}
}
	
