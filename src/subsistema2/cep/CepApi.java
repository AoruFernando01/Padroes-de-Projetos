package subsistema2.cep;

import com.jf.gof.Singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Salvador";
    }
    public String recuperarEstado(String cep) {
        return "BA";
    }
}
