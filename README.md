
An example setup with multiple extension points
-----------------------------------------------

- module1: example extension point
- module2: another example extension point
- application: the actual (final) management interface. composed of core console (AS7), module1 and module2


Constraints
-----------

- module require their own namespace (package names & maven artifactId)
- for inclusion in composite modules, depend on the *-export.jar artifact
- modules can reduce the number permuations (aka browser/language combinations),
  however the final console should not.


Module Development
------------------

Typically you would work on a module at a time.
You can easily switch into the module directory and launch the hosted mode:

cd module2
mvn gwt:run

Since it's not a composite module you will only see any UI extension scoped to a particular module.
But it allows you to rely on the quick turn around times that hosted mode + brwoser refresh give you


Building a composite module
---------------------------

The application directory contains a composite module.
Composite means it pulls in several extensions as maven dependencies.










