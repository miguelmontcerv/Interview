import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Debes proporcionar un unico argumento de texto.");
            return;
        }

        String input = args[0];
        input = input.replaceAll("\\s", ""); // Elimina espacios en blanco

        if (isPalindrome(input)) {
            System.out.println("El texto SI es un palindromo.");
        } else {
            System.out.println("El texto NO es un palindromo.");
        }
    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s", ""); // Convertir a minúsculas y eliminar espacios
        Stack<Character> stack = new Stack<>();
        int length = text.length();
        int mid = length / 2;
    
        // Push a la primera mitad de los caracteres en la pila
        for (int i = 0; i < mid; i++) {
            stack.push(text.charAt(i));
        }
    
        // Saltar la mitad si la longitud es impar
        if (length % 2 != 0) {
            mid++;
        }
    
        // Comparar la segunda mitad con los caracteres en la pila
        for (int i = mid; i < length; i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }
    
        return stack.isEmpty();
    }
    
}
