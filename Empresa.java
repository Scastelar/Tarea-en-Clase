
package Herencia;

import java.util.Scanner;
import Herencia.Empleado;

public class Empresa {
    static Scanner lea = new Scanner(System.in);
    
    static Empleado[] empleados;
    
    public Empresa(){
        this.empleados = new Empleado[100];
    }
            
    public static void main(String[] args) {
       
        int op;
        
        do{
            System.out.println("1- Agregar Empleado");
            System.out.println("2- Pagar Empleado");
            System.out.println("3- Lista de Empleados");
            System.out.println("4- Sub Menu especifico");
            System.out.println("5- Salir");
            System.out.print("Escoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    hire();
                    break;
                case 2:
                    pay();
                    break;
                case 3:
                    list();
                    break;
                case 4:
                    submenu();
                    break;
            }
        }while(op!=5);
        
    }
    
    /**
     * Recorre la lista de Empleados. Si encuentra un
     * empleado con ese codigo, se retorna, sino, retorna null
     * @param cod Codigo del Empleado
     * @return El obj Empleado si se encuentra, null si no
     */
    private static Empleado search(int cod){
        for (Empleado empleado: empleados){
            if (empleado != null && empleado.getCodigo()==(cod)) {
                return empleado;
            }
    }
        return null;
    }

    /**
     * Contrata un nuevo empleado
     * 1- Se pide del teclado el tipo: COMUN, HORA, VENTA o TEMPORAL
     * 2- Se instancia un objeto segun el tipo y se guarda en el arreglo
     * 3- pero siempre y cuando el Codigo NO este repetido
     * 4- LOS DATOS requeridos se ingresan del teclado
     */
    private static void hire(int code, String name) {
        System.out.println("Ingrese el tipo de empleado: COMUN, HORA, VENTA, o TEMPORAL");
        String tipo = lea.next().toUpperCase();
        if (search(code)==null){
            for(int pos=0; pos < empleados.length; pos++){
                if(empleados[pos]==null){
                    
                   
                }
            }
        }
    }

    /**
     * Le paga a un empleado
     * 1- Pide del teclado el codigo
     * 2- Buscamos ese empleado
     * 3- Si existe, mostramos en pantalla su pago
     */
    private static void pay() {
    }

    /**
     * Imprimir la lista de empleados
     */
    private static void list() {
        
    }

    
    private static void submenu() {
        int op;
        do{
            System.out.println("1-Fecha Fin Contrato a Temporales");
            System.out.println("2-Ingresar Venta");
            System.out.println("3-Ingresar Horas de Trabajo");
            System.out.println("4-Regresar al Menu Principal");
            System.out.print("Escoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    setFin();
                    break;
                case 2:
                    ventas();
                    break;
                case 3:
                    horas();
                    break;
            }
            
        }while(op!=4);
    }
    
    /**
     * 1- Leer un codigo
     * 2- Buscar el empleado, que existe y q sea Temporal
     * 3- Si concuerda, set fecha fin contrato
     * 4- Leer del teclado los datos
     */
    private static void setFin() {
        
    }

    /**
     * 1- Leer un codigo
     * 2- Buscar empleado, que exista y que sea PorVentas
     * 3- Si concuerda, agregar una venta
     * 4- Leer del teclado los datos
     */
    private static void ventas() {
        
    }

    /**
     * 1- Leer un codigo
     * 2- Buscar empleado, que exista y que sea PorHoras
     * 3- Si concuerda, agregar las horas trabajadas
     * 4- Leer del teclado los datos
     */
    private static void horas() {
        
    }
}
