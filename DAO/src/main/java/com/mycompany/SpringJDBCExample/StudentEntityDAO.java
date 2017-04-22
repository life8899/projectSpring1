/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringJDBCExample;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class StudentEntityDAO {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(StudentEntityDAO guest) {
        em.persist(guest);
    }
 
    // Retrieves all the guests:
    public List<StudentEntityDAO> getAllGuests() {
        TypedQuery<StudentEntityDAO> query = em.createQuery(
            "SELECT g FROM Guest g ORDER BY g.id", StudentEntityDAO.class);
        return query.getResultList();
    }
}
