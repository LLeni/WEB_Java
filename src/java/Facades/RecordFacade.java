/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Record;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author LLeni
 */
@Stateless
public class RecordFacade extends AbstractFacade<Record> {

    @PersistenceContext(unitName = "JoyRoomsServer2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecordFacade() {
        super(Record.class);
    }
    
    public List<Record> find(String approximate_date_record){
        Query query = em.createNativeQuery("SELECT profile.login_profile, record.link_demo_record\n" +
                                "FROM record INNER JOIN profile ON record.id_profile = profile.id_profile\n" +
                                "WHERE date_record BETWEEN TO_DATE('01.' || EXTRACT(MONTH FROM ?) || '.' ||  EXTRACT(YEAR FROM ?), 'DD.MM.YYYY') AND TO_DATE('30.' || EXTRACT(MONTH FROM ?) || '.' ||  EXTRACT(YEAR FROM ?), 'DD.MM.YYYY');", Record.class);
        query.setParameter(1, approximate_date_record);
        query.setParameter(2, approximate_date_record);
        query.setParameter(3, approximate_date_record);
        query.setParameter(4, approximate_date_record);
        List<Record> result = query.getResultList();
        return result;
    }
        
}
