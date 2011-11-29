#!/bin/bash

function fez {
    if [ $1 == 0 ];then
        echo $2
    else
        if [ $[$1 % 3] == 0 ] || [ $[$1 % 5] == 0 ];then
            fez $[$1-1] $[$2+$1]
        else
            fez $[$1-1] $2
        fi
    fi    
}

fez 999 0
