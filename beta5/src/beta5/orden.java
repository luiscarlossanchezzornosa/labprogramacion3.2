/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta5;

/**
 *
 * @author paule
 */
public class orden 
{
    public void ordenburbuja(int[] modelos)
    {
        int aux;
        boolean cambios=false;
        while (true) 
        {
             cambios=false;
           for(int i=1;i<modelos.length;i++)
           {
               if (modelos[i]<modelos[i-1]) 
               {
               aux=modelos[i];
               modelos[i]=modelos[i-1];
               modelos[i-1]=aux;
               cambios=true;
               }
           }
            if(cambios==false)
               break;
        }
    }
    
    public int [] magesort(int [] A)
    {
     if(A.length<=1)
      {
       return A; 
      }else
     {
      int [] left;
      int[] right;
      right=new int[A.length/2];
      if(A.length%2==0)
       {
        left=new int[A.length/2];
       }else
      {
       left=new int  [(A.length/2+1)];
      }
      int i;
      for (i=0;i<left.length;++i)
      {
       left[i]=A[i];
      }
      int k=0;           
      for(int j=i;j<A.length;++j)
      {
       right[k]=A[j];
       ++k;
      }
      int[] arrayordenado=marge(magesort(left),magesort(right)); 
      return arrayordenado;
     }
    }
   public  int[] marge(int[] a, int[] b)
   {
    int i=0;
    int j =0;
    int [] c =new int [a.length + b.length];
    for (int k = 0; k < c.length; ++k)
     {
      if(a[i]<b[j])
      {
       c[k]=a[i];
       ++i; 
      }else
       {
        c[k]=b[j];
       }
        if(i==a.length)      
       {
           ++k;
           for (j = j; j < b.length; j++)
           {
            c[ k]=b[j];
            ++k;
           }
       }else if(j==b.length)
       {
        ++k;
       }
       for (i = i; i < a.length; i++)
       {
        c[k]=a[i];
        ++k;
       }       
     }         
    return c;
   }
}
