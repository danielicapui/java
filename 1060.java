import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	Scanner input = new Scanner(System.in);
	
	//entrada
	for (int i=0;i<6;i++){
		shika.p=input.nextDouble();
		shika.pares();
	}
	input.close();
	
	//processamento das funções
	shika.saida();	
	}
}

class Rabbit{
	int usagi=0;
	double p=0;
	public int pares()
	{
		if (p>0)
		{
		  usagi=usagi+1;
		}
		return usagi;
	}
	public void saida()
	{
		System.out.printf("%d valores positivos\n",usagi);
	}   
}	
