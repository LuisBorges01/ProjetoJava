package PosQuarenta.G.QuarentaOito;

public class Local {
    private String rua;
    private String bairro;

    //const
    
    public Local(String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    } 

    //print 
    public void print(){
        System.out.println("================= Relatório do local =================");
        System.out.println("Rua: " + rua);
        System.out.println("Bairro " + bairro);
    }


    //"args"
    public void setRua(String rua){
        this.rua=rua;
    }
    public String getRua(){
        return this.rua;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public String getBairro(){
        return this.bairro;
    }
}
