
# An example setup with multiple extension points

- module1: example extension point
- module2: another example extension point
- application: the actual (final) management interface. composed of core console (AS7), module1 and module2


## Constraints

- module require their own namespaces (package names & maven artifactId)
- for inclusion in composite modules, depend on the *-sources.jar artifact
- modules can reduce the number permuations (aka browser/language combinations),
  however the final console should not.

Some noteworthy gotchas:

- the extensions (bean factory, gin module, etc) are all treated as "mixins" for
a final class that acts as the main entry point. since this basically means we are building
an inheritance hierarchy it might happen that extensions collide on method or class names.
The compiler catches these cases and they are trivial to fix.

## Module Development

Switch to the 'application' directory and launch the hosted mode:

`cd application
mvn gwt:run`

## Building a composite module

The "application" directory contains a composite module.
The composite pulls in several extensions as maven dependencies (note the *-sources classfier).

Like the other module you can either run the hosted mode

`mvn gwt:run`

or package it for deployment

`mvn clean install`

## Deployment

Currently the console is integrated as an AS7 module. Hence the deployment as war file is not supported.
Documentation will be provided soon.

## Problems?

Please post any questions to the jboss as 7 mailing list:
jboss-as7-dev@lists.jboss.org


Have fun.
















