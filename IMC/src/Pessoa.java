
import java.text.DecimalFormat;


public class Pessoa {
    public String sexo;
    public double peso;
    public double altura;

    public Pessoa() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaImc(double peso, double altura){
        double imc;
        imc = 10000*(peso/Math.pow(altura, 2));
        
        return imc;
    }
    
    public void exibeResultado(String sexo, double peso, double altura){
        DecimalFormat df = new DecimalFormat("##.#");
        double imc = this.calculaImc(peso, altura);
        String fd;
        
        if(sexo.equalsIgnoreCase("Mulher")){
            if(imc<15){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Procure um médico, você vai morrer");
            }
            if(imc>=15 && imc<18){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está abaixo do peso recomendado!");
            }
            if(imc>=18 && imc<24.5){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está muito bem! Continue assim!");            
            }
            if(imc>=24.5 && imc<27.3){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está acima do peso recomendado. Cuidado!");
            }
            if(imc>=27.3){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
            }
        }
        
        if(sexo.equalsIgnoreCase("Homem")){
            if(imc<17.9){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Procure um médico, você vai morrer");
            }
            if(imc>=17.9 && imc<19){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está abaixo do peso recomendado!");
            }
            if(imc>=19 && imc<25){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está muito bem! Continue assim!");            
            }
            if(imc>=25 && imc<27.8){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está acima do peso recomendado. Cuidado!");
            }
            if(imc>=27.8){
                fd = df.format(imc);
                System.out.println("IMC: "+fd+" Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
            }
        }
    }
}
