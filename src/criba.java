import java.util.Scanner;
public class criba {
    public static void main(String[] args) {

        int primo[];
        int a;
        Scanner entradaEscaner = new Scanner (System.in);
        int  entradaTeclado = entradaEscaner.nextInt();

        primo = new int[entradaTeclado];
        primo[0]=1;
        primo[1]=0;

        for(int i=2; i<entradaTeclado; i++) {

                for(int p=i+1;p<entradaTeclado; p++)
                {
                    if(p%i==0 )
                    {
                        primo[p]=1;
                    }
                }
        }

     for(int j=0; j<entradaTeclado; j++)
     {
         if(primo[j]==0)
         {
             System.out.print(j + " ");
         }
     }
    }
    }
