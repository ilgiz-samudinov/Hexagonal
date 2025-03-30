package ie.example.hehagonal.application.service;

import ie.example.hehagonal.application.ports.in.TaskService;
import ie.example.hehagonal.domain.model.Task;
import ie.example.hehagonal.application.ports.out.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    @Transactional
    public Task createTask(Task task) {
        return  taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        return null;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(taskRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Такая задача не существует")));

    }

    @Override
    public Optional<Task> findByTitle(String title) {
        return Optional.ofNullable(taskRepository.findByTitle(title)
                .orElseThrow(() -> new EntityNotFoundException("Такая задача не существует")));
    }

    @Override
    @Transactional
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }
}
