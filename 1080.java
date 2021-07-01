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
	int pos=0;
	//int nemui[]=new int [100];
	int max=0;
	////String[]=new String[]	
	public void yume_nikki()
	{
		Scanner input = new Scanner(System.in);
		
		for (int i=1;i<=100;i++)
		{
			usagi=input.nextInt();
			//nemui[i]=usagi;
			if (usagi<max)
			{
				max=max;
				pos=pos;
			}
			else
			{
				max=usagi;
				pos=i;
			}
		}
		input.close();
	}
	public void saida()
	{
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",pos);
	}   
}	
