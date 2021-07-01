import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
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
    }
}
class Rabbit
{
    int usagi=1;
    int nemui[]=new int [3];
    String mika[] = {"Alcool:", "Gasolina:", "Diesel:"};
    public void yume_nikki()
    {
        Scanner input = new Scanner(System.in);
        // for(int i=0;i<=2;i++)
        // {
        //     nemui[i]=0;
        // }
        while(usagi!=4)
        {
            usagi=input.nextInt();
            if (usagi>0 && usagi<=3)
            {
                nemui[usagi-1]++;
            }
            else if (usagi==4)
            {
                break;
            }
         }
    input.close();
    saida();
    }
    public void saida()
    {
        System.out.printf("MUITO OBRIGADO\n");
        for(int i=0;i<=2;i++)
        {
            System.out.printf("%s %d\n",mika[i],nemui[i]); 
        }
    }
}