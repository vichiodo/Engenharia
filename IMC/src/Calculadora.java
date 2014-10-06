
import java.util.*;


public class Calculadora {
    public static void main(String[] args) {
        boolean error = true, error1 = true, error2 = true;
        Scanner s = new Scanner(System.in);
        Pessoa p = new Pessoa();
        String sexo = null;
        double peso = 0, altura = 0;
        
        while(error){
            System.out.println("Sexo(Homem/Mulher):");
            sexo = s.nextLine();
                if( (!sexo.equalsIgnoreCase("homem")) && (!sexo.equalsIgnoreCase("mulher"))){
                    System.out.println("Não é um sexo válido"); 
                    error = true;
                }
                else{
                    error = false;
                }
        }
      
        while(error1){
            System.out.println("Altura(em cm):");
            altura = s.nextDouble();
                    if(altura<=20 || altura>=400){
                        System.out.println("Altura invalida !! A altura deve ser em centimetros sem a unidade de medida");
                        error1=true;
                    }else{
                        error1=false;
                    }
        }
        while(error2){
            System.out.println("Peso(em kg):");
            peso = s.nextDouble();
                if(peso<=20 || peso>=1000){
                     System.out.println("O peso deve ser em kilogramas sem a unidade de medida");
                     error2=true;
                }else{
                     error2=false;
                }
        }
        System.out.println(p.exibeResultado(sexo, peso, altura));
        
    }    
}
