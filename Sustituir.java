import javax.swing.*;
import java.awt.event.*;

public class Sustituir extends JFrame implements ActionListener{

        JButton botonSustituir;

        JLabel labelSustituir;
        JLabel labelSustituido;
        JLabel labelTextoUsuario;
        JLabel labelTextoModificado;

        JTextField caracter;
        JTextField caracterSustituto;

        JTextArea textoUsuario;
        JTextArea textoModificado;
        JScrollPane scrollUsuario;
        JScrollPane scrollModificado;

        JMenuBar menubar;
        JMenu menu1;
        JMenuItem eliminar;
        JMenuItem sustituir;


        public Sustituir(){
            setTitle("CaracterEditor");
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            menubar = new JMenuBar();
            setJMenuBar(menubar);
            menu1 = new JMenu("Opciones");
            menubar.add(menu1);

            eliminar = new JMenuItem("Eliminar");
            menu1.add(eliminar);
            eliminar.addActionListener(this);


            sustituir = new JMenuItem("Sustituir");
            menu1.add(sustituir);
            sustituir.setEnabled(false);



            labelSustituir= new JLabel("Introduce el/los caracter/es que quieres sustituir: ");
            labelSustituir.setBounds(152, 50, 300, 30);
            add(labelSustituir);

            caracter = new JTextField();
            caracter.setBounds(440, 50, 100, 30);
            add(caracter);


            labelSustituido= new JLabel("Introduce el/los caracter/es por los que quieres sustituir: ");
            labelSustituido.setBounds(152, 90, 350, 30);
            add(labelSustituido);

            caracterSustituto = new JTextField();
            caracterSustituto.setBounds(500, 100, 100, 30);
            add(caracterSustituto);


            labelTextoUsuario= new JLabel("Introduce tu texto:");
            labelTextoUsuario.setBounds(152, 120, 300, 30);
            add(labelTextoUsuario);

            textoUsuario = new JTextArea();
            scrollUsuario = new JScrollPane(textoUsuario);
            scrollUsuario.setBounds(152, 150, 300, 300);
            add(scrollUsuario);

            labelTextoModificado= new JLabel("El resultado es:");
            labelTextoModificado.setBounds(152, 470, 300, 30);
            add(labelTextoModificado);

            textoModificado = new JTextArea();
            scrollModificado = new JScrollPane(textoModificado);
            scrollModificado.setBounds(152, 500, 300, 300);
            add(scrollModificado);

            botonSustituir = new JButton("Sustituir");
            botonSustituir.setBounds(100, 850, 100, 30);
            add(botonSustituir);
            botonSustituir.addActionListener(this);

        }

        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==botonSustituir){
                textoModificado.setText("");
                String textoMod = textoUsuario.getText().replace(caracter.getText(),caracterSustituto.getText());
                textoModificado.setText(textoMod);
            }

            if(e.getSource()==eliminar){
                Eliminar pantallaEliminar = new Eliminar();
                pantallaEliminar.setBounds(0,0,800,1200);
                pantallaEliminar.setVisible(true);
                pantallaEliminar.setResizable(true);
                pantallaEliminar.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }



}
