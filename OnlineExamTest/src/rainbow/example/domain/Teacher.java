package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String name;
     private String pwsTea;
     private String emailTea;
     private String teaId;
     private Set xueKes = new HashSet(0);


    // Constructors

    /** default constructor */
    public Teacher() {
    }

    
    /** full constructor */
    public Teacher(String name, String pwsTea, String emailTea, String teaId, Set xueKes) {
        this.name = name;
        this.pwsTea = pwsTea;
        this.emailTea = emailTea;
        this.teaId = teaId;
        this.xueKes = xueKes;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
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

    public Set getXueKes() {
        return this.xueKes;
    }
    
    public void setXueKes(Set xueKes) {
        this.xueKes = xueKes;
    }
   








}