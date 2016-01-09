package rainbow.example.domain;

// default package

import java.util.Date;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private long id;
	private String name;
	private String pwsTea;
	private String emailTea;
	private String teaId;
	private String namePy;
	private String usedName;
	private String sex;
	private Date bornDate;
	private String country;
	private String mingzu;
	private String zhengzhiMm;
	private String bornWhere;
	private String hunyin;
	private String jiguan;
	private String shenfenId;
	private String jiaoshiId;
	private String xueyuan;
	private String zhuanye;
	private String ruzhiFs;
	private String zhiwei;
	private Date ruzhiDate;
	private String renqi;
	private String zhiweiChange;
	private String zhuyaoChengjiu;
	private String renjiaoXk;
	private String tel;
	private String sushe;
	private String susheTel;
	private String home;
	private String homeTel;
	private String youbian;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(String name, String pwsTea, String emailTea, String teaId,
			String namePy, String usedName, String sex, Date bornDate,
			String country, String mingzu, String zhengzhiMm, String bornWhere,
			String hunyin, String jiguan, String shenfenId, String jiaoshiId,
			String xueyuan, String zhuanye, String ruzhiFs, String zhiwei,
			Date ruzhiDate, String renqi, String zhiweiChange,
			String zhuyaoChengjiu, String renjiaoXk, String tel, String sushe,
			String susheTel, String home, String homeTel, String youbian) {
		this.name = name;
		this.pwsTea = pwsTea;
		this.emailTea = emailTea;
		this.teaId = teaId;
		this.namePy = namePy;
		this.usedName = usedName;
		this.sex = sex;
		this.bornDate = bornDate;
		this.country = country;
		this.mingzu = mingzu;
		this.zhengzhiMm = zhengzhiMm;
		this.bornWhere = bornWhere;
		this.hunyin = hunyin;
		this.jiguan = jiguan;
		this.shenfenId = shenfenId;
		this.jiaoshiId = jiaoshiId;
		this.xueyuan = xueyuan;
		this.zhuanye = zhuanye;
		this.ruzhiFs = ruzhiFs;
		this.zhiwei = zhiwei;
		this.ruzhiDate = ruzhiDate;
		this.renqi = renqi;
		this.zhiweiChange = zhiweiChange;
		this.zhuyaoChengjiu = zhuyaoChengjiu;
		this.renjiaoXk = renjiaoXk;
		this.tel = tel;
		this.sushe = sushe;
		this.susheTel = susheTel;
		this.home = home;
		this.homeTel = homeTel;
		this.youbian = youbian;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwsTea() {
		return this.pwsTea;
	}

	public void setPwsTea(String pwsTea) {
		this.pwsTea = pwsTea;
	}

	public String getEmailTea() {
		return this.emailTea;
	}

	public void setEmailTea(String emailTea) {
		this.emailTea = emailTea;
	}

	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	public String getNamePy() {
		return this.namePy;
	}

	public void setNamePy(String namePy) {
		this.namePy = namePy;
	}

	public String getUsedName() {
		return this.usedName;
	}

	public void setUsedName(String usedName) {
		this.usedName = usedName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBornDate() {
		return this.bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMingzu() {
		return this.mingzu;
	}

	public void setMingzu(String mingzu) {
		this.mingzu = mingzu;
	}

	public String getZhengzhiMm() {
		return this.zhengzhiMm;
	}

	public void setZhengzhiMm(String zhengzhiMm) {
		this.zhengzhiMm = zhengzhiMm;
	}

	public String getBornWhere() {
		return this.bornWhere;
	}

	public void setBornWhere(String bornWhere) {
		this.bornWhere = bornWhere;
	}

	public String getHunyin() {
		return this.hunyin;
	}

	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}

	public String getJiguan() {
		return this.jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	public String getShenfenId() {
		return this.shenfenId;
	}

	public void setShenfenId(String shenfenId) {
		this.shenfenId = shenfenId;
	}

	public String getJiaoshiId() {
		return this.jiaoshiId;
	}

	public void setJiaoshiId(String jiaoshiId) {
		this.jiaoshiId = jiaoshiId;
	}

	public String getXueyuan() {
		return this.xueyuan;
	}

	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}

	public String getZhuanye() {
		return this.zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	public String getRuzhiFs() {
		return this.ruzhiFs;
	}

	public void setRuzhiFs(String ruzhiFs) {
		this.ruzhiFs = ruzhiFs;
	}

	public String getZhiwei() {
		return this.zhiwei;
	}

	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}

	public Date getRuzhiDate() {
		return this.ruzhiDate;
	}

	public void setRuzhiDate(Date ruzhiDate) {
		this.ruzhiDate = ruzhiDate;
	}

	public String getRenqi() {
		return this.renqi;
	}

	public void setRenqi(String renqi) {
		this.renqi = renqi;
	}

	public String getZhiweiChange() {
		return this.zhiweiChange;
	}

	public void setZhiweiChange(String zhiweiChange) {
		this.zhiweiChange = zhiweiChange;
	}

	public String getZhuyaoChengjiu() {
		return this.zhuyaoChengjiu;
	}

	public void setZhuyaoChengjiu(String zhuyaoChengjiu) {
		this.zhuyaoChengjiu = zhuyaoChengjiu;
	}

	public String getRenjiaoXk() {
		return this.renjiaoXk;
	}

	public void setRenjiaoXk(String renjiaoXk) {
		this.renjiaoXk = renjiaoXk;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSushe() {
		return this.sushe;
	}

	public void setSushe(String sushe) {
		this.sushe = sushe;
	}

	public String getSusheTel() {
		return this.susheTel;
	}

	public void setSusheTel(String susheTel) {
		this.susheTel = susheTel;
	}

	public String getHome() {
		return this.home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getHomeTel() {
		return this.homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getYoubian() {
		return this.youbian;
	}

	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}

}