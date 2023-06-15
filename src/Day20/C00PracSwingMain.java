package Day20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class C00GUI extends JFrame
{
	C00GUI()
	{
		// Frame
		super("Chatting Server");
		setBounds(100,100,700,700);
		
		// Panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);	// 레이아웃 삭제
		
		// Label
		JLabel label1 = new JLabel("Chatting Server");
		label1.setBounds(0,10,150,20);
		
		
		// Component
		JButton btn1 = new JButton("파일로 저장");
		btn1.setBounds(520,100,150,40);		
		JButton btn2 = new JButton("1:1 요청");
		btn2.setBounds(520,250,150,40);
		JButton btn3 = new JButton("대화 기록보기");
		btn3.setBounds(520,400,150,40);
		JButton btn4 = new JButton("입력");
		btn4.setBounds(520,530,150,40);
		
		
		
		
		// TEXT 필드 Component
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,500,500,100);		
		
		
		
		// TEXTAREA 필드 Component
		JTextArea area1 = new JTextArea();
		area1.setBounds(10,90,210,300);
		
		// ScrollPane Component
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,500,400);
		
		// Add_Panel_Component
		panel.add(label1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1);
		// Frame
		add(panel); // 프레임에 패널 추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}


public class C00PracSwingMain {

	public static void main(String[] args) {
		
		new C00GUI();
		
		
		
	}

}
