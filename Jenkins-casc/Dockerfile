FROM jenkins/jenkins:lts

USER root

# Install CasC plugin
RUN jenkins-plugin-cli --plugins configuration-as-code

# Copy groovy script to disable setup wizard
COPY init.groovy.d/disable-setup.groovy /usr/share/jenkins/ref/init.groovy.d/

USER jenkins

# Environment variable for CASC
ENV CASC_JENKINS_CONFIG=/var/jenkins_home/jenkins.yaml

EXPOSE 8080
