package cn.evafjs.goods.dao;

import java.util.List;

import cn.evafjs.goods.domain.Goods;

public interface GoodsDao {

	List<Goods> findAllGoods();
	
	List<Goods> findAllUnderGoods();
	
	List<Goods> findAllUpGoods();

	Goods findGoodsByGid(String gid);

	void addGoods(Goods goods);

	void deleteGoods(String gid);

	void updateGoods(Goods goods);

}
