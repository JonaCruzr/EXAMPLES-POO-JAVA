package ventana;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

public class Ventana extends JFrame{

    JPanel panel;
    // Constructor
    public Ventana(){
        // (this hace referencia a la instancia JFrame)
        this.setSize(500, 500); // Establecemos el tamaño de la ventana (Ancho, Alto)
        this.setTitle("Jonathan Cruz"); // Establecemos el titulo de la ventana
        //this.setLocation(500, 200); // Establecemos la posición inicial de la ventana
        //this.setBounds(500, 200, 500, 500); // Establecemos el tamñano y la posicion inicial de la ventana (Engloba "setSize" y "setLocation")
        this.setLocationRelativeTo(null); // Establecemos la ventana en el centro
        //this.setResizable(false); // Establecemos si la ventana puede cambiar de tamaño o no
        this.setMinimumSize(new Dimension(200, 200)); // Establece el tamaño minimo que puede tener la ventana
        
        Container contentPane = this.getContentPane(); // Devuelve el contenedor (objeto contentPane) principal del JFrame.
        contentPane.setBackground(Color.BLACK); // Establece el color de la ventana

        iniciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando se cirre la venta la ejecución finaliza
    }

    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles(){
        panel = new JPanel(); // Se crea un panel
        panel.setLayout(null); // Desactivamos el Diseño por defecto del panel
        this.getContentPane().add(panel); // Agregamos el panel a la ventana (this hace referencia a la instancia JFrame)
    }

    private void colocarEtiquetas(){
        //ETIQUETAS DE TIPO TEXTO

        // Forma 1 de agregar una etiqueta de texto
        JLabel equita_1 = new JLabel("Etiqueta de texto"); // Se crea una etiqueta, las etiquetas pueden ser texto o imagenes
        
        // Forma 2 de agregar una etiqueta de texto
        JLabel etiqueta_2 = new JLabel();
        etiqueta_2.setText("Etiqueta de texto 2");

        // Para hacer lo de la linea siguiente es necesario desactivar el Layaout por defecto del panel
        equita_1.setBounds(10, 10, 400, 50); // Acomoda la etiqueta en esa posicion con ese tamaño
        etiqueta_2.setBounds(50, 70, 150, 20); 

        equita_1.setForeground(Color.RED); // Establecemos el color de la letra de la etiqueta
        equita_1.setFont(new Font("arial", Font.ITALIC, 50)); // Establece la fuente del texto

        etiqueta_2.setOpaque(true); //Establecemos pintar el fondo de la eqtiqueta 
        etiqueta_2.setBackground(Color.yellow);  //Establecemos el color del fondo de la etiqueta

        // "SwingConstants": colección de constantes generalmente utilizadas para posicionar y orientar componentes en la pantalla.
        etiqueta_2.setHorizontalAlignment(SwingConstants.CENTER);  // Establece la alineacion horizontal del texto de la etiqueta

        panel.add(equita_1); // Agregamos la etiqueta al panel
        panel.add(etiqueta_2);


        // ETIQUETA DE TIPO IMAGEN

        ImageIcon imagen = new ImageIcon("azul.png");
        JLabel etiqueta_imagen = new JLabel();
        etiqueta_imagen.setBounds(70, 110, 350, 350);
        // Las siguientes lineas establece un tamaño a la imagen (el tamaño tiene el mismo ancho y alto de la etiqueta imagen)
        etiqueta_imagen.setIcon(new ImageIcon(imagen.getImage().
        getScaledInstance(etiqueta_imagen.getWidth(), etiqueta_imagen.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiqueta_imagen);
    }

    private void colocarBotones(){
        // Boton de texto
        JButton btn_1 = new JButton();
        // Como se tiene desactiva el diseño por defecto del panel tenemos que indicarle en donde va a estar colocado el botos.
        btn_1.setBounds(10, 10, 120, 40);
        btn_1.setText("BOTON"); // Establcemos un texto al boton
        btn_1.setEnabled(true);  // Habilita p deshabilita el boton
        btn_1.setForeground(Color.BLUE); // Establece el color de la letra del boton
        btn_1.setFont(new Font("arial", Font.BOLD, 20)); // Establece la fuente de la letra del boton
        panel.add(btn_1);

        // Boton de imagen
        JButton btn_2 = new JButton();
        btn_2.setBounds(10, 60, 100, 100);
        btn_2.setBackground(Color.yellow); // Establece el color del fondo del boton
        ImageIcon img_btn_2 = new ImageIcon("equis.png");
        // Las siguientes 2 lineas establecen una imagen al boton con cierto tamaño
        btn_2.setIcon(new ImageIcon(img_btn_2.getImage().
        getScaledInstance(btn_2.getWidth(), btn_2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(btn_2);

        // Botos con bordes
        JButton btn_3 = new JButton();
        btn_3.setBounds(10, 170, 100, 40);
        //lo que recibe es una interface Border y utilizamos "BorderFactory" para implementarla
        btn_3.setBorder(BorderFactory.createLineBorder(Color.RED, 3)); // Se establece un borde para el boton de 3 pixeles
        panel.add(btn_3);

    }
}
