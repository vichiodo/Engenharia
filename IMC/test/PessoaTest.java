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
        
        String mulher01 = "IMC: 17,6 Procure um médico, você vai morrer";
        
        double peso = 45;
        double altura = 160;
        String mulher02 = "IMC: 17,6\nVocê está abaixo do peso recomendado!";
        Pessoa pessoa = new Pessoa();
        Assert.assertEquals(mulher02, pessoa.exibeResultado("Mulher", peso, altura));
    
    }
}
