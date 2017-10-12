/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupevo.rpgcord;

/* Classe abstraite entité, équivalent de personnage */
abstract class Entity {
  
  	/* Points de vie */
    private int healthPoints;
  
  	/* Points de vie maximum */
  	private int maxHealthPoints;
  
  	/* Points force */
  	private int force;
  
  	/* Nom de l'entité */
  	private String name;
  
  	/* Résistance de l'entité */
  	private int shield;
  
  	/* Capacité du personnage à réaliser des esquives */
  	private boolean dodge;
  	
  	/* Permet d'infliger des dégats à l'objet */
    public void applyDamage(int damage){
      if(damage >= 0){
      	this.updateHP(damage);
      }
    }
  	
  	/* Méthode à surcharger dans les classes enfants */
    abstract public void getDamage();
    
  	/* Retourne une valeur mise à jour des points de vie */
    public int updateHP(int modify){
      return this.healthPoints - modify;
    }

    public int getForce() {
        return force;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public String getName() {
        return name;
    }

    public int getShield() {
        return shield;
    }

    public void setDodge(boolean dodge) {
        this.dodge = dodge;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public boolean isDodge() {
        return dodge;
    }
    
  
}
