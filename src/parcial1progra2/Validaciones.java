/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1progra2;
import java.util.regex.Pattern;
import java .util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Melisa
 */
public class Validaciones extends LogIn {
    boolean usuario1;
    
    
    public boolean email_Validaciones(){
         
         //patron para validar en email
         String email_Pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
         Pattern pattern=Pattern.compile(email_Pattern);



         
         return usuario1;
     }

    

    
    
}
