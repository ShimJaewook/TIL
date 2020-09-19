package vega2k.boot.jparelation.member;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MemberClassRepository {
	@PersistenceContext
	private EntityManager em;

	public void save(Member member) {
		em.persist(member);
	}

	public Member findOne(Long id) {
		return em.find(Member.class, id);
	}

	public List<Member> findAll() {
		return em.createQuery("select m from Member m join fetch m.phone", Member.class).getResultList();
	}
	
	public List<Member> findByName(String name) {
		return em.createQuery("select m from Member m join fetch m.phone where m.name = :name", Member.class).setParameter("name", name)
				.getResultList();
	}
}
