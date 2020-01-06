package com.huangzhen.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangzhen.bean.Goods;
import com.huangzhen.service.GoodsService;

@Controller
public class MyController {

	@Resource
	private GoodsService gservice;

	@RequestMapping("list")
	public String selAll(Model model, @RequestParam(defaultValue = "1") int pageNum, String guan, String miaoshu, String name, String chan, String addr, Integer money,
			String startd, String yeard, String statc) {
		int pageSize = 3;
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("guan", guan);
		map.put("miaoshu", miaoshu);
		map.put("name", name);
		map.put("chan", chan);
		map.put("addr", addr);
		map.put("money", money);
		map.put("startd", startd);
		map.put("yeard", yeard);
		map.put("statc", statc);
		List<Goods> list = gservice.selAll(map);
		
		PageInfo<Goods> plist = new PageInfo<Goods>(list);
		model.addAttribute("plist", plist);
		return "list";
	}
	
	@RequestMapping("selOne")
	public String selOne(int id,Model model){
		Goods one = gservice.selOne(id);
		model.addAttribute("goods", one);
		return "update";
		
	}
}
