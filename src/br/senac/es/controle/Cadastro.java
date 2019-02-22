package br.senac.es.controle;

import br.senac.es.modelo.Cliente;

public class Cadastro {

    //exemplo de array simples
    double[] numeros = new double[10];

    //Propriedade lista : array de Cliente
    Cliente[] lista = new Cliente[10];

    public boolean cadastrar(Cliente c) {
        if (c.getCodigo() < 0) {
            //verifica se código é negativo
            return false;
        } else if (c.getNome().length() < 3) {
            //verifica se o nome tem menos de 3 letras
            return false;
        } else if (c.getEmail().contains("@")) {
            //verifica se o e-mail tem um @
            return false;
        } else {
            //cadastro válido
            //guardaria o objeto c dentro do array
            return true;            
        }
    }
}
