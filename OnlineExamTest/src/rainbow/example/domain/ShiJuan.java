package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * ShiJuan entity. @author MyEclipse Persistence Tools
 */

public class ShiJuan  implements java.io.Serializable {


    // Fields    

     private Long sjId;
     private PangDuan pangDuanByPangduan10;
     private KeGuan keGuanByZhuguan3;
     private KeGuan keGuanByZhuguan1;
     private KeGuan keGuanByZhuguan2;
     private XuanZe xuanZeByXuanze10;
     private XuanZe xuanZeByXuanze5;
     private XuanZe xuanZeByXuanze4;
     private XuanZe xuanZeByXuanze3;
     private XuanZe xuanZeByXuanze2;
     private XuanZe xuanZeByXuanze9;
     private XuanZe xuanZeByXuanze8;
     private XuanZe xuanZeByXuanze7;
     private PangDuan pangDuanByPangduan2;
     private XuanZe xuanZeByXuanze6;
     private PangDuan pangDuanByPangduan1;
     private PangDuan pangDuanByPangduan4;
     private PangDuan pangDuanByPangduan3;
     private PangDuan pangDuanByPangduan6;
     private PangDuan pangDuanByPangduan5;
     private XuanZe xuanZeByXuanze1;
     private PangDuan pangDuanByPangduan8;
     private PangDuan pangDuanByPangduan7;
     private PangDuan pangDuanByPangduan9;
     private Long teaId;
     private Long xkid;
     private Set daAnJuans = new HashSet(0);


    // Constructors

    /** default constructor */
    public ShiJuan() {
    }

    
    /** full constructor */
    public ShiJuan(PangDuan pangDuanByPangduan10, KeGuan keGuanByZhuguan3, KeGuan keGuanByZhuguan1, KeGuan keGuanByZhuguan2, XuanZe xuanZeByXuanze10, XuanZe xuanZeByXuanze5, XuanZe xuanZeByXuanze4, XuanZe xuanZeByXuanze3, XuanZe xuanZeByXuanze2, XuanZe xuanZeByXuanze9, XuanZe xuanZeByXuanze8, XuanZe xuanZeByXuanze7, PangDuan pangDuanByPangduan2, XuanZe xuanZeByXuanze6, PangDuan pangDuanByPangduan1, PangDuan pangDuanByPangduan4, PangDuan pangDuanByPangduan3, PangDuan pangDuanByPangduan6, PangDuan pangDuanByPangduan5, XuanZe xuanZeByXuanze1, PangDuan pangDuanByPangduan8, PangDuan pangDuanByPangduan7, PangDuan pangDuanByPangduan9, Long teaId, Long xkid, Set daAnJuans) {
        this.pangDuanByPangduan10 = pangDuanByPangduan10;
        this.keGuanByZhuguan3 = keGuanByZhuguan3;
        this.keGuanByZhuguan1 = keGuanByZhuguan1;
        this.keGuanByZhuguan2 = keGuanByZhuguan2;
        this.xuanZeByXuanze10 = xuanZeByXuanze10;
        this.xuanZeByXuanze5 = xuanZeByXuanze5;
        this.xuanZeByXuanze4 = xuanZeByXuanze4;
        this.xuanZeByXuanze3 = xuanZeByXuanze3;
        this.xuanZeByXuanze2 = xuanZeByXuanze2;
        this.xuanZeByXuanze9 = xuanZeByXuanze9;
        this.xuanZeByXuanze8 = xuanZeByXuanze8;
        this.xuanZeByXuanze7 = xuanZeByXuanze7;
        this.pangDuanByPangduan2 = pangDuanByPangduan2;
        this.xuanZeByXuanze6 = xuanZeByXuanze6;
        this.pangDuanByPangduan1 = pangDuanByPangduan1;
        this.pangDuanByPangduan4 = pangDuanByPangduan4;
        this.pangDuanByPangduan3 = pangDuanByPangduan3;
        this.pangDuanByPangduan6 = pangDuanByPangduan6;
        this.pangDuanByPangduan5 = pangDuanByPangduan5;
        this.xuanZeByXuanze1 = xuanZeByXuanze1;
        this.pangDuanByPangduan8 = pangDuanByPangduan8;
        this.pangDuanByPangduan7 = pangDuanByPangduan7;
        this.pangDuanByPangduan9 = pangDuanByPangduan9;
        this.teaId = teaId;
        this.xkid = xkid;
        this.daAnJuans = daAnJuans;
    }

   
    // Property accessors

    public Long getSjId() {
        return this.sjId;
    }
    
    public void setSjId(Long sjId) {
        this.sjId = sjId;
    }

    public PangDuan getPangDuanByPangduan10() {
        return this.pangDuanByPangduan10;
    }
    
    public void setPangDuanByPangduan10(PangDuan pangDuanByPangduan10) {
        this.pangDuanByPangduan10 = pangDuanByPangduan10;
    }

    public KeGuan getKeGuanByZhuguan3() {
        return this.keGuanByZhuguan3;
    }
    
    public void setKeGuanByZhuguan3(KeGuan keGuanByZhuguan3) {
        this.keGuanByZhuguan3 = keGuanByZhuguan3;
    }

    public KeGuan getKeGuanByZhuguan1() {
        return this.keGuanByZhuguan1;
    }
    
    public void setKeGuanByZhuguan1(KeGuan keGuanByZhuguan1) {
        this.keGuanByZhuguan1 = keGuanByZhuguan1;
    }

    public KeGuan getKeGuanByZhuguan2() {
        return this.keGuanByZhuguan2;
    }
    
    public void setKeGuanByZhuguan2(KeGuan keGuanByZhuguan2) {
        this.keGuanByZhuguan2 = keGuanByZhuguan2;
    }

