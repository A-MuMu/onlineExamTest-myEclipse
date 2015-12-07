package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * PangDuan entity. @author MyEclipse Persistence Tools
 */

public class PangDuan  implements java.io.Serializable {


    // Fields    

     private Long pdid;
     private XueKe xueKe;
     private String type;
     private String tiMu;
     private String daAn;
     private Set shiJuansForPangduan9 = new HashSet(0);
     private Set shiJuansForPangduan8 = new HashSet(0);
     private Set shiJuansForPangduan7 = new HashSet(0);
     private Set shiJuansForPangduan6 = new HashSet(0);
     private Set shiJuansForPangduan5 = new HashSet(0);
     private Set shiJuansForPangduan4 = new HashSet(0);
     private Set shiJuansForPangduan10 = new HashSet(0);
     private Set shiJuansForPangduan1 = new HashSet(0);
     private Set shiJuansForPangduan2 = new HashSet(0);
     private Set shiJuansForPangduan3 = new HashSet(0);


    // Constructors

    /** default constructor */
    public PangDuan() {
    }

	/** minimal constructor */
    public PangDuan(XueKe xueKe) {
        this.xueKe = xueKe;
    }
    
    /** full constructor */
    public PangDuan(XueKe xueKe, String type, String tiMu, String daAn, Set shiJuansForPangduan9, Set shiJuansForPangduan8, Set shiJuansForPangduan7, Set shiJuansForPangduan6, Set shiJuansForPangduan5, Set shiJuansForPangduan4, Set shiJuansForPangduan10, Set shiJuansForPangduan1, Set shiJuansForPangduan2, Set shiJuansForPangduan3) {
        this.xueKe = xueKe;
        this.type = type;
        this.tiMu = tiMu;
        this.daAn = daAn;
        this.shiJuansForPangduan9 = shiJuansForPangduan9;
        this.shiJuansForPangduan8 = shiJuansForPangduan8;
        this.shiJuansForPangduan7 = shiJuansForPangduan7;
        this.shiJuansForPangduan6 = shiJuansForPangduan6;
        this.shiJuansForPangduan5 = shiJuansForPangduan5;
        this.shiJuansForPangduan4 = shiJuansForPangduan4;
        this.shiJuansForPangduan10 = shiJuansForPangduan10;
        this.shiJuansForPangduan1 = shiJuansForPangduan1;
        this.shiJuansForPangduan2 = shiJuansForPangduan2;
        this.shiJuansForPangduan3 = shiJuansForPangduan3;
    }

   
    // Property accessors

    public Long getPdid() {
        return this.pdid;
    }
    
    public void setPdid(Long pdid) {
        this.pdid = pdid;
    }

    public XueKe getXueKe() {
        return this.xueKe;
    }
    
    public void setXueKe(XueKe xueKe) {
        this.xueKe = xueKe;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getTiMu() {
        return this.tiMu;
    }
    
    public void setTiMu(String tiMu) {
        this.tiMu = tiMu;
    }

    public String getDaAn() {
        return this.daAn;
    }
    
    public void setDaAn(String daAn) {
        this.daAn = daAn;
    }

    public Set getShiJuansForPangduan9() {
        return this.shiJuansForPangduan9;
    }
    
    public void setShiJuansForPangduan9(Set shiJuansForPangduan9) {
        this.shiJuansForPangduan9 = shiJuansForPangduan9;
    }

    public Set getShiJuansForPangduan8() {
        return this.shiJuansForPangduan8;
    }
    
    public void setShiJuansForPangduan8(Set shiJuansForPangduan8) {
        this.shiJuansForPangduan8 = shiJuansForPangduan8;
    }

    public Set getShiJuansForPangduan7() {
        return this.shiJuansForPangduan7;
    }
    
    public void setShiJuansForPangduan7(Set shiJuansForPangduan7) {
        this.shiJuansForPangduan7 = shiJuansForPangduan7;
    }

    public Set getShiJuansForPangduan6() {
        return this.shiJuansForPangduan6;
    }
    
    public void setShiJuansForPangduan6(Set shiJuansForPangduan6) {
        this.shiJuansForPangduan6 = shiJuansForPangduan6;
    }

    public Set getShiJuansForPangduan5() {
        return this.shiJuansForPangduan5;
    }
    
    public void setShiJuansForPangduan5(Set shiJuansForPangduan5) {
        this.shiJuansForPangduan5 = shiJuansForPangduan5;
    }

    public Set getShiJuansForPangduan4() {
        return this.shiJuansForPangduan4;
    }
    
    public void setShiJuansForPangduan4(Set shiJuansForPangduan4) {
        this.shiJuansForPangduan4 = shiJuansForPangduan4;
    }

    public Set getShiJuansForPangduan10() {
        return this.shiJuansForPangduan10;
    }
    
    public void setShiJuansForPangduan10(Set shiJuansForPangduan10) {
        this.shiJuansForPangduan10 = shiJuansForPangduan10;
    }

    public Set getShiJuansForPangduan1() {
        return this.shiJuansForPangduan1;
    }
    
    public void setShiJuansForPangduan1(Set shiJuansForPangduan1) {
        this.shiJuansForPangduan1 = shiJuansForPangduan1;
    }

    public Set getShiJuansForPangduan2() {
        return this.shiJuansForPangduan2;
    }
    
    public void setShiJuansForPangduan2(Set shiJuansForPangduan2) {
        this.shiJuansForPangduan2 = shiJuansForPangduan2;
    }

    public Set getShiJuansForPangduan3() {
        return this.shiJuansForPangduan3;
    }
    
    public void setShiJuansForPangduan3(Set shiJuansForPangduan3) {
        this.shiJuansForPangduan3 = shiJuansForPangduan3;
    }
   








}