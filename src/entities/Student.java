package entities;

public class Student {
	// Atributos
	public String nome;
	public float nota1, nota2, nota3;
	
	// Métodos públicos 
	public float calcularNota() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if(calcularNota() >= 60.00) {
			return "NOTA FINAL: " + String.format("%.2f", calcularNota()) + "\nAPROVADO";
		}
		else {
			return "NOTA FINAL: " + String.format("%.2f", calcularNota()) + "\nREPROVADO" + "\nFALTAM: " 
					+ String.format("%.2f", (60.00 - calcularNota())) + " PONTOS";
		}
		
	}
}
