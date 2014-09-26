/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Barbara
 */
public class PessoaTest {
    
    public PessoaTest() {
    }

   @Test
    public void testCalculaImc() {
        double peso = 45;
        double altura = 160;
        double imc  = 17.6;
        
        Pessoa pessoa = new Pessoa();
        Assert.assertEquals(imc, pessoa.calculaImc(peso, altura), 0.1);
    }
    
    @Test
    public void testExibeResultado(){
        Pessoa pessoa = new Pessoa();
        double peso = 30;
        double altura = 160;
        String mulher01 = "IMC: 11,7\nProcure um médico, você vai morrer";
        Assert.assertEquals(mulher01, pessoa.exibeResultado("Mulher", peso, altura));
        
        double peso1 = 45;
        String mulher02 = "IMC: 17,6\nVocê está abaixo do peso recomendado!";
        Assert.assertEquals(mulher02, pessoa.exibeResultado("Mulher", peso1, altura));
        
        double peso2 = 50;
        String mulher03 = "IMC: 19,5\nVocê está muito bem! Continue assim!";
        Assert.assertEquals(mulher03, pessoa.exibeResultado("Mulher", peso2, altura));
        
        double peso3 = 65;
        String mulher04 = "IMC: 25,4\nVocê está acima do peso recomendado. Cuidado!";
        Assert.assertEquals(mulher04, pessoa.exibeResultado("Mulher", peso3, altura));
        
        double peso4 = 75;
        String mulher05 = "IMC: 29,3\nVocê está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        Assert.assertEquals(mulher05, pessoa.exibeResultado("Mulher", peso4, altura));
    
    }
}
