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
public class PrimerProy {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sw=1;
        while(sw==1)
        {
        System.out.println("Digite tipo de figura geometrica...:");
        System.out.println("1.Para Dibujar un Cuadrado..:");
        System.out.println("2.Para Dibujar un Triangulo..:");
        System.out.println("3.Para Dibujar un Circulo..:");
        System.out.println("0.Para Salir..:");
        System.out.print("Digitelo..:");
        Scanner entrada =new Scanner(System.in);
        int nombre = entrada.nextInt();
        if(nombre == 0)
        {
            sw=0;
            System.out.println("Salio del programa");
        }    
        if(nombre ==1)
        {
            System.out.println("Elegio la figura geometrica Cuadrado");
            System.out.println("Digite la base...:");
            double a = entrada.nextDouble();
            Cuadrado ob = new Cuadrado(a);
            ob.Setsuperficie();
            ob.Setbase();
            ob.Setaltura();
            ob.mostrar();
        }
            
        if(nombre==2)
        {
            System.out.print("Elegio la figura geometrica Triangulo");
            System.out.println("Digite la base...:");
            double b = entrada.nextDouble();
            System.out.println("Digite la altura...:");
            double a = entrada.nextDouble();
            System.out.println("Digite el lado l...:");
            double l = entrada.nextDouble();
            Triangulo obj = new Triangulo(b,a,l,l,l);
            obj.Setsuperficie();
            obj.Setbase();
            obj.Setaltura();
            obj.mostrar();
        }
            
        if(nombre==3)
        {
            System.out.println("Elegio la figura geometrica Circulo");
            System.out.println("Digite la diametro...:");
            double d = entrada.nextDouble();
            System.out.println("Digite la radio...:");
            double r = entrada.nextDouble();            
            Circulo obje = new Circulo(d,r);
            obje.Setsuperficie();            
            obje.mostrar();
            
        }
            
        
        }
    }
}
