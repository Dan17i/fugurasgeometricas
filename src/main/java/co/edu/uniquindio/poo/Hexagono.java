package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Hexagono extends FiguraRegular implements IfigulaGeometricaR {

    public Hexagono(float medidaLados) {
        super(medidaLados);
    }

    @Override
    public void calcularArea() {
        float area=(float)(3 * Math.sqrt(3)/ 2) * getMedidaLados() * getMedidaLados();
        JOptionPane.showMessageDialog(null, "El area del Hexagono es "+area);
    }

    @Override
    public void calcularPerimetro() {
        float perimentro= 6 * getMedidaLados();
        JOptionPane.showMessageDialog(null,"El perimetro de un hexagono es "+ perimentro); 
    }


    @Override
    public void calcularLongitudApotemas() {
        float apotema = (float) ((getMedidaLados() / 2) * Math.sqrt(3));
        JOptionPane.showMessageDialog(null,"El apotema de este hexagono es :"+ apotema); 

    }

    @Override
    public void sumaAngulosInteriores() {
        float  sumaAngulos = (6 - 2) * 180;
         JOptionPane.showMessageDialog(null,"la suma de los angulos de este exagono es :"+ sumaAngulos); 
    }
    
}
