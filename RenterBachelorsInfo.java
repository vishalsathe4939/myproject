import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.border.*;

class RenterBachelorsInfo extends JFrame implements ActionListener
{

	JFrame frame;
	JLabel lrname,lrpaddr,lrraddr,lrmobno,lrano,lrage,lphoto;
	JTextField tfrname,tfrmobno,tfrano,tfrage;
	JTextArea tarpaddr,tarraddr;
	JButton bsave,breset,bcancel,bbrowse;	
	JFileChooser fc;
	int in;
	RenterBachelorsInfo()
	{

		String input = JOptionPane.showInputDialog(this,"Enter in some text:");	
		in=Integer.parseInt(input);
		if (input == null) 
		{
		    System.out.println("The user canceled");
		}
		else
		{
			System.out.println(input);
		}
	
		setLayout(null);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		lrname=new JLabel("Renter Name");
		lrname.setFont(new Font("Arial", Font.BOLD, 18));
		lrname.setSize(160,40);
		lrname.setLocation(50,30);
//		tfrname.requestFocus();
		add(lrname);

		lrpaddr=new JLabel("<html>Permanent<br> Address</br><html>");
		lrpaddr.setFont(new Font("Arial", Font.BOLD, 18));
                lrpaddr.setSize(160,40);
                lrpaddr.setLocation(50,100);
                add(lrpaddr);

		lrraddr=new JLabel("<html>Renting<br> Address</br><html>");
                lrraddr.setFont(new Font("Arial", Font.BOLD, 18));
                lrraddr.setSize(160,40);
                lrraddr.setLocation(50,170);
                add(lrraddr);
	
		lrmobno=new JLabel("Mobile No");
                lrmobno.setFont(new Font("Arial", Font.BOLD, 18));
		lrmobno.setSize(160,40);
                lrmobno.setLocation(50,240);
                add(lrmobno);

		lrano=new JLabel("Aadhar No");
                lrano.setFont(new Font("Arial", Font.BOLD, 18));
		lrano.setSize(160,40);
                lrano.setLocation(50,310);
                add(lrano);

		lrage=new JLabel("Age");
		lrage.setSize(160,40);
		lrage.setLocation(50,380);
		lrage.setFont(new Font("Arial", Font.BOLD, 18));
		add(lrage);

		tfrname=new JTextField();
		tfrname.setSize(160,40);
		tfrname.setLocation(240,30);
		add(tfrname);

		tarpaddr=new JTextArea();
                tarpaddr.setSize(160,40);
                tarpaddr.setLocation(240,100);
		Border border1 = BorderFactory.createLineBorder(Color.GRAY, 1);
		tarpaddr.setBorder(border1);
                add(tarpaddr);

		tarraddr=new JTextArea();
                tarraddr.setSize(160,40);
                tarraddr.setLocation(240,170);
                //Border border1 = BorderFactory.createLineBorder(Color.GRAY, 1);
                tarraddr.setBorder(border1);
                add(tarraddr);

		tfrmobno=new JTextField();
                tfrmobno.setSize(160,40);
                tfrmobno.setLocation(240,240);
                add(tfrmobno);
	
		tfrano=new JTextField();
                tfrano.setSize(160,40);
                tfrano.setLocation(240,310);
                add(tfrano);

		tfrage=new JTextField();
                tfrage.setSize(160,40);
                tfrage.setLocation(240,380);
                add(tfrage);

		bsave=new JButton("Save");
		bsave.setSize(100,30);
		bsave.setLocation(50,470);
		bsave.addActionListener(this);
		add(bsave);

		bcancel=new JButton("Cancel");
                bcancel.setSize(100,30);
                bcancel.setLocation(350,470);
                bcancel.addActionListener(this);
                add(bcancel);

		breset=new JButton("Reset");
                breset.setSize(100,30);
                breset.setLocation(200,470);
                breset.addActionListener(this);
                add(breset);

		bbrowse=new JButton("Browse Photo");
                bbrowse.setSize(140,30);
                bbrowse.setLocation(430,150);
                bbrowse.addActionListener(this);
                add(bbrowse);

		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

		lphoto=new JLabel();
                lphoto.setSize(100,100);
               	lphoto.setLocation(450,30);
		lphoto.setBorder(border);
		add(lphoto);


	/******* Image choosing Code***********/

//		fs=new JFileChooser();

	/******* Image Choosing code End*******/

		System.out.println("Screen Width"+(int)screenSize.getWidth());	
		System.out.println("Screen Height"+(int)screenSize.getHeight());		

		setTitle("Owner Information");
        	setSize(((int)screenSize.getWidth())/3,((int)screenSize.getHeight())/2);  
             	//setSize(800,500);
		setVisible(true);
		setLocationRelativeTo(null);
               	//setLocation(500,500);
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		
		String str=ae.getActionCommand();
			
		try
		{
		
			if(str.equals("Save"))
			{
				for(int i=0;i<in;i++)
				{
					new RenterBachelorsInfo();
				}				
			}

			if(str.equals("Reset"))
			{
				tfrname.setText("");
                	        tarpaddr.setText("");
                	        tfrmobno.setText("");
                	        tfrano.setText("");
                	        tfrage.setText("");
                	        tfrname.requestFocus();
			}

			if(str.equals("Cancel"))
			{
				dispose();
			}

			if(str.equals("Browse Photo"))
			{
				JFileChooser fc=new JFileChooser();    
        			int i=fc.showOpenDialog(this);

				if(i==JFileChooser.APPROVE_OPTION)
        			{    
					
        	    				File f=fc.getSelectedFile();    
        	    				String filepath=f.getPath();
						System.out.println("Path of Selected File"+filepath);
				
						BufferedImage img=ImageIO.read(new File(filepath));
						ImageIcon icon=new ImageIcon(img);
						lphoto.setIcon(icon);
					
					
					
				}

				System.out.println("Hiii I am In browse Photo"+JFileChooser.APPROVE_OPTION);  
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String vishal[])
	{
		RenterBachelorsInfo oi=new RenterBachelorsInfo();
	}
}
