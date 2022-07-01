package springboot.app.model.dto;

import java.util.Date;

public class ClassDTO {
    /*--return JSON--*/
    private Long id;
    private String name;
    private int size;
    private String skill;
    private String fsu;
    private String status;
    private Date startDate;
    private Date endDate;
    /*-- GETTER SETTER --*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    
}
