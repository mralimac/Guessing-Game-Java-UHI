package guessingGame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.util.ArrayList;
import java.util.List;

public class GUI
{
	static GraphicsConfiguration gc;
	JFrame frame;	
	JButton button;
	JTextField textField;
	JLabel label;
	int frameWidth = 400;
	int frameHeight = 600;
	List<String> labelStrings = new ArrayList<String>();
	int numberOfStrings;
	
	public void initGUI() 
	{
		//Build the frame layout
		JFrame frameWire = new JFrame(gc);
		frameWire.setTitle("Guessing Game");
		frameWire.setSize(frameWidth,frameHeight);
		frameWire.setVisible(true);
		frameWire.setResizable(false);
		frameWire.getContentPane().setBackground(Color.gray);
		frameWire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.frame = frameWire;
		createTextbox();
		
	}
	
	public JButton createButton(int posX, int posY, int width, int height, String buttonText, String action)
	{
		
		return this.button;
	}
	
	public void createTextbox()
	{
		textField = new JTextField();
		textField.setBounds(10,530,380,30);		
		this.frame.getContentPane().add(textField);	
		textField.setVisible(true);
	}
	
	public void createLabel(String labelString)
	{
		numberOfStrings++;
		labelStrings.add(labelString);
		for(int i = 0; i < numberOfStrings; i++)
		{
			int posY = 530 - (30*i);
			label = new JLabel(labelString);
			label.setBounds(10,posY,380,30);
			label.setVisible(true);
			this.frame.getContentPane().add(label);
		}

	}
	
}
