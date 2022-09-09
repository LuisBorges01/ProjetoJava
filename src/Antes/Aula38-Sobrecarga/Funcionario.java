package Aula38Sobrecarga;

public class Funcionario {
    public String nome;
    public String cpf;
    public int salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
    }



//-----------------------------------
public void setNome(String nome){
    this.nome = nome;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public void setSalario(int salario){
    this.salario = salario;
}
public String getNome(){
    return this.nome;
}
public String getCpf(){
    return this.cpf;
}
public String getSalario(){
    return this.salario;
}

}



