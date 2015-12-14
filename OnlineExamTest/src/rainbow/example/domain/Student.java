package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String idStu;
     private String nameStu;
     private String pswStu;
     private String emailStu;
     private Set courses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Student() {
    }

	/** minimal constructor */
    public Student(String idStu, String nameStu, String pswStu, String emailStu) {
        this.idStu = idStu;
        this.nameStu = nameStu;
        this.pswStu = pswStu;
        this.emailStu = emailStu;
    }
    
    /** full constructor */
    public Student(String idStu, String nameStu, String pswStu, String emailStu, Set courses) {
        this.idStu = idStu;
        this.nameStu = nameStu;
        this.pswStu = pswStu;
        this.emailStu = emailStu;
        this.courses = courses;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStu() {
        return this.idStu;
    }
    
    public void setIdStu(String idStu) {
        this.idStu = idStu;
    }

    public String getNameStu() {
        return this.nameStu;
    }
    
    public void setNameStu(String nameStu) {
        this.nameStu = nameStu;
    }

    public String getPswStu() {
        return this.pswStu;
    }
    
    public void setPswStu(String pswStu) {
        this.pswStu = pswStu;
    }

    public String getEmailStu() {
        return this.emailStu;
    }
    
    public void setEmailStu(String emailStu) {
        this.emailStu = emailStu;
    }

    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }
   
}