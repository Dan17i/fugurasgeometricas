package co.edu.uniquindio.poo;

public interface IfigulaGeometricaR {


   float calcularArea(); 
   float calcularPerimetro();
   //son metodos por default, son de obligatoria implementacion
   default void sumaAngulosInteriores(){
   }
   //metodo por default de obligatoria implementacion
   default void calcularLongitudApotemas(){
   }
}
