//Exercicio que verifica o nível de conhecimento de programação com base nos anos de experiência
// pedir para que o usuário insira a informação
import java.util.Scanner;

public class ExemploIfElse2 {
	public static void main (String[] args){
	    Scanner scanner = new Scanner (System.in);//cria um objeto para ler a entrada do usuário
	    
	    System.out.print("Digite quantos anos de experiencia você possui: ");// solicito a entrada do usuário
	    int anosDeExperiencia = scanner.nextInt();// ler o nº de anos de experiencia
	    if (anosDeExperiencia <2) { 
	        System.out.println("Você é um desenvolvedor júnior!");
	    } else if (anosDeExperiencia >= 2 && anosDeExperiencia <5) {
	         System.out.println("Você é um desenvolvedor pleno!");
    	} else{
    	    System.out.println("Você é um desenvolvedor Sênior!");
    	}
    	
	}
}