# SpringBootWithExternalTomcat
A Spring boot project with external tomcat

-- This is a Spring boot project and war file is deployed on External Tomcat,Also I have used h2 in memory DB to persist the record and fetch from in memory DB.
 -- Here is how to run this project
 
 1 . Clone the project in your local machine
 2. run Maven- tomcat7:deploy
 3. a WAR packaging will be deployed in your tomcat
 4. Here are the endpoints to run to test from Postman,browser (since both are GET requests)
  A) http://localhost:8091/pukhraj/greetings - will return a String "Hello Pukhraj"
  B) http://localhost:8091/pukhraj/getStudent?id=10001 - will return the name of the Student whose id= 1001
  
  External Setup is needed to configure the tomcat
  1. Install Tomcat
  	Let's make these changes in $CATALINA_HOME\conf\tomcat-users:
	<role rolename="manager-gui"/>
	<role rolename="manager-script"/>
	<user username="admin" password="password" roles="manager-gui, manager-script"/>
	
  2. Go to c:/tomcat/bin -> service install tomcat7/8/9.exe
  3. Go to c:/tomcat/bin -> run tomcat.start script
  
  4.Create settings.xml in A user’s install: ${user.home}/.m2/settings.xml
  	 <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                          https://maven.apache.org/xsd/settings-1.0.0.xsd">
      <localRepository/>
      <interactiveMode/>
      <offline/>
      <pluginGroups/>
      <server>
    <id>TomcatServer</id>
    <username>tomcat</username>
    <password>tomcat</password>
</server>
      <mirrors/>
      <proxies/>
      <profiles/>
      <activeProfiles/>
    </settings>
