import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int numero1=input.nextInt();
	int numero2=input.nextInt();
	int numero3=input.nextInt();
	int numero4=input.nextInt();
	input.close();
	int sub=calculo.diferenca(numero1,numero2,numero3,numero4);
	calculo.Saida(sub);
	}

}
class Calculo{
	public int diferenca(int n1,int n2,int n3,int n4){
		return ((n1*n2)-n3*n4);
	}
	public void Saida(int r){
		System.out.printf("DIFERENCA = %d%n",r);
	}
}	




