package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args){ 
            //creamos un triangulo de tipo Triangulo y llamamos a los metodos:)

            Triangulo triangulo = new Triangulo(2);
            triangulo.calcularArea();
            triangulo.calcularPerimetro();
            triangulo.calcularAlturaTriangulo();
            triangulo.calcularLongitudApotemas();
            triangulo.sumaAngulosInteriores();

            //creamos un cuadrado de tipo Cuadrado y llamamos a los metodos:)

            Cuadrado cuadrado = new Cuadrado(2);
            cuadrado.calcularArea();
            cuadrado.calcularDiagonalCuadrados();
            cuadrado.calcularPerimetro();
            cuadrado.calcularLongitudApotemas();
            cuadrado.sumaAngulosInteriores();

            //creamos un pentagono de tipo Pentagono y llamamos a los metodos:)

            Pentagono pentagono = new Pentagono(2);
            pentagono.calcularArea();
            pentagono.calcularPerimetro();
            pentagono.calcularLongitudApotemas();
            pentagono.sumaAngulosInteriores();

            //creamos un hexagono de tipo Hexagono y llamamos a los metodos:)

            Hexagono hexagono = new Hexagono(2);
            hexagono.calcularArea();
            hexagono.calcularPerimetro();
            hexagono.calcularLongitudApotemas();
            hexagono.sumaAngulosInteriores();

            //creamos un octagono de tipo Octagono y llamamos a los metodos:)

            Octagono octagono = new Octagono(2);
            octagono.calcularArea();
            octagono.calcularPerimetro();
            octagono.calcularLongitudApotemas();
            octagono.sumaAngulosInteriores();

            //creamos un circulo de tipo Circulo y llamamos a los metodos:)

            Circulo circulo = new Circulo(5);
            circulo.calcularArea();
            circulo.calcularPerimetro();
            circulo.calcularDiametroCirculo();
            circulo.calcularLongitudApotemas();
            
            }
        }
        
        
    

