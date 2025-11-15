import jenkins.model.Jenkins

// Skip initial setup wizard
Jenkins.instance.setInstallState(jenkins.model.InstallState.INITIAL_SETUP_COMPLETED)

