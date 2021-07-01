import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		input.close();
		Calculo calculo=new Calculo(a);
		calculo.nota();
		calculo.Saida();
	}

}
class Calculo
{
	public int inu []={100,50,20,10,5,2,1};
	public int a,b;
	ArrayList<Integer> rabbit=new ArrayList<Integer>(7);
	Calculo(int a)
	{
		this.a=a;
		this.b=a;
	}
	public void nota(){
		int aux;
		for(int i=0;i<7;i++)
		{
			aux=(a/inu[i]);
			rabbit.add(aux);
			a=(a%inu[i]);
		}
	}
	public void Saida()
	{
		System.out.printf("%d%n", this.b);
		String palavra;
		for(int i=0;i<7;i++)
		{
			palavra=rabbit.get(i)+" nota(s) de R$ "+inu[i]+",00";
			System.out.println(palavra);
		}
		
	}
}	




