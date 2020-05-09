
    
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
               node('Linux'){  
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
               node('Linux'){  
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
               node('Linux'){  
        junit '**/*Cucumber.xml'               }
                   
               }
    
        
    }
    
     
     
    stage('Email') {
        
        parallel chrome: {
            node('master'){
                step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'steverocklow@gmail.com', sendToIndividuals: false])
            }
                
            },
            firefox: {
               node('mac'){  
                step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'steverocklow@gmail.com', sendToIndividuals: false])
               }
                   
            },
            edge: {
               node('Linux'){  
                    step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'steverocklow@gmail.com', sendToIndividuals: false])
               }
                   
               }
    
        
    }
    
   

   
