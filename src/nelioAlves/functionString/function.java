package nelioAlves.functionString;

public class function {
    public static void main(String[] args) {
        String original = "aaaa AAAA bbbb BBBBB aBAb     ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.replaceAll("a", "x");

        System.out.println("Tudo minusculo: " + s01);
        System.out.println("Tudo maiusculo: " + s02);
        System.out.println("-Sem espaços: " + s03 + "-");
        System.out.println("Trocando: " + s04);

        //Tem outras e está na aula "Funções interessantes do String"
    }
}
