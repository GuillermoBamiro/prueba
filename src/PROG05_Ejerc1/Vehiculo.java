/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.validaciones;
import java.time.LocalDate;

/**
 *
 * @author Guillermo Dominguez Suarez
 * En esta clase se definen los atributos de Vehiculo y se crean los
 * constructores.
 */
public class Vehiculo {//comienzo de la clase Vehiculo
    /**
     * @param marca contendra la marca de vehiculo
     * @param matricula contendra la matricula delvehiculo
     * @param numKM contiene los Km del veiculo
     * @param fechaMatriculacion contendra la fecha en la que se matriculo
     * el vehiculo
     * @param noombrePropietario nombre del dueño del vehiculo
     * @param nif contiene el nif del dueño
     */
    String marca;
    String matricula;
    float numKM;
    LocalDate fechaMatriculacion;
    float precio;
    String nombrePropietario;
    String nif;
    int numDNI;
   public Vehiculo(String nif,float numKM, String marca, LocalDate fechaMatriculacion, String matricula,
    float precio, String nombrePropietario){
   this.nif=nif;
   this.numKM=numKM;
   this.marca=marca;
   this.fechaMatriculacion=fechaMatriculacion;
   this.matricula=matricula;
   this.precio=precio;
   this.nombrePropietario=nombrePropietario;
   
   
   }
    
    
    //meter aqui as validacions
   //meter aqui validacions
    
     public String obtenerNIF () {


    return nif;

}


public void establecer (String nif) throws Exception {

    if (validaciones.validarNIF (nif)) { // Valor válido: lo almacenamos

        this.numDNI= validaciones.extraerNumeroNIF(nif); 

    }

    else { // Valor inválido: lanzamos una excepción

        throw new Exception ("NIF inválido: " + nif);

    }
}

public void establecer (int dni) throws Exception {

    // Comprobación de rangos

    if (dni>999999 && dni<99999999) { 

        this.numDNI= dni; // Valor válido: lo almacenamos

    }

    else { // Valor inválido: lanzamos una excepción

        throw new Exception ("DNI inválido: " + String.valueOf(dni));

    }

}       
}//fin de la clase vehiculo.
