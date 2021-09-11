/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilcorp;

import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author SARA
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador=0;
        
        Empleado[] empleados = new Empleado[10];
                
        do{
            
            System.out.println("Bienvenido");
            System.out.println("**************");
            
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Mostrar empleado");
            System.out.println("4. Calcular salario");
            System.out.println("5. Salir");
            System.out.print("Digite una opción: ");
            opcion=entrada.nextInt();
           
            switch(opcion){
                case 1:
                    System.out.println("Registro de empleado: ");
                    System.out.println("");
                    
                    empleados[contador]= new Empleado();
                    
                    empleados[contador].setId(contador);
                    
                    System.out.println("Digite el nombre");
                    empleados[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite el cargo");
                    empleados[contador].setCargo(entrada.next());
                    
                    System.out.println("Digite horas semanales");
                    empleados[contador].setHoraSemanales(entrada.nextDouble());
                    
                    empleados[contador].setSalario(0);
                    
                    contador++;
                    
                    break;
                    
                case 2:
                    System.out.println("Busca un empleado");
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Base de datos empleados");
                    System.out.println("");
                    
                    for(int i=0; i<contador; i++){                    
                        System.out.println(empleados[i].getNombre());
                        System.out.println(empleados[i].getCargo());
                        System.out.println("");    
                    }
                    
                    
                    
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4");
                    break;
                case 5:
                    System.exit(0);
                    break;
                    
                default:
                    break;
                           
            }
            
        }while(opcion!=5);
       
      
    }
    
}
