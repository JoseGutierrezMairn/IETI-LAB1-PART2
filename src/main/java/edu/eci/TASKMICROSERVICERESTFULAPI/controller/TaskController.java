package edu.eci.TASKMICROSERVICERESTFULAPI.controller;


import edu.eci.TASKMICROSERVICERESTFULAPI.data.Task;
import edu.eci.TASKMICROSERVICERESTFULAPI.dto.TasktDto;
import edu.eci.TASKMICROSERVICERESTFULAPI.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping( "/v1/task" )
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all(){
        return ResponseEntity.status(HttpStatus.OK).body( taskService.all() );
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body( taskService.findById( id ) );
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update( @RequestBody TasktDto task, @PathVariable String id ){
        try{
            return ResponseEntity.status(HttpStatus.OK).body( taskService.update( task , id ) );
        }catch ( Exception e ){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( null );
        }

    }

    @PostMapping
    public ResponseEntity<Task> create ( @RequestBody TasktDto task ){
        try{
            return ResponseEntity.status(HttpStatus.OK).body( taskService.create( new Task ( task ) ) );
        }catch ( Exception e ){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( null );
        }
    }

    @DeleteMapping("/{id}" )
    public ResponseEntity<Boolean> delete ( @PathVariable String id ){
        try{
            taskService.deleteById( id );
            return ResponseEntity.status(HttpStatus.OK).body( true );
        }catch ( Exception e ){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( false );
        }

    }
}
