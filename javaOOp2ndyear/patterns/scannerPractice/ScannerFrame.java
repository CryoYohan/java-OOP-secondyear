package scannerPractice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ScannerFrame implements ActionListener {
	JButton button = new JButton("A Button!");
	JLabel label, labelCenter;
	int counter = 0;
	public static void main(String[]args) {
		ScannerFrame getJBoys = new ScannerFrame();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		ImageIcon icon = new ImageIcon("jollibeLogoNoBG.png");
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("JOLLIBEE APP");
		frame.setIconImage(icon.getImage().getScaledInstance(30, 30, 30));
		
		frame.getContentPane().setBackground(new Color(255,50,55));
	
		
		getJBoys.button.setFocusable(false);
		getJBoys.label = new JLabel();
		getJBoys.label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		getJBoys.label.setAlignmentY(JLabel.BOTTOM_ALIGNMENT);
		getJBoys.labelCenter = new JLabel("Click me!");
		getJBoys.label.setHorizontalAlignment(JLabel.CENTER);
		getJBoys.label.setVerticalAlignment(JLabel.BOTTOM);
		getJBoys.labelCenter.setForeground(new Color(200,150,150));
		getJBoys.labelCenter.setFont(new Font("Comic Sans", Font.BOLD, 50));
		getJBoys.labelCenter.setText("Counter: " + getJBoys.counter);
		
		panel.add(getJBoys.labelCenter);
		panel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		panel.setAlignmentY(JPanel.BOTTOM_ALIGNMENT);
		panel.add(getJBoys.button);
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	ScannerFrame(){
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			labelCenter.setText("Counter: " + (++counter));
			button.setText("You clicked me!");		
		}
		
	}
	
	
}
