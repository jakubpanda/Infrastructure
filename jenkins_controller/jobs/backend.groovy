pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/jakubpanda/Backend.git")
                    }
                    branches('main')
                    scriptPath('JenkinsFile')
                }
            }
        }
    }
}