/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.UserAccount;

/**
 *
 * @author atan
 */
@Stateless
public class UserFacade extends AbstractFacade<UserAccount> {
    @PersistenceContext(unitName = "ninjamatchPU")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(UserAccount.class);
    }

    
}
