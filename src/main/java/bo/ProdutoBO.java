/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.salaodesktop.modelo.dao.ProdutoDAO;
import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.entidades.Produto;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProdutoBO {
    private ProdutoDAO dao;
     
    private SimpleEntityManager simpleEntityManager= new SimpleEntityManager("HELDERnomeDoPersistence");
     
    public ProdutoBO(){        
        dao = new ProdutoDAO();
    }
     
    public void save(Produto obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(Produto obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public List<Produto> findAll(){
        return dao.findAll();
    }
}