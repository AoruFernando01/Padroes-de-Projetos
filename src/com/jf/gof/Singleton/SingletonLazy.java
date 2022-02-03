package com.jf.gof.Singleton;

/*
   Singleton "preguiçoso"
*   ███۞███████ ]▄▄▄▄▄▄▄▄▄▄▄▄▃
    ▂▄▅█████████▅▄▃▂
 I███████████████████].
 * @author AoruFernando01
* */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    public static  SingletonLazy getInstancia(){
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
