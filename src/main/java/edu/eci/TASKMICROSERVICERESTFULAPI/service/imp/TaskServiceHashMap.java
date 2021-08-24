package edu.eci.TASKMICROSERVICERESTFULAPI.service.imp;

import edu.eci.TASKMICROSERVICERESTFULAPI.data.Task;
import edu.eci.TASKMICROSERVICERESTFULAPI.dto.TasktDto;
import edu.eci.TASKMICROSERVICERESTFULAPI.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap< String, Task > tasks = new HashMap();

    @Override
    public Task create(Task task) {
        String id = task.getId();
        if( tasks.containsKey( id ) ){
            System.out.println( "Como que existe ome?");
            throw new RuntimeException( "User already exists" );
        }
        tasks.put( id, task );
        return tasks.get( id );
    }

    @Override
    public Task findById(String id) {
        return tasks.get( id );
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>( tasks.values() );
    }

    @Override
    public void deleteById(String id) {
        if( !tasks.containsKey( id ) ){ throw new RuntimeException( "User Does not exist" ); }
        tasks.remove( id );
    }

    @Override
    public Task update(TasktDto task, String id) {
        deleteById( id );

        return create( new Task( task, id ) );
    }
}
