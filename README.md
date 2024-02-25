# springbootStarter

how to deploy using maven

# Prerequisiste :- Download maven and set it in environment path

# in cmd line
Go to your project directory where pom.xml is present

run the below command
# mvn clean install
this will create a jar file in your target folder 

   if you want war file, go to pom.xml and just below your project version and in packaging just enter the file packaging you want

    <groupId>com.javaproject</groupId>
    <artifactId>springbootstarter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>war</packaging>

after creating a jar/war file, run the below command to build the jar/war file
#  mvn package spring-boot:repackage
make sure pom.xml is present in your location path where you're running the above command     

this is how you get your project in an executable format and deploy and run it in any environment

this packaging can taken and deployed in any traditional servlet container 