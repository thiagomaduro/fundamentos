package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio *raio;
		
		//uma string concatenando com  a variavel "area" e "m2"
		System.out.println("A �rea �: " + area + "m2." );
		/**
		 * %f que vai ser o "area", onde o %f ser� substitu�do pelo area
		 * e o \n � a quebra de p�gina, j� que estou usando o printf
		 */
		
		System.out.printf("A �rea � %f m2.\n ", area );
		
		/**
		 * o %.2 significa que eu s� quero 2 casas decimais ap�s a virgula
		 
		 */
		
		System.out.printf("A �rea � %.2f m2. ", area );
		
		
		
	}

}
