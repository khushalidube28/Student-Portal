package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.FeesDao;
import com.cts.model.Fees;

@Service
public class FeesServiceImpl implements FeesService {
	
	
	@Autowired
	private FeesDao feesDao;
	
	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return feesDao.getAll();
	}

	@Override
	public Fees getById(int id) {
		// TODO Auto-generated method stub
		return feesDao.getById(id);
	}

	@Override
	public void addFees(Fees fees) {
		// TODO Auto-generated method stub
		feesDao.addFees(fees);
		
	}

	@Override
	public void updateFees(Fees fees) {
		// TODO Auto-generated method stub
		feesDao.updateFees(fees);
		
	}

	@Override
	public void deleteFees(int id) {
		// TODO Auto-generated method stub
		feesDao.deleteFees(id);
		
	}

	@Override
	public List getPaidfees() {
		// TODO Auto-generated method stub
		return feesDao.getPaidfees();
	}

	@Override
	public List getUnpaidfees() {
		// TODO Auto-generated method stub
		return feesDao.getUnpaidfees();
	}
	
	

}
