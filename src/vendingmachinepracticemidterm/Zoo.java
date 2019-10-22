/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachinepracticemidterm;

/**
 *
 * @author Revenger Mini
 */
public class Zoo {
    private Animal animal[];
    private static int count = 0;
    private int size;
    
    public Zoo(){
        this.size=3;
        this.animal = new Animal[size];
    }
    public void populateAnimal(Animal animal){
        this.animal[count++] = animal;
    }
    public void animalInfo(){
        for(int i = 0; i<animal.length; i++){
            System.out.println(animal[i].toString());
        }
        System.out.println();
    }
    
}
