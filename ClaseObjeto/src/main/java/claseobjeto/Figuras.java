

package claseobjeto;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Figuras {
public void cuadrado(){
    int lado,area;
    lado=Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
    area=lado*lado;
    JOptionPane.showMessageDialog(null,"El area del cuadrado es de : " + area);
}

public void triangulo(){
    double base,altura,area;
    base=Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo"));
    altura=Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
    area=(base*altura) / 2 ;
    JOptionPane.showMessageDialog(null, "El area del triangulo es : " + area);
}

public void circulo(){
    double radio,pi=3.14,area;
    radio=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));
    area=pi*Math.pow(radio,2);
    JOptionPane.showMessageDialog(null,"El area del circulo es de : " + area);
}
}
