package strategy;

public class Calculadora {
    public double calcular(double valor, Desconto estrategiaDeDesconto){
        return estrategiaDeDesconto.aplicar(valor);
    }
}
