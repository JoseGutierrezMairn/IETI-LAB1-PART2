package edu.eci.TASKMICROSERVICERESTFULAPI.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import edu.eci.TASKMICROSERVICERESTFULAPI.utils.StatusType;

import java.util.Date;



public class TasktDto {

    private String name;
    private String description;
    private StatusType status;
    private String assignedTo;
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date dueDate;
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date created;


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


    public StatusType getStatus() {
        return status;
    }
}
