
package com.example.model;

public class Triangle {
    private double lado;
    
    public Triangle(double lado){
    this.lado=lado;
    }
    
    public double getlado(){
    return lado;
    }
    
    public void setlado(double lado){
    this.lado=lado;
    }
    
    public double calculoArea(){
    return(Math.sqrt(3)/4)*(lado*lado);
    }
    
    public double calculoPerimetro(){
    return 3*lado;
    }
}
