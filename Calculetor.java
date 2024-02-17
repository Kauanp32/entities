package entities;

public class Calculetor {
    
    // Constante PI
    public static final double PI = 3.14159;
    
    // Método estático para calcular a circunferência de uma esfera com base no raio
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    
    // Método estático para calcular o volume de uma esfera com base no raio
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}