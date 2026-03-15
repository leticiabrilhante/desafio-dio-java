package strategy;

public class DescontoNovoCliente implements  Desconto {
    @Override
    public double aplicar(double valor) {
        return valor * 0.95;
    }

}
