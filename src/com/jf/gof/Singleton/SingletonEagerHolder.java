package com.jf.gof.Singleton;

/*
   Singleton "apressado"
*   ███۞███████ ]▄▄▄▄▄▄▄▄▄▄▄▄▃
    ▂▄▅█████████▅▄▃▂
 I███████████████████].
 * @author AoruFernando01
* */

public class SingletonEagerHolder {

    private static class InstanceHolder {
        private static SingletonEagerHolder instancia = new SingletonEagerHolder();
    }

    private SingletonEagerHolder(){
        super();
    }

    public static SingletonEagerHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
