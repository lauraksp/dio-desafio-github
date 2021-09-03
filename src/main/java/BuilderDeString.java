public class BuilderDeString {

        public static void main(String[] args) {

            System.out.println("A B C D E".toCharArray()); //**mostra a sequêcncia de caracteres representada por essa string**//

            System.out.println("Aula teste".split(""));//**a string vazia é ignorada**//

            System.out.println("Aula".concat(" de Java"));//**faz a concatenação das duas string**//

            System.out.println("1234 asda qw".replaceAll("[0-3]", "#"));
            //**as posições que não forem existentes dentro do array será substituído pela segunda string**//




        }
    }
