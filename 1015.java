import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	double x1=input.nextDouble();
	double y1=input.nextDouble();
	double x2=input.nextDouble();
	double y2=input.nextDouble();
	input.close();
	double usagi=calculo.distancia(x1,y1,x2,y2);
	calculo.Saida(usagi);
	}

}
class Calculo{
	public double distancia(double x1,double y1,double x2,double y2){
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}

	public void Saida(double a){
		System.out.printf("%.4f%n",a);

	}
}	




