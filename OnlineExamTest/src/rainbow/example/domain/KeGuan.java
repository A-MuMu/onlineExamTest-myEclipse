package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * KeGuan entity. @author MyEclipse Persistence Tools
 */

public class KeGuan  implements java.io.Serializable {


    // Fields    

     private Long kgid;
     private XueKe xueKe;
     private String type;
     private String tiMu;
     private String daAn;
     private Set shiJuansForZhuguan3 = new HashSet(0);
     private Set shiJuansForZhuguan2 = new HashSet(0);
     private Set shiJuansForZhuguan1 = new HashSet(0);


    // Constructors

    /** default constructor */
    public KeGuan() {
    }

	/** minimal constructor */
    public KeGuan(XueKe xueKe) {
        this.xueKe = xueKe;
    }
    
    /** full constructor */
    public KeGuan(XueKe xueKe, String type, String tiMu, String daAn, Set shiJuansForZhuguan3, Set shiJuansForZhuguan2, Set shiJuansForZhuguan1) {
        this.xueKe = xueKe;
        this.type = type;
        this.tiMu = tiMu;
        this.daAn = daAn;
        this.shiJuansForZhuguan3 = shiJuansForZhuguan3;
        this.shiJuansForZhuguan2 = shiJuansForZhuguan2;
        this.shiJuansForZhuguan1 = shiJuansForZhuguan1;
    }

   
    // Property accessors

    public Long getKgid() {
        return this.kgid;
    }
    
    public void setKgid(Long kgid) {
        this.kgid = kgid;
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

    public Set getShiJuansForZhuguan3() {
        return this.shiJuansForZhuguan3;
    }
    
    public void setShiJuansForZhuguan3(Set shiJuansForZhuguan3) {
        this.shiJuansForZhuguan3 = shiJuansForZhuguan3;
    }

    public Set getShiJuansForZhuguan2() {
        return this.shiJuansForZhuguan2;
    }
    
    public void setShiJuansForZhuguan2(Set shiJuansForZhuguan2) {
        this.shiJuansForZhuguan2 = shiJuansForZhuguan2;
    }

    public Set getShiJuansForZhuguan1() {
        return this.shiJuansForZhuguan1;
    }
    
    public void setShiJuansForZhuguan1(Set shiJuansForZhuguan1) {
        this.shiJuansForZhuguan1 = shiJuansForZhuguan1;
    }
   








}