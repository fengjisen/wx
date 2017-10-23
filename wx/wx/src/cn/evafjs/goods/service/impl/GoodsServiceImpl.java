package cn.evafjs.goods.service.impl;

import java.util.List;

import cn.evafjs.goods.dao.GoodsDao;
import cn.evafjs.goods.dao.impl.GoodsDaoImpl;
import cn.evafjs.goods.domain.Goods;
import cn.evafjs.goods.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	private GoodsDao goodsDao = new GoodsDaoImpl();
	@Override
	public List<Goods> findAllGoods() {
		List<Goods> list = goodsDao.findAllGoods();
		return list;
		
	}

	@Override
	public Goods findGoodsByGid(String gid) {
		Goods goods = goodsDao.findGoodsByGid(gid);
		return goods;
	}

	@Override
	public void addGoods(Goods goods) {
		//status中true表示上架 false表示下架
		goods.setStatus(true);
		goodsDao.addGoods(goods);
	}

	@Override
	public void deleteGoods(String gid) {
		goodsDao.deleteGoods(gid);
	}

	@Override
	public void underGoods(String gid) {
		// TODO Auto-generated method stub
		Goods goods = goodsDao.findGoodsByGid(gid);
		//false代表下架
		goods.setStatus(false);
		goodsDao.updateGoods(goods);
	}

	@Override
	public void updateGoods(Goods goods) {
		goodsDao.updateGoods(goods);
	}

	@Override
	public List<Goods> findAllUpGoods() {
		List<Goods> list = goodsDao.findAllUpGoods();
		return list;
	}

	@Override
	public List<Goods> findAllUnderGoods() {
		List<Goods> list = goodsDao.findAllUnderGoods();
		return list;
	}

}
