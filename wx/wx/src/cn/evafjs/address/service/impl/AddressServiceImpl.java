package cn.evafjs.address.service.impl;

import java.util.List;

import cn.evafjs.address.dao.AddressDao;
import cn.evafjs.address.dao.impl.AddressDaoImpl;
import cn.evafjs.address.domain.Address;
import cn.evafjs.address.service.AddressService;

public class AddressServiceImpl implements AddressService {
	private AddressDao addressDao = new AddressDaoImpl();
	@Override
	public List<Address> findAddrByUid(int uid) {
		List<Address> list = addressDao.findAddrByUid(uid);
		return list;
	}
	@Override
	public Address findAddressByAid(String aid) {
		Address address = addressDao.findAddressByAid(aid);
		return address;
		
	}
	@Override
	public void deleteAddressByAid(String aid) {
		Address address = addressDao.findAddressByAid(aid);
		//假删除  false为删除
		address.setStatus(false);
		addressDao.updateAddress(address);
		
	}
	
	@Override
	public void addAddress(Address address) {
		address.setStatus(true);
		addressDao.addAddress(address);
		
	}
	@Override
	public void updateAddress(Address address) {
		addressDao.updateAddress(address);
	}

}
