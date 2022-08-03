pipelineJob('appofapps') {

     parameters {
        stringParam('backendDockerTag')
        stringParam('frontendDockerTag')
     }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/jakubpanda/App_of_apps.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}