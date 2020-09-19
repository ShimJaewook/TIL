package vega2k.boot.jparelation.member;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import javax.persistence.EntityManager;

import vega2k.boot.jparelation.member.MemberClassRepository;
import vega2k.boot.jparelation.member.MemberService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberTest {
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberClassRepository memberRepository;
	
	@Autowired
	EntityManager em;
	
	@Test
	public void 조회() throws Exception {
		List<Member> listMembers = memberService.findMembers();
		for (Member member : listMembers) {
			System.out.println(member);
		}
	}
	

	@Test  @Ignore
	public void 회원가입() throws Exception {
		//Given
		Member member = new Member();
		member.setName("Lee");
		member.addPhone(new Phone("010-ZZZZ-ZZZZ"));
		Long saveId = memberService.join(member);
		System.out.println(memberRepository.findOne(saveId));
		//Then
		assertEquals(member, memberRepository.findOne(saveId));
		
		Member first = new Member("Jung"); // (1)
		first.addPhone(new Phone("010-XXXX-XXXX"));
		first.addPhone(new Phone("010-YYYY-YYYY"));	
		memberService.join(first);
		
		Member third = new Member("Min"); // (2)
		memberService.join(third);
		
		em.flush();
		
	}

	@Test(expected = IllegalStateException.class) @Ignore
	public void 중복_회원_예외() throws Exception {
		//Given
		Member member1 = new Member();
		member1.setName("kim");
		Member member2 = new Member();
		member2.setName("kim");
		//When
		memberService.join(member1);
		memberService.join(member2); // 예외가 발생해야 한다.
		//Then
		fail("예외가 발생해야 한다.");
	}
}