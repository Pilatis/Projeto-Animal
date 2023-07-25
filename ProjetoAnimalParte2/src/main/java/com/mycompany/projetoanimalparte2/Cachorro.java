/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoanimalparte2;

/**
 *
 * @author Lucas
 */
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }
            
    public void reagir(String frase){
        if(frase.equals("Toma Cuidado")|| frase.equals("Olá")){
            System.out.println("Abanar e Latir");
        }
        else {
               System.out.println("Rosnar");     
        }
    
    }        
    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("Abanar o rabo");    
        } 
        else if(hora >= 18){
        System.out.println("Ignorar");
    }  
        else{
            System.out.println("Abanar e Latir");
        }
    }   
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar e Latir");   
    }   
        
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
               System.out.println("Abanar");
            } else {
               System.out.println("Latir");
            }
        } if  (peso < 10)
            {
                System.out.println("Rosnar");
        } else {
                System.out.println("Ignorar");
                }
        
    }
    
    
    
    
    
    
    
    }  

