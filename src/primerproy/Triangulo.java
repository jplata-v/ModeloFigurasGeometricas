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
public class Triangulo extends FiguraGeometrica
{
    public double base;
    public double altura;
    public double lado_l;
    public double lado_m;
    public double lado_n;
    
    public Triangulo(double b,double a,double l,double m,double n)
    {
        super("Triangulo");
        base=b;
        altura = a;
        lado_l = l;
        lado_m =m;
        lado_n =n;
    }
    
    public void Setsuperficie()
    {
        this.superficie = (base * altura)/2;
    }
    public void Setbase()
    {
        this.base=base;
    }
    public void Setaltura()
    {
        this.altura= altura;
    }
    public void mostrar()
    {
        super.mostrar();
    }
}
