package com.example.controller;

import com.example.service.TriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TriangleController {
    
    @Autowired
    private TriangleService triangleService;
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String showForm(){
    return "TriangleForm";
    }
    
    @RequestMapping(value="/calculo",method=RequestMethod.POST)
    public String calculate(@RequestParam("lado") double lado, Model model){
        double area=triangleService.getArea(lado);
        double perimetro=triangleService.getPerimetro(lado);
        model.addAttribute("area",area);
        model.addAttribute("perimetro",perimetro);
        return "result";
    }
}
