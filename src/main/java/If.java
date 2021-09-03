public class If {

    public static void main(String[] args) {

        final var condicao = true;

        if (condicao) {
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");

        if (condicao) {
            System.out.println("Uma única linha...");
        }

        final var ternario = condicao ? "é verdadeiro" : "é falso";
        System.out.println(ternario);
        }
    }
}
