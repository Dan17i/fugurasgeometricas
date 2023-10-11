package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Octagono extends FiguraRegular implements IfigulaGeometricaR {

    public Octagono(float medidaLados) {
        super(medidaLados);
    }

    @Override
    public void calcularArea() {
         float area = (float)(2 + Math.sqrt(2)) * getMedidaLados() * getMedidaLados();
            JOptionPane.showMessageDialog(null,"El area de un octagono es "+ area);
    }

    @Override
    public void calcularPerimetro() {
        float perimentro= 8*getMedidaLados();   
        JOptionPane.showMessageDialog(null,"El perimetro del octagono es :"+perimentro);
    }

    // apothema = sideLength / (2 * Math.tan(Math.PI / 8));
    @Override
    public void calcularLongitudApotemas() {
        float longitudApotemas=(float) (getMedidaLados()/(2*Math.tan(Math.PI/8)));
        JOptionPane.showMessageDialog(null, "La longitud del apotema deeste octagono es :"+longitudApotemas);
    }

    //la suma de los angulos interiores de un octagono siempre va a ser la misma
    @Override
    public void sumaAngulosInteriores() {
        JOptionPane.showMessageDialog(null,"la suma de angulos internos del octagono es: 1080° ");   
    }
    
}
