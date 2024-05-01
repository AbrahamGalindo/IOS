# WPS

This project contains the test cases created for a WPS project regression test.
These test cases are created in java with Gherkin language (Cucumber), using appium server for execution.

Tools and libraries used for creation:

Tools

    *Java
    *brew
    *Appium
    *XCode
    *IntelliJ

Libraries

    *JUnit
    *Cucumber
    *Extents reports

## Requirements instalation 📋

_1.- Tools for install_


       JAVA ------->brew install openjdk@17
                    sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
                    ls -lsah /Library/Java/JavaVirtualMachines/
                    cd ~
                    echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
                    export CPPFLAGS="-I/opt/homebrew/opt/openjdk@17/include"
                    source ~/.zshrc
       IntelliJ----->https://www.jetbrains.com/idea/download/?section=mac   **install community edition
       Appium------>npm i --location=global appium
       Xcuitest---->appium driver install xcuitest
                    brew tap wix/brew && brew install wix/brew/applesimutils

_2.- Disable the firewall option on the local machine_
     -Go to settings
     -Select Network
     -Disable firewall
     -Restart machine
![Screenshot 2023-08-17 at 2.30.52 PM.png](src%2Fimages%2FScreenshot%202023-08-17%20at%202.30.52%20PM.png)

## Execution test cases 🛠️

This instructions are for execution into your local machine

_1.- Clone the project into your machine(do you need previous permissions to repo or ask to give the project on .zip file)_

    git clone git@github.com:Summit-Digital-Group/evaluation-platform-automation.git

_2.- Open the project in IntelliJ_

    evaluation-platform-automation

_3.- Click on Build menu_

    select build menu
    select build project
![Screenshot 2023-08-16 at 9.28.29 PM.png](src%2Fimages%2FScreenshot%202023-08-16%20at%209.28.29%20PM.png)

_4.- Execute the WPS application en two iPads_

    ** Review the README from https://github.com/wpspublish-oes/evaluation-platform/tree/main/WPS **

    Open WPS project on Xcode and build the project on the nex specification iPads
    1.- iPad-----> iPad Pro (12.9-inch) (6th generation) ------>Admin
![Screenshot 2023-08-16 at 9.27.06 PM.png](src%2Fimages%2FScreenshot%202023-08-16%20at%209.27.06%20PM.png)
 
    2.- iPad-----> iPad (10th generation)                ------>Client
![Screenshot 2023-08-16 at 9.25.56 PM.png](src%2Fimages%2FScreenshot%202023-08-16%20at%209.25.56%20PM.png)

_5.- Execute this commans on terminal_

    /opt/homebrew/bin/appium -p 10001 

_6.- Execute this commans on other terminal_

    /opt/homebrew/bin/appium -p 10000 

_7.- Go to Runners folder_
    
    On the intelliJ go to src->test->java->Runners
![Screenshot 2023-08-16 at 9.21.40 PM.png](src%2Fimages%2FScreenshot%202023-08-16%20at%209.21.40%20PM.png)

    RigthClick on Runner class that do you need run
    -RunnerMatrices.class
    -RunnerFaces.class
    -RunnerVocabulary.class
    -RunnerWMI.class
    and select Run option
![Screenshot 2023-08-16 at 9.23.20 PM.png](src%2Fimages%2FScreenshot%202023-08-16%20at%209.23.20%20PM.png)

    NOTE: 
        1.- For the firts time to execute is necesary allow the permissions for web driver
        2.- For vocabulary execution first time is necesary the allow permissions on mic

## Author ✒️

* **Abraham Galindo** *