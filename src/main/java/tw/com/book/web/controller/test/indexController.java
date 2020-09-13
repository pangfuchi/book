package tw.com.book.web.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.book.entity.Member;
import tw.com.book.service.MemberService;

@Controller
@RequestMapping("/")
public class indexController {
	@Autowired
	public MemberService memberService;
	
	@GetMapping(value = "new")
    public String hello() {
		return"index";
    }
	
	@GetMapping(value = "test")
    public String test() {
		return"layout/layout-standard";
    }
	
	@GetMapping(value = "layoutTest")
    public String layoutTest() {
		return"content";
    }
	
	@GetMapping(value = "get")
	@ResponseBody
	public Member getMember() {
		Member member = new Member();
		member = memberService.getMember(1);
		System.err.println("member : " + member);
		return member;
	}
	
	@GetMapping(value = "getNotDb")
	@ResponseBody
	public Member getMemberNotDB() {
		Member member = new Member();
		member = memberService.getMemberNotDB();
		System.err.println("memberNotDB : " + member);
		return member;
	}
}
