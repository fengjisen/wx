package cn.evafjs.address.dao;

import java.util.List;

import cn.evafjs.address.domain.Address;

public interface AddressDao {

	List<Address> findAddrByUid(int uid);
	Address findAddressByAid(String aid);
	void updateAddress(Address address);
	void addAddress(Address address);
}
