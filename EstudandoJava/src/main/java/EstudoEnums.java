


public class EstudoEnums {


    public static void main(String[] args) {
        enum DiaDaSemana{
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.print(hoje);

        enum NiverDev { JUNIOR, PLENO, SENIOR}
        NiverDev nivel = NiverDev.PLENO;

        switch (nivel) {
            case JUNIOR:
                System.out.print("Seu nível é JUNIOR");
                break;
            case PLENO:
                    System.out.print("Seu nível é PLENO");
                    break;
            case SENIOR:
                    System.out.print("Seu nível é SENIOR");
                    break;
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
