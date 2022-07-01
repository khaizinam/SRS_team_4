package springboot.app.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class SkillEntity extends BaseEntity{
    
    /*-- column --*/
    @Column(name = "name_skill")
    private String nameSkill;
    /*-- FOREIGN KEY --*/

    @ManyToMany(mappedBy = "skills")
    private List<UserEntity> users = new ArrayList<>();

    /*--GETTER SETTER--*/
    


    public List<UserEntity> getUsers() {
        return users;
    }
    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
    public String getNameSkill() {
        return nameSkill;
    }
    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }
}
