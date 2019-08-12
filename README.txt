Steps to run code.

1. Download the code from https://github.com/vara22g/macaddresslocator.git
2. unzip it, build the .jar file(file is size is more could not upload in git repo)
3. build jar file using below command 
   java -jar macaddresslocator-0.0.1-SNAPSHOT.jar
4. The repo has dockerfile to create docker image
5. REST API to runs on port 8090, check using command "netstat -apn | grep 8090"
   
  Active Connections

  Proto  Local Address          Foreign Address        State
  TCP    0.0.0.0:8090          0.0.0.0:0              LISTENING
  
To Run
===================  
6. Download the shell script "macaddresslocator.sh" on VM , run using below command
   ./macaddresslocator.sh <MAC>

   USAGE: echo "USAGE: $0 <MAC address>" 

output
==============
7. Return company name and IP address for a given MAC address   
   