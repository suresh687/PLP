package com.cg.capgstore.dao;

import java.util.List;

import com.cg.capgstore.dto.StoreDTO;

public interface CapgStoreDao {

	List<StoreDTO> getAllProducts(Integer cat);

	List<StoreDTO> sort(int i, int a);

}
