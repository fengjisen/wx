package cn.evafjs.address.service;

import java.util.List;

import cn.evafjs.address.domain.Address;

public interface AddressService {

	List<Address> findAddrByUid(int uid);

	Address findAddressByAid(String aid);

	void deleteAddressByAid(String aid);

	void addAddress(Address address);

	void updateAddress(Address address);

}
