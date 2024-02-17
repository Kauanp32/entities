package entities;

public class RectanglePart2 {

    // Atributos da classe representando a largura e altura do retângulo
    public double width;   // Largura do retângulo
    public double height;  // Altura do retângulo

    // Método para calcular a área do retângulo
    public double area() {
        return width * height;  // A área é calculada multiplicando a largura pela altura
    }

    // Método para calcular o perímetro do retângulo
    public double perimeter() {
        return 2 * (width + height);  // O perímetro é calculado usando a fórmula 2 * (largura + altura)
    }

    // Método para calcular a diagonal do retângulo usando o teorema de Pitágoras
    public double diagonal() {
        return Math.sqrt(width * width + height * height);  // A diagonal é calculada usando a raiz quadrada da soma dos quadrados da largura e altura
    }

}