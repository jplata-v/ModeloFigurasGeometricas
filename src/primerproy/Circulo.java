/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproy;

/**
 *
 * @author JOAO
 */
public class Circulo extends FiguraGeometrica
{
    public double diametro;
    public double radio;
    
    public Circulo(double d,double r)
    {
        super("Circulo");
        diametro =d;
        radio = r;
        
    }
    public void Setsuperficie()
    {
        this.superficie = Math.PI * radio * radio;
    }
    
    public void Setdiametro()
    {
        this.diametro= diametro;
    }
    public void mostrar()
    {
        super.mostrar();
    }
}
