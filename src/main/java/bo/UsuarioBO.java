/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.dao.UsuarioDAO;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Aluno
 */
public class UsuarioBO {

    private UsuarioDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public UsuarioBO() {
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new UsuarioDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Usuario usuario) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(usuario);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void update(Usuario usuario) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(usuario);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Usuario> findAll() {
        return dao.findAll();
    }

    public void delete(Usuario u) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(u);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public Usuario getById(int id) {
        return dao.getById(id);
    }

    public Usuario getUsuarioByLoginSenha(String login, String senha) {
        Query query = dao.getEntityManager().createQuery(
                "From Usuario where login = ?1 and senha = ?2"
        );
        query.setParameter(1, login);
        query.setParameter(2, senha);
        try {
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
}
