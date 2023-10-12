package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;
/* clase triangulo que resive la herencia de (FiguraRegular) y implementa (IfigulaGeometrica)(IfigurraGeometriCirculo)
 * @autor Samuel castaño, Salome Perez, Daniel jurado
 *  10/10/2023
 *  licencia publica Nu 1.0
 */ 
public class Circulo extends FiguraRegularCirculo implements IfigulaGeometricaR{

    // constructor con herencia 
    public Circulo(float radio) {
        super(radio);
    }
     
    // metodo sobreescrito, para calcular el area del circulo
    @Override
    public float calcularArea() {
        double area = Math.PI * (this.getRadio()* this.getRadio());
        JOptionPane.showMessageDialog(null, "El area del circulo es:"+ area);
        return (float)area;
    }

     //metodo sobre escrito  Perimetro  = 2 * π * r
    @Override
    public float calcularPerimetro() {
        double perimetro = (2*(Math.PI*(this.getRadio()*this.getRadio())));
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es :"+ perimetro);
        return (float) perimetro;
    }
     //metodo propio, calcula Diámetro = 2 * Radio
    public void calcularDiametroCirculo() {
     double diametro = 2*getRadio();
         JOptionPane.showMessageDialog(null, "El diametro del circulo es :"+ diametro);        
    }
    // metodo longitud de apotemas 
    @Override
    public void calcularLongitudApotemas() { 
        System.out.println("La longitud del apotema del pentágono es: " + getRadio());
    }

    
}
