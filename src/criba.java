import java.util.Scanner;
public class criba {
    public int criba(int uno, int dos) {

        int primo[];
        int a;
        primo = new int[dos];
        primo[0]=1;
        primo[1]=0;

        for(int i=2; i<dos; i++) {

            for(int p=i+1;p<dos; p++)
            {
                if(p%i==0 )
                {
                    primo[p]=1;
                }
            }
        }

        for(int j=uno; j<dos; j++)
        {
            if(primo[j]==0)
            {
                System.out.print(j + " ");
            }
        }
        return 0;
    }

    public int criba(int uno)
    {

        int primo[];
        int a,max=0,aux=100;
        uno= uno+15;
        primo = new int[uno];
        primo[0]=1;
        primo[1]=0;
        for(int i=2; i<uno; i++) {

            for(int p=i+1;p<uno; p++)
            {
                if(p%i==0 )
                {
                    primo[p]=1;
                }
            }
        }

        for(int j=2; j<uno; j++)
        {
            if(primo[j]==0)
            {
                if(j<(uno-15)) {
                    max = (uno - 15) - j;
                } else {
                    max = j - (uno - 15);
                }

            }

            if(max< aux)
            {
                aux=max;

            }

        }
        if(primo[((uno-15)+ aux)]==0)
        {
            return ((uno-15) + aux);
        }
        else
        {
            return ((uno-15) - aux);
        }

    }




    public int primo(int i)
    {
        for(int p=2; p<i; p++)
        {
            if(i%p==0)
            {
                return 1;
            }

        }
        return 2;

    }
}