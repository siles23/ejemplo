
package POOVehiculo;

/**
 *
 * @author Esteban Siles Vargas
 */
public class Mivehiculo {
    public static void main(String[] args) {
        Taxi datostaxi = new Taxi();
        for (int i = 0; i < 5; i++) {
            datostaxi.Ingresar();
            datostaxi.imprimir();
        }
        
        Bus datosbus = new Bus();
            for (int i = 0; i < 5; i++) {
            datosbus.ingresar();
            datosbus.imprimir();
        }
        
    }
        
}
