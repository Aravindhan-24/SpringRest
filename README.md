# SpringRest

Spring REST demonstrates implementaion of Representational State Transfer using spring boot and H2 in memory database.

This projects makes 4 HTTP calls to implement CRUD operations using JPARepository interface

The follwing urls are used to retrive, delete, add, update data:

1. To fetch all student,<br />
   @GetMapping <br />
   localhost:8080/students <br />
  
2. To retrive a particular student, <br />
   @GetMapping <br />
   localhost:8080/student/{id} <br />
   
3. Add a student,<br />
   @PostMapping <br />
   localhost:8080/students <br />
   pass the staff details(rollNumber, name, department, date of birth) in body.<br />
   
4. Delete a student, <br />
   @DeleteMapping <br />
   localhost:8080/student/{id} <br />  
   
5. Update a student, <br />
   @PutMapping <br />
   localhost:8080/student <br/>
   pass the staff details(rollNumber, name, department, date of birth) in body.<br />
   
Tools:      Eclipse IDE, JPA, H2 database, POSTMAN. <br />
Technology: JAVA, spring boot.
