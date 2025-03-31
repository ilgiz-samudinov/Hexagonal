package ie.example.hehagonal.adapters.out.persistence.mapper;

import ie.example.hehagonal.adapters.out.persistence.entity.TaskEntity;
import ie.example.hehagonal.domain.model.Task;
import ie.example.hehagonal.domain.valueobject.TaskPriority;
import ie.example.hehagonal.domain.valueobject.TaskStatus;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {


    public TaskEntity toEntity(Task domain) {
        return TaskEntity.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .description(domain.getDescription())
                .taskStatus(domain.getTaskStatus())
                .taskPriority(domain.getTaskPriority())
                .deadLine(domain.getDeadLine())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public Task toDomain(TaskEntity entity) {
        return Task.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .taskStatus(entity.getTaskStatus())
                .taskPriority(entity.getTaskPriority())
                .deadLine(entity.getDeadLine())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

}
