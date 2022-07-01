package springboot.app.model.converter;

import org.springframework.stereotype.Component;

import springboot.app.model.dto.ClassDTO;
import springboot.app.model.entity.ClassEntity;

@Component
public class ClassConverter {
    public ClassEntity toEntity(ClassDTO dto){
        ClassEntity entity = new ClassEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setSize(dto.getSize());
		entity.setSkill(dto.getSkill());
        entity.setFsu(dto.getFsu());
		entity.setStatus(dto.getStatus());
		entity.setStartDate(dto.getStartDate());
		entity.setEndDate(dto.getEndDate());
		return entity;
    }
    public ClassDTO toDTO(ClassEntity entity){
        ClassDTO dto = new ClassDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setSize(entity.getSize());
		dto.setSkill(entity.getSkill());
        dto.setFsu(entity.getFsu());
		dto.setStatus(entity.getStatus());
		dto.setStartDate(entity.getStartDate());
		dto.setEndDate(entity.getEndDate());
		return dto;
    }
}
