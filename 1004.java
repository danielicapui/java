import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int numero1= input.nextInt();
	int numero2=input.nextInt();
	input.close();
	int produto=calculo.prod(numero1,numero2);
	calculo.Saida(produto);
	}

}
class Calculo{
	public int prod(int n1,int n2){
		return (n1*n2);
	}
	public void Saida(int r){
		System.out.printf("PROD = %d%n",r);
	}
}	




