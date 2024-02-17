package entities;

public class TrianglePart2 {

    // Atributos da classe representando os lados do triângulo
    public double a;  // Lado 'a'
    public double b;  // Lado 'b'
    public double c;  // Lado 'c'

    // Método para calcular a área do triângulo usando a fórmula de Herão
    public double area() {
        // Semi-perímetro do triângulo
        double p = (a + b + c) / 2.0;
        
        // Fórmula de Herão para calcular a área do triângulo usando o semi-perímetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }		
}