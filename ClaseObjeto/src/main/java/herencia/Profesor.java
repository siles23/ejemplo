
package herencia;
import javax.swing.JOptionPane;
/**
 *
 * @author Esteban Siles Vargas
 */
public class Profesor extends Persona {
    private String departamento;
    private String institucion;
    
    public Profesor(){
        
    }

    public Profesor(String departamento, String institucion, String nombre, String apellido, int edad, int ID) {
        super(nombre, apellido, edad, ID);
        this.departamento = departamento;
        this.institucion = institucion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        departamento=(JOptionPane.showInputDialog("Digite el departamento donde labora"));
        institucion=(JOptionPane.showInputDialog("Digite la institucion"));
    }
       
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "El nombre del profesor es : " + getNombre()
                + "\n El apellido del profesor es:  " + getApellido()
                + "\n La edad del profesor es : " + getEdad()
                + "\n El ID del profesor es:  " + getID()
                + "\n Su departamento es " + departamento
                + "\n Labora en : " + institucion );

    }
    
    
    
}
