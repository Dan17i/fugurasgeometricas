package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Cuadrado extends FiguraRegular implements IfigulaGeometricaR {
    // constructor con herencia
    public Cuadrado(float medidaLados) {
        super(medidaLados);
    }
    //metodo sobreescrito calcula el area del cuadeado
    @Override
    public float calcularArea() {
        float area= getMedidaLados()*getMedidaLados();
        JOptionPane.showMessageDialog(null, "El area de este cuadrado es :"+area);
        return  area;
    }
    //metodo sobreescrito calcula el perimetro del cuadrado
    @Override
    public float calcularPerimetro() {
        float perimetro= getMedidaLados()+getMedidaLados()+getMedidaLados()+getMedidaLados();
        JOptionPane.showMessageDialog(null,"El perimetro de este cuadrado es :"+perimetro);
        return   perimetro ;
    }
    //metodo propio de Cuadrado calcula la diagonal de cuadrados
    public void calcularDiagonalCuadrados() {
        double diagonalCuadrado= getMedidaLados()* Math.sqrt(2);
        JOptionPane.showMessageDialog(null," la diagonal del cuadrado es :"+diagonalCuadrado);
    }
    //calcula longitud de los apotemas
    @Override
    public void calcularLongitudApotemas() {
        float longitudApotema= getMedidaLados()/2;
        JOptionPane.showMessageDialog(null,"la longitud del apotema de este triangulo es :"+ longitudApotema);
    }
    //metodo sobreescrito, suma los angulos interiores del cuadrado
    @Override
    public void sumaAngulosInteriores() {
      JOptionPane.showMessageDialog(null,"la suma de angulos internos del cuadrado es: 360° ");   
    }

    
}
