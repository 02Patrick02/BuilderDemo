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
public class Armor {
   private String name;
   private int durability;
   private int defence; 
   
   public Armor(String name, int durability, int defence){
       this.name = name;
       this.durability = durability;
       this.defence = defence;
   }
   
   public Armor(ArmorBuilder builder){
       this.name = builder.getName();
       this.durability = builder.getDurability();
       this.defence = builder.getDefence();
   }
   
   public String getName(){
       return name;
   }
   public void setName(String name) {
        this.name = name;
   }
   
   public int getDurability(){
       return durability;
   }
   public void setDurability(int durability){
       this.durability = durability;
   }
   
   public int getDefence(){
       return defence;
   }
   public void setDefence(int defence){
       this.defence = defence;
   }
   
   @Override
   public String toString(){ 
       String dura = Integer.toString(durability); 
       String deff = Integer.toString(defence);
       
       String all = name + " " + dura + " " + deff;
       return all;
   }
}
