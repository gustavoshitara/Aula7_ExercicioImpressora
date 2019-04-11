package br.com.digitalhouse;

public class Documento implements Imprimivel{
    private String nome;
    private String tipo;

    public Documento(String novoNome,String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String novoTipo){
        nome = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word: " + getNome() + "." + getTipo());
    }

}
