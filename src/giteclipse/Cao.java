package giteclipse;

import java.util.Scanner;

public class Cao {
	
	String nome;
	int idade;
	
	

	public Cao() {
		
		System.out.println("Nome do cão: ");
		Scanner keyboard = new Scanner(System.in);
		String strNomeCao = keyboard.nextLine();
		this.nome = strNomeCao;
				
		System.out.println("Idade do cão: ");
		int intIdadeCao = keyboard.nextInt();
		this.idade = intIdadeCao;
		keyboard.close();
			
		
	}
	
	public Cao(String nomeCao, int idadeCao){
		
		this.nome = nomeCao;
		this.idade = idadeCao;
				
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	

}
