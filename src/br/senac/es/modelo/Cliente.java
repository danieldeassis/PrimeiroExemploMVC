
package br.senac.es.modelo;

/**
 * Classe de modelo Cliente
 * (as classes de modelo geralmente não tem interação
 * com o osuário internamente)
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private String email;
    
    /**
     * Método
     * Estrutura
     * <encapsulamento> <tipo de retorno> <nome do método>( [parâmetros] ) 
     */
    /**
    *insereCodigo (setCodigo)
    * método que insere um valor na propriedade 'código'
    */    
    public void insereCodigo(int codigo){
        this.codigo = codigo;
    }
     /**
    *obtemCodigo (getCodigo)
    * retornar o valor que existe na propriedade 'código'
    */    
    public int obtemCodigo(){
        return this.codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
    
    
}
