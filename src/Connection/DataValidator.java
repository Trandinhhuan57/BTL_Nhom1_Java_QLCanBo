/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Hoang Pham
 */
public class DataValidator{
    public static void ValidateEmpty(JTextField field, StringBuilder sb, String errorMessage)
    {
        if(field.getText().equals(""))
        {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
            
        }else{
            field.setBackground(Color.WHITE);
        }
               
    }
    
     public static void ValidateEmpty(JPasswordField field, StringBuilder sb, String errorMessage)
    {
        String pass = new String(field.getPassword());
        if(pass.equals(""))
        {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
            
        }else{
            field.setBackground(Color.WHITE);
        }
               
    }
}
