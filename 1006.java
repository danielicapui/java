import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	double numero1= input.nextDouble();
	double numero2=input.nextDouble();
	double numero3=input.nextDouble();
	input.close();
	double med=calculo.media(numero1,numero2,numero3);
	calculo.Saida(med);
	}

}
class Calculo{
	public double media(double n1,double n2,double n3){
		return ((n1*2.0+n2*3.0+n3*5.0)/10);
	}
	public void Saida(double r){
		System.out.printf("MEDIA = %.1f%n",r);
	}
}	




