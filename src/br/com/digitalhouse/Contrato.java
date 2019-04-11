package br.com.digitalhouse;

public class Contrato implements Imprimivel{

    private String nome;
    private String tipo;

    public Contrato(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    private String getNome(){
        return nome;
    }

    private void setNome(String novoNome){
        nome = novoNome;
    }

    private String getTipo(){
        return tipo;
    }

    private void setTipo(String novoTipo){
        nome = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal: " + getNome() + "." + getTipo());
    }
}
