package entities;

public class Account {

    // Atributos da conta
    private int number; // Número da conta
    private String holder; // Titular da conta
    private double balance; // Saldo da conta

    // Construtor da classe para criar uma conta com número e titular
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Construtor da classe para criar uma conta com número, titular e depósito inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); // Realiza um depósito inicial na conta
    }

    // Método getter para obter o número da conta
    public int getNumber() {
        return number;
    }

    // Método getter para obter o titular da conta
    public String getHolder() {
        return holder;
    }

    // Método setter para definir o titular da conta
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Método getter para obter o saldo da conta
    public double getBalance() {
        return balance;
    }

    // Método para realizar um depósito na conta
    public void deposit(double amount) {
        balance += amount;
    }
    
    // Método para realizar um saque na conta
    public void withdraw(double amount) {
        balance -= amount + 5.0; // Desconta uma taxa de $5.00 do saldo ao realizar um saque
    }
    
    // Método toString para representação em string do objeto Account
    @Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance); // Formata o saldo com duas casas decimais
    }
}