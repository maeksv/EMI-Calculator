import java.awt.event.*;
import java.awt.*;
class A extends Frame implements ActionListener 
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button bt1;
	A()
	{
		setLayout(null); 
        l4 =new Label("EMI CALCULATOR ");
	    l4.setBounds(175,10,150,50); 
	    add(l4);		
		l1 =new Label("enter loan amount    ");
	    l1.setBounds(100,100,150,50); 
	    add(l1);
		l2 =new Label("enter downpayment  ");
	    l2.setBounds(100,200,150,50); 
	    add(l2);
		l3 =new Label("enter no of EMIs ");
	    l3.setBounds(100,300,150,50); 
	    add(l3);
		
	    t1= new TextField();
	    t1.setBounds(250,100,100,30);
		add(t1);
		t2= new TextField();
	    t2.setBounds(250,200,100,30);
		add(t2);
		t3= new TextField();
	    t3.setBounds(250,300,100,30);
		add(t3);
		
		bt1 = new Button("calculate");
		bt1.setBounds(250,400,100,100);
		bt1.addActionListener(this);
		add(bt1);
		
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	
		
		if(e.getSource()==bt1)
		{
			int a,b,c,d;
			String f;
			
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=Integer.parseInt(t3.getText());
			d=(10*(a-b))/100;
			f=""+(d+(a-b))/c;
			System.out.print("EMI amount :"+(d+(a-b))/c);
			System.out.print("Payable amount:"+((a-b)+d+(a-b))/c);
			
		}
		else
		{
		}
	
	
	}
}  
class Ac
{
 
public static void main(String[] ar) throws Exception
  {
	  A fb=new A();
	  
  }
	
}	


