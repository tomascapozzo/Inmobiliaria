package inmobiliaria.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InmobiliariaUI extends JFrame {

    public InmobiliariaUI() {
        // Configuración de la ventana principal
        setTitle("Inmobiliaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear una fuente personalizada
        Font dropdowns = new Font("Arial", Font.PLAIN, 30);
        Font menuDropdowns = new Font("Arial", Font.PLAIN, 15);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear menús para cada "pestaña"
        JMenu menu1 = new JMenu("Venta");
        JMenu menu2 = new JMenu("Alquiler");
        JMenu menu3 = new JMenu("Busqueda");
        JMenu menu4 = new JMenu("Documentación");

        // Aplicar la fuente personalizada a los menús
        menu1.setFont(dropdowns);
        menu2.setFont(dropdowns);
        menu3.setFont(dropdowns);
        menu4.setFont(dropdowns);

        // Crear elementos del menú para cada acción
        JMenuItem cargarVenta = new JMenuItem("Cargar Inmueble");
        JMenuItem bajaVenta = new JMenuItem("Baja Inmueble");
        JMenuItem modificarVenta = new JMenuItem("Modificar Inmueble");

        JMenuItem cargarAlquiler = new JMenuItem("Cargar Inmueble");
        JMenuItem bajaAlquiler = new JMenuItem("Baja Inmueble");
        JMenuItem modificarAlquiler = new JMenuItem("Modificar Inmueble");

        JMenuItem buscarPorID = new JMenuItem("ID");
        JMenuItem buscarPorDireccion = new JMenuItem("Direccion");
        JMenuItem buscarPorPropietario = new JMenuItem("Propietario");
        JMenuItem buscarPorEstado = new JMenuItem("Estado");

        JMenuItem prueba= new JMenuItem("Prueba");

        // Aplicar la fuente personalizada a los elementos del menú
        cargarVenta.setFont(menuDropdowns);
        bajaVenta.setFont(menuDropdowns);
        modificarVenta.setFont(menuDropdowns);

        cargarAlquiler.setFont(menuDropdowns);
        bajaAlquiler.setFont(menuDropdowns);
        modificarAlquiler.setFont(menuDropdowns);

        buscarPorID.setFont(menuDropdowns);
        buscarPorDireccion.setFont(menuDropdowns);
        buscarPorPropietario.setFont(menuDropdowns);
        buscarPorEstado.setFont(menuDropdowns);

        // Agregar elementos del menú a los menús
        menu1.add(cargarVenta);
        menu1.add(bajaVenta);
        menu1.add(modificarVenta);

        menu2.add(cargarAlquiler);
        menu2.add(bajaAlquiler);
        menu2.add(modificarAlquiler);

        menu3.add(buscarPorID);
        menu3.add(buscarPorDireccion);
        menu3.add(buscarPorPropietario);
        menu3.add(buscarPorEstado);

        menu4.add(prueba);

        // Agregar los menús a la barra de menú
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);

        setJMenuBar(menuBar);

        // Panel principal para mostrar contenido
        JPanel mainPanel = new JPanel(new CardLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Crear y agregar paneles para cada acción
        JPanel panelCargarVenta = new JPanel();
        panelCargarVenta.add(new JLabel("Cargar Inmueble"));

        JPanel panelBajaVenta = new JPanel();
        panelBajaVenta.add(new JLabel("Baja Inmueble"));

        JPanel panelModificarVenta = new JPanel();
        panelModificarVenta.add(new JLabel("Modificar Inmueble"));

        JPanel panelCargarAlquiler = new JPanel();
        panelCargarAlquiler.add(new JLabel("Cargar Inmueble"));

        JPanel panelBajaAlquiler = new JPanel();
        panelBajaAlquiler.add(new JLabel("Baja Inmueble"));

        JPanel panelModificarAlquiler = new JPanel();
        panelModificarAlquiler.add(new JLabel("Modificar Inmueble"));

        JPanel panelBuscarId = new JPanel();
        panelBuscarId.add(new JLabel("Buscar por ID"));

        JPanel panelBuscarDireccion = new JPanel();
        panelBuscarDireccion.add(new JLabel("Buscar por Dirección"));

        JPanel panelBuscarPropietario = new JPanel();
        panelBuscarPropietario.add(new JLabel("Buscar por Propietario"));

        JPanel panelBuscarEstado = new JPanel();
        panelBuscarEstado.add(new JLabel("Buscar por Estado"));

        // Agregar paneles al panel principal
        mainPanel.add(panelCargarVenta, "Cargar Inmueble Venta");
        mainPanel.add(panelBajaVenta, "Baja Inmueble Venta");
        mainPanel.add(panelModificarVenta, "Modificar Inmueble Venta");
        mainPanel.add(panelCargarAlquiler, "Cargar Inmueble Alquiler");
        mainPanel.add(panelBajaAlquiler, "Baja Inmueble Alquiler");
        mainPanel.add(panelModificarAlquiler, "Modificar Inmueble Alquiler");
        mainPanel.add(panelBuscarId, "Buscar por ID");
        mainPanel.add(panelBuscarDireccion, "Buscar por Dirección");
        mainPanel.add(panelBuscarPropietario, "Buscar por Propietario");
        mainPanel.add(panelBuscarEstado, "Buscar por Estado");

        // Agregar acciones a los elementos del menú para mostrar los paneles correspondientes
        cargarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Cargar Inmueble Venta");
            }
        });

        bajaVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Baja Inmueble Venta");
            }
        });

        modificarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Modificar Inmueble Venta");
            }
        });

        cargarAlquiler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Cargar Inmueble Alquiler");
            }
        });

        bajaAlquiler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Baja Inmueble Alquiler");
            }
        });

        modificarAlquiler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Modificar Inmueble Alquiler");
            }
        });

        buscarPorID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Buscar por ID");
            }
        });

        buscarPorDireccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Buscar por Dirección");
            }
        });

        buscarPorPropietario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Buscar por Propietario");
            }
        });

        buscarPorEstado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Buscar por Estado");
            }
        });

        // Agregar MouseListeners para abrir menús al pasar el cursor
        menu1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu1.doClick();
            }
        });

        menu2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu2.doClick();
            }
        });

        menu3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu3.doClick();
            }
        });

        menu4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu4.doClick();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InmobiliariaUI().setVisible(true);
            }
        });
    }
}
