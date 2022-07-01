package springboot.app.repository;

import springboot.app.model.entity.ClassEntity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassEntity, Long>{
}
