import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int a=input.nextInt();
	input.close();
	// #Vector<Integer> shika = new Vector<>();
	ArrayList<Integer>shika=new ArrayList<Integer>(6);
	shika =calculo.nota(a);
	calculo.Saida(shika);
	//shika[0],shika[1],shika[2],shika[3],shika[4],shika[5],shika[6]
	}

}
class Calculo{
	public ArrayList adiciona_lista(ArrayList shika){
		shika.add(100);
		shika.add(50);
		shika.add(20);
		shika.add(10);
		shika.add(5);
		shika.add(2);
		shika.add(1);
		return shika;
	}
	public ArrayList nota(int a){
		ArrayList<Integer> rabbit=new ArrayList<Integer>(6);
		ArrayList<Integer> lista=new ArrayList<Integer>(6);
		lista=adiciona_lista(lista);
		int aux;
		for(int i=0;i<7;i++){
			aux=(int)(a/lista.get(i));
			rabbit.add(aux);
			a=a%lista.get(i);
		}
		return rabbit;
	}
	public void Saida(ArrayList shika ){
		// System.out.printf("%d nota(s) de R$ 100,00%n",n100);
		// System.out.printf("%d nota(s) de R$ 50,00%n",n50);
		// System.out.printf("%d nota(s) de R$ 20,00%n",n20);
		// System.out.printf("%d nota(s) de R$ 10,00%n",n10);
		// System.out.printf("%d nota(s) de R$ 5,00%n",n5);
		// System.out.printf("%d nota(s) de R$ 100,00%n",n2);
		// System.out.printf("%d nota(s) de R$ 1,00%n",n1);
		System.out.printf("%d nota(s) de R$ 100,00%n",shika.get(0));
		System.out.printf("%d nota(s) de R$ 50,00%n",shika.get(1));
		System.out.printf("%d nota(s) de R$ 20,00%n",shika.get(2));
		System.out.printf("%d nota(s) de R$ 10,00%n",shika.get(3));
		System.out.printf("%d nota(s) de R$ 5,00%n",shika.get(4));
		System.out.printf("%d nota(s) de R$ 2,00%n",shika.get(5));
		System.out.printf("%d nota(s) de R$ 1,00%n",shika.get(6));
		
	}
}	




