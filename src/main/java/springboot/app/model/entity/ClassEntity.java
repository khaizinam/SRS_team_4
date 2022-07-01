package springboot.app.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class ClassEntity extends BaseEntity {
    /* ----------- column ----------------*/
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private int size;
    @Column(name = "skill")
    private String skill;
    @Column(name = "fsu")
    private String fsu;
    @Column(name = "status")
    private String status;
    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    /*--FOREIGN KEY--*/
    
    @OneToMany(mappedBy = "classEntity")
    private List<PlanEntity> plans = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "trainees_of_class",
                joinColumns = @JoinColumn(name = "class_id"),
                inverseJoinColumns = @JoinColumn(name = "trainee_id"))
    private List<UserEntity> trainees = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "classAdmin_of_class",
                joinColumns = @JoinColumn(name = "class_id"),
                inverseJoinColumns = @JoinColumn(name = "ca_id"))
    private List<UserEntity> classAdmins = new ArrayList<>();
 
    @ManyToMany
    @JoinTable(name = "Audit_of_class",
                joinColumns = @JoinColumn(name = "class_id"),
                inverseJoinColumns = @JoinColumn(name = "audit_id"))
    private List<UserEntity> Audits = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "trainers_of_class",
                joinColumns = @JoinColumn(name = "class_id"),
                inverseJoinColumns = @JoinColumn(name = "trainer_id"))
    private List<UserEntity> trainers = new ArrayList<>();

    /* ----------- setter setter ----------------*/
    
    public List<UserEntity> getTrainees() {
        return trainees;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public List<PlanEntity> getPlans() {
        return plans;
    }
    public void setPlans(List<PlanEntity> plans) {
        this.plans = plans;
    }
    public void setTrainees(List<UserEntity> trainees) {
        this.trainees = trainees;
    }
    public List<UserEntity> getClassAdmins() {
        return classAdmins;
    }
    public void setClassAdmins(List<UserEntity> classAdmins) {
        this.classAdmins = classAdmins;
    }
    public List<UserEntity> getAudits() {
        return Audits;
    }
    public void setAudits(List<UserEntity> audits) {
        Audits = audits;
    }
    public List<UserEntity> getTrainers() {
        return trainers;
    }
    public void setTrainers(List<UserEntity> trainers) {
        this.trainers = trainers;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getFsu() {
        return fsu;
    }
    public void setFsu(String fsu) {
        this.fsu = fsu;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
