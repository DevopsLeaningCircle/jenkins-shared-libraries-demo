# Jenkins Shared Libraries Demo

Store reusable pipeline code in a separate Git repository, allowing multiple Jenkins pipelines to share the same functions, steps, and even complete pipeline templates.


## Shared Libraries structure

    jenkins-shared-libraries-demo/
    └── vars/
        └── helloWorld.groovy
    └── src/
        └── org/example/Utils.groovy
    └── resources/
    └── README.md
