import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	public GUI() {
		// TODO Auto-generated method stub
		setTitle("Upgradable App");
setLayout(new BorderLayout());
		JPanel mp = new JPanel();
		
		JTextField a = new JTextField(5);

		JTextField b = new JTextField(5);

		JLabel operator = new JLabel("+");
		JLabel equal = new JLabel("=");
		JTextField result = new JTextField(5);
		JButton cal = new JButton("Calc");
		result.setEnabled(false);
		mp.add(a);
		mp.add(operator);
		mp.add(b);
		mp.add(equal);
		mp.add(result);
		mp.add(cal);
		
		cal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String aText = a.getText();
				String bText = b.getText();
				try {
					int a = Integer.parseInt(aText);
					int b = Integer.parseInt(bText);
					int res = a + b;
					result.setText(res + "");
				} catch (NumberFormatException exception) {
					
				}
			}
		});
		
		getContentPane().add(mp ,BorderLayout.CENTER);//		getContentPane().add(new MyToolbar(mp), BorderLayout.NORTH);
		setSize(400, 400);
		setBounds(300, 300, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

}
