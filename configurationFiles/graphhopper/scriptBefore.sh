#!/bin/sh
cd  /root/redis-stable/src/
./redis-server &
unset http_proxy
cd /root/diversify-statements
sh /root/SMART-GH/run_hopper.sh
sh /root/SMART-GH/run_web.sh &

