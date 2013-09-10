#!/bin/sh

cd $1

git commit -m 'update'
git push --repo https://diversify-exp-user:diversify-exp-password@github.com/simonAllier/diversify-exp.git