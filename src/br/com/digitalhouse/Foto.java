package br.com.digitalhouse;

public class Foto implements Imprimivel{
    private String nome;
    private String tipo;

    public Foto(String novoNome,String novoTipo){
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
        System.out.println("Sou uma selfie: " + getNome() + "." + getTipo());
    }
}
