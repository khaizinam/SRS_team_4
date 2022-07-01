package springboot.app.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class UserEntity extends BaseEntity{
      /* ----------- column ----------------*/
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Date dod;

    @Column
    private String mail;

    @Column
    private String gender;

    @Column
    private String phone;

    @Column
    private String role;

    /*-- FOREIGN KEY --*/

    @ManyToMany
    @JoinTable(name = "user_skill",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<SkillEntity> skills = new ArrayList<>();
    
    @ManyToMany(mappedBy = "trainers")
    private List<ClassEntity> class_Trainer = new ArrayList<>();

    @ManyToMany(mappedBy = "trainees")
    private List<ClassEntity> class_Trainee = new ArrayList<>(); 

    @ManyToMany(mappedBy = "classAdmins")
    private List<ClassEntity> class_ClassAdmin = new ArrayList<>();

    @ManyToMany(mappedBy = "Audits")
    private List<ClassEntity> class_Audit = new ArrayList<>();

    @ManyToMany(mappedBy = "trainers")
    private List<PlanEntity> plans = new ArrayList<>();

    /* ----------- GETTER SETTER ----------------*/
    
    public List<PlanEntity> getPlans() {
        return plans;
    }

    public List<ClassEntity> getClass_Trainer() {
        return class_Trainer;
    }

    public void setClass_Trainer(List<ClassEntity> class_Trainer) {
        this.class_Trainer = class_Trainer;
    }

    public List<ClassEntity> getClass_Trainee() {
        return class_Trainee;
    }

    public void setClass_Trainee(List<ClassEntity> class_Trainee) {
        this.class_Trainee = class_Trainee;
    }

    public List<ClassEntity> getClass_ClassAdmin() {
        return class_ClassAdmin;
    }

    public void setClass_ClassAdmin(List<ClassEntity> class_ClassAdmin) {
        this.class_ClassAdmin = class_ClassAdmin;
    }

    public List<ClassEntity> getClass_Audit() {
        return class_Audit;
    }

    public void setClass_Audit(List<ClassEntity> class_Audit) {
        this.class_Audit = class_Audit;
    }

    public void setPlans(List<PlanEntity> plans) {
        this.plans = plans;
    }
    public List<SkillEntity> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillEntity> skills) {
        this.skills = skills;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDod() {
        return dod;
    }

    public void setDod(Date dod) {
        this.dod = dod;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
