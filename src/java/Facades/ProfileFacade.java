/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Profile;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LLeni
 */
@Stateless
public class ProfileFacade extends AbstractFacade<Profile> {

    @PersistenceContext(unitName = "JoyRoomsServer2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfileFacade() {
        super(Profile.class);
    }
    
}
