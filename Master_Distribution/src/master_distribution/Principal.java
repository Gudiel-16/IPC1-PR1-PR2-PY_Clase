
package master_distribution;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;




public class Principal extends javax.swing.JFrame {
        
    //se crea un arreglo con los datos get de la calse datos para compras y se crea una variable i que sera como contador (PDF)
    datos[] datos;
    int i;
    
    //se crea un arreglo con los datos get de la calse datos_venta para ventas y se crea una variable r que sera como contador (PDF)
    datos_venta[] datos_venta;
    int p;
    
    //get de la clase datos para compras (PDF)
    String proveedo;
    String tipo;
    String cantidad;
    String precio;
    String sub_compra;
    
    //get de la clase datos_venta para compras (PDF)
    String client;
    String tipo_vent;
    String cantidad_vent;
    String precio_vent;
    String sub_vent;
    
    //para el filtro
    int item1,item2;
    TableRowSorter trs1,trs2;
    
        DefaultTableModel modelo_compra= new DefaultTableModel(){//Para crear la tabla de compras
        public boolean isCellEditable(int row, int column){  //esto de aqui es para que nuestro modelo de tabla no sea editable
            return false;
        }
        
    }; 
        
        DefaultTableModel modelo_venta=new DefaultTableModel(){// para crear la tabla de ventas
        public boolean isCellEditable(int row, int column){  //esto de aqui es para que nuestro modelo de tabla no sea editable
            return false;
        }
        
    }; 
        
        validar v=new validar(); //objeto para llamar metodos de la clase validar
        
        
        public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(Principal.this); // para que me centre la ventana
        this.setResizable(false); //para que no me cambie tama;0 de ventana, que sea estatico
        //this.setExtendedState(Principal.MAXIMIZED_BOTH);// para que me la extienda en todo la pantalla, por eso es el maximizedboth
        Image icono_ventana_superior= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Ingenieria.png"));
        this.setIconImage(icono_ventana_superior);
        
        //Colores (para que apliquen los colores dados con el panel)
        Titulo.setOpaque(true);
        Titulo_compras.setOpaque(true);
        Titulo_ventas.setOpaque(true);
        Titulo_ganancias.setOpaque(true);
        getContentPane().setBackground(new java.awt.Color(205, 201, 201));
        
        //ya creada la tabla modelo_compra se hace las columnas con nombres
        modelo_compra.addColumn("NOMBRE");
        modelo_compra.addColumn("TIPO");
        modelo_compra.addColumn("CANTIDAD");
        modelo_compra.addColumn("PRECIO");
        modelo_compra.addColumn("SUB-TOTAL");
        tabla_compra.setModel(modelo_compra); //aqui se le asigna a la tabla las columnas con el nombre
        
        //ya creada la tabla modelo_venta se hace las columnas con nombres
        modelo_venta.addColumn("NOMBRE");
        modelo_venta.addColumn("TIPO");
        modelo_venta.addColumn("CANTIDAD");
        modelo_venta.addColumn("PRECIO");
        modelo_venta.addColumn("SUB-TOTAL");
        tabla_venta.setModel(modelo_venta); //aqui se le asigna a la tabla las columnas con el nombre
       
        //pra validar los campos de texto de compras
        v.validar_letras(proveedor);
        v.validar_letras(tipo_compra);
        v.validar_numeros(cantidad_compra);
        v.validar_numeros(precio_compra);
        v.validar_letras(cliente);
        v.validar_letras(tipo_venta);
        v.validar_numeros(cantidad_venta);
        v.validar_numeros(precio_venta);
        v.validar_letras(sub_compras);
        v.validar_numeros(sub_compras);
        v.validar_letras(sub_venta);
        v.validar_numeros(sub_venta);
        
        //Se le da el valor al arreglo para datos y se inicializa i=0 que sera el contador (PDF)
        datos = new datos[200000]; //el PDF almacenara 200000 filas de informacion
        i = 0;
        
        //Se le da el valor al arreglo para datos_venta y se inicializa p=0 que sera el contador (PDF)
        datos_venta = new datos_venta[200000]; //el PDF almacenara 200000 filas de informacion
        p = 0;
        
        //para agregar a compras
        modelo_compra.addRow(new Object[]{"Karla Perez","Clavos",700,2,1400.0});
        modelo_compra.addRow(new Object[]{"Lorena Rodas","Tornillos",800,3,2400.0});
        modelo_compra.addRow(new Object[]{"Evangelyne Gudiel","Lijas",5000,1.50,7500.0});
        
