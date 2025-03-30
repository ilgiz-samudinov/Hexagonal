package ie.example.hehagonal.adapters.out.persistence;

import ie.example.hehagonal.adapters.out.persistence.entity.TaskEntity;
import ie.example.hehagonal.adapters.out.persistence.mapper.TaskMapper;
import ie.example.hehagonal.domain.model.Task;
import ie.example.hehagonal.application.ports.out.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    private final JpaTaskRepository jpaTaskRepository;
    private final TaskMapper taskMapper;

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = taskMapper.toEntity(task);
        TaskEntity savedEntity = jpaTaskRepository.save(taskEntity);
        return taskMapper.toDomain(savedEntity);
    }

    @Override
    public List<Task> findAll() {
        return jpaTaskRepository.findAll().stream()
                .map(taskMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Task> findById(Long id) {
        return jpaTaskRepository.findById(id)
                .map(taskMapper::toDomain);
    }

    @Override
    public void delete(Long id) {
        jpaTaskRepository.deleteById(id);
    }

    @Override
    public Optional<Task> findByTitle(String title) {
        return jpaTaskRepository.findByTitle(title)
                .map(taskMapper::toDomain);
    }
}
