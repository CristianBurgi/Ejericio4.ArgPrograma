
package logica;

import javax.swing.JFrame;
import vista.MenuDeTodoVista;

/**
 *
 * @author Cristian
 */
public class EjergicioGUI4 {

   
    public static void main(String[] args) {
        
        MenuDeTodoVista menu = new MenuDeTodoVista();
        
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setTitle("Productos");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

}
