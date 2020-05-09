
    
    stage('Checkout') {
         parallel chrome: {
            node('master'){
                    git 'https://github.com/duotechacademy/JenkinsCrossBrowserParallelTestingCucumberFramework' 

            }
                
            },
            firefox: {
               node('mac'){  
                           git 'https://github.com/duotechacademy/JenkinsCrossBrowserParallelTestingCucumberFramework' 
 
               }
                   
            },
            edge: {
               node('linux'){  
                           git 'https://github.com/duotechacademy/JenkinsCrossBrowserParallelTestingCucumberFramework' 
 
               }
                   
               }
             
        
        
    }


    stage('Build and Test') {
        
        parallel chrome: {
            node('master'){
            bat label: '', script: 'mvn verify -Dbrowser="chrome"' 
            }
                
            },
            firefox: {
               node('mac'){  
                    bat label: '', script: 'mvn verify -Dbrowser="headlessChrome"' 
               }
                   
            },
            edge: {
               node('linux'){  
                    bat label: '', script: 'mvn verify -Dbrowser="edge"'
               }
                   
               }
    
        
    }
    
     stage('Report') {
        
        parallel chrome: {
            node('master'){
        junit '**/*Cucumber.xml'            }
                
            },
            firefox: {
               node('mac'){  
        junit '**/*Cucumber.xml'               }
                   
            },
            edge: {
               node('linux'){  
        junit '**/*Cucumber.xml'               }
                   
               }
    
        
    }
    
     
     
    stage('Email') {
        
        parallel chrome: {
            node('master'){
                step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'duotechinstructor@gmail.com', sendToIndividuals: false])
            }
                
            },
            firefox: {
               node('mac'){  
                step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'duotechinstructor@gmail.com', sendToIndividuals: false])
               }
                   
            },
            edge: {
               node('linux'){  
                    step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'duotechinstructor@gmail.com', sendToIndividuals: false])
               }
                   
               }
    
        
    }
    
   

   
