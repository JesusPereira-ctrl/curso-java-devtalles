package wrapper;

public class WrapperCharacter {
    public static void main(String[] args) {
        boolean isLetter = Character.isLetter('A'); // esLetra = true
        boolean isDigit = Character.isDigit('5'); // esDigito = true
        boolean isWhiteSpace = Character.isWhitespace(' '); // esEspacio = true
        char upperText = Character.toUpperCase('a'); // mayúscula = 'A'
        char lowerText = Character.toLowerCase('A'); // minúscula = 'a'

        System.out.println("Es letra: " + isLetter);
        System.out.println("Es digito: " + isDigit);
        System.out.println("Es espacio: " + isWhiteSpace);
        System.out.println("Mayúscula: " + upperText);
        System.out.println("Minúscula: " + lowerText);
    }
}
