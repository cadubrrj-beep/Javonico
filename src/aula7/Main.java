package aula7;

public class Main {

    public static void main(String[] args) {

        // 1. Tentar instanciar a classe abstrata gera erro de compilacao (Deu erro pq não pode ser instanciado)
        // Voluntario v = new Voluntario("Ana", "ana@email.com");

        // 2. Criando instancias das classes concretas
        DentistaVoluntario dentista = new DentistaVoluntario("Dra. Maria", "maria@email.org", "SP-123456", 4);
        EducadorVoluntario educador = new EducadorVoluntario("Pedro", "pedro@email.org", 2);

        // 3. Executando os metodos de FORMA DIRETA
        // System.out.println("---Voluntario 1---");
        // System.out.println(dentista.getInfo());
        // dentista.realizarAcao();
        // System.out.println("Horas: " + dentista.calcularHorasDedicadas() + "h\n");

        // System.out.println("---Voluntario 2---");
        // System.out.println(educador.getInfo());
        // educador.realizarAcao();
        // System.out.println("Horas: " + educador.calcularHorasDedicadas() + "h\n");

        imprimirRelatorio(dentista);
        imprimirRelatorio(educador);
    }

        // Metode Dolimonfice: recebe a classe ABSTRATA como parâmetro
        public static void imprimirRelatorio(Voluntario v) {
            System.out.println("--- RELATÓRIO ---");
            System.out.println(v.getInfo());
            v.realizarAcao(); //Executa o compentamente especifice da sub classe
            System.out.println("Horas: " + v.calcularHorasDedicadas() + "h\n");
            System.out.println(" --------------------------------------------\n");
    }
}
