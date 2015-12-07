package rainbow.example.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * XueKe entity. @author MyEclipse Persistence Tools
 */

public class XueKe  implements java.io.Serializable {


    // Fields    

     private XueKeId id;
     private Teacher teacher;
     private String nameXk;
     private Set pangDuans = new HashSet(0);
     private Set courses = new HashSet(0);
     private Set xuanZes = new HashSet(0);
     private Set keGuans = new HashSet(0);
//     private Set tianKongs = new HashSet(0);


    // Constructors

    /** default constructor */
    public XueKe() {
    }

	/** minimal constructor */
    public XueKe(XueKeId id, Teacher teacher) {
        this.id = id;
        this.teacher = teacher;
    }
    
    /** full constructor */
    public XueKe(XueKeId id, Teacher teacher, String nameXk, Set pangDuans, Set courses, Set xuanZes, Set keGuans, Set tianKongs) {
        this.id = id;
        this.teacher = teacher;
        this.nameXk = nameXk;
        this.pangDuans = pangDuans;
        this.courses = courses;
        this.xuanZes = xuanZes;
        this.keGuans = keGuans;
//        this.tianKongs = tianKongs;
    }

   
    // Property accessors

    public XueKeId getId() {
        return this.id;
    }
    
    public void setId(XueKeId id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getNameXk() {
        return this.nameXk;
    }
    
    public void setNameXk(String nameXk) {
        this.nameXk = nameXk;
    }

    public Set getPangDuans() {
        return this.pangDuans;
    }
    
    public void setPangDuans(Set pangDuans) {
        this.pangDuans = pangDuans;
    }

    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }

    public Set getXuanZes() {
        return this.xuanZes;
    }
    
    public void setXuanZes(Set xuanZes) {
        this.xuanZes = xuanZes;
    }

    public Set getKeGuans() {
        return this.keGuans;
    }
    
    public void setKeGuans(Set keGuans) {
        this.keGuans = keGuans;
    }

//    public Set getTianKongs() {
//        return this.tianKongs;
//    }
//    
//    public void setTianKongs(Set tianKongs) {
//        this.tianKongs = tianKongs;
//    }

}