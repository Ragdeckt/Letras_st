
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args)
    {

        int primo;
        System.out.println("Programa 1= 1");
        System.out.println("Programa 2= 2");
        Scanner resp = new Scanner(System.in);
        int respuesta= resp.nextInt();

        if(respuesta==1)
        {
            System.out.println("Ingrese una frase");
            Scanner entradaEscaner = new Scanner (System.in);
            String  entradaTeclado = entradaEscaner.nextLine();
            Letras llamada= new Letras();
            llamada.letra(entradaTeclado);

        }
        else {
            System.out.println("Ingrese dos numeros");
            Scanner entrada1 = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            int num1 = entrada1.nextInt();
            int num2 = entrada2.nextInt();
            criba n1 = new criba();
            primo = n1.primo(num1);
            if (primo == 1)
            {
                num1=n1.criba(num1);
            }
            primo = n1.primo(num2);
            if (primo == 1) {
                num2=n1.criba(num2);
            }
            System.out.println("Rango de numeros de " + num1 + " a "+ num2 );
            n1.criba(num1, num2);
        }


    }
}


