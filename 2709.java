import java.util.Scanner;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	Scanner input = new Scanner(System.in);
    while (input.hasNext()){
        int t = input.nextInt();
		int []ika;
		ika=new int[t];
		shika.hotaro=0;
		
		for (int i=0;i<t;i++)
		{
			shika.p=input.nextInt();
			ika[i]=shika.p;
		}
		//processamento das funções
		shika.hotaro=input.nextInt();
		shika.ika=ika;
		shika.remover();
		shika.isprimo();
		if (shika.saida()==true)
		{
			break;
		}
	}
	input.close();
	}
}

class Rabbit{	
	int p=0;
	int soma=0;
	int hotaro=0;
	int []ika;
	int neko=0;
	
	public int remover()
	{
		soma=0;
		int tam=(ika).length-1;
        while (tam>=0)
		{
           soma=soma+ika[tam];
		   tam=tam-hotaro;
		}
		// System.out.printf("soma=%d",soma);
		return soma;
	}
	public int isprimo()
	{
		if ((soma!= 2 && soma%2==0 )|| soma==1)
		{
            neko=0;
            return neko;
		}
		for (int i=3;i<soma-1;i++)
		{
			if (soma%i==0){
			  neko=0;
			  return neko;
			}
		}
		neko=1;
        return neko;		
	}
	public boolean saida()
	{
		if (neko==1)
		{
            System.out.printf("You’re a coastal aircraft, Robbie, a large silver aircraft.\n");
			return true;
		}
        else
		{
            System.out.printf("Bad boy! I’ll hit you.\n");
			return false;
		}
	}   
}	
