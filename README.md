### Java Spring template project

Create a new folder - dev

cd dev

git clone https://github.com/adhusury/SpringBootWeb.git

cd SpringBootWeb

Use Eclipse IDE: File --> Import --> Navigate to your Project folder "SpringBootWeb" 

Right click pom.xml file and install

Run: 

Navigate to com.example.demo.DemoApplication.java -> Right Click -> Run As -> Run Configurations ->  "VM Arguments" tab Copy the below

-Dspring.profiles.active=local 

Apply and Run
### 
Using browser navigate to http://localhost:5001/myFirstGet


