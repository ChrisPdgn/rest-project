# rest-project
1ο Παραδοτέο Κατανεμημένα Συστήματα Ομάδα 50 Θέμα 2ο  
21878 Παπαδογιάννη Χριστίνα  
21838 Καρασάββας Σπυρίδων  

# Import & Run Project  
- Download the project  
- Extract the contents of .zip in a folder  
- Open Eclipse  
- File -> Open Projects from File System -> Add existing folder by pressing 'Directory' -> Open -> Finish  
- Run rest-project as a java application
  
# Prepare Database  
- Create a database with name 'rest_project'  
```
CREATE DATABASE rest_project;
```
- Copy & run all the commands from file 'mysql commands' with the order they are shown  
  
  
*IMPORTANT*  
In order to connect the database with the application you must change the below properties in application.properties: 
```
spring.datasource.username = YOUR_USERNAME
spring.datasource.password = YOUR_PASSWORD
```
  
# Extras  
Default server port: 9090  
Swagger API Documentation link: http://localhost:9090/swagger-ui/index.html
