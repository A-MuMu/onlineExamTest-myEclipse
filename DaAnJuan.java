package rainbow.example.domain;

// default package

import java.sql.Time;

/**
 * DaAnJuan entity. @author MyEclipse Persistence Tools
 */

public class DaAnJuan implements java.io.Serializable {

	// Fields

	private Long daJuan;
	private ShiJuan shiJuan;
	private Long idStu;
	private String xuanze1;
	private String xuanze2;
	private String xuanze3;
	private String xuanze4;
	private String xuanze5;
	private String xuanze6;
	private String xuanze7;
	private String xuanze8;
	private String xuanze9;
	private String xuanze10;
	private String pangduan1;
	private String pangduan2;
	private String pangduan3;
	private String pangduan4;
	private String pangduan5;
	private String pangduan6;
	private String pangduan7;
	private String pangduan8;
	private String pangduan9;
	private String pangduan10;
	private String zhuguan1;
	private String zhuguan2;
	private String zhuguan3;
	private Integer zuZhuFenShu;
	private Integer zongFen;
	private Time firstTime;
	private Time lastTime;

	// Constructors

	/** default constructor */
	public DaAnJuan() {
	}

	/** minimal constructor */
	public DaAnJuan(ShiJuan shiJuan, Time firstTime, Time lastTime) {
		this.shiJuan = shiJuan;
		this.firstTime = firstTime;
		this.lastTime = lastTime;
	}

	/** full constructor */
	public DaAnJuan(ShiJuan shiJuan, Long idStu, String xuanze1,
			String xuanze2, String xuanze3, String xuanze4, String xuanze5,
			String xuanze6, String xuanze7, String xuanze8, String xuanze9,
			String xuanze10, String pangduan1, String pangduan2,
			String pangduan3, String pangduan4, String pangduan5,
			String pangduan6, String pangduan7, String pangduan8,
			String pangduan9, String pangduan10, String zhuguan1,
			String zhuguan2, String zhuguan3, Integer zuZhuFenShu,
			Integer zongFen, Time firstTime, Time lastTime) {
		this.shiJuan = shiJuan;
		this.idStu = idStu;
		this.xuanze1 = xuanze1;
		this.xuanze2 = xuanze2;
		this.xuanze3 = xuanze3;
		this.xuanze4 = xuanze4;
		this.xuanze5 = xuanze5;
		this.xuanze6 = xuanze6;
		this.xuanze7 = xuanze7;
		this.xuanze8 = xuanze8;
		this.xuanze9 = xuanze9;
		this.xuanze10 = xuanze10;
		this.pangduan1 = pangduan1;
		this.pangduan2 = pangduan2;
		this.pangduan3 = pangduan3;
		this.pangduan4 = pangduan4;
		this.pangduan5 = pangduan5;
		this.pangduan6 = pangduan6;
		this.pangduan7 = pangduan7;
		this.pangduan8 = pangduan8;
		this.pangduan9 = pangduan9;
		this.pangduan10 = pangduan10;
		this.zhuguan1 = zhuguan1;
		this.zhuguan2 = zhuguan2;
		this.zhuguan3 = zhuguan3;
		this.zuZhuFenShu = zuZhuFenShu;
		this.zongFen = zongFen;
		this.firstTime = firstTime;
		this.lastTime = lastTime;
	}

	// Property accessors

	public Long getDaJuan() {
		return this.daJuan;
	}

	public void setDaJuan(Long daJuan) {
		this.daJuan = daJuan;
	}

	public ShiJuan getShiJuan() {
		return this.shiJuan;
	}

	public void setShiJuan(ShiJuan shiJuan) {
		this.shiJuan = shiJuan;
	}

	public Long getIdStu() {
		return this.idStu;
	}

	public void setIdStu(Long idStu) {
		this.idStu = idStu;
	}

	public String getXuanze1() {
		return this.xuanze1;
	}

	public void setXuanze1(String xuanze1) {
		this.xuanze1 = xuanze1;
	}

	public String getXuanze2() {
		return this.xuanze2;
	}

