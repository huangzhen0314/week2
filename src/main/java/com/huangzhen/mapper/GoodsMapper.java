package com.huangzhen.mapper;

import java.util.List;
import java.util.Map;

import com.huangzhen.bean.Goods;

public interface GoodsMapper {

	public int add(Goods g);

	public List<Goods> selAll(Map<String, Object> map);

	public Goods selOne(int id);
}
