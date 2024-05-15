import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    private Map<String, String> userDatabase; // Declaração de variável para armazenar os dados do usuário

    // Método construtor para inicializar a tela de login e adicionar alguns usuários de teste ao banco de dados
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    // Método para verificar se o usuário está registrado e se a senha fornecida está correta
    public boolean login(String username, String password) {
        // Verifica se o nome de usuário está presente no banco de dados
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username); // Obtém a senha armazenada para o usuário
            if (storedPassword.equals(password)) { // Compara a senha fornecida com a senha armazenada
                return true; // Retorna verdadeiro se as senhas coincidirem
            }
        }
        return false; // Retorna falso se o usuário não for encontrado ou a senha estiver incorreta
    }

    // Método para adicionar um novo usuário ao banco de dados
    public void addUser(String username, String password) {
        userDatabase.put(username, password); // Adiciona o novo usuário ao banco de dados
    }
}