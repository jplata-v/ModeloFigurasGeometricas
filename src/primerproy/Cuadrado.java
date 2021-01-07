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
public class Cuadrado extends FiguraGeometrica
{
    public double lado;
    
    public Cuadrado(double l)
    {
        super("Cuadrado");
        lado = l;
    }
    public void Setsuperficie()
    {
        this.superficie = lado *lado;
    }
    public void Setbase()
    {
        this.base=lado;
    }
    public void Setaltura()
    {
        this.altura= lado;
    }
    public void mostrar()
    {
        super.mostrar();
    }
    
}
