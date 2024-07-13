
package com.example.service;
import com.example.model.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleService {
    
    public double getArea(double lado){
    Triangle triangle=new Triangle(lado);
    return triangle.calculoArea();
    }
    
    public double getPerimetro(double lado){
    Triangle triangle=new Triangle(lado);
    return triangle.calculoPerimetro();
    }
}
