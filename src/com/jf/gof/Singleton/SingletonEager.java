package com.jf.gof.Singleton;

/*
   Singleton "apressado"
*   ███۞███████ ]▄▄▄▄▄▄▄▄▄▄▄▄▃
    ▂▄▅█████████▅▄▃▂
 I███████████████████].
 * @author AoruFernando01
* */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
