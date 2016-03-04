package rainbow.example.domain;
// default package

import java.util.Date;


/**
 * StuCourseId entity. @author MyEclipse Persistence Tools
 */

public class StuCourseId  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String idStu;
     private String nameStu;
     private String xkname;
     private long daJuan;
     private long shijuan;
     private Date date;
     private Integer zongFen;
     private Integer zuZhuFenShu;


    // Constructors

    /** default constructor */
    public StuCourseId() {
    }

	/** minimal constructor */
    public StuCourseId(Integer id, String idStu, String nameStu, long daJuan, long shijuan) {
        this.id = id;
        this.idStu = idStu;
        this.nameStu = nameStu;
        this.daJuan = daJuan;
        this.shijuan = shijuan;
    }
    
    /** full constructor */
    public StuCourseId(Integer id, String idStu, String nameStu, String xkname, long daJuan, long shijuan, Date date, Integer zongFen, Integer zuZhuFenShu) {
        this.id = id;
        this.idStu = idStu;
        this.nameStu = nameStu;
        this.xkname = xkname;
        this.daJuan = daJuan;
        this.shijuan = shijuan;
        this.date = date;
        this.zongFen = zongFen;
        this.zuZhuFenShu = zuZhuFenShu;
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

    public String getXkname() {
        return this.xkname;
    }
    
    public void setXkname(String xkname) {
        this.xkname = xkname;
    }

    public long getDaJuan() {
        return this.daJuan;
    }
    
    public void setDaJuan(long daJuan) {
        this.daJuan = daJuan;
    }

    public long getShijuan() {
        return this.shijuan;
    }
    
    public void setShijuan(long shijuan) {
        this.shijuan = shijuan;
    }

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getZongFen() {
        return this.zongFen;
    }
    
    public void setZongFen(Integer zongFen) {
        this.zongFen = zongFen;
    }

    public Integer getZuZhuFenShu() {
        return this.zuZhuFenShu;
    }
    
    public void setZuZhuFenShu(Integer zuZhuFenShu) {
        this.zuZhuFenShu = zuZhuFenShu;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StuCourseId) ) return false;
		 StuCourseId castOther = ( StuCourseId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getIdStu()==castOther.getIdStu()) || ( this.getIdStu()!=null && castOther.getIdStu()!=null && this.getIdStu().equals(castOther.getIdStu()) ) )
 && ( (this.getNameStu()==castOther.getNameStu()) || ( this.getNameStu()!=null && castOther.getNameStu()!=null && this.getNameStu().equals(castOther.getNameStu()) ) )
 && ( (this.getXkname()==castOther.getXkname()) || ( this.getXkname()!=null && castOther.getXkname()!=null && this.getXkname().equals(castOther.getXkname()) ) )
 && (this.getDaJuan()==castOther.getDaJuan())
 && (this.getShijuan()==castOther.getShijuan())
 && ( (this.getDate()==castOther.getDate()) || ( this.getDate()!=null && castOther.getDate()!=null && this.getDate().equals(castOther.getDate()) ) )
 && ( (this.getZongFen()==castOther.getZongFen()) || ( this.getZongFen()!=null && castOther.getZongFen()!=null && this.getZongFen().equals(castOther.getZongFen()) ) )
 && ( (this.getZuZhuFenShu()==castOther.getZuZhuFenShu()) || ( this.getZuZhuFenShu()!=null && castOther.getZuZhuFenShu()!=null && this.getZuZhuFenShu().equals(castOther.getZuZhuFenShu()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getIdStu() == null ? 0 : this.getIdStu().hashCode() );
         result = 37 * result + ( getNameStu() == null ? 0 : this.getNameStu().hashCode() );
         result = 37 * result + ( getXkname() == null ? 0 : this.getXkname().hashCode() );
         result = 37 * result + (int) this.getDaJuan();
         result = 37 * result + (int) this.getShijuan();
         result = 37 * result + ( getDate() == null ? 0 : this.getDate().hashCode() );
         result = 37 * result + ( getZongFen() == null ? 0 : this.getZongFen().hashCode() );
         result = 37 * result + ( getZuZhuFenShu() == null ? 0 : this.getZuZhuFenShu().hashCode() );
         return result;
   }   





}