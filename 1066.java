import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	// Scanner input = new Scanner(System.in);
	// entrada
	// for (int i=0;i<5;i++)
	// (
		// shika.usagi=input.nextInt();
	// )
	// input.close();
	//processamento das funções	
	shika.yume_nikki();
	shika.saida();
	}
}

class Rabbit
{
	int usagi=1;
	int par=0;
	int impar=0;
	int pos=0;
	int neg=0;
	int nemui[]=new int [5];
	public int[] yume_nikki()
	{
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<5;i++)
		{
			usagi=input.nextInt();
			nemui[i]=usagi;
			if (nemui[i]%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
			if (nemui[i]<0)
			{
				neg++;
			}
			if (nemui[i]>0)
			{
				pos++;
			}	
		}
		input.close();
		return nemui;
	}
	
	public void saida()
	{
		System.out.printf("%d valor(es) par(es)\n",par);
		System.out.printf("%d valor(es) impar(es)\n",impar);
		System.out.printf("%d valor(es) positivo(s)\n",pos);
		System.out.printf("%d valor(es) negativo(s)\n",neg);
	}   
}	
