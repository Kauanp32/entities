package entities;

	public class StudentPart2 {
		
	    // Atributos do estudante
	    public String name; // Nome do estudante
	    public double grade1; // Nota da primeira disciplina
	    public double grade2; // Nota da segunda disciplina
	    public double grade3; // Nota da terceira disciplina

	    // Método para calcular a nota final do estudante
	    public double finalGrade() {
	        return grade1 + grade2 + grade3;
	    }

	    // Método para calcular os pontos faltantes para passar, caso a nota final seja inferior a 60
	    public double missingPoints() {
	        if (finalGrade() < 60.0) {
	            return 60.0 - finalGrade();
	        } else {
	            return 0.0; // Se a nota final for maior ou igual a 60, não há pontos faltantes
	        }
	    }
}