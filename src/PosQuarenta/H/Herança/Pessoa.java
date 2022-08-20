package PosQuarenta.H.Herança;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereço endereço;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    //
    public void setEnteEndereço(Endereço endereço){
        this.endereço = endereço;
    }
    public Endereço getEndereço(){
        return endereço;
    }
}
