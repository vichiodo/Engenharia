
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
    
    public String exibeResultado(String sexo, double peso, double altura){
        DecimalFormat df = new DecimalFormat("##.#");
        double imc = this.calculaImc(peso, altura);
        String fd;
        String saida=null;
        
        if(sexo.equalsIgnoreCase("Mulher")){
            if(imc<15){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nProcure um médico, você vai morrer";
            }
            else if(imc>=15 && imc<18){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está abaixo do peso recomendado!";
            }
            else if(imc>=18 && imc<24.5){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está muito bem! Continue assim!";            
            }
            else if(imc>=24.5 && imc<27.3){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está acima do peso recomendado. Cuidado!";
            }
            else{
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
            }
        }
        
        else if(sexo.equalsIgnoreCase("Homem")){
            if(imc<17.9){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nProcure um médico, você vai morrer";
            }
            else if(imc>=17.9 && imc<19){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está abaixo do peso recomendado!";
            }
            else if(imc>=19 && imc<25){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está muito bem! Continue assim!";            
            }
            else if(imc>=25 && imc<27.8){
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está acima do peso recomendado. Cuidado!";
            }
            else{
                fd = df.format(imc);
                saida = "IMC: "+fd+"\nVocê está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
            }
        }
        else{
            saida = "Sexo não existe";
        }
       return saida;
    }
}
