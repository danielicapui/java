import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	String nome=input.nextLine();
	double numero2=0;
	numero2=input.nextDouble();
	double numero3=input.nextDouble();
	input.close();
	double dinheiro=calculo.salario(numero2,numero3);
	calculo.Saida(dinheiro);
	}

}
class Calculo{
	public double salario(double n1,double n2){
		return (n1+n2*0.15);
	}
	public void Saida(double r){
		System.out.printf("TOTAL = R$ %.2f\n",r);
		
	}
}	




