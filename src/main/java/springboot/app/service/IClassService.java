package springboot.app.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import springboot.app.model.dto.ClassDTO;

public interface IClassService {
    List<ClassDTO> findAll(Pageable pageable);
    int totalItem();
}
