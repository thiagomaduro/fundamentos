package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio *raio;
		
		//uma string concatenando com  a variavel "area" e "m2"
		System.out.println("A área é: " + area + "m2." );
		/**
		 * %f que vai ser o "area", onde o %f será substituído pelo area
		 * e o \n é a quebra de página, já que estou usando o printf
		 */
		
		System.out.printf("A área é %f m2.\n ", area );
		
		/**
		 * o %.2 significa que eu só quero 2 casas decimais após a virgula
		 
		 */
		
		System.out.printf("A área é %.2f m2. ", area );
		
		
		
	}

}
