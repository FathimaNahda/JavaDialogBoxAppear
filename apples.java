/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class apples {
    public static void main (String[]args){
        String fn=JOptionPane.showInputDialog("Enter firs number");
        String sn=JOptionPane.showInputDialog("Enter first number");
        int num1=Integer.parseInt(fn);
        int num2=Integer.parseInt(sn);
        int sum=num1+num2;
       JOptionPane.showConfirmDialog(null,"the answer is" +sum,"the titile",JOptionPane.PLAIN_MESSAGE);
       
    
    }
    
}
