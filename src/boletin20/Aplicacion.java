/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import javax.swing.JOptionPane;

/**
 *
 * @author Jota
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria miLibreria = new Libreria();
        boolean condicion=true;
        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija opción:\n1)Engadir Libro\n2)Amosar\n3)Dar de baja libros sin unidades\n4)Vender Libro\n5)Consultar libro\n6)Salir"));
            switch(opcion){
                case 1:
                    miLibreria.engadirLibro(new Libro(JOptionPane.showInputDialog("Titulo:"),JOptionPane.showInputDialog("Autor:"),JOptionPane.showInputDialog("ISBN:"),Float.parseFloat(JOptionPane.showInputDialog("Prezo:")),Integer.parseInt(JOptionPane.showInputDialog("Unidades:"))));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,miLibreria.amosarLibros());
                    break;
                case 3:
                    miLibreria.darBaixaUnidades0();
                    break;
                case 4:
                    int posicionLibro = Integer.parseInt(JOptionPane.showInputDialog("Posición del libro a vender:"));
                    miLibreria.venderLibro(posicionLibro);
                    break;
                case 5:
                    miLibreria.consultarLibro();
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }
        }while(condicion);
    }
    
}
