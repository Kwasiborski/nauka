import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private JTextArea textArea;
	private JButton btn;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Przelicznik");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textArea = new JTextArea();
		formPanel = new FormPanel();
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textArea.append(text);
			}
		});
		
		btn = new JButton("Sprawdz wynik");
		add(toolbar, BorderLayout.NORTH);
		add(btn, BorderLayout.SOUTH);
		add(textArea, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("Wynik\n");
			
				
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 600);
	}

}
