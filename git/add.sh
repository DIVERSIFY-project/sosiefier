#!/bin/sh

cd $1

git add $2
git commit -m $3
git push 