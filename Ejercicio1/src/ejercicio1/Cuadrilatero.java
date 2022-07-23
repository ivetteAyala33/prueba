/*
 EJERCICIO 1
Obtener area y perimetro de un cuadrilatero, si es un cuadrado solo usar un lado
 */
package ejercicio1;


public class Cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;
    
    //metodos

    public Cuadrilatero(float lado1, float lado2) {//constructor 1
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {//constructor 2
        this.lado1 = this.lado2= lado1;
    }
    
    public float getPerimetro (){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;    
    }
    
    public float getArea (){
        float area = (lado1 *lado2);
        return area;
    }
    
    
    
    
    
    
}
