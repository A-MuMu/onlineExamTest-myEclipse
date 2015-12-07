package rainbow.example.domain;
// default package



/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course  implements java.io.Serializable {


    // Fields    

     private Long cid;
     private Student student;
     private XueKe xueKe;


    // Constructors

    /** default constructor */
    public Course() {
    }

	/** minimal constructor */
    public Course(Student student) {
        this.student = student;
    }
    
    /** full constructor */
    public Course(Student student, XueKe xueKe) {
        this.student = student;
        this.xueKe = xueKe;
    }

   
    // Property accessors

    public Long getCid() {
        return this.cid;
    }
    
    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public XueKe getXueKe() {
        return this.xueKe;
    }
    
    public void setXueKe(XueKe xueKe) {
        this.xueKe = xueKe;
    }
   








}