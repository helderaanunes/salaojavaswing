/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.salaodesktop.modelo.dao.UsuarioPermissaoDAO;
import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.dao.UsuarioDAO;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;
import br.com.cafi.salaodesktop.modelo.entidades.UsuarioPermissao;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Aluno
 */
public class UsuarioPermissaoBO {
    private UsuarioPermissaoDAO dao;
     
    private SimpleEntityManager simpleEntityManager= new SimpleEntityManager("HELDERnomeDoPersistence");
     
    public UsuarioPermissaoBO(){        
         this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new UsuarioPermissaoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void save(UsuarioPermissao obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(UsuarioPermissao obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public List<UsuarioPermissao> findAll(){
        return dao.findAll();
    }

    public boolean usuarioPossuiPermissao(Usuario usuarioLogado, String permissao) {
    Query query = dao.getEntityManager().createQuery(
                "From UsuarioPermissao where permissao_id "
                + "in (select id from Permissao where descricao = ?1) "
                + "and usuario_id = ?2"
        );
        query.setParameter(1, permissao);
        query.setParameter(2, usuarioLogado.getId());
        System.out.println(query.toString());
        try {
            UsuarioPermissao up = (UsuarioPermissao) query.getSingleResult();
            return up!=null;
        } catch (NoResultException e) {
            e.printStackTrace();
            return false;
        }
    }
}