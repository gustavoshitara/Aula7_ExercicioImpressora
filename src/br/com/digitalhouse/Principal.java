package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {
        Contrato novoContrato = new Contrato("Novo Contrato","pdf");

        Foto novaFoto = new Foto("Nova Foto","jpeg");

        Documento novoDocumento = new Documento("Novo Documento","docs");

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(novoContrato);
        impressora.adicionarImprimivel(novaFoto);
        impressora.adicionarImprimivel(novoDocumento);

        impressora.ImprimirTudo();

    }
}
