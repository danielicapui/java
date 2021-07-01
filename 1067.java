import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	Scanner input = new Scanner(System.in);
	
	//entrada
	shika.p=input.nextInt();
	input.close();
	//processamento das funções	
	shika.impar();
	}
}

class Rabbit
{
	int usagi=0;
	int p=0;
	public int impar()
	{
		for (int i=1;i<p+1;i++)
		{
			if (i%2!=0)
			{
				usagi=i;
				saida();
			}
		}
		return usagi;
	}
	public void saida()
	{
		System.out.printf("%d\n",usagi);
	}   
}	
