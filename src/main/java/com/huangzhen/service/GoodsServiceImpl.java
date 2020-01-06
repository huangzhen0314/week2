package com.huangzhen.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huangzhen.bean.Goods;
import com.huangzhen.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper gmapper;

	public int add(Goods g) {
		int i = gmapper.add(g);
		return i;
	}

	public List<Goods> selAll(Map<String, Object> map) {
		List<Goods> list = gmapper.selAll(map);
		return list;
	}

	public Goods selOne(int id) {
		Goods one = gmapper.selOne(id);
		return one;
	}

}
