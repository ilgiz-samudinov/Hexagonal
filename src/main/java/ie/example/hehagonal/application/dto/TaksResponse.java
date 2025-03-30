package ie.example.hehagonal.application.dto;

import ie.example.hehagonal.domain.valueobject.TaskPriority;
import ie.example.hehagonal.domain.valueobject.TaskStatus;
import lombok.Data;

import java.time.LocalDate;
@Data
public class TaksResponse {

    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private LocalDate deadLine;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
