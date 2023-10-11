package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Cuadrado extends FiguraRegular implements IfigulaGeometricaR {

    public Cuadrado(float medidaLados) {
        super(medidaLados);
    }

    @Override
    public float calcularArea() {
        float area= getMedidaLados()*getMedidaLados();
        JOptionPane.showMessageDialog(null, "El area de este cuadrado es :"+area);
        return  area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro= getMedidaLados()+getMedidaLados()+getMedidaLados()+getMedidaLados();
        JOptionPane.showMessageDialog(null,"El perimetro de este cuadrado es :"+perimetro);
        return   perimetro ;
    }

    @Override
    public void calcularDiagonalCuadrados() {
        double diagonalCuadrado= getMedidaLados()* Math.sqrt(2);
        JOptionPane.showMessageDialog(null," la diagonal del cuadrado es :"+diagonalCuadrado);
    }

    @Override
    public void calcularLongitudApotemas() {
        float longitudApotema= getMedidaLados()/2;
        JOptionPane.showMessageDialog(null,"la longitud del apotema de este triangulo es :"+ longitudApotema);
    }

    @Override
    public void sumaAngulosInteriores() {
      JOptionPane.showMessageDialog(null,"la suma de angulos internos del cuadrado es: 360° ");   
    }

    
}
