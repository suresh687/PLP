package com.cg.capgstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.capgstore.dto.StoreDTO;

@Repository("repo")
public class CapgStoreDaoImpl implements CapgStoreDao {
	@PersistenceContext
	EntityManager manager;

	@Override
	public List<StoreDTO> getAllProducts(Integer cat) {
		// TODO Auto-generated method stub
		Query q=manager.createQuery("from StoreDTO where categoryId=:category");
		q.setParameter("category",cat);
		List<StoreDTO> myAll = q.getResultList();
		//System.out.println(myAll);
		return myAll;
	}

	@Override
	public List<StoreDTO> sort(int i, int a) {
		// TODO Auto-generated method stub
		if(a==1)
		{
		Query q=manager.createQuery("from StoreDTO where categoryId=:category order by productName ");
		q.setParameter("category",i);
		List<StoreDTO> myAll = q.getResultList();
		//System.out.println(myAll);
		return myAll;
		}
		else if(a==2)
		{
			Query q=manager.createQuery("from StoreDTO where categoryId=:category order by productName desc ");
			q.setParameter("category",i);
			List<StoreDTO> myAll = q.getResultList();
			//System.out.println(myAll);
			return myAll;
		}
		else if(a==3)
		{
			Query q=manager.createQuery("from StoreDTO where categoryId=:category order by productPrice ");
			q.setParameter("category",i);
			List<StoreDTO> myAll = q.getResultList();
			//System.out.println(myAll);
			return myAll;
		}
		else if(a==4)
		{
			Query q=manager.createQuery("from StoreDTO where categoryId=:category order by productPrice desc ");
			q.setParameter("category",i);
			List<StoreDTO> myAll = q.getResultList();
			//System.out.println(myAll);
			return myAll;
		}
		else return null;
	}

}
