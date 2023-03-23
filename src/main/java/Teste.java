
import bo.UsuarioBO;
import br.com.cafi.salaodesktop.modelo.dao.DAO;
import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;

public class Teste {

    public static void main(String[] args) {
        UsuarioBO bo = new UsuarioBO();
        Usuario u = new Usuario();
        u.setLogin("joao");
        u.setNome("joao");
        u.setSenha("a");
        u = bo.save(u);
        System.out.println(u.getId());
    }
}
