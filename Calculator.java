package Calculator;
import java.awt.*;

public class Calculator extends Frame
{
	public Calculator()
	{
		this.setLayout(new BorderLayout());
		
		Panel p0=new Panel();
		TextArea ta=new TextArea(2,20);
		ta.setText("0");
		p0.add(ta);
		add(p0,BorderLayout.NORTH);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(5,2));
		p1.add(new Button("MC"));
		p1.add(new Button("MR"));
		p1.add(new Button("¡ç"));
		p1.add(new Button("CE"));
		p1.add(new Button("7"));
		p1.add(new Button("8"));
		p1.add(new Button("4"));
		p1.add(new Button("5"));
		p1.add(new Button("1"));
		p1.add(new Button("2"));
		
		Panel p1_2=new Panel();
		p1_2.setLayout(new BorderLayout(2,1));
		p1_2.add(p1,BorderLayout.NORTH);
		p1_2.add(new Button("0"),BorderLayout.SOUTH);
		
		add(p1_2,BorderLayout.WEST);
		
		
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(6,2));
		p2.add(new Button("MS"));
		p2.add(new Button("M+"));
		p2.add(new Button("C"));
		p2.add(new Button("¡¾"));
		p2.add(new Button("9"));
		p2.add(new Button("/"));
		p2.add(new Button("6"));
		p2.add(new Button("*"));
		p2.add(new Button("3"));
		p2.add(new Button("-"));
		p2.add(new Button("."));
		p2.add(new Button("+"));
		add(p2,BorderLayout.CENTER);
		
		
		Panel p3=new Panel();
		p3.setLayout(new GridLayout(4,1));
		p3.add(new Button("M-"));
		p3.add(new Button("¡î"));
		p3.add(new Button("%"));
		p3.add(new Button("1/x"));
		add(p3,BorderLayout.EAST);

		
		Panel p3_1=new Panel();
		p3_1.setLayout(new BorderLayout());
		p3_1.add(p3,BorderLayout.NORTH);
		p3_1.add(new Button("="),BorderLayout.CENTER);
		
		add(p3_1,BorderLayout.EAST);
	}
}

