/* groovylint-disable-next-line EmptyMethod */
/* groovylint-disable-next-line MethodReturnTypeRequired */
def call() {
    withSonarQubeEnv('sonar') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Netflix \
                    -Dsonar.projectKey=Netflix '''
    }
}
