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
public class ArmorBuilder {
   private String name;
   private int durability;
   private int defence; 
   
   
   public ArmorBuilder name(String name){
       this.name = name;
       return this;
   }
   public ArmorBuilder durability(int durability){
       this.durability = durability;
       return this;
   }
   public ArmorBuilder defence(int defence){
       this.defence = defence;
       return this;
   }
   
   public String getName(){
       return name;
   }
   public int getDurability(){
       return durability;
   }
   public int getDefence(){
       return defence;
   }
   
   public Armor build(){
       if(name == null){
           throw new IllegalStateException("Armor must have a name");
       }
       if(durability <= 0){
           durability = 0;
       }
       if(defence <= 0){
           throw new IllegalStateException("no defence");
       }
       return new Armor(this);
   }
   
   
}
