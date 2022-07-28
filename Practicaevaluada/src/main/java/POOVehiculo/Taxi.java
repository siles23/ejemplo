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
public class Taxi extends Vehiculo {
    private String capacidad;
    private String zona;
    
    public Taxi(){
        
    }

    public Taxi(String capacidad, String zona, String marca, String modelo, int placa, String color) {
        super(marca, modelo, placa, color);
        this.capacidad = capacidad;
        this.zona = zona;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
            
    public void Ingresar() {
        int i=1;
        while (i<=5) {
        setMarca(JOptionPane.showInputDialog("Digite la marca del taxi"));
        setModelo(JOptionPane.showInputDialog("Digite el modelo del taxi"));
        setPlaca(Integer.parseInt(JOptionPane.showInputDialog("Digite la placa del taxi")));
        setColor(JOptionPane.showInputDialog("Digite el color del taxi"));
        capacidad=(JOptionPane.showInputDialog("Ingrese la capacidad del taxi"));
        zona = (JOptionPane.showInputDialog("Ingrese la zona donde labora el taxi"));
        i++;
        }

    }
    
    public void imprimir(){
                JOptionPane.showMessageDialog(null, "La marca del taxi es : " + getMarca()
                + "\n El modelo del taxi es:  " + getModelo()
                + "\n La placa del taxi es : " + getPlaca()
                + "\n El color del taxi es:  " + getColor()
                + "\n Su capacidad es de " + capacidad + "personas"
                + "\n Labora en : " + zona );
    }
}
