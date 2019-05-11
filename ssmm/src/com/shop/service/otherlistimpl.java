package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.OtherMapper;
import com.shop.domain.Other;
import com.shop.domain.OtherExample;
@Service
public class otherlistimpl implements otherlist {
	@Autowired
	private OtherMapper othermap;
	@Override
	public List<Other> otherlist() {
		OtherExample example=new OtherExample();
		List<Other> selectByExample = othermap.selectByExample(example);
		
		return selectByExample;
	}

}