    public XuanZe getXuanZeByXuanze10() {
        return this.xuanZeByXuanze10;
    }
    
    public void setXuanZeByXuanze10(XuanZe xuanZeByXuanze10) {
        this.xuanZeByXuanze10 = xuanZeByXuanze10;
    }

    public XuanZe getXuanZeByXuanze5() {
        return this.xuanZeByXuanze5;
    }
    
    public void setXuanZeByXuanze5(XuanZe xuanZeByXuanze5) {
        this.xuanZeByXuanze5 = xuanZeByXuanze5;
    }

    public XuanZe getXuanZeByXuanze4() {
        return this.xuanZeByXuanze4;
    }
    
    public void setXuanZeByXuanze4(XuanZe xuanZeByXuanze4) {
        this.xuanZeByXuanze4 = xuanZeByXuanze4;
    }

    public XuanZe getXuanZeByXuanze3() {
        return this.xuanZeByXuanze3;
    }
    
    public void setXuanZeByXuanze3(XuanZe xuanZeByXuanze3) {
        this.xuanZeByXuanze3 = xuanZeByXuanze3;
    }

    public XuanZe getXuanZeByXuanze2() {
        return this.xuanZeByXuanze2;
    }
    
    public void setXuanZeByXuanze2(XuanZe xuanZeByXuanze2) {
        this.xuanZeByXuanze2 = xuanZeByXuanze2;
    }

    public XuanZe getXuanZeByXuanze9() {
        return this.xuanZeByXuanze9;
    }
    
    public void setXuanZeByXuanze9(XuanZe xuanZeByXuanze9) {
        this.xuanZeByXuanze9 = xuanZeByXuanze9;
    }

    public XuanZe getXuanZeByXuanze8() {
        return this.xuanZeByXuanze8;
    }
    
    public void setXuanZeByXuanze8(XuanZe xuanZeByXuanze8) {
        this.xuanZeByXuanze8 = xuanZeByXuanze8;
    }

    public XuanZe getXuanZeByXuanze7() {
        return this.xuanZeByXuanze7;
    }
    
    public void setXuanZeByXuanze7(XuanZe xuanZeByXuanze7) {
        this.xuanZeByXuanze7 = xuanZeByXuanze7;
    }

    public PangDuan getPangDuanByPangduan2() {
        return this.pangDuanByPangduan2;
    }
    
    public void setPangDuanByPangduan2(PangDuan pangDuanByPangduan2) {
        this.pangDuanByPangduan2 = pangDuanByPangduan2;
    }

    public XuanZe getXuanZeByXuanze6() {
        return this.xuanZeByXuanze6;
    }
    
    public void setXuanZeByXuanze6(XuanZe xuanZeByXuanze6) {
        this.xuanZeByXuanze6 = xuanZeByXuanze6;
    }

    public PangDuan getPangDuanByPangduan1() {
        return this.pangDuanByPangduan1;
    }
    
    public void setPangDuanByPangduan1(PangDuan pangDuanByPangduan1) {
        this.pangDuanByPangduan1 = pangDuanByPangduan1;
    }

    public PangDuan getPangDuanByPangduan4() {
        return this.pangDuanByPangduan4;
    }
    
    public void setPangDuanByPangduan4(PangDuan pangDuanByPangduan4) {
        this.pangDuanByPangduan4 = pangDuanByPangduan4;
    }

    public PangDuan getPangDuanByPangduan3() {
        return this.pangDuanByPangduan3;
    }
    
    public void setPangDuanByPangduan3(PangDuan pangDuanByPangduan3) {
        this.pangDuanByPangduan3 = pangDuanByPangduan3;
    }

    public PangDuan getPangDuanByPangduan6() {
        return this.pangDuanByPangduan6;
    }
    
    public void setPangDuanByPangduan6(PangDuan pangDuanByPangduan6) {
        this.pangDuanByPangduan6 = pangDuanByPangduan6;
    }

    public PangDuan getPangDuanByPangduan5() {
        return this.pangDuanByPangduan5;
    }
    
    public void setPangDuanByPangduan5(PangDuan pangDuanByPangduan5) {
        this.pangDuanByPangduan5 = pangDuanByPangduan5;
    }

    public XuanZe getXuanZeByXuanze1() {
        return this.xuanZeByXuanze1;
    }
    
    public void setXuanZeByXuanze1(XuanZe xuanZeByXuanze1) {
        this.xuanZeByXuanze1 = xuanZeByXuanze1;
    }

    public PangDuan getPangDuanByPangduan8() {
        return this.pangDuanByPangduan8;
    }
    
    public void setPangDuanByPangduan8(PangDuan pangDuanByPangduan8) {
        this.pangDuanByPangduan8 = pangDuanByPangduan8;
    }

    public PangDuan getPangDuanByPangduan7() {
        return this.pangDuanByPangduan7;
    }
    
    public void setPangDuanByPangduan7(PangDuan pangDuanByPangduan7) {
        this.pangDuanByPangduan7 = pangDuanByPangduan7;
    }

    public PangDuan getPangDuanByPangduan9() {
        return this.pangDuanByPangduan9;
    }
    
    public void setPangDuanByPangduan9(PangDuan pangDuanByPangduan9) {
        this.pangDuanByPangduan9 = pangDuanByPangduan9;
    }

    public Long getTeaId() {
        return this.teaId;
    }
    
    public void setTeaId(Long teaId) {
        this.teaId = teaId;
    }

    public Long getXkid() {
        return this.xkid;
    }
    
    public void setXkid(Long xkid) {
        this.xkid = xkid;
    }

    public Set getDaAnJuans() {
        return this.daAnJuans;
    }
    
    public void setDaAnJuans(Set daAnJuans) {
        this.daAnJuans = daAnJuans;
    }
   








}