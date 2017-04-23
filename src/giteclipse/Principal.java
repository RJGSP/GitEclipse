package giteclipse;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Cenas");
	 System.out.println("Agora outra coisa");
	 
	 System.out.println("Vou criar um cão:");
	 
	 Cao cao = new Cao();
	 
	 System.out.println("O nome do cão é: " + cao.getNome());
	 System.out.println("O cão tem " + cao.getIdade() + " anos.");
	 
	 System.out.println("Vou criar um cão com o nome Canito e com 2 anos.");
	 
	 Cao canito = new Cao("Canito", 2);
	 
	 System.out.println("O nome do cão é: " + canito.getNome());
	 System.out.println("O cão tem " + canito.getIdade() + " anos.");
	 

	}

}
