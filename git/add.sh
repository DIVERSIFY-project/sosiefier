#!/bin/sh

cd $1


git add $2
git commit -m '$3'
git push --repo https://diversify-exp-user:diversify-exp-password@github.com/simonAllier/diversify-exp.git