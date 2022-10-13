import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.print(hoje.isAfter(natal));
        System.out.println(hoje.isAfter(natal)); // verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal)); // verifica se a data é antes da especificada
        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // numero do mes
        int dia = hoje.getDayOfMonth(); // numero do dia do mes

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();
        System.out.print("Faltam " + diasParaNatal + "para o Natal!");

    }
}