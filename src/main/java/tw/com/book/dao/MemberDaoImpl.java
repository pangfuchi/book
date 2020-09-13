package tw.com.book.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tw.com.book.entity.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Member getMember(Integer memberId) {
		return sessionFactory.getCurrentSession().get(Member.class, memberId);
	}
}
