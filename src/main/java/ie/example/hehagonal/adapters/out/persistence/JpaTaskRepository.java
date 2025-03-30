package ie.example.hehagonal.adapters.out.persistence;

import ie.example.hehagonal.adapters.out.persistence.entity.TaskEntity;
import ie.example.hehagonal.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
    Optional<TaskEntity> findByTitle(String title);
}
