package com.huangzhen.service;

import java.util.List;
import java.util.Map;

import com.huangzhen.bean.Goods;

public interface GoodsService {

	public int add(Goods g);

	public List<Goods> selAll(Map<String, Object> map);
	
	public Goods selOne(int id);
}
