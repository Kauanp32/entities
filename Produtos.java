package entities;

public class Produtos {

    // Atributos da classe representando informações sobre um produto
    public String name;      // Nome do produto
    public double price;     // Preço unitário do produto
    public int quantity;     // Quantidade de unidades em estoque

    // Método para calcular o valor total em estoque para este produto
    public double totalValueInStock() {
        return price * quantity;  // O valor total é calculado multiplicando o preço pela quantidade em estoque
    }

    // Método para adicionar unidades ao estoque do produto
    public void addProducts(int quantity) {
        this.quantity += quantity;  // A quantidade fornecida é adicionada à quantidade em estoque
    }

    // Método para remover unidades do estoque do produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;  // A quantidade fornecida é removida da quantidade em estoque
    }

    // Método para gerar uma representação de string do objeto Produto
    public String toString() {
        // Retorna uma string formatada com nome, preço unitário, quantidade em estoque e valor total em estoque
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}