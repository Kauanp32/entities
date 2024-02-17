package entities;

public class Rent {
    
    // Atributos do aluguel
    private String name; // Nome do locatário
    private String email; // E-mail do locatário

    // Construtor da classe Rent
    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Método getter para obter o nome do locatário
    public String getName() {
        return name;
    }

    // Método setter para definir o nome do locatário
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para obter o e-mail do locatário
    public String getEmail() {
        return email;
    }

    // Método setter para definir o e-mail do locatário
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representação em string do objeto Rent
    public String toString() {
        return name + ", " + email;
    }
}