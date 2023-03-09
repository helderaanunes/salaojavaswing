
import bo.UsuarioBO;
import br.com.cafi.salaodesktop.modelo.dao.DAO;
import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;

public class Teste {

    public static void main(String[] args) {
        String persistenceUnitName = "HELDERnomeDoPersistence";
         
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        /**
         * THE SERVICE LAYER ENCAPSULATES EVERY BEGIN/COMMIT/ROLLBACK
         */
        UsuarioBO costumerService = new UsuarioBO(simpleEntityManager);
         
        for(Usuario c : costumerService.findAll()){
            System.out.println(c.getNome());
        }
         
        simpleEntityManager.close();
    }
}
