
package hilos3interfaz;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 
public class Hilos3Interfaz extends Frame{
    private Button btn1;
    private Choice chc;
    
    public Hilos3Interfaz(){
        super("Ventanas S/H");
        setLayout(new FlowLayout());
        
        btn1=new Button("Esto es un ejemplo que va a tardar");
        add(btn1);
        btn1.addActionListener(new EscuchaBoton());
        
        chc=new Choice();
        chc.addItem("Opcion 1");
        chc.addItem("Opcion2 ");
        chc.addItem("Opcion3 ");
        add(chc);
        
        setSize(300,300);
        
        
        setVisible(true);
    
    
    
    }
    
    class EscuchaBoton implements ActionListener{

        
        public void actionPerformed(ActionEvent ae) {
            try{
            Thread.sleep(15000);
            System.out.println("Termino el programa");
            }catch(Exception ex){
                ex.printStackTrace();
            
            }
        }
    
    }
    public static void main(String[] args) {
        Hilos3Interfaz hi= new Hilos3Interfaz();
    }
    
}
//programas 6.2.3
//6.26