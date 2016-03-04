package rainbow.example.domain;
// default package



/**
 * StuCourse entity. @author MyEclipse Persistence Tools
 */

public class StuCourse  implements java.io.Serializable {


    // Fields    

     private StuCourseId id;


    // Constructors

    /** default constructor */
    public StuCourse() {
    }

    
    /** full constructor */
    public StuCourse(StuCourseId id) {
        this.id = id;
    }

   
    // Property accessors

    public StuCourseId getId() {
        return this.id;
    }
    
    public void setId(StuCourseId id) {
        this.id = id;
    }
   








}