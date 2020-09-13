package tw.com.book.service;

import tw.com.book.entity.Member;

public interface MemberService {
	public Member getMember(Integer memberId);
	
	public Member getMemberNotDB();
}
