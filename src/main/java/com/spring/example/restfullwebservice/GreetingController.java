/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.example.restfullwebservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JuanGB
 */
//indica que es un controlador rest y recibe peticiones http
@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    //long para menejo seguro con hilos
    private final AtomicLong counter = new AtomicLong();
    
    //path que recibe la petionc y ejecuta el metodo
    @RequestMapping("/greeting")
    //parametros que se debe de recibir
    public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
        
        //se retorna en pojo con los datos indicados
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
