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

public class Animal {
    private String species;
    private String name;
    private String cageNum;
    private String diet;
    
    public Animal(String species, String name, String cageNum, String diet){
        this.species = species;
        this.name = name;
        this.cageNum = cageNum;
        this.diet = diet;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cageNum
     */
    public String getCageNum() {
        return cageNum;
    }

    /**
     * @param cageNum the cageNum to set
     */
    public void setCageNum(String cageNum) {
        this.cageNum = cageNum;
    }

    /**
     * @return the diet
     */
    public String getDiet() {
        return diet;
    }

    /**
     * @param diet the diet to set
     */
    public void setDiet(String diet) {
        this.diet = diet;
    }
    public String toString(){
        return("I am "+this.name+" the "+this.species+" and I live in cage "+this.cageNum+". I eat "+this.diet+".");
    }
    
}


