package Calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener
{
	TextArea ta=new TextArea(2,20);
	Button plus=new Calculate("+");
	Button minus=new Calculate("-");
	Button multi=new Calculate("*");
	Button div=new Calculate("/");
	Button percent=new Calculate("%");
	Button back=new Calculate("¡ç");
	Button equal=new Calculate("=");
	
	public Double num1;
	public Double num2;
	public Double result;
	public int pluss,minuss,multii,divv=0;
	
	public Calculator()
	{
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});
		
		this.setLayout(new BorderLayout());
		
		Panel p0=new Panel();
		p0.add(ta);
		add(p0,BorderLayout.NORTH);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(5,2));
		Button mc=new Calculate("MC");
		Button mr=new Calculate("MR");
		Button ce=new Calculate("CE");
		Button seven=new Number("7");
		Button eight=new Number("8");
		Button four=new Number("4");
		Button five=new Number("5");
		Button one=new Number("1");
		Button two=new Number("2");
		p1.add(mc);
		p1.add(mr);
		p1.add(back);
		p1.add(ce);
		p1.add(seven);
		p1.add(eight);
		p1.add(four);
		p1.add(five);
		p1.add(one);
		p1.add(two);
		
		Panel p1_2=new Panel();
		p1_2.setLayout(new BorderLayout(2,1));
		p1_2.add(p1,BorderLayout.NORTH);
		
		Button zero=new Number("0");
		p1_2.add(zero,BorderLayout.SOUTH);
		add(p1_2,BorderLayout.WEST);
		
		
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(6,2));
		Button ms=new Calculate("MS");
		Button mplus=new Calculate("M+");
		Button c=new Calculate("C");
		Button plusminus=new Calculate("¡¾");
		Button nine=new Number("9");
		Button six=new Number("6");
		Button three=new Number("3");
		
		Button point=new Calculate(".");
		
		p2.add(ms);
		p2.add(mplus);
		p2.add(c);
		p2.add(plusminus);
		p2.add(nine);
		p2.add(div);
		p2.add(six);
		p2.add(multi);
		p2.add(three);
		p2.add(minus);
		p2.add(point);
		p2.add(plus);
		add(p2,BorderLayout.CENTER);
		
		
		Panel p3=new Panel();
		p3.setLayout(new GridLayout(4,1));
		Button mminus=new Calculate("M-");
		Button route=new Calculate("¡î");
		
		Button onedivx=new Calculate("1/x");
		p3.add(mminus);
		p3.add(route);
		p3.add(percent);
		p3.add(onedivx);
		add(p3,BorderLayout.EAST);

		
		Panel p3_1=new Panel();
		p3_1.setLayout(new BorderLayout());
		p3_1.add(p3,BorderLayout.NORTH);
	
		p3_1.add(equal,BorderLayout.CENTER);
		
		add(p3_1,BorderLayout.EAST);
	}

	class Number extends Button 
	{
		public Number(String n)
		{
			super(n);
			addActionListener(Calculator.this);
		}
	}
	class Calculate extends Button 
	{
		public Calculate(String s)
		{
			super(s);
			addActionListener(Calculator.this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Button btn=(Button)ae.getSource();
		// TODO Auto-generated method stub
		if(ae.getSource() instanceof Number)
		{
			ta.append(btn.getLabel());
		}
		else if(ae.getSource() instanceof Calculate)
		{
			if(ae.getSource()==plus)
			{
				num1=Double.valueOf(ta.getText());
				ta.setText("");
				pluss++;
				minuss=0; multii=0; divv=0;
			}
			else if(ae.getSource() == minus) 
			{
				num1=Double.valueOf(ta.getText());
				ta.setText("");
				minuss++; 
				pluss=0; multii=0; divv=0;
			}
			else if(ae.getSource() == multi) 
			{
				num1=Double.valueOf(ta.getText());
				ta.setText("");
				multii++;
				pluss=0; minuss=0; divv=0;
			}
			else if(ae.getSource() == div) 
			{
				num1=Double.valueOf(ta.getText());
				ta.setText("");
				divv++;
				pluss=0; minuss=0; multii=0;
			}
			else if(ae.getSource()==equal)
			{
				num2=Double.valueOf(ta.getText());
				ta.setText("");
				if(pluss>0) 
				{
					result=num1+num2;
				}
				else if(minuss>0)
				{
					result=num1-num2;
				}
				else if(multii>0)
				{
					result=num1*num2;
				}
				else if(divv>0)
				{
					result=num1/num2;
				}
				
				ta.setText(Double.toString(result));
			}	
		}
	}
}

