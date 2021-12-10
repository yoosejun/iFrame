package com.cen.member.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cen.member.model.MemberVo;
import com.cen.member.service.MemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	public static final Logger logger=LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	//회원가입 페이지 이동
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public void joinGet(HttpSession session, Model model) {
		logger.info("회원가입 페이지 이동");
		//TODO:페이지 이동
	}
	
	//회원가입
	@RequestMapping(value="/joinCtr.do", method=RequestMethod.POST)
	public void joinPost(MemberVo memberVo) {
		logger.info("join 이동."+memberVo+"회원추가");
		memberService.memberInsertOne(memberVo);
		//TODO:return "redirect:.."
	}
}
