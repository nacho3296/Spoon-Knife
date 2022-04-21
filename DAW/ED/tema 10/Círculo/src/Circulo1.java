/*
 * Ejercicio de Documentación
 * Circulos - Versión sin información
 */

/**
 * Clase Circulo1: Crea un Círculo.
 * @author Nacho
 * @version 11 mar 2022 10:33:22
 */
public class Circulo1 {

    private double centroX;
    private double centroY;
    private double radio;
    
/**
* Constructor.
* @param x centro del círculo: coordenada X.
* @param y centro del círculo: coordenada Y.
* @param r radio del círculo.
*/
    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

/**
* Getter.
* @return centro del círculo: coordenada X.
*/
    public double getCentroX() {
        return centroX;
    }

/**
* Calcula la longitud de la circunferencia (perímetro del círculo).
* @return perímetro.
*/
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

/**
* Desplaza el círculo a otro lugar.
* @param despX movimiento en el eje X.
* @param despY movimiento en el eje Y. 
*/    
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
