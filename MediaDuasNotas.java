/* Crie um programa que realize a média de duas notas decimais e exiba o resultado. */
  
public class MediaDuasNotas {
    public static void main(String[] args){
        String titulo = "Média das notas do aluno X: ";
        double notaUm = 6;
        double notaDois = 8.5;

        double media = (notaUm + notaDois) / 2;
        String resultado = """
                %s
                A média das notas um: %.1f e dois: %.1f é de:
                %.1f
                """.formatted(titulo, notaUm, notaDois, media);

        System.out.println(resultado);
    }
}
