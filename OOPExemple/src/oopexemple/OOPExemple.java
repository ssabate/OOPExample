/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopexemple;

/**
 *
 * @author profe
 */
public class OOPExemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Baby b0;
//        b0.diguesElTeuNom();
        
        Baby b1=new Baby();
        b1.setNom("Pepet");
        b1.modificarPes(3.6F);
        Baby.numBebes=1;
        //Baby.LIMIT=3;
        System.out.println(b1.getNom()+" "+b1.getPes()+" "+Baby.numBebes);
        b1.diguesElTeuNom();
        
        Baby b2=new Baby("Pepeta");
        System.out.println(b2.getNom()+" "+Baby.numBebes);
        b2.diguesElTeuNom();

        Baby b3=new Baby(10.0F);
        b3.setNom("Pepe");
        b3.modificarPes(-3.6F);
        System.out.println(b3.getNom()+" "+b3.getPes()+" "+Baby.numBebes);
        b3.diguesElTeuNom();

        Baby b4=new Baby("Pepito", 7F);
        b4.modificarPes(1F);
        System.out.println(b4.getNom()+" "+b4.getPes()+" "+Baby.numBebes);
        b4.diguesElTeuNom();

    }
    
}
