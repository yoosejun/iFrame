package com.cen.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cen.member.model.MemberVo;

@Repository
public class MemberMapperImpl implements MemberMapper {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	String nameSpace="com.cen.member.";
	
	@Override
	public int memberInsertOne(MemberVo memberVo) {
		return sqlSession.insert(nameSpace+"memberInsertOne", memberVo);
	}
}
