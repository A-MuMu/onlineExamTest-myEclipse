package rainbow.example.domain;
// default package

import java.util.Date;


/**
 * StuCourse entity. @author MyEclipse Persistence Tools
 */

public class StuCourse  implements java.io.Serializable {


    // Fields    

     private StuCourseId id;
     private String nameStu;
     private String xkname;
     private long daJuan;
     private long shijuan;
     private Date date;
     private Integer zongFen;
     private Integer zuZhuFenShu;


    // Constructors

    /** default constructor */
    public StuCourse() {
    }

	/** minimal constructor */
    public StuCourse(StuCourseId id, String nameStu, long daJuan, long shijuan) {
        this.id = id;
        this.nameStu = nameStu;
        this.daJuan = daJuan;
        this.shijuan = shijuan;
    }
    
    /** full constructor */
    public StuCourse(StuCourseId id, String nameStu, String xkname, long daJuan, long shijuan, Date date, Integer zongFen, Integer zuZhuFenShu) {
        this.id = id;
        this.nameStu = nameStu;
        this.xkname = xkname;
        this.daJuan = daJuan;
        this.shijuan = shijuan;
        this.date = date;
        this.zongFen = zongFen;
        this.zuZhuFenShu = zuZhuFenShu;
    }

   
    // Property accessors

    public StuCourseId getId() {
        return this.id;
    }
    
    public void setId(StuCourseId id) {
        this.id = id;
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
   








}