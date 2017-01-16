
package letras_st;
import java.util.Scanner;

public class Letras {


    public static void main(String[] args) {

        int cub[];
        char a;
        int b;
        cub = new int[30];


        Scanner entradaEscaner = new Scanner (System.in);

        String  entradaTeclado = entradaEscaner.nextLine();


        for( int i=0; i < entradaTeclado.length(); i++)
        {
            if(entradaTeclado.charAt(i)!=32)
            {
                if(entradaTeclado.charAt(i)>=97)

                {
                    cub[entradaTeclado.charAt(i)-97]++;
                }
                else
                {
                    cub[entradaTeclado.charAt(i)-65]++;

                }
            }

        }

        for( int i=0; i < 26; i++)
        {
            if(cub[i]!=0)
            {
                if(cub[i]>1)
                {
                    for(int j=0; j<cub[i]; j++)
                    {
                        b= i+65;
                        a = (char) b  ;
                        System.out.print((a) +" ");
                    }
                }
                else
                {
                    b= i+65;
                    a = (char) b  ;
                    System.out.print((a) +" ");
                }

            }
        }

    }



}