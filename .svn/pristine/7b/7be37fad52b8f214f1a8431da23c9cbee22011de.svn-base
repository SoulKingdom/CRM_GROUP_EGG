package net.wanho.service.product.impl;

import java.util.List;

import net.wanho.dao.product.StoreDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.Store;
import net.wanho.service.product.StoreServiceI;

public class StoreServiceImpl implements StoreServiceI {
	StoreDaoI storeDaoI = (StoreDaoI) ObjectFactory.getObject("StoreDaoI");
	@Override
	public int add(Store store) {
		return storeDaoI.insert(store);
	}

	@Override
	public int remove(Integer id) {
		return storeDaoI.delete(id);
	}

	@Override
	public int modify(Store info) {
		return storeDaoI.update(info);
	}

	@Override
	public Store queryById(Integer id) {
		return storeDaoI.selectById(id);
	}

	@Override
	public List<Store> queryAll() {
		return storeDaoI.selectAll();
	}

}
