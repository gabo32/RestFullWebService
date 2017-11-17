/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.example.restfullwebservice;

/**
 * Bean que sera mapeado a json para ser enviado al cliente
 * @author JuanGB
 */
public class Greeting {
    private long id;
    private String content;
    
    public Greeting(long id,String content){
        this.id = id;
        this.content = content;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

}
