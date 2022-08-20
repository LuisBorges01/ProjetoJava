package PosQuarenta.QuarentaUm;

public class Cliente {
    private int[] parcelas;
//"--------------------------------------------"
{ 
    parcelas = new int[100];
    System.out.println("Dentro do bloco de inicialização. \n");
    for(int nParcelas=1; nParcelas <= 100; nParcelas++){
    parcelas[nParcelas - 1] = nParcelas;
   }
}

    public Cliente(){ 
    }
//"-----------------------------------------"
    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }
    public int[] getParcelas(){
        return this.parcelas;
    }
    
}
