
import br.com.cafi.salaodesktop.modelo.dao.DAO;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;


public class Teste {
    public static void main(String[] args) {
        DAO<Usuario> dao = new DAO<>(Usuario.class);
        Usuario u = new Usuario();
        u.setLogin("klecio");
        u.setNome("klecio");
        u.setSenha("321");
        dao.abrir().create(u).fechar();
    }
}
