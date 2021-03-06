--Setup up a Spring web app to be used as the Rest Service endpoint to be called by Spring MVC app
***Be sure you have m2e-wtp plugin for eclipse if you want to run on tomcat***
	(1) Choose File --> New Project --> maven-archetype-webapp
	(2) Add the spring dependencies that are in the pom.xml file, along with the jackson dependencies needed for JSON data mapping
	(3) Alter the webapp/WEB-INF/web.xml in order to map the dispatcher servlet.
	(4) Create the AppConfig class that servers as you 'DispatcherServlet'
	(5) Create your packages and classes for Config/Controller/Domain/Service/Repo layers
	(6) Annotate you Controller with the @RestController annotation at the class level
	(7) **Important** Be sure to create an empty default constructor for you domain class if you define any other constructors.
		--The default constructor is needed by the Jackson Mapper to instantiate the domain object.
		
	
******IMPORTANT*******
To Access the web app, you have to enter http://localhost:8080/{artifact ID}
	--This is listed in the first tab of the POM.xml

--Annotation Based config
	(1) Deleted the WEB-INF/springmvc-servlet.xml and replaced it with a new config file (com.sample.config.AppConfig) and configured it in WEB-INF/web.xml
	(2) You can break out the config files so that you do not have one huge monolithic config file with everything defined within it.
		--Example: I broke out the Services and Dao class configurations into their own Config files (ServiceConfig & DaoConfig) within the com.sample.config package
		--You can then use the @Import annotation in the main config class (AppConfig.java) to import and wire in the new config definitions. 	

	
	
--Creating repo
	(1) Issue git commands from git bash:
		--git remote add origin git@github.com:Deeze814/SpringREST.git
		--git push -u origin master
	(2) If you get an error saying it couldnt push, make sure your account is added as a collaborator in the github repo
	(3) If it still fails, open the project .git/config and make sure the url is correct.
		--For SpringMVC I had to make the following change
			--[remote "origin"]
				url = git@github.com:Deeze814.SpringMVC.git --> url = git@github.com:Deeze814/SpringMVC.git
				
--Eclipse settings
	(1) To get the normal Project Explorer, go to Window --> Open Perspective --> JavaEE
	(2) Switched form Luna to Mars and downloaded the JavaEE edition from:
		http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2 

--Troubleshooting
	(1) I created directory structure of /gitRest/SpringRest/SpringRest and used git bash to clone the repo into the new folder.
	(2) I couldnt get eclipse to import the project because it kept saying it already existed in the work space.
	(3) So I created a new folder structure, \gitRest\SimpleRestProject\SpringREST\SpringREST.
	(4) Then I deleted all .metadata and RemoteSystemsTempFiles from the first directory (so eclipse didnt recognize this a as a workspace)
	(5) And then Import --> Existing Maven Project, from the first directory into the second. 

	(1) In order to get the newly imported project to track the existing remote git repo:
	(2) In soucetree, Clone/New --> Add working copy, path to SpringRest project
	(3) In sourcetree, edit repo settings and make the remote URL https://Deeze814@github.com/Deeze814/SpringREST.git
	(4) Open git bash in the folder, and issue command:
			$git branch --set-upstream master origin/master
			--This told git to call my current local branch master and for it to tack the remote branch called master at the specified URL (https://Deeze814@github.com/Deeze814/SpringREST.git)
	(5) Then I just Staged all changes to resolve the conflicts and then pushed.
		