package jpabook.jpashop;

import jpabook.jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member1 = new Member();
            member1.setName("hello");

            em.persist(member1);

            em.flush();
            em.clear();

            Member reference = em.getReference(Member.class, member1.getId());

            System.out.println("reference : " + reference.getName());
            System.out.println("isLoaded : " + emf.getPersistenceUnitUtil().isLoaded(reference));
        } catch (Exception e) {
            System.out.println("exception!");
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
