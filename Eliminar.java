import javax.swing.*;
import java.awt.event.*;

public class Eliminar extends JFrame implements ActionListener{
    
        JButton botonEliminar;

        JLabel labelEliminar;
        JLabel labelTextoUsuario;
        JLabel labelTextoModificado;

        JLabel saltoLinea;
        JCheckBox salto;

        JTextField caracter;
        JTextArea textoUsuario;
        JTextArea textoModificado;
        JScrollPane scrollUsuario;
        JScrollPane scrollModificado;

        JMenuBar menubar;
        JMenu menu1;
        JMenuItem eliminar;
        JMenuItem sustituir;


        public Eliminar(){
            setTitle("CaracterEditor");
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            menubar = new JMenuBar();
            setJMenuBar(menubar);
            menu1 = new JMenu("Opciones");
            menubar.add(menu1);

            eliminar = new JMenuItem("Eliminar");
            menu1.add(eliminar);
            eliminar.setEnabled(false);

            sustituir = new JMenuItem("Sustituir");
            menu1.add(sustituir);
            sustituir.addActionListener(this);


            labelEliminar= new JLabel("Introduce el/los caracter/es que quieres eliminar: ");
            labelEliminar.setBounds(152, 50, 300, 30);
            add(labelEliminar);

            caracter = new JTextField();
            caracter.setBounds(440, 50, 100, 30);
            add(caracter);


            saltoLinea= new JLabel("Marca para introducir salto de linea");
            saltoLinea.setBounds(152, 90, 300, 30);
            add(saltoLinea);

            salto=new JCheckBox();
            salto.setBounds(436,90,30,30);
            add(salto);


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

            botonEliminar = new JButton("Eliminar");
            botonEliminar.setBounds(100, 850, 100, 30);
            add(botonEliminar);
            botonEliminar.addActionListener(this);

        }

        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==botonEliminar){
                textoModificado.setText("");
                if(salto.isSelected()){
                    String textoMod = textoUsuario.getText().replace(caracter.getText(),"\n");
                    textoModificado.setText(textoMod);
                }else{
                    String textoMod = textoUsuario.getText().replace(caracter.getText(),"");
                    textoModificado.setText(textoMod);
                }
            }

            if(e.getSource()==sustituir){
                Sustituir pantallaSustituir = new Sustituir();
                pantallaSustituir.setBounds(0,0,800,1200);
                pantallaSustituir.setVisible(true);
                pantallaSustituir.setResizable(true);
                pantallaSustituir.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }


}