package com.jf.gof;

import com.jf.gof.Singleton.SingletonEager;
import com.jf.gof.Singleton.SingletonEagerHolder;
import com.jf.gof.Singleton.SingletonLazy;
import com.jf.gof.facade.Facade;
import com.jf.gof.strategy.*;

public class test {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonEagerHolder EZ = SingletonEagerHolder.getInstancia();
        System.out.println(EZ);

        //Strategy

        System.out.println("");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        // Facade

        System.out.println("");

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "32165422");
    }

}
