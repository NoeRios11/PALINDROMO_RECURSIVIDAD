/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda;

/**
 *
 * @author RIOS
 */
public class Alcancia {
    
    //NOE RIOS DE LA CRUZ 
    // declaramos 2 variables privadas 
    private float dinero_guardado;
    private float meta_ahorro;
    
    // creamos nuesto constructor 
    public Alcancia(float meta_ahorro){
        this.dinero_guardado =0;
        this.meta_ahorro=meta_ahorro;
    
    }
    // metodo para ingesar dinero , si el dinero es mayor a 0 entra 
    public void depositar_moneda(float cantidad){
        if (cantidad>0){
            this.dinero_guardado+=cantidad;
        }   
    }
    // este metodo muestra el dinero guardado 
    public float getdinero_guardado(){
        return this.dinero_guardado;
    }
    // metodo para la meta de ahorro
    public float getmeta_ahorro(){
        return this.meta_ahorro;
    }
     //metodo para calocular la proyeccion de ahorro  (recursividad)
    public float proyeccion_ahorro(int dias, float dinero_diario){
        if (dias <=0){ // cuando el dia llegue a 0 deveulve lo que ya esta enla alcancia
               return this.dinero_guardado;
        }
        else {// suma el dinero diario y se llama a si mismo y se resta 1 dia 
            return dinero_diario+proyeccion_ahorro(dias-1,dinero_diario);
        }
    }
    
    
    
}
