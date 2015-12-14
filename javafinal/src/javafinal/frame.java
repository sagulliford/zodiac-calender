package javafinal;

	import java.awt.FlowLayout;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	
public class frame extends JFrame {

	private JLabel item1;
	
	
	public frame(){
		super("Chinese Calender");
		setLayout(new FlowLayout());
		
		item1 = new JLabel();
		add(item1);
		
	}
	
	
	
	
}
