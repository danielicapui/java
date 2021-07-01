import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int numero1= input.nextInt();
	int numero2= input.nextInt();
	input.close();
	int resultado=calculo.Soma(numero1,numero2);
	calculo.Saida(resultado);
	}

}
class Calculo{
	public static void main(String[] args){
	}
	/* public int Entrada(){
		Scanner input = new Scanner(System.in);
		int numero1= input.nextInt();
		input.close();
		return numero1;
	} */
	public int Soma(int numero1,int numero2){
		return (numero1+numero2);
	}
	public void Saida(int r){
		System.out.printf("X = %d%n",r);
	}
}	




