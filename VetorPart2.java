package entities; // Pacote do programa

public class VetorPart2 { // Declaração da classe VetorPart2

    // Atributos da classe
    private String name; // Nome do produto
    private double price; // Preço do produto

    // Construtor da classe
    public VetorPart2(String name, double price) { // Método construtor que inicializa os atributos da classe
        this.name = name; // Inicializando o atributo 'name' com o valor passado como parâmetro
        this.price = price; // Inicializando o atributo 'price' com o valor passado como parâmetro
    }

    // Métodos getters e setters para os atributos da classe

    // Getter para o atributo 'name' que retorna o nome do produto
    public String getName() {
        return name; // Retorna o valor do atributo 'name'
    }

    // Setter para o atributo 'name' que define o nome do produto
    public void setName(String name) {
        this.name = name; // Define o valor do atributo 'name' com o valor passado como parâmetro
    }

    // Getter para o atributo 'price' que retorna o preço do produto
    public double getPrice() {
        return price; // Retorna o valor do atributo 'price'
    }

    // Setter para o atributo 'price' que define o preço do produto
    public void setPrice(double price) {
        this.price = price; // Define o valor do atributo 'price' com o valor passado como parâmetro
    }
}