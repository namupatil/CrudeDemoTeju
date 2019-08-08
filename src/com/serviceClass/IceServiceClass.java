package com.serviceClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoInterface.IceDaoInterface;
import com.model.Icecreame;
import com.serviceInterface.IceServiceInterface;

@Transactional
@Service
public class IceServiceClass implements IceServiceInterface {

	@Autowired
	
	IceDaoInterface iceDaoInterface;
	
	@Override
	public void saveIcecreame(Icecreame icecreame) {
		// TODO Auto-generated method stub
		iceDaoInterface.saveIcecreame(icecreame);
	}

	
}
