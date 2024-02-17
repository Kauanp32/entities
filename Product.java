package entities;

public class Product {
    
    // Atributos do produto
    private String name;      // Nome do produto
    private double price;     // Preço do produto
    private int quantity;     // Quantidade em estoque
    
    // Construtor padrão
    public Product() {
    	
    }
    
    // Construtor que inicializa o nome, preço e quantidade do produto
    public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
    
    // Construtor que inicializa o nome e o preço do produto
    public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
    
	// Métodos getters e setters para acessar e modificar os atributos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// Método para calcular o valor total em estoque
	public double totalValueInStock() {
        return price * quantity;
    }

    // Método para adicionar produtos ao estoque
    public void addProducts(int quantity) {
        this.quantity += quantity; 
    }

    // Método para remover produtos do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity; 
    }

    // Método toString para representação em string do objeto Product
    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}