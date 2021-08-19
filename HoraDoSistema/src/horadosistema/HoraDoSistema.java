/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

// Bibliotecas
import java.util.Date;


/**
 *
 * @author henri
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();// A expressão 'new' é para criar um novo obejto
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
    
}
