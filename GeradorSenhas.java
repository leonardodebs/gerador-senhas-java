import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento da senha: ");
        int comprimento = scanner.nextInt();
        scanner.close();
        
        String senha = gerarSenha(comprimento);
        System.out.println("Senha gerada: " + senha);
    }
    
    public static String gerarSenha(int comprimento) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(index));
        }
        
        return senha.toString();
    }
}
