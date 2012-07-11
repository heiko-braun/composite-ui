
An example setup with multiple extension points
-----------------------------------------------

- module1: example extension point
- module2: another example extension point
- application: the actual (final) management interface. composed of core console (AS7), module1 and module2


Constraints
-----------

- module require their own namespace (package names & maven artifactId)
- for inclusion in composite modules, depend on the <name>-export.jar artifact






