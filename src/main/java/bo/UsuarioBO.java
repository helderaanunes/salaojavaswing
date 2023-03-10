/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.dao.UsuarioDAO;
import br.com.cafi.salaodesktop.modelo.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class UsuarioBO {
    private UsuarioDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public UsuarioBO(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new UsuarioDAO(simpleEntityManager.getEntityManager());
    }
     
    public void save(Usuario usuario){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(usuario);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
     
    public List<Usuario> findAll(){
        return dao.findAll();
    }
}
