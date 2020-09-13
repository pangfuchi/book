package tw.com.book.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.com.book.dao.MemberDaoImpl;
import tw.com.book.entity.Member;

/*@Transactional  如果放在Class上方；表示只要存取Service裡的所有method，都會需要connect db*/

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberDaoImpl memberDaoImpl;
	
	/*@Transactional  如果放在method上方；表示只有存取該method，才需要connect db*/
	@Override
	@Transactional  
	public Member getMember(Integer memberId) {
		return memberDaoImpl.getMember(memberId);
	}
	
	@Override 
	public Member getMemberNotDB() {
		Member member = new Member();
		member.setId(1);
		member.setEmail("email");
		return member;
	}
}
