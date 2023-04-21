package Tema_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;

public class Menu_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_user;
	private JPasswordField pf_pass;
	private JTextField txt_nom;
	private JTextField txt_tel;
	private JTextField txt_sueldo;
	private JTextField txt_name;
	private JTextField txt_slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_1 frame = new Menu_1();
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
	public Menu_1() {
		setTitle("Menu de opciones.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 582);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		tabbedPane.setBounds(40, 40, 619, 466);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 91, 170));
		tabbedPane.addTab("Login", null, panel, null);
		panel.setLayout(null);
		
		JLabel lbl_titulo = new JLabel("Login");
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setBackground(new Color(240, 240, 240));
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lbl_titulo.setBounds(10, 21, 594, 41);
		panel.add(lbl_titulo);
		
		JLabel lbl_user = new JLabel("UserName:");
		lbl_user.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_user.setBounds(55, 272, 133, 41);
		panel.add(lbl_user);
		
		JLabel lbl_pass = new JLabel("Password:");
		lbl_pass.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_pass.setBounds(55, 335, 133, 41);
		panel.add(lbl_pass);
		
		txt_user = new JTextField();
		txt_user.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_user.setBounds(175, 272, 222, 41);
		panel.add(txt_user);
		txt_user.setColumns(10);
		
		JButton btn_ingresar = new JButton("Ingresar");
		btn_ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_user.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Ingrese su usuario.", "Error.", JOptionPane.ERROR_MESSAGE);
					txt_user.requestFocus();
				}
				else {
					if(pf_pass.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Ingrese su password.", "Error.", JOptionPane.ERROR_MESSAGE);
						pf_pass.requestFocus();
					}
					else {
						if(txt_user.getText().equals("Noam")) {
							if(pf_pass.getText().equals("1234")) {
								JOptionPane.showMessageDialog(null, "Bienvenido.", "Información.", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								JOptionPane.showMessageDialog(null, "Datos no validos", "Error.", JOptionPane.ERROR_MESSAGE);
								txt_user.setText("");
								pf_pass.setText("");
								txt_user.requestFocus();
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Datos no validos", "Error.", JOptionPane.ERROR_MESSAGE);
							txt_user.setText("");
							pf_pass.setText("");
							txt_user.requestFocus();
						}
						
						
						
						
						//JOptionPane.showMessageDialog(null, "Bienvenido.", "Información.", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btn_ingresar.setBackground(new Color(51, 102, 255));
		btn_ingresar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_ingresar.setBounds(433, 272, 133, 41);
		panel.add(btn_ingresar);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_user.setText("");			
				pf_pass.setText("");
				txt_user.requestFocus();
			}
		});
		btn_cancelar.setBackground(new Color(255, 51, 51));
		btn_cancelar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_cancelar.setBounds(433, 335, 133, 41);
		panel.add(btn_cancelar);
		
		pf_pass = new JPasswordField();
		pf_pass.setEchoChar('*');
		pf_pass.setFont(new Font("Tahoma", Font.BOLD, 16));
		pf_pass.setBounds(175, 335, 222, 41);
		panel.add(pf_pass);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_logo.setIcon(new ImageIcon("C:\\Users\\noama\\eclipse\\java-2021-062\\eclipse\\MyWorkSpace\\TAD2023_2\\Figuras\\depositphotos_45060115-stock-photo-stop-right-there.jpg"));
		lbl_logo.setBounds(217, 72, 168, 165);
		panel.add(lbl_logo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(247, 166, 182));
		tabbedPane.addTab("JList", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_nombre.setBounds(33, 43, 133, 41);
		panel_2.add(lbl_nombre);
		
		JLabel lbl_telefono = new JLabel("Tel\u00E9fono:");
		lbl_telefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_telefono.setBounds(33, 106, 133, 41);
		panel_2.add(lbl_telefono);
		
		txt_nom = new JTextField();
		txt_nom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				if(txt_nom.getText().length() >= 25)
				{
					evt.consume();
				}
				else
				{				   				  			
					int key = evt.getKeyChar();
					boolean numeros = (key >= 97 && key <= 122) || (key >= 65 && key <= 90) || key == 32;				        
					if (!numeros)
					{
						evt.consume();
					}   
				}
			}
		});
		txt_nom.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_nom.setColumns(10);
		txt_nom.setBounds(153, 43, 222, 41);
		panel_2.add(txt_nom);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 286, 152, 120);
		panel_2.add(scrollPane);
		
		DefaultListModel modeloL1 = new DefaultListModel();
		JList lista_noms = new JList();
		scrollPane.setViewportView(lista_noms);
		lista_noms.setModel(modeloL1);
		
		JLabel lbl_list_noms = new JLabel("Nombres");
		lbl_list_noms.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_list_noms.setBounds(68, 235, 133, 41);
		panel_2.add(lbl_list_noms);
		
		DefaultListModel modeloL2 = new DefaultListModel();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(237, 286, 152, 120);
		panel_2.add(scrollPane_1);
		JList lista_tels = new JList();
		scrollPane_1.setViewportView(lista_tels);
		lista_tels.setModel(modeloL2);
		
		DefaultListModel modeloL3 = new DefaultListModel();
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(434, 286, 152, 120);
		panel_2.add(scrollPane_2);
		JList lista_sueldos = new JList();
		scrollPane_2.setViewportView(lista_sueldos);
		lista_sueldos.setModel(modeloL3);
		
		JLabel lbl_list_tels = new JLabel("Tel\u00E9fonos");
		lbl_list_tels.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_list_tels.setBounds(270, 235, 133, 41);
		panel_2.add(lbl_list_tels);
		
		JLabel lbl_list_sueldos = new JLabel("Sueldos");
		lbl_list_sueldos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_list_sueldos.setBounds(471, 235, 133, 41);
		panel_2.add(lbl_list_sueldos);
		
		JButton btn_add = new JButton("Agregatr a JListas");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_nom.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Ingrese su nombre.", "Error.", JOptionPane.ERROR_MESSAGE);
					txt_nom.requestFocus();
				}
				else{
					if(txt_tel.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Ingrese su número de teléfono.", "Error.", JOptionPane.ERROR_MESSAGE);
						txt_tel.requestFocus();
					}
					else{
						if(txt_sueldo.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Ingrese su sueldo.", "Error.", JOptionPane.ERROR_MESSAGE);
							txt_sueldo.requestFocus();
						}
						else{
							modeloL1.addElement(txt_nom.getText());
							modeloL2.addElement(txt_tel.getText());
							modeloL3.addElement(txt_sueldo.getText());
							txt_nom.setText("");
							txt_tel.setText("");
							txt_sueldo.setText("");
							txt_nom.requestFocus();
						}
					}
				}
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_add.setBackground(new Color(51, 102, 255));
		btn_add.setBounds(401, 43, 185, 41);
		panel_2.add(btn_add);
		
		JButton btn_limnpiar = new JButton("Limpiar");
		btn_limnpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_nom.setText("");
				txt_tel.setText("");
				txt_sueldo.setText("");
				txt_nom.requestFocus();
			}
		});
		btn_limnpiar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_limnpiar.setBackground(new Color(255, 51, 51));
		btn_limnpiar.setBounds(401, 106, 185, 41);
		panel_2.add(btn_limnpiar);
		
		JLabel lbl_sueldo = new JLabel("Sueldo:");
		lbl_sueldo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_sueldo.setBounds(33, 167, 133, 41);
		panel_2.add(lbl_sueldo);
		
		txt_tel = new JTextField();
		txt_tel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				if(txt_tel.getText().length() >= 10)
				{
					evt.consume();
				}
				else
				{				   				  			
					int key = evt.getKeyChar();
					boolean numeros = key >= 48 && key <= 57;				        
					if (!numeros)
					{
						evt.consume();
					}   
				}
			}
		});
		txt_tel.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_tel.setColumns(10);
		txt_tel.setBounds(153, 106, 222, 41);
		panel_2.add(txt_tel);
		
		txt_sueldo = new JTextField();
		txt_sueldo.addKeyListener(new KeyAdapter() {
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
		txt_sueldo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_sueldo.setColumns(10);
		txt_sueldo.setBounds(153, 167, 222, 41);
		panel_2.add(txt_sueldo);
		
		JButton btn_borrar_listas = new JButton("Borrar Listas");
		btn_borrar_listas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_nom.setText("");
				txt_tel.setText("");
				txt_sueldo.setText("");
				txt_nom.requestFocus();
				modeloL1.clear();
				modeloL2.clear();
				modeloL3.clear();
			}
		});
		btn_borrar_listas.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_borrar_listas.setBackground(Color.ORANGE);
		btn_borrar_listas.setBounds(401, 167, 185, 41);
		panel_2.add(btn_borrar_listas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(199, 61, 46));
		tabbedPane.addTab("JSpinner", null, panel_1, null);
		panel_1.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner.setFont(new Font("Tahoma", Font.BOLD, 16));
		spinner.setBounds(153, 31, 97, 34);
		panel_1.add(spinner);
		
		JButton btnNewButton = new JButton("Probar JSpinner");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(spinner.getValue().toString()){
					case "1": JOptionPane.showMessageDialog(null, "Seleccionaste el 1", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "2": JOptionPane.showMessageDialog(null, "Seleccionaste el 2", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "3": JOptionPane.showMessageDialog(null, "Seleccionaste el 3", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "4": JOptionPane.showMessageDialog(null, "Seleccionaste el 4", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "5": JOptionPane.showMessageDialog(null, "Seleccionaste el 5", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "6": JOptionPane.showMessageDialog(null, "Seleccionaste el 6", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "7": JOptionPane.showMessageDialog(null, "Seleccionaste el 7", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "8": JOptionPane.showMessageDialog(null, "Seleccionaste el 8", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "9": JOptionPane.showMessageDialog(null, "Seleccionaste el 9", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
					case "10": JOptionPane.showMessageDialog(null, "Seleccionaste el 10", "Información.", JOptionPane.INFORMATION_MESSAGE);
							break;
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(278, 31, 167, 34);
		panel_1.add(btnNewButton);
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(204, 153, 102));
		slider.setBorder(new LineBorder(new Color(0, 0, 0)));
		slider.setForeground(Color.RED);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setValue(0);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txt_slider.setText("" + slider.getValue());
			}
		});
		slider.setFont(new Font("Tahoma", Font.BOLD, 16));
		slider.setBounds(32, 160, 557, 62);
		panel_1.add(slider);
		
		txt_slider = new JTextField();
		txt_slider.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_slider.setBounds(261, 244, 96, 34);
		panel_1.add(txt_slider);
		txt_slider.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 16));
		progressBar.setBounds(32, 374, 557, 34);
		panel_1.add(progressBar);
		
		JButton btn_pbar = new JButton("Progressbar");
		btn_pbar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread hilo = new Thread() {
					public void run() {
						progressBar.setMaximum(2000000);
						for(int i = 0; i< 2000000; i++) {
							System.out.println(i);							
							progressBar.setValue(i);
						}
						progressBar.setValue(0);
					}
				};
				hilo.start();
			}
		});
		btn_pbar.setBackground(new Color(148, 0, 211));
		btn_pbar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_pbar.setBounds(246, 324, 147, 34);
		panel_1.add(btn_pbar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(122, 250, 116));
		tabbedPane.addTab("JComboBox", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lbl_name = new JLabel("Ingrese su Nombre:");
		lbl_name.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_name.setBounds(36, 36, 210, 34);
		panel_3.add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_name.setBounds(222, 36, 210, 34);
		panel_3.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lbl_selector = new JLabel("Seleccione su rango de edad:");
		lbl_selector.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_selector.setBounds(36, 110, 260, 34);
		panel_3.add(lbl_selector);
		
		JComboBox cb_select = new JComboBox();
		cb_select.setModel(new DefaultComboBoxModel(new String[] {"", "0 - 1 A\u00F1os", "2 - 11 A\u00F1os", "12 - 17 A\u00F1os", "18 - N A\u00F1os"}));
		cb_select.setFont(new Font("Tahoma", Font.BOLD, 16));
		cb_select.setBounds(293, 107, 141, 34);
		panel_3.add(cb_select);
		
		JButton btn_ver = new JButton("Ver Dato");
		btn_ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Ingrese su nombre.", "Error.", JOptionPane.ERROR_MESSAGE);
					txt_name.requestFocus();
				}
				else
				{
					if(cb_select.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "Seleccione su rango de edad.", "Error.", JOptionPane.ERROR_MESSAGE);
						cb_select.requestFocus();
					}
					else
					{
						String dato = "";
						if(cb_select.getSelectedIndex() == 1) {
							dato = "Bebe";
						}
						if(cb_select.getSelectedIndex() == 2) {
							dato = "Infante";
						}
						if(cb_select.getSelectedIndex() == 3) {
							dato = "Adolecente";
						}
						if(cb_select.getSelectedIndex() == 4) {
							dato = "Adulto";
						}
						JOptionPane.showMessageDialog(null, "Eres un " + dato, "Información.", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btn_ver.setBackground(Color.GREEN);
		btn_ver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_ver.setBounds(454, 36, 128, 34);
		panel_3.add(btn_ver);
				
	}
}
