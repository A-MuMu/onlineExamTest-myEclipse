package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * XuanZe entity. @author MyEclipse Persistence Tools
 */

public class XuanZe  implements java.io.Serializable {


    // Fields    

     private Long xzid;
     private XueKe xueKe;
     private String type;
     private String tiMu;
     private String daAn;
     private String a;
     private String b;
     private String c;
     private String d;
     private Set shiJuansForXuanze1 = new HashSet(0);
     private Set shiJuansForXuanze3 = new HashSet(0);
     private Set shiJuansForXuanze2 = new HashSet(0);
     private Set shiJuansForXuanze5 = new HashSet(0);
     private Set shiJuansForXuanze4 = new HashSet(0);
     private Set shiJuansForXuanze10 = new HashSet(0);
     private Set shiJuansForXuanze7 = new HashSet(0);
     private Set shiJuansForXuanze6 = new HashSet(0);
     private Set shiJuansForXuanze9 = new HashSet(0);
     private Set shiJuansForXuanze8 = new HashSet(0);


    // Constructors

    /** default constructor */
    public XuanZe() {
    }

	/** minimal constructor */
    public XuanZe(XueKe xueKe, String a) {
        this.xueKe = xueKe;
        this.a = a;
    }
    
    /** full constructor */
    public XuanZe(XueKe xueKe, String type, String tiMu, String daAn, String a, String b, String c, String d, Set shiJuansForXuanze1, Set shiJuansForXuanze3, Set shiJuansForXuanze2, Set shiJuansForXuanze5, Set shiJuansForXuanze4, Set shiJuansForXuanze10, Set shiJuansForXuanze7, Set shiJuansForXuanze6, Set shiJuansForXuanze9, Set shiJuansForXuanze8) {
        this.xueKe = xueKe;
        this.type = type;
        this.tiMu = tiMu;
        this.daAn = daAn;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.shiJuansForXuanze1 = shiJuansForXuanze1;
        this.shiJuansForXuanze3 = shiJuansForXuanze3;
        this.shiJuansForXuanze2 = shiJuansForXuanze2;
        this.shiJuansForXuanze5 = shiJuansForXuanze5;
        this.shiJuansForXuanze4 = shiJuansForXuanze4;
        this.shiJuansForXuanze10 = shiJuansForXuanze10;
        this.shiJuansForXuanze7 = shiJuansForXuanze7;
        this.shiJuansForXuanze6 = shiJuansForXuanze6;
        this.shiJuansForXuanze9 = shiJuansForXuanze9;
        this.shiJuansForXuanze8 = shiJuansForXuanze8;
    }

   
    // Property accessors

    public Long getXzid() {
        return this.xzid;
    }
    
    public void setXzid(Long xzid) {
        this.xzid = xzid;
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

    public String getA() {
        return this.a;
    }
    
    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return this.b;
    }
    
    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return this.c;
    }
    
    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return this.d;
    }
    
    public void setD(String d) {
        this.d = d;
    }

    public Set getShiJuansForXuanze1() {
        return this.shiJuansForXuanze1;
    }
    
    public void setShiJuansForXuanze1(Set shiJuansForXuanze1) {
        this.shiJuansForXuanze1 = shiJuansForXuanze1;
    }

    public Set getShiJuansForXuanze3() {
        return this.shiJuansForXuanze3;
    }
    
    public void setShiJuansForXuanze3(Set shiJuansForXuanze3) {
        this.shiJuansForXuanze3 = shiJuansForXuanze3;
    }

    public Set getShiJuansForXuanze2() {
        return this.shiJuansForXuanze2;
    }
    
    public void setShiJuansForXuanze2(Set shiJuansForXuanze2) {
        this.shiJuansForXuanze2 = shiJuansForXuanze2;
    }

    public Set getShiJuansForXuanze5() {
        return this.shiJuansForXuanze5;
    }
    
    public void setShiJuansForXuanze5(Set shiJuansForXuanze5) {
        this.shiJuansForXuanze5 = shiJuansForXuanze5;
    }

    public Set getShiJuansForXuanze4() {
        return this.shiJuansForXuanze4;
    }
    
    public void setShiJuansForXuanze4(Set shiJuansForXuanze4) {
        this.shiJuansForXuanze4 = shiJuansForXuanze4;
    }

    public Set getShiJuansForXuanze10() {
        return this.shiJuansForXuanze10;
    }
    
    public void setShiJuansForXuanze10(Set shiJuansForXuanze10) {
        this.shiJuansForXuanze10 = shiJuansForXuanze10;
    }

    public Set getShiJuansForXuanze7() {
        return this.shiJuansForXuanze7;
    }
    
    public void setShiJuansForXuanze7(Set shiJuansForXuanze7) {
        this.shiJuansForXuanze7 = shiJuansForXuanze7;
    }

    public Set getShiJuansForXuanze6() {
        return this.shiJuansForXuanze6;
    }
    
    public void setShiJuansForXuanze6(Set shiJuansForXuanze6) {
        this.shiJuansForXuanze6 = shiJuansForXuanze6;
    }

    public Set getShiJuansForXuanze9() {
        return this.shiJuansForXuanze9;
    }
    
    public void setShiJuansForXuanze9(Set shiJuansForXuanze9) {
        this.shiJuansForXuanze9 = shiJuansForXuanze9;
    }

    public Set getShiJuansForXuanze8() {
        return this.shiJuansForXuanze8;
    }
    
    public void setShiJuansForXuanze8(Set shiJuansForXuanze8) {
        this.shiJuansForXuanze8 = shiJuansForXuanze8;
    }
   








}