package edu.eci.TASKMICROSERVICERESTFULAPI.data;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import edu.eci.TASKMICROSERVICERESTFULAPI.dto.TasktDto;
import edu.eci.TASKMICROSERVICERESTFULAPI.utils.StatusType;


import java.util.Date;
import java.util.UUID;

public class Task {

    private String id;
    private String name;
    private String description;
    private StatusType status;
    private String assignedTo;

    @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date dueDate;

    @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date created;

    public Task( TasktDto dto ) {
        this.id =  UUID.randomUUID().toString();
        this.name = dto.getName();
        this.description = dto.getDescription();
        this.status = dto.getStatus();
        this.assignedTo = dto.getAssignedTo();
        this.dueDate = dto.getDueDate();
        this.created = new Date();
    }


    public Task( TasktDto dto, String id ) {
        this.id =  id;
        this.name = dto.getName();
        this.description = dto.getDescription();
        this.status = dto.getStatus();
        this.assignedTo = dto.getAssignedTo();
        this.dueDate = dto.getDueDate();
        this.created = new Date();
    }

    public String getId() {
        return id;
    }

    public StatusType getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

}
