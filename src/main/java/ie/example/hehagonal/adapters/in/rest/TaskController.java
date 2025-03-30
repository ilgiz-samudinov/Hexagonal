package ie.example.hehagonal.adapters.in.rest;

import ie.example.hehagonal.application.ports.in.TaskService;
import ie.example.hehagonal.domain.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskUseCase;


    @PostMapping
    public ResponseEntity<Task> save(@RequestBody Task task){
        return ResponseEntity.ok(taskUseCase.createTask(task));
    }

    @GetMapping
    public List<Task> findAll(){
        return taskUseCase.findAllTasks();
    }




}
