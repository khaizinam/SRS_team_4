package springboot.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import springboot.app.model.converter.ClassConverter;
import springboot.app.model.dto.ClassDTO;
import springboot.app.model.entity.ClassEntity;
import springboot.app.repository.ClassRepository;
import springboot.app.service.IClassService;
@Service
public class ClassService implements IClassService {
    @Autowired
	private ClassRepository classRepository;
    @Autowired
	private ClassConverter classConverter;
    
    @Override
	public List<ClassDTO> findAll(Pageable pageable) {
		List<ClassDTO> results = new ArrayList<>();
		List<ClassEntity> entities = classRepository.findAll(pageable).getContent();
		for (ClassEntity item: entities){
			ClassDTO newDTO = classConverter.toDTO(item);
			results.add(newDTO);
		}
		return results;
	}
    @Override
	public int totalItem() {
		return (int) classRepository.count();	
	}
}
