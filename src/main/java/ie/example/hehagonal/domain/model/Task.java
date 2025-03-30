package ie.example.hehagonal.domain.model;

import ie.example.hehagonal.domain.valueobject.TaskPriority;
import ie.example.hehagonal.domain.valueobject.TaskStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private LocalDate deadLine;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