        //para agregar a ventas
        modelo_venta.addRow(new Object[]{"Edna Perez","Clavos",50,3.5,175.0});
        modelo_venta.addRow(new Object[]{"Liseth Rodas","Tornillos",100,5,500.0});
        modelo_venta.addRow(new Object[]{"Jennifer Lopez","Lijas",1000,3,3000.0});
        
        contador_compra.setText("11300.0");
        contador_venta.setText("3500.0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Titulo_compras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo_ventas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Titulo_ganancias = new javax.swing.JLabel();
        cantidad_compra = new javax.swing.JTextField();
        precio_compra = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        tipo_venta = new javax.swing.JTextField();
        cantidad_venta = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_compra = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        limpiar_compras = new javax.swing.JButton();
        modificar_compras = new javax.swing.JButton();
        eliminar_compras = new javax.swing.JButton();
        proveedor = new javax.swing.JTextField();
        tipo_compra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sub_compras = new javax.swing.JTextField();
        contador_compra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sub_venta = new javax.swing.JTextField();
        contador_venta = new javax.swing.JTextField();
        agregar_venta = new javax.swing.JButton();
        limpiar_ventas = new javax.swing.JButton();
        modificar_venta = new javax.swing.JButton();
        eliminar_venta = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        ganancias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rol1 = new javax.swing.JComboBox();
        filtro1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rol2 = new javax.swing.JComboBox();
        filtro2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(204, 204, 0));
        Titulo.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("MASTER DISTRIBUTION, S.A.");
        Titulo.setToolTipText("");
        Titulo.setRequestFocusEnabled(false);
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 1050, -1));

        Titulo_compras.setBackground(new java.awt.Color(204, 204, 0));
        Titulo_compras.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        Titulo_compras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_compras.setText("COMPRAS");
        getContentPane().add(Titulo_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 1041, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de materia prima");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 159, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad de compra");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel4.setText("Precio de compra");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 239, 128, -1));

        Titulo_ventas.setBackground(new java.awt.Color(204, 204, 0));
        Titulo_ventas.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        Titulo_ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_ventas.setText("VENTAS");
        getContentPane().add(Titulo_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1050, -1));

        jLabel6.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel6.setText("Nombre del cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 430, 138, -1));

        jLabel7.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de materia prima");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad de venta");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel9.setText("Precio de venta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        Titulo_ganancias.setBackground(new java.awt.Color(204, 204, 0));
        Titulo_ganancias.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Titulo_ganancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_ganancias.setText("GANANCIAS");
        getContentPane().add(Titulo_ganancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 698, 1050, -1));

        cantidad_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cantidad_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 196, 103, 31));

        precio_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(precio_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 239, 103, 33));

        cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 423, 106, 31));

        tipo_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tipo_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 106, 31));

        cantidad_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cantidad_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 106, 30));

        precio_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(precio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 106, 30));

        tabla_compra.setBackground(new java.awt.Color(255, 255, 255));
        tabla_compra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_compra.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabla_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_compraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_compra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 110, 471, 153));

        tabla_venta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_venta.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabla_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_venta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 423, 466, 165));

        agregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        agregar.setText("AGREGAR");
        agregar.setBorderPainted(false);
        agregar.setContentAreaFilled(false);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setIconTextGap(2);
        agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar2.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 110, -1, 43));

        limpiar_compras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpiar_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        limpiar_compras.setText("LIMPIAR");
        limpiar_compras.setBorderPainted(false);
        limpiar_compras.setContentAreaFilled(false);
        limpiar_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar_compras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar2.png"))); // NOI18N
        limpiar_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_comprasActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 164, -1, -1));

        modificar_compras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        modificar_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar_compras.setText("MODIFICAR");
        modificar_compras.setBorderPainted(false);
        modificar_compras.setContentAreaFilled(false);
        modificar_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_compras.setIconTextGap(2);
        modificar_compras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar2.png"))); // NOI18N
        modificar_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_comprasActionPerformed(evt);
            }
        });
        getContentPane().add(modificar_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 215, -1, 41));

        eliminar_compras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eliminar_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar_compras.setText("ELIMINAR");
        eliminar_compras.setBorderPainted(false);
        eliminar_compras.setContentAreaFilled(false);
        eliminar_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_compras.setIconTextGap(2);
        eliminar_compras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar2.png"))); // NOI18N
        eliminar_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_comprasActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 267, -1, -1));

        proveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 110, 103, 31));

        tipo_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tipo_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 153, 103, 30));

        jLabel10.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel10.setText("Sub-total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 128, -1));

        sub_compras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(sub_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 284, 103, 28));

        contador_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contador_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 104, 30));

        jLabel12.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel12.setText("Sub-total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 128, 29));

        sub_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(sub_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 106, 29));

        contador_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contador_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 600, 95, 33));

        agregar_venta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        agregar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        agregar_venta.setText("AGREGAR");
        agregar_venta.setBorderPainted(false);
        agregar_venta.setContentAreaFilled(false);
        agregar_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar_venta.setIconTextGap(2);
        agregar_venta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar2.png"))); // NOI18N
        agregar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        limpiar_ventas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpiar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        limpiar_ventas.setText("LIMPIAR");
        limpiar_ventas.setBorderPainted(false);
        limpiar_ventas.setContentAreaFilled(false);
        limpiar_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar_ventas.setDoubleBuffered(true);
        limpiar_ventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar2.png"))); // NOI18N
        limpiar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_ventasActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        modificar_venta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        modificar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar_venta.setText("MODIFICAR");
        modificar_venta.setBorderPainted(false);
        modificar_venta.setContentAreaFilled(false);
        modificar_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_venta.setIconTextGap(2);
        modificar_venta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar2.png"))); // NOI18N
        modificar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(modificar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, -1));

        eliminar_venta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eliminar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar_venta.setText("ELIMINAR");
        eliminar_venta.setBorderPainted(false);
        eliminar_venta.setContentAreaFilled(false);
        eliminar_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_venta.setIconTextGap(2);
        eliminar_venta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar2.png"))); // NOI18N
        eliminar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 140, -1));

        generar.setText("GENERAR");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        getContentPane().add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 91, -1));

        ganancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ganancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciasActionPerformed(evt);
            }
        });
        getContentPane().add(ganancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, 106, 28));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 76, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TOTAL:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 599, 82, 33));

        jLabel13.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel13.setText("Buscar por:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, 30));

        rol1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Tipo", "Cantidad", "Precio", "Sub-total" }));
        rol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rol1ActionPerformed(evt);
            }
        });
        getContentPane().add(rol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, 30));

        filtro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro1KeyTyped(evt);
            }
        });
        getContentPane().add(filtro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 100, 28));

        jLabel14.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel14.setText("Buscar por:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 605, -1, 20));

        rol2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Tipo", "Cantidad", "Precio", "Sub-total" }));
        getContentPane().add(rol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 604, -1, -1));
        getContentPane().add(filtro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 89, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        boolean cantidadd=false;
        boolean precioo=false;
        
        //CAMPOS DE TEXTO VACIOS
        if(proveedor.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el nombre del proveedor \nSi desea agregarlo seleccione la celda y pulse 'modificar'");
        }
        
        if(tipo_compra.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el tipo de materia prima \nSi desea agregarlo seleccione la celda y pulse 'modificar'");
        }
        
        if(cantidad_compra.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso la cantidad de compra \nDebe ingresar la cantidad");
            cantidadd=false;
        }else{
            cantidadd=true;
        }
        
        if(precio_compra.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el precio de compra \nDebe ingresar el precio");
            precioo=false;
        }else{
            precioo=true;
        }
         
        if (cantidadd==true&&precioo==true) {
            
        
        //dos variables double para calcular el subtotal
        double cant_compras=0;
        double cant_precio=0;
        double contador1=0.0;//contador para el total
        
        cant_compras= Double.parseDouble(this.cantidad_compra.getText()); //la cantidad texto ingresada en cantidad compra la convierte a double
        cant_precio= Double.parseDouble(this.precio_compra.getText()); //la cantidad texto ingresada en cantidad compra la convierte a double
        
        double resultado=cant_compras*cant_precio;
        
        sub_compras.setText(String.valueOf(resultado));//la cantidad double resultaldo la guarda en el text sub_compras, convirtiendo el valor double a String
        
        //arreglo String para darles posicion a los datos ingresados
        String datos_compras[]=new String[5];
        datos_compras[0]=proveedor.getText();
        datos_compras[1]=tipo_compra.getText();
        datos_compras[2]= cantidad_compra.getText();
        datos_compras[3]=precio_compra.getText();
        datos_compras[4]=sub_compras.getText();
        modelo_compra.addRow(datos_compras); //para que en la tabla modelo_compras vayan ingresando los datos_compra (valores de cada posicion del arreglo)
        
        //para que me vaya acumulando el total de compras
        int totalRow=tabla_compra.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_compra.getValueAt(y, 4)));
            contador1+=contador;
        }
        contador_compra.setText(String.valueOf(contador1));
        
        //los get de clase datos de compras se igual a los campos de texto (PDF)
        proveedo=proveedor.getText();
        tipo=tipo_compra.getText();
        cantidad=cantidad_compra.getText();
        precio=precio_compra.getText();
        sub_compra=sub_compras.getText();
        
        //aqui se va agregando los datos al arreglo media vez sea menor al tama;o del arreglo y se va acumulando i++ (PDF)
         if(i < datos.length){
            datos[i] = new datos(proveedo, tipo, cantidad, precio, sub_compra);
             i++;
         }
        }    
    }//GEN-LAST:event_agregarActionPerformed
    //cierre agregar
        
    
    private void limpiar_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_comprasActionPerformed
       
        // set porque envia, y como no tiene texto los limpia
        proveedor.setText("");
        tipo_compra.setText("");
        cantidad_compra.setText("");
        precio_compra.setText("");
        sub_compras.setText("");
        proveedor.requestFocus(); // al limpiar se va enfocar aqui y es ahi donde se va posicionar para ingresar otro valor
        
        
        
    }//GEN-LAST:event_limpiar_comprasActionPerformed

    private void modificar_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_comprasActionPerformed
        
        int fila_select= tabla_compra.getSelectedRow();//variable int de la fila seleccionada
        double contador1=0.0;
        // if para que se seleccione una fila, SI se selecciona se ara lo siguiente:
        if(fila_select>=0&&filtro1.getText().length()==0){
        
            //se devolveran los valores a los text, cada valor sera = (fila seleccionada, columna que corresponda)
            proveedor.setText(tabla_compra.getValueAt(fila_select, 0).toString());
            tipo_compra.setText(tabla_compra.getValueAt(fila_select, 1).toString());
            cantidad_compra.setText(tabla_compra.getValueAt(fila_select, 2).toString());
            precio_compra.setText(tabla_compra.getValueAt(fila_select, 3).toString());
            sub_compras.setText(tabla_compra.getValueAt(fila_select, 4).toString());
            modelo_compra.removeRow(fila_select); //para remover fila selleciona y asi agregarla de nuevo ya modificada
            
            //para me vuelva actualizar el total de compras cuando se modifique una fila
        int totalRow=tabla_compra.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_compra.getValueAt(y, 4)));
            contador1+=contador;
        }
        contador_compra.setText(String.valueOf(contador1));
            
        }else if (fila_select>=0&&filtro1.getText().length()>0) {
            
            JOptionPane.showMessageDialog(null, "No puede modificar cuanto esta realizando una busqueda!");
        
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Seleccione fila a modificar!");
        }
        
        
        
    }//GEN-LAST:event_modificar_comprasActionPerformed

    private void eliminar_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_comprasActionPerformed
        
        int fila_select= tabla_compra.getSelectedRow();//variable int de la fila seleccionada
        double contador1=0.0;
        // if para que se seleccione una fila, SI se selecciona se ara lo siguiente:
        if(fila_select>=0&&filtro1.getText().length()==0){
        
            modelo_compra.removeRow(fila_select); //para remover fila selleciona 
            JOptionPane.showMessageDialog(null, "Eliminacion con exito!");
            
        //para me vuelva actualizar el total de compras cuando se elimine una fila
        int totalRow=tabla_compra.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_compra.getValueAt(y, 4)));
            contador1+=contador;
        }
        contador_compra.setText(String.valueOf(contador1));
            
        }else if (fila_select>=0&&filtro1.getText().length()>0) {
            
            JOptionPane.showMessageDialog(null, "No puede eliminar cuanto esta realizando una busqueda!");
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione fila a eliminar");
        }
         
    }//GEN-LAST:event_eliminar_comprasActionPerformed

  
    
    private void agregar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_ventaActionPerformed
       
        boolean cantidadd=false;
        boolean precioo=false;
        
        //CAMPOS DE TEXTO VACIOS
        if(cliente.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el nombre del cliente \nSi desea agregarlo seleccione la celda y pulse 'modificar'");
        }
        
        if(tipo_venta.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el tipo de materia prima \nSi desea agregarlo seleccione la celda y pulse 'modificar'");
        }
        
        if(cantidad_venta.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso la cantidad de venta \nDebe ingresar la cantidad");
            cantidadd=false;
        }else{
            cantidadd=true;
        }
        
        if(precio_venta.getText().length()==0){
            JOptionPane.showMessageDialog(this, "!ALERTA! \nNo ingreso el precio de venta \nDebe ingresar el precio");
            precioo=false;
        }else{
            precioo=true;
        }
        
        if (cantidadd==true&&precioo==true) {
            
        
        //dos variables int para calcular el subtotal
        double cant_ventas=0;
        double cant_precio_venta=0;
        double contador2=0.0;
        cant_ventas= Double.parseDouble(this.cantidad_venta.getText()); //la cantidad texto ingresada en cantidad venta la convierte a double
        cant_precio_venta= Double.parseDouble(this.precio_venta.getText()); //la cantidad texto ingresada en cantidad venta la convierte a double
        
        double resultado=cant_ventas*cant_precio_venta;
        sub_venta.setText(String.valueOf(resultado));//la cantidad double resultaldo la guarda en el text sub_venta, convirtiendo el valor double a String
        
        //arreglo String para darles posicion a los datos ingresados
        String datos_ventas[]=new String[5];
        datos_ventas[0]=cliente.getText();
        datos_ventas[1]=tipo_venta.getText();
        datos_ventas[2]= cantidad_venta.getText();
        datos_ventas[3]=precio_venta.getText();
        datos_ventas[4]=sub_venta.getText();
        modelo_venta.addRow(datos_ventas); //para que en la tabla modelo_compras vayan ingresando los datos_compra (valores de cada posicion del arreglo)
        
        //para que me vaya acumulando el total de ventas
        int totalRow=tabla_venta.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_venta.getValueAt(y, 4)));
            contador2+=contador;
        }
        contador_venta.setText(String.valueOf(contador2));
        
        //los get de clase datos_venta de compras se igual a los campos de texto (PDF)
        client=cliente.getText();
        tipo_vent=tipo_venta.getText();
        cantidad_vent=cantidad_venta.getText();
        precio_vent=precio_venta.getText();
        sub_vent=sub_venta.getText();
        
        //aqui se va agregando los datos al arreglo media vez sea menor al tama;o del arreglo y se va acumulando r++ (PDF)
         if(p < datos_venta.length){
            datos_venta[p] = new datos_venta(client, tipo_vent, cantidad_vent, precio_vent, sub_vent);
            p++;
         }
        }
    }//GEN-LAST:event_agregar_ventaActionPerformed
    //cierre agregar ventas
    
    private void limpiar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_ventasActionPerformed
        
        // set porque envia, y como no tiene texto los limpia
        cliente.setText("");
        tipo_venta.setText("");
        cantidad_venta.setText("");
        precio_venta.setText("");
        sub_venta.setText("");
        cliente.requestFocus(); // al limpiar se va enfocar aqui y es ahi donde se va posicionar para ingresar otro valor
        
        
    }//GEN-LAST:event_limpiar_ventasActionPerformed

    private void modificar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_ventaActionPerformed
        
        int fila_select= tabla_venta.getSelectedRow();//variable int de la fila seleccionada
        double contador2=0.0;
        
        // if para que se seleccione una fila, SI se selecciona se ara lo siguiente:
        if(fila_select>=0&&filtro2.getText().length()==0){
           
            //se devolveran los valores a los text, cada valor sera = (fila seleccionada, columna que corresponda)
            cliente.setText(tabla_venta.getValueAt(fila_select, 0).toString());
            tipo_venta.setText(tabla_venta.getValueAt(fila_select, 1).toString());
            cantidad_venta.setText(tabla_venta.getValueAt(fila_select, 2).toString());
            precio_venta.setText(tabla_venta.getValueAt(fila_select, 3).toString());
            sub_venta.setText(tabla_venta.getValueAt(fila_select, 4).toString());
            modelo_venta.removeRow(fila_select); //para remover fila selleciona y asi agregarla de nuevo ya modificada
            
            //para que me vaya actualizando el total de ventas cuando se modifique una fila
        int totalRow=tabla_venta.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_venta.getValueAt(y, 4)));
            contador2+=contador;
        }
        contador_venta.setText(String.valueOf(contador2));
            
        }else if (fila_select>=0&&filtro2.getText().length()>0) {
            
            JOptionPane.showMessageDialog(null, "No puede modificar cuanto esta realizando una busqueda!");
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione fila a modificar!");
        }
        
        
    }//GEN-LAST:event_modificar_ventaActionPerformed

    private void eliminar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_ventaActionPerformed
        
        int fila_select= tabla_venta.getSelectedRow();//variable int de la fila seleccionada
        double contador2=0.0;
        
        // if para que se seleccione una fila, SI se selecciona se ara lo siguiente:
        if(fila_select>=0&&filtro2.getText().length()==0){
            
            modelo_venta.removeRow(fila_select); //para remover fila selleciona 
            JOptionPane.showMessageDialog(null, "Eliminacion con exito!");
            
            //para que me vaya acumulando el total de ventas
        int totalRow=tabla_venta.getRowCount();
        totalRow-=1;
        for(int y=0;y<=(totalRow);y++){
           double contador=Double.parseDouble(String.valueOf(tabla_venta.getValueAt(y, 4)));
            contador2+=contador;
        }
        contador_venta.setText(String.valueOf(contador2));
            
        }else if (fila_select>=0&&filtro2.getText().length()>0) {
            
            JOptionPane.showMessageDialog(null, "No puede eliminar cuanto esta realizando una busqueda!");
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione fila a eliminar");
        }
        
    }//GEN-LAST:event_eliminar_ventaActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       
        if (contador_compra.getText().length()==0||contador_venta.getText().length()==0) {
            
            JOptionPane.showMessageDialog(null, "NO SE PUEDE GENERAR LAS GANANCIAS!");
        
        }else{
            
        
        //Para generar las ganancias
       double txtcompra=0;
       double txtventa=0;
                
        txtcompra=Double.parseDouble(this.contador_compra.getText());
        txtventa=Double.parseDouble(this.contador_venta.getText());
        
        double gananciass=txtventa-txtcompra;
        
        ganancias.setText(String.valueOf(gananciass));  
       
      //crear nuevo documento PDF
      Document documento=new Document(); 
      FileOutputStream ficheroPdf; //para crear un fichero
      Calendar cal = Calendar.getInstance();
      Date fecha = new Date( cal.getTimeInMillis() );
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      
      //ruta de PDF
      try 
    {
    ficheroPdf = new FileOutputStream("Reporte_MasterDristibution.PDF"); //La direccion donde se guardara nuestro archivo PDF
    PdfWriter.getInstance(
                       documento, 
                       ficheroPdf
                       ).setInitialLeading(20);
    }
    catch (Exception ex) 
    {
    System.out.println(ex.toString());
    }
     
      try{
    documento.open();
    
    
    //Para la fecha
    Paragraph parrafoFech = new Paragraph(""+formato.format(fecha));
    parrafoFech.setAlignment(2);//fecha al lado derecho
    documento.add(parrafoFech);
    documento.add(new Paragraph(" "));
    
    //Textos para el documento
    
    Font fuenteTitulo=new Font();
    fuenteTitulo.setSize(25);
    fuenteTitulo.setStyle(1|4);
    //fuenteTitulo.setColor(BaseColor.RED);
    Paragraph parrafo1 = new Paragraph("MASTER DISTRIBUTION S.A.",fuenteTitulo);
    parrafo1.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo1);
    documento.add(new Paragraph(" "));
    
    Font fuenteCompras=new Font();
    fuenteCompras.setSize(15);
    fuenteCompras.setStyle(1);
    //fuenteCompras.setColor(BaseColor.BLUE);
    Paragraph parrafo2 = new Paragraph("COMPRAS",fuenteCompras);
    parrafo2.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo2);
    documento.add(new Paragraph(" "));
    
    //aqui agregamos todo el contenido del PDF...
    
    //Para el Encabezado de la tabla compras
    PdfPTable tablaEC = new PdfPTable(5);
    //el numero indica la cantidad de Columnas
    for (int i = 0; i < 1; i++)
      {
	tablaEC.addCell("NOMBRE");
        tablaEC.addCell("TIPO");
        tablaEC.addCell("CANTIDAD");
        tablaEC.addCell("PRECIO");
        tablaEC.addCell("SUB-TOTAL");
       }
        documento.add(tablaEC);
    
    //tabla para compras
    PdfPTable tabla = new PdfPTable(5); //se crea una "tabla" de (5) columnas donde se iran almacenando nuestrod datos
    
        int cont=0;
        int fila=modelo_compra.getRowCount(); 
        int columna=modelo_compra.getColumnCount();
        
                for (int k = 0; k < fila; k++) { //me recorre las filas del modelo de tabla
               for (int u = 0; u < columna; u++) { //me recorre las columnas del modelo de tabla

                   tabla.addCell(modelo_compra.getValueAt(k, u)+"");
                   cont++;

               }

            }
          
          
          documento.add(tabla);
    
    //total de compras en PDF
    Font fuenteTC=new Font();
    fuenteTC.setStyle(1);
    documento.add(new Paragraph(" "));
    Paragraph parrafo3 = new Paragraph("El total de Compras es: "+contador_compra.getText()+" Q.",fuenteTC);
    parrafo3.setAlignment(2);//el 2 es para poner en lado derecho de la hoja
    documento.add(parrafo3);
    documento.add(new Paragraph(" "));
      
     
    //Textos para el documento
    Font fuenteVentas=new Font();
    fuenteVentas.setSize(15);
    fuenteVentas.setStyle(1);
    //fuenteVentas.setColor(BaseColor.BLUE);
    Paragraph parrafo4 = new Paragraph("VENTAS",fuenteVentas);
    parrafo4.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo4);
    documento.add(new Paragraph(" "));
    
    //Para el Encabezado de la tabla ventas
    PdfPTable tablaEV = new PdfPTable(5);
    //el numero indica la cantidad de Columnas
    for (int i = 0; i < 1; i++)
      {
	tablaEV.addCell("NOMBRE");
        tablaEV.addCell("TIPO");
        tablaEV.addCell("CANTIDAD");
        tablaEV.addCell("PRECIO");
        tablaEV.addCell("SUB-TOTAL");
       }
        documento.add(tablaEV);
    
    //tabla para ventas
    PdfPTable tabla2 = new PdfPTable(5); //se crea una "tabla" de (5) columnas donde se iran almacenando nuestrod datos
    
          int cont2=0;
        int fila2=modelo_venta.getRowCount();
        int columna2=modelo_venta.getColumnCount();
        
                    for (int k = 0; k < fila2; k++) { //me recorre las filas del modelo de tabla
                   for (int u = 0; u < columna2; u++) { //me recorre las columnas del modelo de tabla

                       tabla2.addCell(modelo_venta.getValueAt(k, u)+"");
                       cont2++;

                    }

                 }
                    
          documento.add(tabla2);
     
     //total de ventas en PDF
    Font fuenteTV=new Font();
    fuenteTV.setStyle(1);     
    documento.add(new Paragraph(" "));
    Paragraph parrafo5 = new Paragraph("El total de Ventas es: "+contador_venta.getText()+" Q.",fuenteTV);
    parrafo5.setAlignment(2);//el 2 es para poner en lado derecho de la hoja
    documento.add(parrafo5);
    documento.add(new Paragraph(" "));  
    
    Font fuenteGanancias=new Font();
    fuenteGanancias.setSize(15);
    fuenteGanancias.setStyle(1);
    //fuenteGanancias.setColor(BaseColor.BLUE);
    Paragraph parrafo6 = new Paragraph("GANANCIAS",fuenteGanancias);
    parrafo6.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo6);
    documento.add(new Paragraph(" "));
    
    Font fuenteTG=new Font();
    fuenteTG.setStyle(1);
    Paragraph parrafo7 = new Paragraph("Las ganancias han sido de: "+ganancias.getText()+" Q.",fuenteTG);
    parrafo7.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo7);
   
     
    documento.close();
    }catch(Exception ex){
    System.out.println(ex.toString());
    }
    }      
    }//GEN-LAST:event_generarActionPerformed

    private void gananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciasActionPerformed
        
             
        
    }//GEN-LAST:event_gananciasActionPerformed

    private void filtro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro1KeyTyped
        
        //Para COMPRAS
        filtro1.addKeyListener(new KeyAdapter(){ //se le asigna el evento a nuestro textField (filtro1)
                                                 
        public void keyReleased(final KeyEvent evt)  {
            
            //aca se crea un if para que me identifica el item por cual ser buscado
            //la variable "item" es global
            if (rol1.getSelectedItem().toString().equals("Nombre")) {
                item1=0;
            }
            if (rol1.getSelectedItem().toString().equals("Tipo")) {
                item1=1;
            }
            if (rol1.getSelectedItem().toString().equals("Cantidad")) {
                item1=2;
            }
            if (rol1.getSelectedItem().toString().equals("Precio")) {
                item1=3;
            }
            if (rol1.getSelectedItem().toString().equals("Sub-total")) {
                item1=4;
            }
            
            trs1.setRowFilter(RowFilter.regexFilter("(?i)"+filtro1.getText(), item1)); //trs es de TableRowSorter (arriba se creo global)
                                                                                         //el "(?i)" es para que no me detecte mayusculas
        }
            
        });
        
        trs1=new TableRowSorter(modelo_compra); //se le asigna el objeto a nuestro modelo
        tabla_compra.setRowSorter(trs1); //a nuestra tabla se le asigna el objeto trs
        
        //Para VENTAS
        filtro2.addKeyListener(new KeyAdapter(){ //se le asigna el evento a nuestro textField (filtro1)
                                                 
        public void keyReleased(final KeyEvent evt)  {
            
            //aca se crea un if para que me identifica el item por cual ser buscado
            //la variable "item" es global
            if (rol2.getSelectedItem().toString().equals("Nombre")) {
                item2=0;
            }
            if (rol2.getSelectedItem().toString().equals("Tipo")) {
                item2=1;
            }
            if (rol2.getSelectedItem().toString().equals("Cantidad")) {
                item2=2;
            }
            if (rol2.getSelectedItem().toString().equals("Precio")) {
                item2=3;
            }
            if (rol2.getSelectedItem().toString().equals("Sub-total")) {
                item2=4;
            }
            
            trs2.setRowFilter(RowFilter.regexFilter("(?i)"+filtro2.getText(), item2)); //trs es de TableRowSorter (arriba se creo global)
                                                                                         //el "(?i)" es para que no me detecte mayusculas
        }
            
        });
        
        trs2=new TableRowSorter(modelo_venta); //se le asigna el objeto a nuestro modelo
        tabla_venta.setRowSorter(trs2); //a nuestra tabla se le asigna el objeto trs
        
    }//GEN-LAST:event_filtro1KeyTyped

    private void rol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rol1ActionPerformed

    private void precio_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_ventaActionPerformed

    private void tabla_compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_compraMouseClicked
       
        if (evt.getClickCount()==2) { //si se da doble click en una celda
            
            if (evt.getComponent().equals(tabla_compra)) { //si se da doble click en la tabla compra
                
                String proveed=tabla_compra.getValueAt(tabla_compra.getSelectedRow(), 0).toString();
                String tip=tabla_compra.getValueAt(tabla_compra.getSelectedRow(), 1).toString();
                String cantida=tabla_compra.getValueAt(tabla_compra.getSelectedRow(), 2).toString();
                String preci=tabla_compra.getValueAt(tabla_compra.getSelectedRow(), 3).toString();
                String sub=tabla_compra.getValueAt(tabla_compra.getSelectedRow(), 4).toString();
                
                JOptionPane.showMessageDialog(null, "PROVEEDOR: "+proveed
                                                        +"\nTIPO: "+tip
                                                        +"\nCANTIDAD: "+cantida
                                                        +"\nPRECIO: "+preci
                                                        +"\nSUB-TOTAL : "+sub);
                
            }
            
        }
    }//GEN-LAST:event_tabla_compraMouseClicked

    private void tabla_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventaMouseClicked
        
        if (evt.getClickCount()==2) { //si se da doble click en una celda
            
            if (evt.getComponent().equals(tabla_venta)) { //si se da doble click en la tabla compra
                
                String proveed=tabla_venta.getValueAt(tabla_venta.getSelectedRow(), 0).toString();
                String tip=tabla_venta.getValueAt(tabla_venta.getSelectedRow(), 1).toString();
                String cantida=tabla_venta.getValueAt(tabla_venta.getSelectedRow(), 2).toString();
                String preci=tabla_venta.getValueAt(tabla_venta.getSelectedRow(), 3).toString();
                String sub=tabla_venta.getValueAt(tabla_venta.getSelectedRow(), 4).toString();
                
                JOptionPane.showMessageDialog(null, "PROVEEDOR: "+proveed
                                                        +"\nTIPO: "+tip
                                                        +"\nCANTIDAD: "+cantida
                                                        +"\nPRECIO: "+preci
                                                        +"\nSUB-TOTAL : "+sub);
                
            }
            
        }
        
    }//GEN-LAST:event_tabla_ventaMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo_compras;
    private javax.swing.JLabel Titulo_ganancias;
    private javax.swing.JLabel Titulo_ventas;
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar_venta;
    private javax.swing.JTextField cantidad_compra;
    private javax.swing.JTextField cantidad_venta;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField contador_compra;
    private javax.swing.JTextField contador_venta;
    private javax.swing.JButton eliminar_compras;
    private javax.swing.JButton eliminar_venta;
    private javax.swing.JTextField filtro1;
    private javax.swing.JTextField filtro2;
    private javax.swing.JTextField ganancias;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar_compras;
    private javax.swing.JButton limpiar_ventas;
    private javax.swing.JButton modificar_compras;
    private javax.swing.JButton modificar_venta;
    private javax.swing.JTextField precio_compra;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JTextField proveedor;
    private javax.swing.JComboBox rol1;
    private javax.swing.JComboBox rol2;
    private javax.swing.JTextField sub_compras;
    private javax.swing.JTextField sub_venta;
    private javax.swing.JTable tabla_compra;
    private javax.swing.JTable tabla_venta;
    private javax.swing.JTextField tipo_compra;
    private javax.swing.JTextField tipo_venta;
    // End of variables declaration//GEN-END:variables

    
}
