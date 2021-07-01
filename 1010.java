import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int n1,n2,l1,l2;
	double n3,l3,dinheiro,a,b;
	n1=input.nextInt();
	n2=input.nextInt();
	n3=input.nextDouble();
	l1=input.nextInt();
	l2=input.nextInt();
	l3=input.nextDouble();
	input.close();
	dinheiro=calculo.total(n2*n3,l2*l3);
	calculo.Saida(dinheiro);
	}

}
class Calculo{
	public double total(double a,double b){
		return (a+b);
	}
	public void Saida(double r){
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",r);
	}
}	




