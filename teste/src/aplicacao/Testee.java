
package aplicacao;


public class Testee {
    public static void main(String[] args) {
        double peso = 30;
        double altura = 1.53;
        
        Testee i = new Testee();
        System.out.println("seu imc é " +  i.imc(peso, altura));
        
        if (i.imc(peso, altura) < 18.5){
            System.out.println("voce esta abaixo do peso");
        }
        else if (i.imc(peso, altura) >= 18.5 && i.imc(peso, altura) < 24.9 ){
            System.out.println("voce esta com o peso ideal");
        }
        else 
            System.out.println("voce está com sobrepeso");
    
    }
    
    public double imc (double peso, double altura){
        return peso / Math.pow(altura, 2);
    }
}
