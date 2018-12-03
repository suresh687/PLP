package com.cg.capgstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capgstore.dao.CapgStoreDao;
import com.cg.capgstore.dto.StoreDTO;


@Service("service")
@Transactional
public class CapgStoreServiceImpl implements CapgStoreService {
	@Autowired
	CapgStoreDao repo;

	@Override
	public List<StoreDTO> getAllProducts(Integer cat) {
		// TODO Auto-generated method stub
		return repo.getAllProducts(cat);
	}

	@Override
	public List<StoreDTO> sort(int i, int a) {
		// TODO Auto-generated method stub
		return repo.sort(i,a);
	}

	

}
