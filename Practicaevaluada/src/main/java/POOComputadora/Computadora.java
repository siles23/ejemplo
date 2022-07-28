/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOComputadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Computadora {
    
    private String SistemaOperativo;
    private String PaqueteOffice;
    private String Antivirus;
    private int ram;
    private int SSD;
    private String procesador;
    
    
    public Computadora(){
        
    }


    public void Ingresar(){
        SistemaOperativo=(JOptionPane.showInputDialog("Ingrese su sistema operativo: "));
        PaqueteOffice=(JOptionPane.showInputDialog("Ingrese su paquete Office"));
        Antivirus=(JOptionPane.showInputDialog("Ingrese su antivirus"));
        ram=(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cantidad de GB de Mermoria Ram ")));
        SSD=(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de GB de su disco duro o SSD")));
        procesador=(JOptionPane.showInputDialog("Ingrese el procesador de su computadora "));
    }

    
    public void imprimir(){
               JOptionPane.showMessageDialog(null, "El sistema operativo es : " + SistemaOperativo
                + "\n El paquete Office es:  " + PaqueteOffice
                + "\n El antivirus es : " + Antivirus
                + "\n La memoria ram es de:  " + ram +"GB"
                + "\n El disco duro/SSD es de " + SSD+"GB"
                + "\n Su  procesador es un : " + procesador );

        
    }
    

    
}
