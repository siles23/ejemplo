/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Mainejecucion {
    public static void main(String[] args) {
       Estudiante datos=new Estudiante();
       datos.Ingresar();
       datos.Notas();
       datos.imprimir();
        
    
        
        Profesor datosdocente=new Profesor();
        datosdocente.Ingresar();
        datosdocente.imprimir();
        
        
    }
}
