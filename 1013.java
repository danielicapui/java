import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	

	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	input.close();
	
	int rabbit=calculo.maior(a,b);
	int usagi=calculo.maior(rabbit,c);

	calculo.Saida(usagi);
	}

}
class Calculo{
	public int maior(int a,int b){
		return (a+b+Math.abs(a-b))/2;
	}

	public void Saida(int a){
		System.out.printf("%d eh o maior%n",a);

	}
}	




