package jpql;


import javax.persistence.*;
import java.util.List;

public class JpqlMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("관리자");
            member.setAge(10);
            member.setTeam(team);
            member.setMemberType(MemberType.ADMIN);
            em.persist(member);

            em.flush();
            em.clear();
//            CASE 문
//            String query = "select " +
//                                "case when m.age <=10 then '학생요금' " +
//                                "     when m.age >= 60 then '경로요금' " +
//                                "     else '일반요금' end " +
//                           "from Member m";

//            COALESCE
//            String query = "select coalesce(m.username, '이름 없는 회원') from Member m";

//            NULLIF
            String query = "select nullif(m.username, '관리자') as username " +
                    "from Member m";
            List<String> result = em.createQuery(query, String.class)
                    .getResultList();

            for (String s : result) {
                System.out.println("s = " + s);
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
