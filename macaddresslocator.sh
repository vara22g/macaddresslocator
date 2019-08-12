#!/bin/bash


echo "START OF SCRIPT"

if [ $# -ne 1 ]; then
    echo "USAGE: $0 <MAC Address>"
    exit 0
else 
   {
    mac=$1 
    echo "MAC ADDRESS":$mac
       curl -k http://localhost:8090/mac/search/$mac 
   }
fi
echo "END OF SCRIPT"
