/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author Jota
 */
public class Libreria{
    private final ArrayList<Libro> libreria=new ArrayList();
    
    public void engadirLibro(Libro l){
        libreria.add(l);
    }
    
    public void venderLibro(int k){
        libreria.remove(k);
    }
    
    public String amosarLibros(){   
          Collections.sort(libreria);
          String z="";
          for(Libro l:libreria){
              z+="\n" + l.toString();
          }
          return z;
    
    }
    
    public void darBaixaUnidades0(){
        for(int i=0;i<libreria.size();i++){
            if(libreria.get(i).getNumeroUnidades()==0){
                libreria.remove(i);
            }
        }
    }
    
    public void consultarLibro(){
        String consulta = JOptionPane.showInputDialog("Introduce el titulo, autor o ISBN del libro para buscarlo:");
        boolean notFound = true;
        for(Libro l : libreria){
            if(l.getTitulo().equalsIgnoreCase(consulta) || l.getAutor().equalsIgnoreCase(consulta) || l.getIsbn().equalsIgnoreCase(consulta)){
                JOptionPane.showMessageDialog(null,l);
                notFound=false;
            }
        }
        if(notFound)
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
         
    }



    
    
    
    
    
}
