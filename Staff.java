package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.jfree.ui.RefineryUtilities;

public class Staff extends JFrame implements ActionListener
{
	JFrame jfs;
	JLabel jl,image;
	JButton jb1,jb2,jb3,jb4;
	Staff()
	{
		jfs=new JFrame();
		JLabel l=new JLabel(" UNIVERSITY STAFF");
    	l.setForeground(Color.BLUE);
    	Font f=new Font("Arial",Font.BOLD,40);
    	l.setFont(f);
    	l.setBounds(200, 10, 500, 40);
    	 image = new JLabel(new ImageIcon("Images/water.jpg"));
	        image.setBounds(0,0,800,600);
	       
		jb1=new JButton("GENERATE CHART ");
		jb1.setBounds(130, 200, 500, 70);
		
		jb2=new JButton("GENERATE REPORT");
		jb2.setBounds(130,300,500,70);
		
		jb3=new JButton("LOG OUT");
		jb3.setBounds(130, 400, 500, 70);
		
	//	jb4=new JButton("COMPLAIN");
	//	jb4.setBounds(290, 300, 200, 70);
		
		jfs.setLayout(null);
		
		jfs.add(l);

		//jfs.add(jb4);
		jfs.add(jb1);
		jfs.add(jb2);
		jfs.add(jb3);
		jfs.add(image);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jfs.setResizable(false);
		jfs.setSize(800,600);
		RefineryUtilities.centerFrameOnScreen(jfs);
		jfs.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource()==jb1)
		{
			Managepie mp=new Managepie();
		}
		if(arg0.getSource()==jb2)
		{
			Report r=new Report();
		}
		if(arg0.getSource()==jb3)
		{	
			JOptionPane.showMessageDialog(jfs, "YOU HAVE SUCESSFULLY LOGGED OUT");
			jfs.setVisible(false);
			Home h=new Home();
		}
		
	}
	
}