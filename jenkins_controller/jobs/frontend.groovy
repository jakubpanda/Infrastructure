pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/jakubpanda/Frontend.git")
                    }
                    branches('main')
                    scriptPath('JenkinsFile')
                }
            }
        }
    }
}