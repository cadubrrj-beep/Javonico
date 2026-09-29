package AluraJava;

// 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

public class StringCharConc {
    public static <Char> void main(String[] args){
        char charVar = 'M';
        String stringVar = "gêneros";

        System.out.println("O formulário tem dois tipos de " + stringVar + " e um deles já está marcado como: " + charVar);
    }
}
