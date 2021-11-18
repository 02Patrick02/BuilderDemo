/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author Elev
 */
public class WeaponBuilder {
    protected String name; 
    protected int durability;
    protected int strength; 
    protected double weight;
    
   public WeaponBuilder name(String name){
       this.name = name;
       return this;
   }
   public WeaponBuilder durability(int durability){
       this.durability = durability;
       return this;
   }
   public WeaponBuilder strength(int strength){
       this.strength = strength;
       return this;
   }
   public WeaponBuilder weight(double weight){
       this.weight = weight;
       return this;
   }
   
   public String getName(){
       return name;
   }
   public int getDurability(){
       return durability;
   }
   public int getStrength(){
       return strength;
   }
   public double getWeight(){
       return weight;
   }
   
   public Weapon build(){
       if(name == null){
           throw new IllegalStateException("Weapon must have a name");
       }
       if(durability <= 0){
           durability = 0;
       }
       if(strength <= 0){
           strength = 0;
       }
       if(weight <= 0){
           weight = 0;
       }
       return new Weapon(this);
   }
}
