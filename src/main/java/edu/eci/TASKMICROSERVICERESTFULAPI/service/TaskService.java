package edu.eci.TASKMICROSERVICERESTFULAPI.service;

import edu.eci.TASKMICROSERVICERESTFULAPI.data.Task;
import edu.eci.TASKMICROSERVICERESTFULAPI.dto.TasktDto;

import java.util.List;

public interface TaskService {

    Task create(Task task);

    Task findById(String id);

    List<Task> all();

    void deleteById(String id);

    Task update(TasktDto task, String id);

}
