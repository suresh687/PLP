package com.cg.capgstore.service;

import java.util.List;

import com.cg.capgstore.dto.StoreDTO;

public interface CapgStoreService {

	List<StoreDTO> getAllProducts(Integer cat);

List<StoreDTO> sort(int i, int a);

}
