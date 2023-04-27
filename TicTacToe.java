import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	ImageIcon a = new ImageIcon("oicon.png");
	ImageIcon b = new ImageIcon("xicon.png");
	ImageIcon c = new ImageIcon("");
	//ImageIcon d = new ImageIcon("forwardthi.png");
	//ImageIcon e = new ImageIcon("forwardsec.png");
        //ImageIcon f = new ImageIcon("forwardthi.png");

	boolean flag=true;
	boolean flag2=true;
	int cnt=0;
	//JButton arr[][] = new JButton[3][3];
	//int i=0,j=0,x=0,y=0;

	TicTacToe()
	{
		setLayout(null);
		Font f = new Font("Cambria Math",Font.BOLD,20);
		Color col = new Color(237,237,237);

		l1 = new JLabel("TIC-TAC-TOE");
		l1.setFont(f);
		l1.setSize(200,50);
		l1.setLocation(340,25);
		add(l1);

		l2=new JLabel("Player 1");
                l2.setSize(100,40);
                l2.setFont(f);
                l2.setLocation(70,605);
                add(l2);

                l3=new JLabel("Player 2");
                l3.setSize(100,40);
                l3.setFont(f);
                l3.setLocation(500,605);
                add(l3);

		JLabel l4 = new JLabel(new ImageIcon("vertical.png"));
                l4.setSize(10,300);
                l4.setLocation(320,110);
                add(l4);

		JLabel l5 = new JLabel(new ImageIcon("vertical.png"));
                l5.setSize(10,300);
                l5.setLocation(470,110);
                add(l5);

                JLabel l6 = new JLabel(new ImageIcon("horizontal.png"));
                l6.setSize(550,10);
                l6.setLocation(130,200);
                add(l6);

		JLabel l7 = new JLabel(new ImageIcon("horizontal.png"));
                l7.setSize(550,10);
                l7.setLocation(130,300);
                add(l7);

		tf = new JTextField();
		tf.setSize(470,50);
		tf.setFont(f);
		tf.setEditable(false);
		tf.setLocation(170,500);
		add(tf);
		
		b1 = new JButton();
		b1.setBackground(col);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		b1.setSize(160,90);
		b1.setLocation(160,110);
		add(b1);

		b2 = new JButton();
		b2.setBackground(col);
                b2.setBorderPainted(false);
		b2.addActionListener(this);
                b2.setSize(140,90);
                b2.setLocation(330,110);
                add(b2);

		b3 = new JButton();
		b3.setBackground(col);
                b3.setBorderPainted(false);
		b3.addActionListener(this);
                b3.setSize(170,90);
                b3.setLocation(480,110);
                add(b3);

		b4 = new JButton();
		b4.setBackground(col);
                b4.setBorderPainted(false);
		b4.addActionListener(this);
                b4.setSize(160,90);
                b4.setLocation(160,210);
                add(b4);

		b5 = new JButton();
		b5.setBackground(col);
                b5.setBorderPainted(false);
		b5.addActionListener(this);
                b5.setSize(140,90);
                b5.setLocation(330,210);
                add(b5);

		b6 = new JButton();
		b6.setBackground(col);
                b6.setBorderPainted(false);
		b6.addActionListener(this);
                b6.setSize(170,90);
                b6.setLocation(480,210);
                add(b6);

		b7 = new JButton();
		b7.setBackground(col);
                b7.setBorderPainted(false);
		b7.addActionListener(this);
                b7.setSize(160,100);
                b7.setLocation(160,310);
                add(b7);

		b8 = new JButton();
		b8.setBackground(col);
                b8.setBorderPainted(false);
		b8.addActionListener(this);
                b8.setSize(140,100);
                b8.setLocation(330,310);
                add(b8);

		b9 = new JButton();
		b9.setBackground(col);
                b9.setBorderPainted(false);
		b9.addActionListener(this);
                b9.setSize(170,100);
                b9.setLocation(480,310);
                add(b9);

		b10 = new JButton();
                b10.addActionListener(this);
		b10.setBackground(col);
                b10.setBorderPainted(false);
		b10.setIcon(b);
                b10.setSize(100,50);
                b10.setLocation(180,600);
                add(b10);
		
		b11 = new JButton();
                b11.addActionListener(this);
		b11.setBackground(col);
                b11.setBorderPainted(false);
		b11.setIcon(a);
                b11.setSize(100,50);
                b11.setLocation(610,600);
                add(b11);

		b12 = new JButton("Clear");
                b12.addActionListener(this);
                b12.setSize(100,50);
		b12.setFont(f);
                b12.setLocation(360,700);
                add(b12);


		/*JButton arr[][] = new JButton[3][3];

		for(i=0;i<arr.length;i++)
		{
			x=100;
                        y=y+50;
			j=0;

			do
			{
				arr[i][j] = new JButton();
				arr[i][j].setSize(100,50);
				arr[i][j].addActionListener(this);
				x=x+100;
				arr[i][j].setLocation(x,y);
				add(arr[i][j]);
				j++;

			}while(j<arr[i].length);
		}*/


		setVisible(true);
		setSize(800,900);
		//setResizable(false);
		setLocation(400,100);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object s = ae.getSource();
		cnt++;

		if(s==b1)
		{
			if(flag==true)
			{
				b1.setIcon(b);
				if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				flag=false;
			}
			else
			{
				b1.setIcon(a);
                                if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{ 
				 	tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
				flag=true;

			}
		}
		else if(s==b2)
		{
			if(flag==true)
                        {
                                b2.setIcon(b);
                                flag=false;
                                if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                        }
			else
                        {
                                b2.setIcon(a);
                                flag=true;
				if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}

                        }

		}
		else if(s==b3)
		{
			if(flag==true)
                        {
                                b3.setIcon(b);
                                flag=false;
                                if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b3.getIcon()==b5.getIcon() && b3.getIcon()==b7.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
					//b3.setIcon(d);
					//b5.setIcon(e);
					//b7.setIcon(f);
				}
                        }
			else
                        {
                                b3.setIcon(a);
                                flag=true;
				if(b1.getIcon()==b2.getIcon() && b1.getIcon()==b3.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b3.getIcon()==b5.getIcon() && b3.getIcon()==b7.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}

                        }

		}
		else if(s==b4)
		{
			if(flag==true)
                        {
                                b4.setIcon(b);
                                flag=false;
				if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                                if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}

                        }
			else
                        {
                                b4.setIcon(a);
                                flag=true;
				if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}

                        }

		}
		else if(s==b5)
		{
			if(flag==true)
                        {
                                b5.setIcon(b);
                                flag=false;
				if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                                if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                                if(b3.getIcon()==b5.getIcon() && b3.getIcon()==b7.getIcon())                                         {
					tf.setText("Player 1 is winner !!!");
					flag2=false;
					//b3.setIcon(d);
                                        //b5.setIcon(e);
                                        //b7.setIcon(f);

				}
				if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                        }
			else
                        {
                                b5.setIcon(a);
                                flag=true;
				if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b3.getIcon()==b5.getIcon() && b3.getIcon()==b7.getIcon())                                                    {
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{ 
				 	tf.setText("Player 2 is winner !!!");
					flag2=false;
				}

                        }

		}
		else if(s==b6)
		{
			if(flag==true)
                        {
                                b6.setIcon(b);
                                flag=false;
				if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                        }
			else
                        {
                                b6.setIcon(a);
                                flag=true;
				if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{ 
				 	tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b4.getIcon()==b5.getIcon() && b4.getIcon()==b6.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}

                        }

		}
		else if(s==b7)
		{
			if(flag==true)
                        {
                                b7.setIcon(b);
                                flag=false;
				if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b7.getIcon()==b5.getIcon() && b7.getIcon()==b3.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
					//b3.setIcon(d);
                                        //b5.setIcon(e);
                                        //b7.setIcon(f);
				}
                        }
			else
                        {
                                b7.setIcon(a);
                                flag=true;
				if(b1.getIcon()==b4.getIcon() && b1.getIcon()==b7.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b7.getIcon()==b5.getIcon() && b7.getIcon()==b3.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                        }

		}
		else if(s==b8)
		{
			if(flag==true)
                        {
                                b8.setIcon(b);
                                flag=false;
				if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                        }
			else
                        {
                                b8.setIcon(a);
                                flag=true;
				if(b2.getIcon()==b5.getIcon() && b2.getIcon()==b8.getIcon())
				{ 
				 	tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                        }

		}
		else if(s==b9)
		{
			if(flag==true)
                        {
                                b9.setIcon(b);
                                flag=false;
				if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
				if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{
					tf.setText("Player 1 is winner !!!");
					flag2=false;
				}
                        }
			else
                        {
                                b9.setIcon(a);
                                flag=true;
				if(b3.getIcon()==b6.getIcon() && b3.getIcon()==b9.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b7.getIcon()==b8.getIcon() && b7.getIcon()==b9.getIcon())
				{    
				    	tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                                if(b1.getIcon()==b5.getIcon() && b1.getIcon()==b9.getIcon())
				{
					tf.setText("Player 2 is winner !!!");
					flag2=false;
				}
                        }
		}
		
		
		if(cnt >= 9)
		{
			if(flag2==true)
			{
               			tf.setText("Match Draw !!!");
			}
		}

		if(s==b12)
		{
			b1.setIcon(c);
			b2.setIcon(c);
			b3.setIcon(c);
			b4.setIcon(c);
			b5.setIcon(c);
			b6.setIcon(c);
			b7.setIcon(c);
			b8.setIcon(c);
			b9.setIcon(c);
			tf.setText("");
			flag=true;
			flag2=true;
			cnt=0;
		}
	}

	public static void main(String args[])
	{
		new TicTacToe();
	}
}
