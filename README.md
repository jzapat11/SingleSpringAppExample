# SingleSpringAppExample
Single Spring app to check how spring property placehoder configurer works. 

# Prerequisites
- Maven 3.1+
- JDK 1.7+

# How to test
- Build the app with maven. `mvn clean package`
- Move the jar artifact located in target folder within you parent project directory, to any prefered directory for execution.
- Locate your spring dependencies from .m2 maven folder and copy them into your execution directory.
- Execute your jar typing this in the command line `java-DENV=DEV -jar SingleSpringExampleApp.jar`
  - the `ENV system variable` is needed for execution, so that the app can take the especific properties file from an especific environment.
