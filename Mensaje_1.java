package Tema_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mensaje_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mensaje_1 frame = new Mensaje_1();
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
	public Mensaje_1() {
		setTitle("1 Mensaje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(122, 250, 116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_mensaje = new JButton("Mensaje");
		btn_mensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Excelente.");
				JOptionPane.showMessageDialog(null, "Bienvenido.", "Información.", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn_mensaje.setForeground(new Color(220, 20, 60));
		btn_mensaje.setBackground(new Color(102, 205, 170));
		btn_mensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_mensaje.setBounds(73, 23, 144, 61);
		contentPane.add(btn_mensaje);
	}
}
