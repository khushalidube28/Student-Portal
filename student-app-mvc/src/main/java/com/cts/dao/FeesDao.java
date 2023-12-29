package com.cts.dao;

import java.util.List;

import com.cts.model.Fees;

public interface FeesDao {
	List getAll();
	Fees getById(int id);
	void addFees(Fees fees);
	void updateFees(Fees fees);
	void deleteFees(int id);
	List getPaidfees();
	List getUnpaidfees();

}
