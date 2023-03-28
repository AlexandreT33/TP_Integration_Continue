#!/bin/bash

function pause(){
    read -s -n 1 -p "Press any key to continue . . ."
    echo ""
}

for arg in "$@"
do
    case $arg in
        "--help" )
           echo "--help : this help";
           echo "-b : Build the app";
           echo "-l : Launch the app";
           echo "-bl : Build and launch the app";;
        "-b" )
            echo "...Building package";
            cd ./TP_Integration_Continue;
            mvn package;;
        "-l" )
            echo "...Launching package";
            java -cp ./TP_Integration_Continue/target/TP_Integration_Continue-1.0-SNAPSHOT.jar com.GroupeTP.app.App;;
        "-bl" )
            echo "...Building package";
            cd ./TP_Integration_Continue;
            mvn package;
            echo "...Launching package";
            cd ..
            java -cp ./TP_Integration_Continue/target/TP_Integration_Continue-1.0-SNAPSHOT.jar com.GroupeTP.app.App;;
   esac
done


