Demo for javafx-maven-plugin issue [#18](https://github.com/openjfx/javafx-maven-plugin/issues/18).

From project root, run:

    $ mvn clean install
    $ cd app
    $ mvn javafx:run

You should see WARNING like:

    [WARNING] Can't extract module name from core-0.1-SNAPSHOT.jar: ClassInDefaultPackage.class found in top-level directory (unnamed package not allowed in module)
    
And the application should fail to start.

By removing `core/src/main/java/ClassInDefaultPackage.java`, the failure should go away and
the javafx app (simple Hello World pane) should run/open successfully.
