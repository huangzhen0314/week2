package com.huangzhen.bean;

public class Goods {

	private int id;
	private String guan;
	private String miaoshu;
	private String name;
	private String chan;
	private String addr;
	private Integer money;

	private String startd;
	private String yeard;

	private String statc;

	private String beizhu;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int id, String guan, String miaoshu, String name, String chan, String addr, Integer money,
			String startd, String yeard, String statc, String beizhu) {
		super();
		this.id = id;
		this.guan = guan;
		this.miaoshu = miaoshu;
		this.name = name;
		this.chan = chan;
		this.addr = addr;
		this.money = money;
		this.startd = startd;
		this.yeard = yeard;
		this.statc = statc;
		this.beizhu = beizhu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuan() {
		return guan;
	}

	public void setGuan(String guan) {
		this.guan = guan;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChan() {
		return chan;
	}

	public void setChan(String chan) {
		this.chan = chan;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getStartd() {
		return startd;
	}

	public void setStartd(String startd) {
		this.startd = startd;
	}

	public String getYeard() {
		return yeard;
	}

	public void setYeard(String yeard) {
		this.yeard = yeard;
	}

	public String getStatc() {
		return statc;
	}

	public void setStatc(String statc) {
		this.statc = statc;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", guan=" + guan + ", miaoshu=" + miaoshu + ", name=" + name + ", chan=" + chan
				+ ", addr=" + addr + ", money=" + money + ", startd=" + startd + ", yeard=" + yeard + ", statc=" + statc
				+ ", beizhu=" + beizhu + "]";
	}

}
