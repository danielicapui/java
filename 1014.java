import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int a=input.nextInt();
	double b=input.nextDouble();
	input.close();
	double usagi=calculo.gasto(a,b);

	calculo.Saida(usagi);
	}

}
class Calculo{
	public double gasto(int a,double b){
		return (a/b);
	}

	public void Saida(double a){
		System.out.printf("%.3f km/l%n",a);

	}
}	




