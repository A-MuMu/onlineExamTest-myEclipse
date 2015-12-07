package rainbow.example.domain;
// default package



/**
 * TianKong entity. @author MyEclipse Persistence Tools
 */

public class TianKong  implements java.io.Serializable {


    // Fields    

     private Long tdid;
     private XueKe xueKe;
     private String type;
     private String tiMu;
     private String daAn;


    // Constructors

    /** default constructor */
    public TianKong() {
    }

	/** minimal constructor */
    public TianKong(XueKe xueKe) {
        this.xueKe = xueKe;
    }
    
    /** full constructor */
    public TianKong(XueKe xueKe, String type, String tiMu, String daAn) {
        this.xueKe = xueKe;
        this.type = type;
        this.tiMu = tiMu;
        this.daAn = daAn;
    }

   
    // Property accessors

    public Long getTdid() {
        return this.tdid;
    }
    
    public void setTdid(Long tdid) {
        this.tdid = tdid;
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
   








}