package giteclipse;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Cenas");
	 System.out.println("Agora outra coisa");
	 
	 System.out.println("Vou criar um c�o:");
	 
	 Cao cao = new Cao();
	 
	 System.out.println("O nome do c�o �: " + cao.getNome());
	 System.out.println("O c�o tem " + cao.getIdade() + " anos.");
	 
	 System.out.println("Vou criar um c�o com o nome Canito e com 2 anos.");
	 
	 Cao canito = new Cao("Canito", 2);
	 
	 System.out.println("O nome do c�o �: " + canito.getNome());
	 System.out.println("O c�o tem " + canito.getIdade() + " anos.");
	 

	}

}
