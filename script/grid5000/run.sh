#!bin/sh
rm -r tmpNodeDir
mkdir tmpNodeDir

rm grid_nodes
oargridstat -w -l $2 | sort -u > grid_nodes

cd tmpNodeDir
split -l $1 ../grid_nodes

for nodes in $(ls)
do
echo $nodes
kadeploy3 -f $nodes --multi-server -a ../diversify-exp.env -k http://public.rennes.grid5000.fr/~sallier/authorized_keys &
done
cd ..