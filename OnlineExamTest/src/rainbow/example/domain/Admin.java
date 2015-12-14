package rainbow.example.domain;
// default package



/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String loginId;
     private String loginPsw;


    // Constructors

    /** default constructor */
    public Admin() {
    }

    
    /** full constructor */
    public Admin(String loginId, String loginPsw) {
        this.loginId = loginId;
        this.loginPsw = loginPsw;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPsw() {
        return this.loginPsw;
    }
    
    public void setLoginPsw(String loginPsw) {
        this.loginPsw = loginPsw;
    }
   








}