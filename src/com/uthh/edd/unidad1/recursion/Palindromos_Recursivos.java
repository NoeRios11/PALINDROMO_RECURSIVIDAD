/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursion;

import java.util.Scanner;

/**
 *
 * @author RIOS
 */
public class Palindromos_Recursivos{
    
    public boolean esPalindromo(String texto){
        if (texto==null){ // validamos si es nulo  y retornamos false 
            return false;
        }
        // declaramos una variable nueva y su asigancion contiene el texto normalizado , aqui convierte el texto a minusculas y elimina los espacios 
        String textoNor=texto.toLowerCase().replaceAll("\\s+", ""); 
        return esPalindromoAux(textoNor,0,textoNor.length()-1); // metodo recursivo pasa el texto ys sus indices 
    }
    private boolean esPalindromoAux(String texto, int inicio, int fin) {
        if (inicio>= fin){ // valida y retorna un true
            return true;
        }
        if (texto.charAt(inicio)!= texto.charAt(fin)){ // si la primera palabra es diferente ala ultima es false 
            return false ;
        }
        return esPalindromoAux(texto,inicio+1,fin-1); // el paso recursivo es este suma 1 para que vaya hacia la derecha y al fin le resta paraque vaya ala izquierda
    }
    public static void main(String []args){
        Palindromos_Recursivos obj = new Palindromos_Recursivos(); // creamos el objeto de la clase para invocar los metodos 
        Scanner scaner = new Scanner(System.in); // creamos el scaner para que lea lo que el usuario va  escribir 
        System.out.println("ingrese una palabra o un texto");// pide la palabra 
        String texto=scaner.nextLine(); // lee
        boolean resultado = obj.esPalindromo(texto); // evalua mediante la llamda al metodo 
        System.out.println("¿Es palíndromo?: " + resultado); // muestra el resultado true o false 
        
        
    }
}

    
            

   
                
    

