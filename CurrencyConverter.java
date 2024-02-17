// Declaração do pacote chamado 'entities'
package entities;

// Declaração da classe CurrencyConverter
public class CurrencyConverter {

    // Declaração de uma variável constante para representar a Taxa de Entrada e Saída (IOF)
	public static double IOF = 0.06;

    // Declaração de um método para converter dólares para reais
    public static double dollarToReal(double amount, double dollarPrice) {

        // Cálculo do valor convertido, considerando a quantidade, a cotação do dólar e o IOF
        return amount * dollarPrice * (1.0 + IOF);
    }
}