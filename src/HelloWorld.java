public class HelloWorld {
    public static void main(String[] args) {
//      Reglas para definir una variable
//      - TipoDeDato nombreVariable;
//      - No se puede usar ninguna palabra clave del lenguaje como nombre de variable
//      - Los nombres de variables no pueden iniciar con un número
//      - No se recomienda usar acentos como la letra "ñ"

        int numero;
        Integer number = 7;
        boolean valor;
        var variableDinamica = 15;
        String saludar = "Hola mundo desde Java";

        valor = false;
        numero = 10;

        System.out.println(saludar.toUpperCase());
        System.out.println(numero);
        System.out.println(number);
        System.out.println(valor);
        System.out.println(variableDinamica);
    }
}