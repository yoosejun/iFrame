package com.cen.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cen.member.dao.MemberMapper;
import com.cen.member.model.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberMapper memberMapper;

	@Override
	public int memberInsertOne(MemberVo memberVo) {
		// TODO Auto-generated method stub
		return memberMapper.memberInsertOne(memberVo);
	}
}
