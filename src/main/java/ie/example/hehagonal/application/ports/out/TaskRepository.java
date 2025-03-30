package ie.example.hehagonal.application.ports.out;



import ie.example.hehagonal.adapters.out.persistence.entity.TaskEntity;
import ie.example.hehagonal.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Task save (Task task);
    List<Task>  findAll();
    Optional<Task> findById(Long id);
    void delete (Long id);

    Optional<Task> findByTitle(String title);
}
