package PosQuarenta.F.QuarentaQuatro;

public class Cliente {
    private static int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização. \n");
        for (int nParcelas = 1; nParcelas <= 100; nParcelas++) {
            parcelas[nParcelas - 1] = nParcelas;
        }
    }

    public Cliente() {
    }

    // "-----------------------------------------"
    public void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

    public int[] getParcelas() {
        return Cliente.parcelas;
    }

}
