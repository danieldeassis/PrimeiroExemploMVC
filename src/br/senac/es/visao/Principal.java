package br.senac.es.visao;

import br.senac.es.controle.Cadastro;
import br.senac.es.modelo.Cliente;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        String leitura;
        leitura = JOptionPane.showInputDialog("Digite o código do cliente");

        cliente1.insereCodigo(Integer.parseInt(leitura));
        /**
         * outra opção 
         * int a = Integer.parseInt(leitura);
         * cliente1.insereCodigo(a);
         */

        /**
         * int cod = cliente1.obtemCodigo(); JOptionPane.showMessageDialog(null,
         * "Código inserido: "+cod);
         */
        leitura = JOptionPane.showInputDialog("Digite o nome do cliente");
        cliente1.setNome(leitura);

        leitura = JOptionPane.showInputDialog("Digite o e-mail do cliente");
        cliente1.setEmail(leitura);

        //validação do cliente
        Cadastro cad = new Cadastro();
        
        //se cadastrar retornar true
        if ( cad.cadastrar(cliente1) ){
            String saida = "*** DADOS DO CLIENTE ***\n"
                    + "CÓDIGO: " + cliente1.getCodigo() + "\n"
                    + "NOME: " + cliente1.getNome() + "\n"
                    + "E-MAIL: " + cliente1.getEmail();

            JOptionPane.showMessageDialog(null, saida);
        }else{
            //se cadastrar retornar false
            JOptionPane.showMessageDialog(null, ""
                    + "ERRO\n"
                    + "Cadastro Inválido");
        }       
        

    }

}
