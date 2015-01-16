#!bin/sh
oargridstat -w -l $1 | sort -u > grid_nodes
kadeploy3 -f grid_nodes --multi-server -a diversify-exp.env -k http://public.rennes.grid5000.fr/~sallier/authorized_keys