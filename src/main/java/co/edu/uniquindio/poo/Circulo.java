package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;
/* clase triangulo que resive la herencia de (FiguraRegular) y implementa (IfigulaGeometrica)
 * @autor Samuel castaño, Salome Perez, 
 *  10/10/2023
 *  licencia publica Nu 1.0
 */ 
public class Circulo extends FiguraRegularCirculo implements IfiguraGeometriCirculo, IfigulaGeometricaR{

    // constructor con herencia 
    public Circulo(float radio) {
        super(radio);
    }
     
    // metodo para calcular el area del circulo
    @Override
    public void calcularArea() {
        double area = Math.PI * (this.getRadio()* this.getRadio());
        JOptionPane.showMessageDialog(null, "El area del circulo es:"+ area);
    }

     //metodo Perimetro  = 2 * π * r
    @Override
    public void calcularPerimetro() {
        double perimetro = (2*(Math.PI*(this.getRadio()*this.getRadio())));
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es :"+ perimetro);
    }
     //Diámetro = 2 * Radio
    @Override
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
