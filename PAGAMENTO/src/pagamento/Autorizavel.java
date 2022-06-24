package pagamento;

public interface Autorizavel {
    //Só preciso saber o valor total da compra,
    //para ele ser autorizável ou não

    public double getValorTotal();
}
