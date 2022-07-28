
package herencia;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Estudiante extends Persona {
    DecimalFormat df=new DecimalFormat("#.00");
    private String grado;
    private String seccion;
    private String institucion;
    private Double promedio;
    
    public Estudiante(){
        
    }

    public Estudiante(String grado, String seccion, String institucion, String nombre, String apellido, int edad, int ID) {
        super(nombre, apellido, edad, ID);
        this.grado = grado;
        this.seccion = seccion;
        this.institucion = institucion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public void Ingresar(){
        setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        setApellido(JOptionPane.showInputDialog("Digite el apellido"));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        setID(Integer.parseInt(JOptionPane.showInputDialog("Digite el ID")));
        grado=(JOptionPane.showInputDialog("Digite el grado"));
        seccion=(JOptionPane.showInputDialog("Digite la seccion"));
        institucion=(JOptionPane.showInputDialog("Digite la institucion"));
    }
    
    public void Notas() {
        double nota1, nota2, nota3;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercer nota"));
        promedio = (nota1 + nota2 + nota3) / 3;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "El nombre del alumno es : " + getNombre()
        +"\n El apellido del alumno es:  " + getApellido() 
        +"\n La edad del alumno es : " + getEdad() 
        +"\n El ID del alumno es:  " + getID()
        +"\n El grado del alumno es: " + grado 
        +"\n La seccion del alumno es: " + seccion 
        +"\n La institucion del alumno es " + institucion 
        +"\n Su promedio final es : " + df.format(promedio));
        
    }
    
    
}
