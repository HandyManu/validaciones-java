
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;


public class ctrlRegistro implements MouseListener{
    
    frmRegistro vista;
    
    public ctrlRegistro(frmRegistro vista){
        this.vista=vista;
        vista.btnRegistrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== vista.btnRegistrar){
            
            //campos vacios
            if(vista.txt_Nombre.getText().isBlank()){
                JOptionPane.showMessageDialog(vista,"llene los campos");
            }
            
            //correo valido
            if(!vista.Txt_Correo.getText().contains("@")|| !vista.Txt_Correo.getText().contains(".com"))
                JOptionPane.showMessageDialog(vista, "ingrese un correoo valido");
            
            //mas de 6 caracteres
            
           if (vista.txt_Clave.getText().length()<6){
               JOptionPane.showMessageDialog(vista, "La contraseña debe tenemas mas de 6 cracateres");
           }
           
            try {
                int edadNumerica = Integer.parseInt(vista.txt_Edad.getText());
                
                if(edadNumerica > 100 || edadNumerica == 0){
                
               JOptionPane.showMessageDialog(vista, "Ingrese edad valida") ;
}
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Ingrese solo numeros");
            }
            
           
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
