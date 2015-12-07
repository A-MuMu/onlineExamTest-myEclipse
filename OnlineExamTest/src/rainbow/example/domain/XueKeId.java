package rainbow.example.domain;
// default package



/**
 * XueKeId entity. @author MyEclipse Persistence Tools
 */

public class XueKeId  implements java.io.Serializable {


    // Fields    

     private Long xkid;
     private Long teaId;


    // Constructors

    /** default constructor */
    public XueKeId() {
    }

    
    /** full constructor */
    public XueKeId(Long xkid, Long teaId) {
        this.xkid = xkid;
        this.teaId = teaId;
    }

   
    // Property accessors

    public Long getXkid() {
        return this.xkid;
    }
    
    public void setXkid(Long xkid) {
        this.xkid = xkid;
    }

    public Long getTeaId() {
        return this.teaId;
    }
    
    public void setTeaId(Long teaId) {
        this.teaId = teaId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof XueKeId) ) return false;
		 XueKeId castOther = ( XueKeId ) other; 
         
		 return ( (this.getXkid()==castOther.getXkid()) || ( this.getXkid()!=null && castOther.getXkid()!=null && this.getXkid().equals(castOther.getXkid()) ) )
 && ( (this.getTeaId()==castOther.getTeaId()) || ( this.getTeaId()!=null && castOther.getTeaId()!=null && this.getTeaId().equals(castOther.getTeaId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getXkid() == null ? 0 : this.getXkid().hashCode() );
         result = 37 * result + ( getTeaId() == null ? 0 : this.getTeaId().hashCode() );
         return result;
   }   





}