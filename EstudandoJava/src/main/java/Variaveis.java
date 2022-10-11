public class Variaveis {
    //Execução do nosso programa JAVA
    public static void main(String[] args)
    {
        System.out.println("Hello, world!"); // equivale ao console.log

        //Variáveis no Java: fortemente e estaticamente tipado - priomeiro o tipo e depois o nome da variável
        int idade = 20; // inteiro - tem alcance de até 2bi
        double salario = 4500.99;// dupla precisão de casas decimais
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_00l; // long contém número longos
        boolean tarefaConcluida = false; // (true ou false)
        int i = 1, j = 0, k = 1000; // comporta várias variáveis juntas, se forem do mesmo tipo
        String nomeCompleto = "José Almir"; // Sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de valores

        final int teste2 = 200; //  impossível mudar o valor
        //teste2 = 100;

        //Operadores

        int a = 10;
        int b = 5;

        int soma = - a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("O resultado da soma é " + soma);

        //Divisão entre inteiros rsulta em inteiros

        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois;
        System.out.println(resultado);
        double resultado2 = sete / dois2;
        System.out.println(resultado2);

        //Math

        double x = Math.sqrt(144);
        double y = Math.pow(5, 2);

        //Casting - converte o valor e não a varíavel

        int pi2 = (int)Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois;

        // Operadores relacionais

        int valor = 5;
        valor ++; //incrementa +1
        valor --; // decrementa -1
        valor += 10; // valor = valor +10



        boolean teste1 = 5>1;
        boolean teste3 = 5<1;
        boolean teste4 = 5==1;
        boolean teste5 = 5 != 1;
        boolean teste6 = 6 >= 6;
        boolean teste7 = 5 <= 9;

        //Operadores Lógicos

        boolean teste8 = true && false;
        boolean teste9 = true ||false;
        boolean teste10 = (5>10) && (10<5);
        boolean teste11 = (10>= 0) || (1<5);
        boolean teste12 = (5>1);
        boolean teste13 = !teste12;
    }
}

