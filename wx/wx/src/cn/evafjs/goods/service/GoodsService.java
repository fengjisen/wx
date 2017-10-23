package cn.evafjs.goods.service;

import java.util.List;

import cn.evafjs.goods.domain.Goods;

public interface GoodsService {
	List<Goods> findAllGoods();
	
	List<Goods> findAllUpGoods();
	
	List<Goods> findAllUnderGoods();
	
	Goods findGoodsByGid(String gid);
	
	void addGoods(Goods goods);
	
	void deleteGoods(String gid);
	
	void underGoods(String gid);
	
	void updateGoods(Goods goods);
}
