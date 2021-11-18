/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author TE4-Lärardator
 */
public class Weapon {
    private String name; 
    private int durability;
    private int strength; 
    private double weight;

    public Weapon(String name, int durability, int strength, double weight) {
        this.name = name;
        this.durability = durability;
        this.strength = strength;
        this.weight = weight;
    }
    
    public Weapon(WeaponBuilder builder){
       this.name = builder.getName();
       this.durability = builder.getDurability();
       this.strength = builder.getStrength();
       this.weight = builder.getWeight();
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
   @Override
   public String toString(){ 
       String dura = Integer.toString(durability); 
       String str = Integer.toString(strength);
       String kg = Double.toString(weight);
       
       String all = name + " " + dura + " " + str + " " + kg;
       return all;
   }
    
     
}
