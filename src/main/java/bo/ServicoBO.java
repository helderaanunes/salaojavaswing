/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.salaodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.salaodesktop.modelo.dao.ServicoDAO;
import br.com.cafi.salaodesktop.modelo.entidades.Servico;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ServicoBO {

    private ServicoDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public ServicoBO() {
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new ServicoDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Servico obj) {
        try {
            simpleEntityManager.beginTransaction();

            dao.save(obj);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void delete(Servico obj) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public Servico getById(Long id) {
        return dao.getById(id);
    }

    public List<Servico> findAll() {
        return dao.findAll();
    }

    public void update(Servico obj) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(obj);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
}
