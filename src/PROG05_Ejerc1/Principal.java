/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;
import PROG05_Ejerc1_util.validaciones;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;

/**
 *
 * @author guill
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("hola");
        Scanner in=new Scanner(System.in);
        Vehiculo prueba;
        String entrada="0";
        float kmCoche=0;
        String entradamarca="0";
        LocalDate entradafecha = null;
        String entradaMatricula="0";
        float precioCoche=0;
        String entradaPropietario="0";
        
        prueba=new Vehiculo(entrada,kmCoche,entradamarca, entradafecha,
                        entradaMatricula, precioCoche, entradaPropietario  );
        int i;
        Scanner on=new Scanner(System.in);
        Scanner an=new Scanner(System.in);
        for(i=0;;i++){
        System.out.println("1.Nuevo Vehiculo");
        System.out.println("2.Ver Matricula");
        System.out.println("3.Ver Numero de Km");
        System.out.println("4.Actualizar Km");
        System.out.println("5.Numero de años");
        System.out.println("6.Mostrar propietario");
        System.out.println("7.Mostrar Descripción");
        System.out.println("8.Mostrar precio");
        System.out.println("9.Salir");
        int teclamenu=on.nextInt();
       if( teclamenu==1){
            try {
                //try{
                System.out.println("Introduce DNI");
                entrada= in.nextLine();
                validaciones.validarNIF(entrada);
                System.out.println("Introduce km");
                kmCoche=an.nextFloat();
                //String entradakm= in.nextLine();
                //kmCoche = Float.parseFloat(entradakm);
                validaciones.validacionesKM(kmCoche);
                System.out.println("Introduce marca");
            
                entradamarca= in.nextLine();
                System.out.println("introduce fecha formato aaaa-mm-dd");
                
                try {
                    entradafecha= LocalDate.parse(in.nextLine());
                } catch (Exception ex) {
                    System.out.println("formato incorrecto");
                }
                System.out.println("Introduce matricula");
                entradaMatricula=in.nextLine();
                System.out.println("introduce precio");
                precioCoche=an.nextFloat();
                //String entradaPrecio= in.nextLine();
                //precioCoche = Float.parseFloat(entradaPrecio);
                System.out.println("introduce el nombre del propietario");
                entradaPropietario= in.nextLine();
               
                
                
            }
            catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else{
           if(teclamenu==2){
               System.out.println("la matricula es "+entradaMatricula);
           }
           
           else{
               if(teclamenu==3){
               System.out.println("el coche tiene "+ kmCoche);
               } else{
                   if(teclamenu==4){
                   System.out.println("Ultmos datos "+kmCoche);
                   System.out.println("Nuevo total de km");
                   kmCoche=an.nextFloat();
                   } else{
                       if(teclamenu==5){
                       System.out.println("años antiguedad");
                       }else{
                           if(teclamenu==6){
                           System.out.println("propietario: "+entradaPropietario);
                           }else{
                               if(teclamenu==7){
                               System.out.println("Marca: "+entradamarca);
                               }else{
                                   if(teclamenu==8){
                                   System.out.println("Precio coche: "+precioCoche);
                                   }else{
                                       if(teclamenu==9){
                                           System.out.println("Adios");
                                           break;
                                       }else{
                                       System.out.println("tecla incorrecta");
                                       //continue;
                                       }
                                   }
                               }
                           }
                           
                       }
                       
                   }
                   
                   
                   
                   
                   }
               }
            
        }
}
    }
}

