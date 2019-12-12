package mvc_swing_jfx.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Point;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;

public class Swap extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swap frame = new Swap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Swap() {
		setTitle("Swapper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 440, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(0, 0, 181, 68);
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setText("oui");
		panel.add(txt1);
		txt1.setColumns(10);
		
		JButton btnNewButton = new JButton("SWAP");
		btnNewButton.setBounds(181, 18, 78, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String stock = txt2.getText();
				txt2.setText(txt1.getText());
				txt1.setText(stock);
			}
		});
		panel.add(btnNewButton);
		
		txt2 = new JTextField();
		txt2.setBounds(259, 0, 181, 68);
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setText("non");
		panel.add(txt2);
		txt2.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(5, 73, 440, 39);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Fermer");
		btnNewButton_1.setBounds(347, 6, 87, 29);
		btnNewButton_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnNewButton_1);
	}


}
