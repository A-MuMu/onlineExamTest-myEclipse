package rainbow.example.domain;
// default package



/**
 * UserId entity. @author MyEclipse Persistence Tools
 */

public class UserId  implements java.io.Serializable {


    // Fields    

     private String id;
     private String psw;
     private String name;


    // Constructors

    /** default constructor */
    public UserId() {
    }

    
    /** full constructor */
    public UserId(String id, String psw, String name) {
        this.id = id;
        this.psw = psw;
        this.name = name;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return this.psw;
    }
    
    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserId) ) return false;
		 UserId castOther = ( UserId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getPsw()==castOther.getPsw()) || ( this.getPsw()!=null && castOther.getPsw()!=null && this.getPsw().equals(castOther.getPsw()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getPsw() == null ? 0 : this.getPsw().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         return result;
   }   





}