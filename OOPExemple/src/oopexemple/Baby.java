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
public class Baby {
    private static final int LIMIT=255;
    public static int numBebes=0;

    public static int getNumBebes() {
        return numBebes;
    }

    private static void setNumBebes(int aNumBebes) {
        numBebes = aNumBebes;
    }
    
    public String nom;
    private float pes;

    public Baby() {
        numBebes++;
        nom="hgghhj";
    }

    public Baby(String nom) {
        this();
        this.nom = nom;
    }
    
    public Baby(float pes) {
        this();
        this.pes = pes;
    }
    
    public Baby(String nom, float pes) {
        this();
        this.nom = nom;
        this.pes = pes;
    }
    
    public static void diguesElTeuNom(){
        System.out.println("Me dic " + numBebes);
    }
    
    public void modificarPes(float v){
    
        pes=pes+v;
    
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        this.pes = pes;
    }
    
}
