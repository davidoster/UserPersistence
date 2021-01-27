/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpersistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import userpersistence.entities.User;

/**
 *
 * @author mac
 */
public class UserPersistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String persistenceUnit = "UserPersistencePU";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
        EntityManager em = emf.createEntityManager();
        
        User user = new User();
        
        user.setUsername("gkpaaaa");
        user.setPassword("gkppassaaaa");
//        System.out.println("before:" + user);

        /* INSERT */
//        em.getTransaction().begin();
//        em.persist(user);
//        em.getTransaction().commit();
//        System.out.println(user);
        /* END OF INSERT *?
        
        /* DELETE */
//        em.getTransaction().begin();
//        user = em.find(User.class, new Long(1));
//        em.remove(user);
//        em.getTransaction().commit();
        /* END OF DELETE */

 /* UPDATE */
        em.getTransaction().begin();
        user = em.find(User.class, new Long(7));
        user.setUsername("DDDD");
        user.setPassword("EEEE");
        em.getTransaction().commit();
        /* END OF UPDATE */
    }
    
}
