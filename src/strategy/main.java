package strategy;

public class main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double valorCompra = 100.0;

        Desconto descontoVip = new DescontoVip();
        Desconto descontoNovo = new DescontoNovoCliente();

        double valorDaCompra = 100;
        System.out.println("Valor original do produto: R$ " + valorDaCompra);

        //  desconto VIP
        double valorParaVip = calculadora.calcular(valorDaCompra, descontoVip);
        System.out.println("Valor para Cliente VIP: R$ " + valorParaVip);

        // desconto para Novo Cliente
        double valorParaNovo = calculadora.calcular(valorDaCompra, descontoNovo);
        System.out.println("Valor para Novo Cliente: R$ " + valorParaNovo);
    }
}
