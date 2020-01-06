package huangzhen_cmsweek2;

import java.math.BigInteger;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.huangzhen.bean.Goods;
import com.huangzhen.mapper.GoodsMapper;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsMapper mapper = ac.getBean(GoodsMapper.class);
		List<Object[]> list = IOUtils.readFile("a.txt", "\t");
		for (Object[] objects : list) {
			// 30 大冶宏成 设计、制造、销售起重电磁铁、电缆卷筒、永磁吸吊器、永磁除铁器、电磁除铁器、电器控制设备、电磁搅拌器、...
			// 大冶宏成机械设备有限公司
			// 设计、制造、销售起重电磁铁、电缆卷筒、永磁吸吊器、永磁除铁器、电磁除铁器、电器控制设备、电磁搅拌器、...
			// 岳阳市南湖新区求索西路（市电业局变电所5栋） 500 2004-05-31 未年检
			// objects[0]是id ob[1]是关键字
			boolean b = StringUtil.isNumber(objects[0] + "");
	
			/**
			 * keywords 、description、公司名称、主营产品、地址要使用 hasText()方法判断有没有值。（3分）
			 * 
			 */
			boolean empty = StringUtil.isEmpty(objects[1] + "");
			boolean empty2 = StringUtil.isEmpty(objects[2] + "");
			boolean empty3 = StringUtil.isEmpty(objects[3] + "");
			boolean empty4 = StringUtil.isEmpty(objects[4] + "");

			boolean empty5 = StringUtil.isEmpty(objects[5] + "");
			/**
			 * 注册资本要使用hasText()方法判断有没有值，并使用 isNumber()判断是不是数字（3分）
			 * 
			 * 
			 */

			boolean c = StringUtil.isEmpty(objects[6] + "");

			StringUtil.isNumber(objects[6] + "");
			/**
			 * 成立时间要使用hasText()方法判断有没有值,判断是不是日期 类型（3分）
			 * 
			 * 
			 * 
			 */
			StringUtil.isEmpty(objects[7] + "");		

			if (c) {
				Goods goods = new Goods(0, objects[1] + "", objects[2] + "", objects[3] + "", objects[4] + "",
						objects[5] + "", 0, objects[7] + "", objects[8] + "",
						objects[9] + "", objects[10] + "");
				mapper.add(goods);
			} else {
				Goods goods = new Goods(0, objects[1] + "", objects[2] + "", objects[3] + "", objects[4] + "",
						objects[5] + "", Integer.parseInt(objects[6] + ""), objects[7] + "", objects[8] + "",
						objects[9] + "", objects[10] + "");
			
				mapper.add(goods);
			}

		}
	}
}
