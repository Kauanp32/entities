package entities;

public class EmployeePart2 {
	
	// Atributos da classe
	public String name;            // Nome do funcionário
	public double grossSalary;     // Salário bruto do funcionário
	public double tax;             // Imposto sobre o salário do funcionário

	// Método para calcular o salário líquido
	public double netSalary() {
		return grossSalary - tax;   // Salário líquido é calculado subtraindo o imposto do salário bruto
	}

	// Método para aumentar o salário com base em uma porcentagem
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;  // Aumenta o salário bruto conforme a porcentagem fornecida
	}

	// Método para fornecer uma representação de string do objeto Employee
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());  // Retorna uma string formatada com o nome e o salário líquido
	}

}