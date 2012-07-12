
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


Some noteworthy gotchas:

- the extensions (bean factory, gin module, etc) are all treated as "mixins" for
a final class that acts as the main entry point. since this basically means we are building
an inheritance hierarchy it might happen that extensions collide on method or class names.
The compiler catches these cases and they are trivial to fix.

Module Development
------------------

Typically you would work on a module at a time.
You can easily switch into the module directory and launch the hosted mode:

`cd module2
mvn gwt:run`


Since it's not a composite module you will only see any UI extension scoped to a particular module.
But it allows you to rely on the quick turn around times that hosted mode + brwoser refresh give you


Building a composite module
---------------------------

The application directory contains a composite module.
The composite pulls in several extensions as maven dependencies (note the *-export classfier).

Like the other module you can eiterh run the hosted mode

`mvn gwt:run`

or package it for deployment

`mvn clean install`

Deployment
----------

Currently the console is integrated as an AS7 module. Hence the deployment as war file is not supported.
You'll notice that the actual target/*.war is basically an emtpy wrapper.  However it needs to exists due to the nature
of the maven gw plugin (hosted mode), which expects a war project structure.
















