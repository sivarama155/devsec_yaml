/* groovylint-disable-next-line EmptyMethod */
/* groovylint-disable-next-line MethodReturnTypeRequired */
def call() {
    withSonarQubeEnv('sonar') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${env.MY_VARIABLE} \
                    -Dsonar.projectKey=${env.MY_VARIABLE} '''
    }
}
