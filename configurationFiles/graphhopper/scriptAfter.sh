#!/bin/sh
http_proxy="http://proxy.rennes.grid5000.fr:3128"
./root/tomcal7/bin/shutdown.sh
rm -r /root/tomcal7/webapps/
mkdir /root/tomcal7/webapps/