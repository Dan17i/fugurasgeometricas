package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/* clase triangulo que resive la herencia de (FiguraRegular) y implementa (IfigulaGeometrica)
 * @autor Samuel castaño, Salome Perez, Daniel jurado
 *  10/10/2023
 *  licencia publica Nu1.0
 */ 
public class Triangulo extends FiguraRegular implements IfigulaGeometricaR{

    //constructor de la herencia 
    public Triangulo(float medidaLados) {
        super(medidaLados);
    }
    // metodo sobre escrito area=base * altura / 2
    @Override
    public void calcularArea() {
         float area = ((getMedidaLados()*getMedidaLados())*2);
         JOptionPane.showMessageDialog(null, "El area de este  triangulo es de :"+ area);
    }
    // metoso sobre escrito perimetro= medidalados sumado 3 veces 
    @Override
    public void calcularPerimetro() {
        float perimetro= getMedidaLados()+getMedidaLados()+getMedidaLados();
        JOptionPane.showMessageDialog(null, "El perimetro de el triangulo es :s"+perimetro);
    }
    //metodo sobre escrito altura = (2A) / b
    @Override
    public void calcularAlturaTriangulo() {
        int area=0;
        float  triangulo  = (2*area)/getMedidaLados();
        JOptionPane.showMessageDialog(null,"La altura del triangulo es:" +triangulo );
    }
    // metodo sobre escrito apotema = área / (perímetro / 2)
    @Override
    public void calcularLongitudApotemas() {

    float area = ((getMedidaLados()*getMedidaLados())*2);
    float perimetro= getMedidaLados()+getMedidaLados()+getMedidaLados();
    float longitudP=  area /(perimetro /2);
    
    JOptionPane.showMessageDialog(null, "la longitud del apotema de este triangulo es :"+longitudP);
    }

    // metodo sobre escrito, los angulos de un tringulo son 180° independientemente de su clasificacion, en este caso un equilatero
    @Override
    public void sumaAngulosInteriores() {

         JOptionPane.showMessageDialog(null,"la suma de angulos en este triangulo equilatero es de: 180° ");

    }
    
}
