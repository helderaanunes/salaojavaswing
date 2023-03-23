
import bo.UsuarioBO;
import br.com.cafi.salaodesktop.modelo.dao.DAO;
import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;

public class Teste {

    public static void main(String[] args) {
        UsuarioBO bo = new UsuarioBO();
        Usuario u =
        bo.getUsuarioByLoginSenha("Manu", "1234");
        System.out.println(u.getNome());
    }
}
