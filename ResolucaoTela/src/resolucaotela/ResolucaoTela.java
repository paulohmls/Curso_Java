/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;







/**
 *
 * @author henri
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        
        int height = (int)size.getHeight();
        
        System.out.println("Sua tela está em resolução: " + width + " x " + height);
        
        
        

    }
    
}
