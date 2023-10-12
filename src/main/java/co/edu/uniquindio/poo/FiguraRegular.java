package co.edu.uniquindio.poo;

public class FiguraRegular {
    //atributo de mi clase
     private float medidaLados;
    //metodo constructor
    public FiguraRegular(float medidaLados) {
        this.medidaLados = medidaLados;
    }
    //metodo para obtener la medida de los lados
    public float getMedidaLados() {
        return medidaLados;
    }
    //metodo para cambiar la medida de los lados
    public void setMedidaLados(float medidaLados) {
        this.medidaLados = medidaLados;
    }
}
