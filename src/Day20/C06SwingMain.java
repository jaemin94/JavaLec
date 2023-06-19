package Day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;


class C06GUI extends JFrame implements ActionListener, KeyListener, MouseListener
{
	JButton btn1;
	JButton btn2;
	JTextField txt1;
	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;
	
	C06GUI()
	{
		// Frame
		super("세번째 프레임창입니다.");
		setBounds(100,100,700,700);
		
		// Panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);	// 레이아웃 삭제
		
		// Button Component
		btn1 = new JButton("Button1");
		btn1.setBounds(10,10,100,30);		
		btn2 = new JButton("Button2");
		btn2.setBounds(580,10,100,30);
		
		
		// TEXT 필드 Component
		txt1 = new JTextField();
		txt1.setBounds(10,50,100,30);		
		txt2 = new JTextField();
		txt2.setBounds(580,50,100,30);
		
		
		// TEXTAREA 필드 Component
		area1 = new JTextArea();
		area1.setBounds(10,90,210,300);
		
		// ScrollPane Component
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,300);
		
		// Event 처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		txt1.addKeyListener(this);
		txt2.addKeyListener(this);
		
		area1.addMouseListener(this);
		
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

	
	public void actionPerformed(ActionEvent e) {
		
//		System.out.println("이벤트 발생");
		if(e.getSource()==btn1)
		{
			System.out.println("Button1 클릭");
		}
		else if(e.getSource()==btn2)
		{
			System.out.println("Button2 클릭");
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 땟을때(UNICODE 미지원)
//		System.out.println("keyTyped() : " + " " + e.getKeyChar());
//		System.out.println("keyTyped() : " + " " + e.getKeyCode());
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 눌렀을대
//		System.out.println("keyPressed()");
//		System.out.println("keyPressed() : " + " " + e.getKeyChar());
//		System.out.println("keyPressed() : " + " " + e.getKeyCode());
		if(e.getSource()==txt1)
		{
			if(e.getKeyCode()==10)
			{
				System.out.println("txt1's Enter");
				String txt = txt1.getText();
				area1.append(txt+"\n");
				txt1.setText(" ");
			}
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// 키를 땟을때(UNICODE 지원)
//		System.out.println("keyReleased()");
//		System.out.println("keyReleased() : " + " " + e.getKeyChar());
//		System.out.println("keyReleased() : " + " " + e.getKeyCode());
	}


	@Override
	public void mouseClicked(MouseEvent e) 
	{		
//		System.out.println("mouseClicked()");		
//		System.out.println(e.getPoint().x + " " + e.getPoint().y);	// 클릭한 위치 좌표
		int offset = area1.viewToModel(e.getPoint()); // 좌표값을 area에 전달해서 클릭한 위치의 상대적 위치 확인
//		System.out.println(offset);
		try {
			int row = area1.getLineOfOffset(offset); // 현재행의 값을 홗인
			System.out.println(row); 
			int startOffset = area1.getLineStartOffset(row); // 행값을 전달하여 해당 행의 시작 위치값 확인
			int endOffset = area1.getLineEndOffset(row); // 행값을 전달하여 해당 행의 마지막 위치값 확인
			String txt = area1.getText(startOffset, endOffset-startOffset); // 클릭한 행의 시작문자열과 마지막 번위를 전달하여 문자열을 추출
			System.out.println(txt);
			
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
	}


	@Override
	public void mousePressed(MouseEvent e) 
	{		
//		System.out.println("mousePressed()");
	}


	@Override
	public void mouseReleased(MouseEvent e) 
	{		
//		System.out.println("mouseReleased()");
	}


	@Override
	public void mouseEntered(MouseEvent e) 
	{	
//		System.out.println("mouseEntered()");
	}


	@Override
	public void mouseExited(MouseEvent e) 
	{		
//		System.out.println("mouseExited()");
	}
}


public class C06SwingMain {

	public static void main(String[] args) {
		
		new C06GUI();
		
		
		
	}

}
