
import java.util.*;


public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa p = new Pessoa();
        String sexo;
        double peso, altura;
        
        System.out.println("Sexo(Homem/Mulher):");
        sexo = s.nextLine();
        System.out.println("Altura(em cm):");
        altura = s.nextDouble();
        System.out.println("Peso(em kg):");
        peso = s.nextDouble();
        
        System.out.println(p.exibeResultado(sexo, peso, altura));
        
    }    
}
