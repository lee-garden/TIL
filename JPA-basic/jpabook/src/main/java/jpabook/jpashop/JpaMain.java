package jpabook.jpashop;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Child;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Parent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            List<Member> memberList = em.createQuery(
                    "select m from Member m where m.name like '%kim%'",
                    Member.class
            ).getResultList();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
