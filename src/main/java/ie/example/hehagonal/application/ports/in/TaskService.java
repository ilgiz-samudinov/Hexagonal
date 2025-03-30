package ie.example.hehagonal.application.ports.in;


import ie.example.hehagonal.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    Task updateTask(Long id, Task task);
    Optional<Task> findById(Long id);
    Optional<Task> findByTitle(String title);

    List<Task> findAllTasks();
}
