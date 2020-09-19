package vega2k.boot.jparelation.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MemberRunner implements ApplicationRunner {
	@Autowired
	private MemberService memberService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Member member = new Member();
		member.setName("Lee Lims");
		member.addPhone(new Phone("010-ZZZZ-ZZZZ"));
		
		//--> 등록되게 하려면 아래 주석을 제거해야 합니다.
		//Long saveId = memberService.join(member);
		
		Member first = new Member("Jung Chuls"); // (1)
		first.addPhone(new Phone("010-XXXX-XXXX"));
		first.addPhone(new Phone("010-YYYY-YYYY"));	
		//memberService.join(first);
		
		Member third = new Member("Minis"); // (2)
		//memberService.join(third);
		
		List<Member> listMembers = memberService.findMembers();
		for (Member mem : listMembers) {
			System.out.println(mem);
		}
	}

}
