
package master_distribution;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class validar {
    
     //Para validar solo letras en los campos de texto
        public void validar_letras(JTextField campo){ //JTexfiel(donde se aplicara) es el campo de texto y "campo" es un parametro
          campo.addKeyListener(new KeyAdapter(){ //lo de key es un evento
              public void keyTyped(KeyEvent e){
               char p=e.getKeyChar();
               
               if(Character.isDigit(p)){ //si se ingresa un numero entonces va ser e.consume quiere decir que no lo tomara en cuenta
                   e.consume();
               }
             }
          });
        }
        
        
        
        //Para validar solo numeros en los campo de texto (solo permite el ingreso de un punto)
        public void validar_numeros(JTextField campo){ //JTexfiel(donde se aplicara) es el campo de texto y "campo" es un parametro
          campo.addKeyListener(new KeyAdapter(){ //lo de key es un evento
              public void keyTyped(KeyEvent evt){
               
               int k=(int)evt.getKeyChar();
               if(k>=46 && k<=57){ // en la tabla key tomara caracteres de 46 a 57 (de "." a "9")
                   
                   if(k==46){//si es igual al caracter ".", esto solo nos permitira el ingreso de un "."
                       String dato=campo.getText();
                       int tama=dato.length();
                       for(int i=0;i<=tama;i++){
                           if(dato.contains(".")){
                               evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                           }
                       }
                    }//cierre if
                   if(k==47){// si es igual a "/" no lo tomara en cuenta
                   evt.consume();
               }
               }//cierre if k
               else{
                   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                   evt.consume();
               }
             }//cierre keyTyped
          });//cierre keyAdapter
        }//cierre metodo
        
        
    
}
