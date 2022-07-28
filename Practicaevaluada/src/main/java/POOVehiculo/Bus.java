/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOVehiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Bus extends Vehiculo {
    private String linea; 
    
    public Bus(){
        
    }
    
        public Bus(String capacidad, String zona, String marca, String modelo, int placa, String color) {
        super(marca, modelo, placa, color);
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
     
    public void ingresar(){

        setMarca(JOptionPane.showInputDialog("Digite la marca del bus"));
        setModelo(JOptionPane.showInputDialog("Digite el modelo del bus"));
        setPlaca(Integer.parseInt(JOptionPane.showInputDialog("Digite la placa del bus")));
        setColor(JOptionPane.showInputDialog("Digite el color del Bus"));
        linea = (JOptionPane.showInputDialog("Ingrese la linea de la zona donde labora el bus")); 
        

    }
    
    public void imprimir(){
                JOptionPane.showMessageDialog(null, "La marca del bus es : " + getMarca()
                + "\n El modelo del bus es:  " + getModelo()
                + "\n La placa del bus es : " + getPlaca()
                + "\n El color del bus es:  " + getColor()
                + "\n Labora para la linea de : " + linea );
    }
}
