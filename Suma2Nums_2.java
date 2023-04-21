package Tema_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class Suma2Nums_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_n1;
	private JTextField txt_n2;
	private JTextField txt_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma2Nums_2 frame = new Suma2Nums_2();
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
	public Suma2Nums_2() {
		setTitle("Suma de 2 n\u00FAmeros.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 282);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer n\u00FAmero");
		lblNewLabel.setBounds(39, 36, 150, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblSegundoNmero = new JLabel("Segundo n\u00FAmero");
		lblSegundoNmero.setBounds(39, 93, 150, 25);
		lblSegundoNmero.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblSegundoNmero);
		
		txt_n1 = new JTextField();
		txt_n1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_n1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				int key = evt.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;				        
				if (!numeros)
				{
					evt.consume();
				}   
			}
		});
		txt_n1.setBounds(185, 33, 98, 31);
		txt_n1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_n2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				int key = evt.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;				        
				if (!numeros)
				{
					evt.consume();
				} 
			}
		});
		txt_n2.setBounds(185, 90, 98, 31);
		txt_n2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_n2.setColumns(10);
		contentPane.add(txt_n2);
		
		JButton btn_sumar = new JButton("Sumar");
		btn_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_n1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio.", "Error.", JOptionPane.ERROR_MESSAGE);
					txt_n1.requestFocus();
				}
				else {
					if(txt_n2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio.", "Error.", JOptionPane.ERROR_MESSAGE);
						txt_n2.requestFocus();
					}
					else {
						long v1 = Long.parseLong(txt_n1.getText());
						long v2 = Long.parseLong(txt_n2.getText());
						//JOptionPane.showMessageDialog(null, "La suma de " + v1 + " + " + v2 + " es: " + (v1 + v2), "Información.", JOptionPane.INFORMATION_MESSAGE);
						txt_resultado.setText("" + (v1 + v2));
					}
				}	
			}
		});
		btn_sumar.setBackground(new Color(0, 0, 205));
		btn_sumar.setForeground(Color.MAGENTA);
		btn_sumar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_sumar.setBounds(311, 33, 111, 88);
		contentPane.add(btn_sumar);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(39, 172, 150, 25);
		contentPane.add(lblResultado);
		
		txt_resultado = new JTextField();
		txt_resultado.setEditable(false);
		txt_resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_resultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_resultado.setColumns(10);
		txt_resultado.setBounds(185, 169, 98, 31);
		contentPane.add(txt_resultado);
		
		JButton btn_borrar = new JButton("Borrar");
		btn_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_n1.setText("");
				txt_n2.setText("");
				txt_resultado.setText("");
				txt_n1.requestFocus();
			}
		});
		btn_borrar.setForeground(Color.YELLOW);
		btn_borrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_borrar.setBackground(new Color(255, 0, 0));
		btn_borrar.setBounds(311, 131, 111, 88);
		contentPane.add(btn_borrar);
	}
}
