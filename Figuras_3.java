package Tema_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Figuras_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figuras_3 frame = new Figuras_3();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Figuras_3() {
		setTitle("Figuras.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 621);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_f1 = new JLabel("");
		lbl_f1.setVisible(false);
		lbl_f1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_f1.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\bears.png"));
		lbl_f1.setBounds(68, 31, 162, 174);
		contentPane.add(lbl_f1);
		
		JLabel lbl_f2 = new JLabel("");
		lbl_f2.setVisible(false);
		lbl_f2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_f2.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\bengals.png"));
		lbl_f2.setBounds(290, 10, 305, 195);
		contentPane.add(lbl_f2);
		
		JLabel lbl_f3 = new JLabel("");
		lbl_f3.setVisible(false);
		lbl_f3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_f3.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\bills.png"));
		lbl_f3.setBounds(602, 23, 246, 182);
		contentPane.add(lbl_f3);
		
		JLabel lbl_i1 = new JLabel("");
		lbl_i1.setVisible(false);
		lbl_i1.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\logo nfl.png"));
		lbl_i1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_i1.setBounds(24, 288, 246, 237);
		contentPane.add(lbl_i1);
		
		JLabel lbl_i2 = new JLabel("");
		lbl_i2.setVisible(false);
		lbl_i2.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\shiefs.png"));
		lbl_i2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_i2.setBounds(312, 323, 268, 195);
		contentPane.add(lbl_i2);
		
		JLabel lbl_i3 = new JLabel("");
		lbl_i3.setVisible(false);
		lbl_i3.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\steelers.png"));
		lbl_i3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_i3.setBounds(623, 357, 225, 161);
		contentPane.add(lbl_i3);
		
		JCheckBox check_f1 = new JCheckBox("Mostrar Imagen");
		check_f1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (check_f1.isSelected()==true) {
					lbl_f1.setVisible(true);
					check_f1.setText("Ocultar Imagen");
				}
				else {
					lbl_f1.setVisible(false);
					check_f1.setText("Mostrar Imagen");
				}
			}
		});
		check_f1.setBackground(Color.WHITE);
		check_f1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		check_f1.setBounds(65, 226, 217, 29);
		contentPane.add(check_f1);
		
		JCheckBox check_f2 = new JCheckBox("Mostrar Imagen");
		check_f2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (check_f2.isSelected()==true) {
					lbl_f2.setVisible(true);
					check_f2.setText("Ocultar Imagen");
				}
				else {
					lbl_f2.setVisible(false);
					check_f2.setText("Mostrar Imagen");
				}
			}
		});
		check_f2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		check_f2.setBackground(Color.WHITE);
		check_f2.setBounds(349, 226, 217, 29);
		contentPane.add(check_f2);
		
		JCheckBox check_f3 = new JCheckBox("Mostrar Imagen");
		check_f3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (check_f3.isSelected()==true) {
					lbl_f3.setVisible(true);
					check_f3.setText("Ocultar Imagen");
				}
				else {
					lbl_f3.setVisible(false);
					check_f3.setText("Mostrar Imagen");
				}
			}
		});
		check_f3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		check_f3.setBackground(Color.WHITE);
		check_f3.setBounds(631, 226, 217, 29);
		contentPane.add(check_f3);
		
		JRadioButton radio_i1 = new JRadioButton("Mostrar Imagen");
		buttonGroup.add(radio_i1);
		radio_i1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (radio_i1.isSelected()==true) {
					lbl_i1.setVisible(true);
					radio_i1.setText("Ocultar Imagen");
				}
				else {
					lbl_i1.setVisible(false);
					radio_i1.setText("Mostrar Imagen");
				}
			}
		});
		radio_i1.setBackground(Color.WHITE);
		radio_i1.setFont(new Font("Tahoma", Font.BOLD, 16));
		radio_i1.setBounds(68, 537, 173, 29);
		contentPane.add(radio_i1);
		
		JRadioButton radio_i2 = new JRadioButton("Mostrar Imagen");
		buttonGroup.add(radio_i2);
		radio_i2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (radio_i2.isSelected()==true) {
					lbl_i2.setVisible(true);
					radio_i2.setText("Ocultar Imagen");
				}
				else {
					lbl_i2.setVisible(false);
					radio_i2.setText("Mostrar Imagen");
				}
			}
		});
		radio_i2.setFont(new Font("Tahoma", Font.BOLD, 16));
		radio_i2.setBackground(Color.WHITE);
		radio_i2.setBounds(362, 537, 173, 29);
		contentPane.add(radio_i2);
		
		JRadioButton radio_i3 = new JRadioButton("Mostrar Imagen");
		buttonGroup.add(radio_i3);
		radio_i3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (radio_i3.isSelected()==true) {
					lbl_i3.setVisible(true);
					radio_i3.setText("Ocultar Imagen");
				}
				else {
					lbl_i3.setVisible(false);
					radio_i3.setText("Mostrar Imagen");
				}
			}
		});
		radio_i3.setFont(new Font("Tahoma", Font.BOLD, 16));
		radio_i3.setBackground(Color.WHITE);
		radio_i3.setBounds(660, 537, 173, 29);
		contentPane.add(radio_i3);
	}
}
