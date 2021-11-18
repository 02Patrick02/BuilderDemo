/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elev
 */
public class SoldierBuilder {
    protected String name; 
    protected int health; 
    protected int age;
    protected List<Armor> armors; 
    protected Weapon weapon;
    
    
    public SoldierBuilder(){
        armors = new ArrayList<Armor>();
    }
    
    
   public SoldierBuilder name(String name){
       this.name = name;
       return this;
   }
   public SoldierBuilder health(int health){
       this.health = health;
       return this;
   }
   public SoldierBuilder age(int age){
       this.age = age;
       return this;
   }
   public SoldierBuilder addArmor(Armor armor){
       armors.add(armor);
       return this;
   }
   public SoldierBuilder weapon(Weapon weapon){
       this.weapon = weapon;
       return this;
   }
   
   public String getName(){
       return name;
   }
   public int getHealth(){
       return health;
   }
   public int getAge(){
       return age;
   }
   public List<Armor> getArmors(){
       return armors;
   }
   public Weapon getWeapon(){
       return weapon;
   }
   
   public Soldier build(){
       if(name == null){
           throw new IllegalStateException("Soldier must have a name");
       }
       if(health <= 0){
           throw new IllegalStateException("Soldier must have positive health");
       }
       if(age <= 18){
           throw new IllegalStateException("Soldier must have an age over 18");
       }
       if(armors == null){
           throw new IllegalStateException("Soldier must have armor");
       }
       if(weapon == null){
           throw new IllegalStateException("Soldier must have a weapon");
       }
       return new Soldier(this);
   }
}
