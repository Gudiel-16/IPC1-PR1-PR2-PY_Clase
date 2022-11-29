
package practica2_201404278_1;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ventana_201404278 extends JFrame implements WindowListener{
    
    public ventana_201404278(String title){
        
        super(title);
        setSize(500,500);
        addWindowListener(this);
        setBackground(Color.WHITE);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {
       }

    @Override
    public void windowIconified(WindowEvent e) {
       }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowActivated(WindowEvent e) {
        }

    @Override
    public void windowDeactivated(WindowEvent e) {
       }
    
}
