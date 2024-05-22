package Ejecutable;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDirecEnvio;
	private JTextField textFieldEmailNueCli;
	private JTextField textFieldTelefonoNueCli;
	private JTextField textFieldNombreNueCli;
	private JTextField textFieldNIFNueCli;
	private JTextField textFieldCIFNuePro;
	private JTextField textFieldNombreNuePro;
	private JTextField textFieldTelefonoNuePro;
	private JTextField textFieldWebNuePro;
	private JTextField textFieldDomicilioFiscalNuePro;
	private JTextField textFieldDirecEnvioDaCli;
	private JTextField textFieldEmailDaCli;
	private JTextField textFieldTelefonoDaCli;
	private JTextField textFieldNombreDaCli;
	private JTextField textFieldNIFDaCli;
	private JTextField textFieldCIFDaPro;
	private JTextField textFieldNombreDaPro;
	private JTextField textFieldTelefonoDaPro;
	private JTextField textFieldWebDaPro;
	private JTextField textFieldDomicilioFiscalDaPro;
	private CardLayout cardLayout;
	private JPanel cardPanel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setBackground(new Color(255, 161, 161));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 110, 1312, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 161, 161));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		cardPanel.setBounds(12, 363, 500, 250);
		contentPane.add(cardPanel);

		JPanel panelNueCli = new JPanel();
		panelNueCli.setLayout(null);
		panelNueCli
				.setBorder(new TitledBorder(null, "NUEVO CLIENTE", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelNueCli.setBounds(196, 12, 539, 261);
		contentPane.add(panelNueCli);

		JLabel lblNIFNueCli = new JLabel("ID (NIF)");
		lblNIFNueCli.setBounds(26, 49, 70, 15);
		panelNueCli.add(lblNIFNueCli);

		JLabel lblNombreNueCli = new JLabel("NOMBRE");
		lblNombreNueCli.setBounds(26, 85, 70, 15);
		panelNueCli.add(lblNombreNueCli);

		JLabel lblTelefonoNueCli = new JLabel("TELÉFONO");
		lblTelefonoNueCli.setBounds(26, 120, 81, 15);
		panelNueCli.add(lblTelefonoNueCli);

		JLabel lblEmailNueCli = new JLabel("EMAIL");
		lblEmailNueCli.setBounds(26, 152, 70, 15);
		panelNueCli.add(lblEmailNueCli);

		JLabel lblDirecEnvioNueCli = new JLabel("DIRECCIÓN ENVÍO");
		lblDirecEnvioNueCli.setBounds(26, 185, 126, 15);
		panelNueCli.add(lblDirecEnvioNueCli);

		textFieldDirecEnvio = new JTextField();
		textFieldDirecEnvio.setColumns(10);
		textFieldDirecEnvio.setBounds(158, 183, 174, 19);
		panelNueCli.add(textFieldDirecEnvio);

		textFieldEmailNueCli = new JTextField();
		textFieldEmailNueCli.setColumns(10);
		textFieldEmailNueCli.setBounds(114, 150, 152, 19);
		panelNueCli.add(textFieldEmailNueCli);

		textFieldTelefonoNueCli = new JTextField();
		textFieldTelefonoNueCli.setColumns(10);
		textFieldTelefonoNueCli.setBounds(114, 118, 114, 19);
		panelNueCli.add(textFieldTelefonoNueCli);

		textFieldNombreNueCli = new JTextField();
		textFieldNombreNueCli.setColumns(10);
		textFieldNombreNueCli.setBounds(114, 83, 114, 19);
		panelNueCli.add(textFieldNombreNueCli);

		textFieldNIFNueCli = new JTextField();
		textFieldNIFNueCli.setColumns(10);
		textFieldNIFNueCli.setBounds(114, 47, 114, 19);
		panelNueCli.add(textFieldNIFNueCli);

		JCalendar calendarNueCli = new JCalendar();
		calendarNueCli.setBounds(290, 29, 237, 152);
		panelNueCli.add(calendarNueCli);

		JLabel lblFechaCompletaNueCli = new JLabel();
		lblFechaCompletaNueCli.setBounds(26, 231, 237, 15);
		panelNueCli.add(lblFechaCompletaNueCli);

		Timer timerNueCli = new Timer(1000, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date currentDateNueCli = new Date();
				SimpleDateFormat dateFormatNueCli = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String formattedDateNueCli = dateFormatNueCli.format(currentDateNueCli);
				lblFechaCompletaNueCli.setText(formattedDateNueCli);
				// TODO Auto-generated method stub
			}
		});

		timerNueCli.start();

		JButton btnAltaNueCli = new JButton("ALTA");

		btnAltaNueCli.setBounds(401, 215, 126, 31);
		panelNueCli.add(btnAltaNueCli);

		JPanel panelNuePro = new JPanel();
		panelNuePro.setLayout(null);
		panelNuePro.setBorder(
				new TitledBorder(null, "NUEVO PROVEEDOR", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelNuePro.setBounds(747, 12, 539, 261);
		contentPane.add(panelNuePro);

		JLabel lblCIFNuePro = new JLabel("ID (CIF)");
		lblCIFNuePro.setBounds(26, 49, 70, 15);
		panelNuePro.add(lblCIFNuePro);

		JLabel lblNombreNuePro = new JLabel("NOMBRE");
		lblNombreNuePro.setBounds(26, 85, 70, 15);
		panelNuePro.add(lblNombreNuePro);

		JLabel lblTelefonoNuePro = new JLabel("TELÉFONO");
		lblTelefonoNuePro.setBounds(26, 120, 81, 15);
		panelNuePro.add(lblTelefonoNuePro);

		JLabel lblWebNuePro = new JLabel("WEB");
		lblWebNuePro.setBounds(26, 152, 70, 15);
		panelNuePro.add(lblWebNuePro);

		JLabel lblDomicilioFiscalNuePro = new JLabel("DOMICILIO FISCAL");
		lblDomicilioFiscalNuePro.setBounds(26, 185, 126, 15);
		panelNuePro.add(lblDomicilioFiscalNuePro);

		JCalendar calendarNuePro = new JCalendar();
		calendarNuePro.setBounds(290, 29, 237, 152);
		panelNuePro.add(calendarNuePro);

		JLabel lblFechaCompletaNuePro = new JLabel();
		lblFechaCompletaNuePro.setBounds(26, 229, 237, 15);
		panelNuePro.add(lblFechaCompletaNuePro);

		Timer timerNuePro = new Timer(1000, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date currentDateNuePro = new Date();
				SimpleDateFormat dateFormatNuePro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String formattedDateNuePro = dateFormatNuePro.format(currentDateNuePro);
				lblFechaCompletaNuePro.setText(formattedDateNuePro);
				// TODO Auto-generated method stub
			}
		});

		timerNuePro.start();

		JButton btnAltaNuePro = new JButton("ALTA");
		btnAltaNuePro.setBounds(401, 213, 126, 31);
		panelNuePro.add(btnAltaNuePro);

		textFieldCIFNuePro = new JTextField();
		textFieldCIFNuePro.setColumns(10);
		textFieldCIFNuePro.setBounds(114, 47, 114, 19);
		panelNuePro.add(textFieldCIFNuePro);

		textFieldNombreNuePro = new JTextField();
		textFieldNombreNuePro.setColumns(10);
		textFieldNombreNuePro.setBounds(114, 83, 114, 19);
		panelNuePro.add(textFieldNombreNuePro);

		textFieldTelefonoNuePro = new JTextField();
		textFieldTelefonoNuePro.setText("");
		textFieldTelefonoNuePro.setColumns(10);
		textFieldTelefonoNuePro.setBounds(114, 116, 114, 19);
		panelNuePro.add(textFieldTelefonoNuePro);

		textFieldWebNuePro = new JTextField();
		textFieldWebNuePro.setText("");
		textFieldWebNuePro.setColumns(10);
		textFieldWebNuePro.setBounds(114, 150, 141, 19);
		panelNuePro.add(textFieldWebNuePro);

		textFieldDomicilioFiscalNuePro = new JTextField();
		textFieldDomicilioFiscalNuePro.setColumns(10);
		textFieldDomicilioFiscalNuePro.setBounds(165, 183, 148, 19);
		panelNuePro.add(textFieldDomicilioFiscalNuePro);

		JPanel panelDaCli = new JPanel();
		panelDaCli.setLayout(null);
		panelDaCli.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "DATOS CLIENTE",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelDaCli.setBounds(12, 462, 539, 276);
		cardPanel.add(panelDaCli, "panelDaCli");

		JLabel lblNIFDaCli = new JLabel("ID (NIF)");
		lblNIFDaCli.setBounds(26, 49, 70, 15);
		panelDaCli.add(lblNIFDaCli);

		JLabel lblNombreDaCli = new JLabel("NOMBRE");
		lblNombreDaCli.setBounds(26, 85, 70, 15);
		panelDaCli.add(lblNombreDaCli);

		JLabel lblTelfonoDaCli = new JLabel("TELÉFONO");
		lblTelfonoDaCli.setBounds(26, 120, 81, 15);
		panelDaCli.add(lblTelfonoDaCli);

		JLabel lblEmailDaCli = new JLabel("EMAIL");
		lblEmailDaCli.setBounds(26, 152, 70, 15);
		panelDaCli.add(lblEmailDaCli);

		JLabel lblDirecEnvioDaCli = new JLabel("DIRECCIÓN ENVÍO");
		lblDirecEnvioDaCli.setBounds(26, 185, 126, 15);
		panelDaCli.add(lblDirecEnvioDaCli);

		textFieldDirecEnvioDaCli = new JTextField();
		textFieldDirecEnvioDaCli.setColumns(10);
		textFieldDirecEnvioDaCli.setBounds(158, 183, 174, 19);
		panelDaCli.add(textFieldDirecEnvioDaCli);

		textFieldEmailDaCli = new JTextField();
		textFieldEmailDaCli.setColumns(10);
		textFieldEmailDaCli.setBounds(114, 150, 152, 19);
		panelDaCli.add(textFieldEmailDaCli);

		textFieldTelefonoDaCli = new JTextField();
		textFieldTelefonoDaCli.setColumns(10);
		textFieldTelefonoDaCli.setBounds(114, 118, 114, 19);
		panelDaCli.add(textFieldTelefonoDaCli);

		textFieldNombreDaCli = new JTextField();
		textFieldNombreDaCli.setColumns(10);
		textFieldNombreDaCli.setBounds(114, 83, 114, 19);
		panelDaCli.add(textFieldNombreDaCli);

		textFieldNIFDaCli = new JTextField();
		textFieldNIFDaCli.setColumns(10);
		textFieldNIFDaCli.setBounds(114, 47, 114, 19);
		panelDaCli.add(textFieldNIFDaCli);

		JLabel lblFechaCompletaDaCli = new JLabel();
		lblFechaCompletaDaCli.setBounds(338, 249, 189, 15);
		panelDaCli.add(lblFechaCompletaDaCli);

		JLabel lblImagendacli = new JLabel("");
		lblImagendacli.setIcon(new ImageIcon("C:\\Users\\usuaria\\eclipse-workspace\\CallCenterGeneral\\Entregable\\Ejecutable\\ImgCallCenterGeneral\\clientes1.png"));
		lblImagendacli.setBounds(335, 85, 70, 68);
		panelDaCli.add(lblImagendacli);

		JButton btnPasaralaotraDaCli = new JButton("");
		btnPasaralaotraDaCli.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "panelDaPro");
			}
		});

		btnPasaralaotraDaCli.setBackground(new Color(238, 238, 236));
		btnPasaralaotraDaCli.setIcon(new ImageIcon("C:\\Users\\usuaria\\eclipse-workspace\\CallCenterGeneral\\Entregable\\Ejecutable\\ImgCallCenterGeneral\\pasar.png"));
		btnPasaralaotraDaCli.setBounds(418, 12, 70, 56);
		panelDaCli.add(btnPasaralaotraDaCli);

		Timer timerDaCli = new Timer(1000, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date currentDateDaCli = new Date();
				SimpleDateFormat dateFormatDaCli = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String formattedDateDaCli = dateFormatDaCli.format(currentDateDaCli);
				lblFechaCompletaDaCli.setText(formattedDateDaCli);
				// TODO Auto-generated method stub
			}
		});

		timerDaCli.start();

		JPanel panelDaPro = new JPanel();
		panelDaPro.setLayout(null);
		panelDaPro.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "DATOS PROVEEDOR",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelDaPro.setBounds(586, 462, 539, 276);
		cardPanel.add(panelDaPro, "panelDaPro");

		JLabel lblCIFDaPro = new JLabel("ID (CIF)");
		lblCIFDaPro.setBounds(26, 49, 70, 15);
		panelDaPro.add(lblCIFDaPro);

		JLabel lblNombreDaPro = new JLabel("NOMBRE");
		lblNombreDaPro.setBounds(26, 85, 70, 15);
		panelDaPro.add(lblNombreDaPro);

		JLabel lblTelefonoDaPro = new JLabel("TELÉFONO");
		lblTelefonoDaPro.setBounds(26, 120, 81, 15);
		panelDaPro.add(lblTelefonoDaPro);

		JLabel lblWebDaPro = new JLabel("WEB");
		lblWebDaPro.setBounds(26, 152, 70, 15);
		panelDaPro.add(lblWebDaPro);

		JLabel lblDomicilioFiscalDaPro = new JLabel("DOMICILIO FISCAL");
		lblDomicilioFiscalDaPro.setBounds(26, 185, 126, 15);
		panelDaPro.add(lblDomicilioFiscalDaPro);

		JLabel lblFechaCompleta_1_1 = new JLabel();
		lblFechaCompleta_1_1.setBounds(144, 249, 237, 15);
		panelDaPro.add(lblFechaCompleta_1_1);

		textFieldCIFDaPro = new JTextField();
		textFieldCIFDaPro.setColumns(10);
		textFieldCIFDaPro.setBounds(114, 47, 114, 19);
		panelDaPro.add(textFieldCIFDaPro);

		textFieldNombreDaPro = new JTextField();
		textFieldNombreDaPro.setColumns(10);
		textFieldNombreDaPro.setBounds(114, 83, 114, 19);
		panelDaPro.add(textFieldNombreDaPro);

		textFieldTelefonoDaPro = new JTextField();
		textFieldTelefonoDaPro.setText("");
		textFieldTelefonoDaPro.setColumns(10);
		textFieldTelefonoDaPro.setBounds(114, 116, 114, 19);
		panelDaPro.add(textFieldTelefonoDaPro);

		textFieldWebDaPro = new JTextField();
		textFieldWebDaPro.setText("");
		textFieldWebDaPro.setColumns(10);
		textFieldWebDaPro.setBounds(114, 150, 141, 19);
		panelDaPro.add(textFieldWebDaPro);

		textFieldDomicilioFiscalDaPro = new JTextField();
		textFieldDomicilioFiscalDaPro.setColumns(10);
		textFieldDomicilioFiscalDaPro.setBounds(165, 183, 148, 19);
		panelDaPro.add(textFieldDomicilioFiscalDaPro);

		JLabel lblFechaCompletaDaPro = new JLabel();
		lblFechaCompletaDaPro.setBounds(352, 249, 175, 15);
		panelDaPro.add(lblFechaCompletaDaPro);

		JLabel lblImagendapro = new JLabel("");
		lblImagendapro.setIcon(new ImageIcon("C:\\Users\\usuaria\\eclipse-workspace\\CallCenterGeneral\\Entregable\\Ejecutable\\ImgCallCenterGeneral\\almacen1.png"));
		lblImagendapro.setBounds(333, 85, 81, 82);
		panelDaPro.add(lblImagendapro);

		JButton btnPasaralaotraDaPro = new JButton("");
		btnPasaralaotraDaPro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "panelDaCli");
			}
		});

		btnPasaralaotraDaPro.setBackground(new Color(238, 238, 236));
		btnPasaralaotraDaPro.setIcon(new ImageIcon("C:\\Users\\usuaria\\eclipse-workspace\\CallCenterGeneral\\Entregable\\Ejecutable\\ImgCallCenterGeneral\\pasar.png"));
		btnPasaralaotraDaPro.setBounds(418, 12, 70, 56);
		panelDaPro.add(btnPasaralaotraDaPro);

		Timer timerDaPro = new Timer(1000, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date currentDateDaPro = new Date();
				SimpleDateFormat dateFormatDaPro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String formattedDateDaPro = dateFormatDaPro.format(currentDateDaPro);
				lblFechaCompletaDaPro.setText(formattedDateDaPro);
				// TODO Auto-generated method stub

			}
		});

		timerDaPro.start();

		JPanel panelTransacciones = new JPanel();
		panelTransacciones
				.setBorder(new TitledBorder(null, "TRANSACCIONES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTransacciones.setBounds(12, 280, 1276, 77);
		contentPane.add(panelTransacciones);
		panelTransacciones.setLayout(null);

		JLabel lblProducto = new JLabel("PRODUCTO");
		lblProducto.setBounds(79, 33, 88, 15);
		panelTransacciones.add(lblProducto);

		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setBounds(336, 33, 70, 15);
		panelTransacciones.add(lblCliente);

		JLabel lblProveedor = new JLabel("PROVEEDOR");
		lblProveedor.setBounds(592, 33, 93, 15);
		panelTransacciones.add(lblProveedor);

		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setBounds(878, 33, 49, 15);
		panelTransacciones.add(lblTipo);

		JComboBox comboBoxProducto = new JComboBox();
		comboBoxProducto.setModel(new DefaultComboBoxModel(new String[] {"Ordenador", "Bolso", "Movil"}));
		comboBoxProducto.setBounds(177, 31, 108, 19);
		panelTransacciones.add(comboBoxProducto);

		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(420, 31, 102, 19);
		panelTransacciones.add(comboBoxCliente);

		List<String> listaClientes = new ArrayList<>();
		btnAltaNueCli.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nifCliente = textFieldNIFNueCli.getText();
				listaClientes.add(nifCliente);

				comboBoxCliente.removeAllItems();
				for (String cliente : listaClientes) {
					comboBoxCliente.addItem(cliente);
				}
				guardarDatosClientes();
			}
		});

		JComboBox comboBoxProveedor = new JComboBox();
		comboBoxProveedor.setBounds(695, 31, 108, 19);
		panelTransacciones.add(comboBoxProveedor);

		List<String> listaProveedores = new ArrayList<>();
		btnAltaNuePro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String cifProveedor = textFieldCIFNuePro.getText();
				listaProveedores.add(cifProveedor);

				comboBoxProveedor.removeAllItems();
				for (String proveedor : listaProveedores) {
					comboBoxProveedor.addItem(proveedor);
				}
				guardarDatosProveedores();
			}

		});

		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] { "Pedido", "Devolucion" }));
		comboBoxTipo.setBounds(937, 31, 114, 19);
		panelTransacciones.add(comboBoxTipo);

		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(12, 12, 172, 261);
		contentPane.add(panelLogo);
		panelLogo.setLayout(null);

		JLabel lblFotoLogo = new JLabel("");
		lblFotoLogo.setIcon(new ImageIcon("C:\\Users\\usuaria\\eclipse-workspace\\CallCenterGeneral\\Entregable\\Ejecutable\\ImgCallCenterGeneral\\call_center2.png"));
		lblFotoLogo.setBounds(48, 38, 77, 96);
		panelLogo.add(lblFotoLogo);

		JLabel lblCallCenter = new JLabel("CALL CENTER");
		lblCallCenter.setFont(new Font("Rekha", Font.BOLD, 15));
		lblCallCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCallCenter.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblCallCenter.setBounds(12, 186, 148, 27);
		panelLogo.add(lblCallCenter);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { "PRODUCTO", "MOVIMIENTO", "NIF", "CIF", "FECHA" }, },
				new String[] { "PRODUCTO", "MOVIMIENTO", "NIF", "CIF", "FECHA" }));
		table.setBounds(538, 363, 750, 250);

		JButton btnAñadirTabla = new JButton("AÑADIR");
		btnAñadirTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String producto = (String) comboBoxProducto.getSelectedItem();
				String cliente = (String) comboBoxCliente.getSelectedItem();
				String proveedor = (String) comboBoxProveedor.getSelectedItem();
				String tipo = (String) comboBoxTipo.getSelectedItem();

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String fecha = sdf.format(new Date());

				try {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { producto, tipo, cliente, proveedor, fecha });
					table.setModel(model);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		btnAñadirTabla.setBounds(1173, 52, 93, 15);
		panelTransacciones.add(btnAñadirTabla);
		contentPane.add(table);

	}

	private void guardarDatosClientes() {
		textFieldNIFDaCli.setText(textFieldNIFNueCli.getText());
		textFieldNombreDaCli.setText(textFieldNombreNueCli.getText());
		textFieldTelefonoDaCli.setText(textFieldTelefonoNueCli.getText());
		textFieldEmailDaCli.setText(textFieldEmailNueCli.getText());
		textFieldDirecEnvioDaCli.setText(textFieldDirecEnvio.getText());
		textFieldNIFNueCli.setText("");
		textFieldNombreNueCli.setText("");
		textFieldTelefonoNueCli.setText("");
		textFieldEmailNueCli.setText("");
		textFieldDirecEnvio.setText("");
	}

	private void guardarDatosProveedores() {
		textFieldCIFDaPro.setText(textFieldCIFNuePro.getText());
		textFieldNombreDaPro.setText(textFieldNombreNuePro.getText());
		textFieldTelefonoDaPro.setText(textFieldTelefonoNuePro.getText());
		textFieldWebDaPro.setText(textFieldWebNuePro.getText());
		textFieldDomicilioFiscalDaPro.setText(textFieldDomicilioFiscalNuePro.getText());
		textFieldCIFNuePro.setText("");
		textFieldNombreNuePro.setText("");
		textFieldTelefonoNuePro.setText("");
		textFieldWebNuePro.setText("");
		textFieldDomicilioFiscalNuePro.setText("");
	}
}