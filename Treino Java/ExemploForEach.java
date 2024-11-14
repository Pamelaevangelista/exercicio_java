//repetição sobre arrays/coleções.
//Exercicio percorrendo array de inteiros

public class ExemploForEach {
	public static void main (String[] args){
	    int [] numeros = {1, 2, 3, 4, 5};// vetor inteiro "numeros" 
	    for (int numero : numeros) {//lado esquerdo: variavel 
	    // lado esquerdo : lado direito
	    // lado esquerdo : declara variável par armazenamento temporario o valor do elemento urante a repetição
	    //lado direito : é o array/coleção que estamos percorrendo
	        System.out.println(numero);
	    }  
	}
}