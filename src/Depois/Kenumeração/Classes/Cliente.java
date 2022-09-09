package Depois.Kenumeração.Classes;

public class Cliente {
    
    public enum TipoPagamento {
    APRAZO, AVISTA;
    }

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;     
    

            public String toString(){
                return "NOME: " 
                + this.nome 
                + "\nTIPO DO CLIENTE: " 
                + tipo.getNome()
                + ", NÚMERO DE SÉRIE: " 
                + tipo.getTipo()
                + "\nPAGAMENTO: "
                + this.tipoPagamento; 
            }
//args
        public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPg){
                this.nome = nome;
                this.tipo = tipo;
                this.tipoPagamento = tipoPg;
            }

            public void setTipoPg(TipoPagamento tipoPgAux){
                this.tipoPagamento = tipoPgAux;
            }
            public TipoPagamento tipoPg(){
                return this.tipoPagamento;
            }
            public String getNome(){
                return this.nome;
            }
            public TipoCliente getTipo(){
                return this.tipo;
            }
            public void setNome(String nome){
                this.nome = nome;
            }
            public void setTipo(TipoCliente tipo){
                this.tipo = tipo;
            }   
}
