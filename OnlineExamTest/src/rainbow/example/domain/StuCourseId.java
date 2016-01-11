package rainbow.example.domain;
// default package



/**
 * StuCourseId entity. @author MyEclipse Persistence Tools
 */

public class StuCourseId  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String idStu;


    // Constructors

    /** default constructor */
    public StuCourseId() {
    }

    
    /** full constructor */
    public StuCourseId(Integer id, String idStu) {
        this.id = id;
        this.idStu = idStu;
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
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StuCourseId) ) return false;
		 StuCourseId castOther = ( StuCourseId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getIdStu()==castOther.getIdStu()) || ( this.getIdStu()!=null && castOther.getIdStu()!=null && this.getIdStu().equals(castOther.getIdStu()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getIdStu() == null ? 0 : this.getIdStu().hashCode() );
         return result;
   }   





}