package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Pentagono extends FiguraRegular implements IfigulaGeometricaR {

    public Pentagono(float medidaLados) {
        super(medidaLados);
    }
      //area = (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));
    @Override
    public void calcularArea() {
      float area = (float) ((5*getMedidaLados()*getMedidaLados())/(4*Math.tan(Math.PI / 5)));
        JOptionPane.showMessageDialog(null,"el area de un pentagono es de "+area+ "cm^2");

    }

    @Override
    public void calcularPerimetro() {
        float perimentro= 5*getMedidaLados();
        JOptionPane.showMessageDialog(null,"El perimero de un pentagono es de "+ perimentro );

    }

    @Override
    public void calcularLongitudApotemas() {
        float pi= (float) Math.PI;
        float longitudApotemas= (float) (getMedidaLados() / (2 * Math.tan(pi / 5)));
        JOptionPane.showMessageDialog(null, "La logitud de los apotemas es "+longitudApotemas);

    }

    @Override
    public void sumaAngulosInteriores() {
        float sumaAngulo=(5-2)*180;
        JOptionPane.showMessageDialog(null, "la suma de angulos interiores es"+sumaAngulo+"°");

    }

    
}
