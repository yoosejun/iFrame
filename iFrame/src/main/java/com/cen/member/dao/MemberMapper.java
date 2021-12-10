package com.cen.member.dao;

import com.cen.member.model.MemberVo;

public interface MemberMapper {

	//회원가입
	public int memberInsertOne(MemberVo memberVo);
}
