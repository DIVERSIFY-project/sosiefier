#!/bin/sh
cd  /root/redis-stable/src/
./redis-server &
unset http_proxy
sh /root/SMART-GH/run_hooper.sh
sh /root/SMART-GH/run_web.sh &

