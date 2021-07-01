import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int numero1=input.nextInt();
	int numero2=input.nextInt();
	double numero3=input.nextDouble();
	input.close();
	double dinheiro=calculo.salario(numero2,numero3);
	calculo.Saida(numero1,dinheiro);
	}

}
class Calculo{
	public double salario(int n1,double n2){
		return (n1*n2);
	}
	public void Saida(int n,double r){
		System.out.printf("NUMBER = %d%n",n);
		System.out.printf("SALARY = U$ %.2f%n",r);
		
	}
}	




