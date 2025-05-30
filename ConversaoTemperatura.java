/* Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. 
Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit. */

public class ConversaoTemperatura {
    public static void main(String[] args){
        String titulo = "Esse é o conversor de temperatura";
        double temperaturaCelsius = 20;
        double conversao = (temperaturaCelsius * 1.8) + 32;

        String resultado = """
                %s
                Temperatura em Celsius: %.1f°C
                Conversão em Fahrenheit: %.1f°F
                """.formatted(titulo, temperaturaCelsius, conversao);
        System.out.println(resultado);
    }
}
