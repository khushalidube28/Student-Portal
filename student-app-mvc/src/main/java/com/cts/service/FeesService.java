package com.cts.service;

import java.util.List;

import com.cts.model.Fees;

public interface FeesService {
	List getAll();
	Fees getById(int id);
	void addFees(Fees fees);
	void updateFees(Fees fees);
	void deleteFees(int id);
	List getPaidfees();
	List getUnpaidfees();

}
