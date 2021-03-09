package proy2;

public class Sustitucion {
    
    public String palabra;
    
    public Sustitucion (){
    }
     public Sustitucion (String palabra){
        this.palabra=palabra;
    }
     public void setPalabra(String palabra){
         this.palabra=palabra;
     }
     public String getPalabra(){
         return palabra;
     }
    
    public void sust(String palabra){
        
        char lineaCaracteres [] = palabra.toCharArray();//oreo de oro
        
        int contador=1, mayor=0;
        char MasRepeticiones='*';
                                                  //
        for(int i=0;i<lineaCaracteres.length;i++){//oreo de oro
            contador=1;
                                                              //012345789
            for(int j=i+1;j<lineaCaracteres.length;j++){      //oreo de crema
                                                              //o
                                                              //2
                if(lineaCaracteres[i]==lineaCaracteres[j]){   //2
                                                              //
                    contador++;                               //
                                                              //
                    if(contador>mayor){
                        
                        mayor=contador;
                        MasRepeticiones=lineaCaracteres[i];
                    }
                    
                }
                
            }           
        }
        //char a=MasRepeticiones;
        for(int i=0;i<lineaCaracteres.length;i++){
           
               if(lineaCaracteres[i]=='a'|| lineaCaracteres[i] == 'e' || lineaCaracteres[i] == 'i'
                       || lineaCaracteres[i] == 'o' || lineaCaracteres[i] == 'u'){
                   
                   lineaCaracteres[i]=MasRepeticiones;
               }
        }
        
        String sustituida=String.valueOf(lineaCaracteres);
        
        this.palabra=sustituida;
    }
}
