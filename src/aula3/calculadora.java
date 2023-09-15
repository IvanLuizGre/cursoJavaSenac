package aula3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldValor1;
	private JTextField textFieldValor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		textFieldValor1 = new JTextField();
		textFieldValor1.setBounds(71, 11, 120, 20);
		contentPane.add(textFieldValor1);
		textFieldValor1.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor 2");
		lblValor.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblValor.setBounds(10, 40, 46, 14);
		contentPane.add(lblValor);
		
		textFieldValor2 = new JTextField();
		textFieldValor2.setColumns(10);
		textFieldValor2.setBounds(71, 37, 120, 20);
		contentPane.add(textFieldValor2);
		
		JLabel lblNewLabelResultado = new JLabel("0.00");
		lblNewLabelResultado.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabelResultado.setBounds(102, 124, 89, 14);
		contentPane.add(lblNewLabelResultado);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int v1=Integer.parseInt(textFieldValor1.getText());
					int v2=Integer.parseInt(textFieldValor2.getText());
					lblNewLabelResultado.setText((v1+v2)+"");
				}
				catch(Exception erro) {
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(24, 76, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(123, 76, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(222, 76, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x");
		btnNewButton_3.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_3.setBounds(321, 76, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 124, 82, 14);
		contentPane.add(lblNewLabel_2);
	}
}
