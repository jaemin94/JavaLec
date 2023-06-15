package Day20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class C04GUI extends JFrame
{
	C04GUI()
	{
		// Frame
		super("세번째 프레임창입니다.");
		setBounds(100,100,700,700);
		
		// Panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);	// 레이아웃 삭제
		
		// Component
		JButton btn1 = new JButton("Button1");
		btn1.setBounds(10,10,100,30);		
		JButton btn2 = new JButton("Button2");
		btn2.setBounds(580,10,100,30);
		
		
		// TEXT 필드 Component
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50,100,30);		
		JTextField txt2 = new JTextField();
		txt2.setBounds(580,50,100,30);
		
		
		// TEXTAREA 필드 Component
		JTextArea area1 = new JTextArea();
		area1.setBounds(10,90,210,300);
		
		// ScrollPane Component
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,300);
		
		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		// Frame
		add(panel); // 프레임에 패널 추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}


public class C04SwingMain {

	public static void main(String[] args) {
		
		new C04GUI();
		
		
		
	}

}