	public void setXuanze2(String xuanze2) {
		this.xuanze2 = xuanze2;
	}

	public String getXuanze3() {
		return this.xuanze3;
	}

	public void setXuanze3(String xuanze3) {
		this.xuanze3 = xuanze3;
	}

	public String getXuanze4() {
		return this.xuanze4;
	}

	public void setXuanze4(String xuanze4) {
		this.xuanze4 = xuanze4;
	}

	public String getXuanze5() {
		return this.xuanze5;
	}

	public void setXuanze5(String xuanze5) {
		this.xuanze5 = xuanze5;
	}

	public String getXuanze6() {
		return this.xuanze6;
	}

	public void setXuanze6(String xuanze6) {
		this.xuanze6 = xuanze6;
	}

	public String getXuanze7() {
		return this.xuanze7;
	}

	public void setXuanze7(String xuanze7) {
		this.xuanze7 = xuanze7;
	}

	public String getXuanze8() {
		return this.xuanze8;
	}

	public void setXuanze8(String xuanze8) {
		this.xuanze8 = xuanze8;
	}

	public String getXuanze9() {
		return this.xuanze9;
	}

	public void setXuanze9(String xuanze9) {
		this.xuanze9 = xuanze9;
	}

	public String getXuanze10() {
		return this.xuanze10;
	}

	public void setXuanze10(String xuanze10) {
		this.xuanze10 = xuanze10;
	}

	public String getPangduan1() {
		return this.pangduan1;
	}

	public void setPangduan1(String pangduan1) {
		this.pangduan1 = pangduan1;
	}

	public String getPangduan2() {
		return this.pangduan2;
	}

	public void setPangduan2(String pangduan2) {
		this.pangduan2 = pangduan2;
	}

	public String getPangduan3() {
		return this.pangduan3;
	}

	public void setPangduan3(String pangduan3) {
		this.pangduan3 = pangduan3;
	}

	public String getPangduan4() {
		return this.pangduan4;
	}

	public void setPangduan4(String pangduan4) {
		this.pangduan4 = pangduan4;
	}

	public String getPangduan5() {
		return this.pangduan5;
	}

	public void setPangduan5(String pangduan5) {
		this.pangduan5 = pangduan5;
	}

	public String getPangduan6() {
		return this.pangduan6;
	}

	public void setPangduan6(String pangduan6) {
		this.pangduan6 = pangduan6;
	}

	public String getPangduan7() {
		return this.pangduan7;
	}

	public void setPangduan7(String pangduan7) {
		this.pangduan7 = pangduan7;
	}

	public String getPangduan8() {
		return this.pangduan8;
	}

	public void setPangduan8(String pangduan8) {
		this.pangduan8 = pangduan8;
	}

	public String getPangduan9() {
		return this.pangduan9;
	}

	public void setPangduan9(String pangduan9) {
		this.pangduan9 = pangduan9;
	}

	public String getPangduan10() {
		return this.pangduan10;
	}

	public void setPangduan10(String pangduan10) {
		this.pangduan10 = pangduan10;
	}

	public String getZhuguan1() {
		return this.zhuguan1;
	}

	public void setZhuguan1(String zhuguan1) {
		this.zhuguan1 = zhuguan1;
	}

	public String getZhuguan2() {
		return this.zhuguan2;
	}

	public void setZhuguan2(String zhuguan2) {
		this.zhuguan2 = zhuguan2;
	}

	public String getZhuguan3() {
		return this.zhuguan3;
	}

	public void setZhuguan3(String zhuguan3) {
		this.zhuguan3 = zhuguan3;
	}

	public Integer getZuZhuFenShu() {
		return this.zuZhuFenShu;
	}

	public void setZuZhuFenShu(Integer zuZhuFenShu) {
		this.zuZhuFenShu = zuZhuFenShu;
	}

	public Integer getZongFen() {
		return this.zongFen;
	}

	public void setZongFen(Integer zongFen) {
		this.zongFen = zongFen;
	}

	public Time getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(Time firstTime) {
		this.firstTime = firstTime;
	}

	public Time getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Time lastTime) {
		this.lastTime = lastTime;
	}

}