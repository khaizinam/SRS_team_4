package springboot.app.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Plan")
public class PlanEntity extends BaseEntity{
    /* ----------- column ----------------*/
    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "courseName")
    private String courseName;

    @Column(name = "subjectType")
    private String subjectType;

    @Column(name = "deliveryType")
    private String deliveryType;

    @Column(name = "formatType")
    private String formatType;

    @Column
    private String scope;

    @Column(name = "supplierPartner")
    private String supplierPartner;

    @Column(name = "planTraineeNumber")
    private int planTraineeNumber;

    @Column(name = "acceptedTraineeNumber")
    private int acceptedTraineeNumber;

    @Column(name = "actualTraineeNumber")
    private int  actualTraineeNumber;

    @Column(name = "budgetCode")
    private String budgetCode;

    @Column(name = "estimatedBudget")
    private double estimatedBudget;
    
    /*-- FOREIGN KEY --*/

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;

    @ManyToMany
    @JoinTable(name = "trainers_of_plan",
                joinColumns = @JoinColumn(name = "plan_id"),
                inverseJoinColumns = @JoinColumn(name = "trainer_id"))
    private List<UserEntity> trainers = new ArrayList<>();

    /* ----------- getter setter ----------------*/

    public List<UserEntity> getTrainers() {
        return trainers;
    }
    public ClassEntity getClassEntity() {
        return classEntity;
    }
    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }
    public void setTrainers(List<UserEntity> trainers) {
        this.trainers = trainers;
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
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getSubjectType() {
        return subjectType;
    }
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }
    public String getDeliveryType() {
        return deliveryType;
    }
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    public String getFormatType() {
        return formatType;
    }
    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }
    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }
    public String getSupplierPartner() {
        return supplierPartner;
    }
    public void setSupplierPartner(String supplierPartner) {
        this.supplierPartner = supplierPartner;
    }
    public int getPlanTraineeNumber() {
        return planTraineeNumber;
    }
    public void setPlanTraineeNumber(int planTraineeNumber) {
        this.planTraineeNumber = planTraineeNumber;
    }
    public int getAcceptedTraineeNumber() {
        return acceptedTraineeNumber;
    }
    public void setAcceptedTraineeNumber(int acceptedTraineeNumber) {
        this.acceptedTraineeNumber = acceptedTraineeNumber;
    }
    public int getActualTraineeNumber() {
        return actualTraineeNumber;
    }
    public void setActualTraineeNumber(int actualTraineeNumber) {
        this.actualTraineeNumber = actualTraineeNumber;
    }
    public String getBudgetCode() {
        return budgetCode;
    }
    public void setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
    }
    public double getEstimatedBudget() {
        return estimatedBudget;
    }
    public void setEstimatedBudget(double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }
    
}
