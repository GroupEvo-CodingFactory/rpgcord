/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupevo.rpgcord;
import java.util.*;

/* Classe Heroes, heritant de Entity. Permet d'instancier des héros */
public class Heroes extends Entity {
  
      
  	/* Déclaration des attributs de Heroes */
    private String className;
    private String weaponName;
    private int weaponDamage;
  
    /* Génération d'un nombre aléatoire */
    private int wDamageRandom; //(int)Math.random()*(this.weaponDamage - (this.weaponDamage/(float)1.2f)                                       
  	
  	/* Constructeur de la classe Heroes */
    public Heroes(String className, String weaponName, int weaponDamage, int shield, int healthPoints, int force) {
      super();
      this.className = className;
      this.weaponName = weaponName;
      this.setHealthPoints(healthPoints);
      this.setMaxHealthPoints(healthPoints);
      
      /* Maximum de dégats infligeables par l'arme*/
      this.weaponDamage = weaponDamage;
      
      /* wDamageRandom est le minimum de dégats infligeables par l'arme. C'est un nombre généré aléatoirement */
      this.wDamageRandom = Math.round((float)Math.random()*(this.weaponDamage - (this.weaponDamage/1.3f)));
      }
                                               
    public void readHeroes(){
      
    }
    public void getDamage(){
        
    }

    public String getClassName() {
        return className;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getwDamageRandom() {
        return wDamageRandom;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    
    
}   

