package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // EntityManagerFactory 는 어플리케이션당 하나
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        // JPA 의 모든 데이터 변경은 트랜잭션 안에서 일어나야 한다.
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            회원 등록
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HellloB");
//
//            em.persist(member);

//            회원 조회
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//          JPQL
            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .getResultList();

            // 영속성 컨텍스트의 detach, clear, close에 대한 이해
            // detach = > 영속성 컨텍스트로의 분리
            // clear = > 영속성 컨텍스트 비우기
            // close = > 영속성 컨텍스트 종료
            Member member1 = em.find(Member.class, 1L); // 쿼리 한번 나가고
            em.clear();
            Member member2 = em.find(Member.class, 1L); // 쿼리 한번 또나감

            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }
//            em.close();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
