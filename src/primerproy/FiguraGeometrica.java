/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproy;

import java.util.Scanner;

/**
 *
 * @author JOAO
 */
public class FiguraGeometrica {
    public String Nombre;
    public double superficie;
    public double base;
    public double altura;
    public double diametro;    
    
    public FiguraGeometrica(String No)
    {
        Nombre=No;
    }
    public String GetNombre()
    {
        return this.Nombre;
    }
    public double Getsuperficie()
    {
        return this.superficie;
    }
    public double Getbase()
    {
        return this.base;
    }
    public double Getaltura()
    {
        return this.altura;
    }
    public double Getdiametro()
    {
        return this.diametro;
    }
    
    
    
    public void mostrar()
    {
        System.out.println("Nombre...:"+this.GetNombre());
        System.out.println("Superficie...:"+this.Getsuperficie());
        System.out.println("Base...:"+this.Getbase());
        System.out.println("Altura...:"+this.Getaltura());
        System.out.println("Diametro...:"+this.Getdiametro());
    }
}
