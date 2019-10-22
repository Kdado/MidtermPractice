/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachinepracticemidterm;

/**
 *
 * @author Revenger Mini
 *Hello Kevin, I am testing pull
 * Hello Im practicing branching and cloning then pushing 
 * cool I just merged a branch to my master class 
 */
public class testZoo {
    public static void main(String[]args){
        Zoo torontoZoo = new Zoo();{
            Animal lion = new Animal("lion", "Simba", "1", "Fresh Meat");
            Animal hawk = new Animal("hawk", "Kaw", "2", "Rats");
            Animal pig = new Animal("pig", "Poomba", "3", "Bugs");
            
            torontoZoo.populateAnimal(lion);
            torontoZoo.populateAnimal(hawk);
            torontoZoo.populateAnimal(pig);
            torontoZoo.animalInfo();
            
            
        }
    }
}
