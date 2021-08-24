<img align="right" src="https://github.com/ada-school/module-template/blob/main/ada.png">


## Spring Boot Rest API

**Learning Objectives**

- Explain what needs to be donde to achieve the Level 2 on a  RESTFUL API on the Richardson Maturity Model.
- Implement a Level 2 Users RESTFUL API Microservice.
- Implement a Level 2 Tasks RESTFUL API Microservice.
-  User dependencies injections to create a decoupled architecture.


## Growth Mindset 🤹🏽

"Individuals who believe their talents can be developed (through hard work, good strategies, and input from others) have a growth mindset. They tend to achieve more than those with a more fixed mindset (those who believe their talents are innate gifts)" [What Having a "Growth Mindset" Actually means - Harvard Business Review](https://hbr.org/2016/01/what-having-a-growth-mindset-actually-means)  


**Main Topics**
 * Microservices.
 * RESTFUL API.
 * Richardson Maturity Model.
 * Dependencies Injection.

## Codelab 🧪

🗣️ "I hear and I forget I see and I remember I do and I understand." Confucius


### Part 2: Implementing the Tasks Microservice RESTFUL API

1. Create a new project using the [Spring Initializr](https://start.spring.io/)
  * Use either *Java* or *Kotlin* as programming language.
  * Use Gradle as project option(if your computer is slow then use  Maven)
  * Add Spring Web dependency before generating the project.
2. Create a new repository on Github and commit the files generated in 1.
3. Create a new package called *dto* and inside define your *TaskDto* object with at least the following fields:
    * name.
    * description.
    * status [TODO, DOING, REVIEW and DONE].
    * assignedTo.
    * dueDate.
    * created.
4. Create a new package called *data* and inside define your *Task* data object with at least the following fields:
    * id.
    * name.
    * description.
    * status [TODO, DOING, REVIEW and DONE].
    * assignedTo.
    * dueDate.
    * created.
5. Create a new package called *service* an inside create the following interface:

**Java:**
 ```java
     public interface TaskService
     {
         Task create( Task task );

         Task findById( String id );
         
         List<Task> all();

         void deleteById( String id );

         Task update( Task task, String id );
     }
  ```
  **Kotlin:**
  ```kotlin
      interface TaskService {

         fun create( task: Task): Task

         fun findById( String id ): Task?
         
         fun  all(): List<Task>

         fun deleteById( String id )

         fun update( Task task, String id ): Task

      }
  ```
6. Create an implementation of the TaskService using a HashMap data structure inside.
7. Make your service implementation *TaskServiceHashMap* injectable using the *@Service* annotation.
8. Implement you *TaskController* (try to avoid copy paste, use the User Microservice as reference but try doing it consciously).
9. Test ALL the endpoints of your API using PostMan or any other tool of your preference.

# Tests
- Testing create task request
![create()](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/create.PNG?raw=true)   

- Testing get all tasks request   
![getAll()](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/getAll.PNG?raw=true)   

- Testing get task by id request
![getById()](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/getById.PNG?raw=true)   

- Testing update task request
![update()](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/update.PNG?raw=true)   
    - Api rest response is an error because the id task does not exist
	![update fails](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/updateFails.PNG?raw=true)   

- Testing delete task request
![delete()](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/delete.PNG?raw=true)   
    - Api rest response is an error because the id task does not exist   
	![delete fails](https://github.com/JoseGutierrezMairn/IETI-LAB1-PART2/blob/master/img/deleteFails.PNG?raw=true) 
	



