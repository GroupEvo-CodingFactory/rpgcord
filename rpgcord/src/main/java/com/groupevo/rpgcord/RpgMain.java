/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupevo.rpgcord; /* Permet d'utiliser les classes des autres fichiers contenant cette ligne */
import java.util.*
  
/* Classe principale de rpgcord. Permet de faire usage de tout les objets qu'on vas créer ensuite (Objet entité, monstre, hero) */
public class RpgMain {
  
  static Scanner keybaord = new Scanner(System.in);
  /* Variable de réponse */
  static char reponse = ' ';
  
  /* Fonction principale (main)*/
  public static void RpgMain(String[] args){
    
    /* Affichage du menu */
    do{
      System.out.println("---------------------------");
      System.out.println("Bienvenue sur RPG-Cord");
      System.out.println("");
      System.out.println("Ceci est une base en développement");
      System.out.println("---------------------------");
      
      reponse = keyboard.charAt(0);
      
      /* Executer ces commandes TANT QUE la réponse n'est pas égal à y ni a a n */
      do{
        System.out.println("Mauvaise reponse veullier repondre par y ou n");
      }while(reponse != 'y' && reponse != 'n')
        
    }while(reponse = 'y')
      
      System.out.println("Bye !!!");
  }
    
}

