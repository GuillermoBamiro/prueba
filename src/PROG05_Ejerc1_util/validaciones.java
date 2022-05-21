/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1_util;

/**
 *Estacla clase se encargara de hacer las validaciones de datos necesarias
 * @author Guillermo Domínguez Sárez
 */
public class validaciones {//comienzo de la clase validaciones
    /**
     * 
     */ 
    //private int numDNI;
   public static final String LETRAS_DNI= "TRWAGMYFPDXBNJZSQVHLCKE";
   
   
    public static char extraerLetraNIF (String nif) {// comienzo de metodo estraerLetraNIF
        /**
         * Este onstructor se encarga de extraer la letra del DNI la cual
         * por lanaturaleza del documento es la ultima letra del mismo.
         * @param letra este parametro tendra el valor de la letra del DNI
         * introducido.
         */

    
    char letra=   nif.charAt(nif.length()-1);
    
    return letra;

}//fin del metodo ExtraerLetraDNI
    
    
public static int extraerNumeroNIF (String nif) {//principio metodoextraerNumeroNIF
    /**
     * este metodo extrae el numero del DNI y lo pasa aformato int para poder
     * operar con el.
     * Este metodo obtiene el numero resultante de quitarle la letra al nif
     * y lo devuelve.
     * @param numero en el se guarda el valor del numero del DNI
     */

    int numero= Integer.parseInt(nif.substring(0, nif.length()-1));
    return numero;

}  //fin metodo extraerNumerNIF


 public static char calcularLetraNIF (int numero) {//inicio del metodo calcularLetraNIF
     /**
      * Este metodo calcula la letra del DNI correcta usando el numero 
      * extraido en el metodo extraerNumeroNIF. Los numeros del DNI van en
      * base al resultado del resto al dividir entre 23 el numero del dni
      * por lo usando el resto y la variable LETTRAS_DNI sabremos la letra
      * correcto.
      * @param letra en este parametro se guardara la letra correcta del DNI
      */

  char letra;

  letra= LETRAS_DNI.charAt(numero % 23);       

   return letra;
    }// fin del metodo calcularLetraDNI
 
 
    /*private static*/public static boolean validarNIF (String nif) throws Exception {// comienzo del metodo validarDNI
/**
 * en este metodo se aran las comprovaciones necesarias para saber si el dni 
 * introducido es valido o no, mediante distintas condicionales se ira 
 * filtrando el dato introducido hasta saber si es correcto o no.
 * @param valido este parametro va a suponer que el NIF es valido hasta que
 * se encuentre algun fallo
 * @param letra_calculada esta variable acumulara la letra calculada a partir 
 * del numero del nif para despues compararla
 * @param letra_leida esta variable acumula el valor de la letra del nif
 * introducido para poder compararla posteriormente.
 * @param dni_leido esta variabletendra el valor del numero extraido del NIF
 */
    boolean valido= true;   
 
    char letra_calculada;

    char letra_leida;

    int  dni_leido;

    if (nif == null) {  // comprovación de que no seintroduce el campo en blanco

        valido= false;

    }//fin comprovación campo vacio

    else if (nif.length()<8 || nif.length()>9) {    // comprovación de longitud correcta

        valido= false;

    }//fin comprovación longitud correcta

    else { //en caso de pasar los filros anteriores comprovaciones2

        letra_leida= Character.toUpperCase(validaciones.extraerLetraNIF (nif)); 

        dni_leido= validaciones.extraerNumeroNIF (nif);  

        letra_calculada= validaciones.calcularLetraNIF(dni_leido); 

        if (letra_leida == letra_calculada) {   // comprovamos validez de nif introducido


            valido= true;

        }//fin de comprovación de validez

        else { //si no es validado se tomara el valor false.

                valido= false;

        }//fin de no validez

    }//fin de comprovaciones2
        if(!valido) throw new Exception ("NIF inválido: " );
        return valido;

}//fin de validarNIF
 //if(numKM<0) throw new Exception2 ("Número de km invalido");
   //VALIDACION NON FUNCIONA
    public static boolean validacionesKM (float numKM) throws Exception {
        boolean validonumKM=true;
        if(numKM<0){
            validonumKM=false;
        }
        if (!validonumKM) throw new Exception ("Numero KM invalido");
        return validonumKM;
    } // FINAL DE LA VALIDACION KM QUE NO FUNCIONA     
   
}//fin de la clase validaciones
