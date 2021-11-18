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
public class Run {
    public static void main(String[] args) {
        Armor iron = new ArmorBuilder()
                .name("IronArmor")
                .durability(5)
                .defence(10)
                .build();
        
        Weapon vapen = new WeaponBuilder()
                .name("Sword")
                .durability(30)
                .strength(80)
                .weight(20)
                .build();
                
         Soldier kalle = new SoldierBuilder()
                .name("Kalle")
                .health(100)
                .age(19)
                .addArmor(iron)
                .weapon(vapen)
                .build(); 
         
         System.out.println(String.format("%s, %s, %s", iron.getName(), iron.getDurability(), iron.getDefence()));
         System.out.println(String.format("%s, %s, %s, %s", vapen.getName(), vapen.getDurability(),vapen.getStrength(), vapen.getWeight()));
         System.out.println(String.format("%s, %s, %s, %s, %s", kalle.getName(), kalle.getHealth(), kalle.getAge(), kalle.getArmors(), kalle.getWeapon()));
    }
}
