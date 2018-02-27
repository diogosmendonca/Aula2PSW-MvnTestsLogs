/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.spw.hellomaven1;

import org.apache.log4j.Logger;



/**
 *
 * @author Diogo
 */
public class HelloMaven {
    
    public String helloMavenMsg(String maven){
        
        Logger lg = Logger.getLogger(HelloMaven.class);
        lg.info("chamou o método helloMavenMsg com parâmetro maven = " + maven);
        
        if(maven.equals("true"))
            return "Hello Maven!!!";
        else if(maven.equals("false"))
            return "Hello !!!";
        else{
            try{
                throw new Exception("Parâmetro inválido no método helloMavenMsg. Parâmetro = " + maven);
            }catch(Exception e){
                lg.error("Erro de execução", e);
            }
            return "Erro";
        }
    }
    
    
}
