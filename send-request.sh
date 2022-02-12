#!/bin/sh

if [ -z "$1" ]
  then
    echo "No argument supplied"
    exit 1
fi

curl -X POST http://localhost:8080/api/v1/messages/send -H "Content-Type: application/json" --data-binary @- <<DATA
{
  "message": "$1"
}
DATA
