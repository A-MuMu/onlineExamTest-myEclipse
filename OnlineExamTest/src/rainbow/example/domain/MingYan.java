package rainbow.example.domain;
// default package



/**
 * MingYan entity. @author MyEclipse Persistence Tools
 */

public class MingYan  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String yuJu;


    // Constructors

    /** default constructor */
    public MingYan() {
    }

    
    /** full constructor */
    public MingYan(String yuJu) {
        this.yuJu = yuJu;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getYuJu() {
        return this.yuJu;
    }
    
    public void setYuJu(String yuJu) {
        this.yuJu = yuJu;
    }
   








}