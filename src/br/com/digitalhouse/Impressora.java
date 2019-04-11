package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora{
    private List<Imprimivel> imprimiveis = new ArrayList<>();


    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);
    }

    public void ImprimirTudo(){
        for(int i = 0; i < imprimiveis.size(); i++){
            imprimiveis.get(i).imprimir();
        }
        /* for(Imprimivel imprimivel : imprimiveis) {
            imprimiveel.imprimir();
           }
         */
    }

}
