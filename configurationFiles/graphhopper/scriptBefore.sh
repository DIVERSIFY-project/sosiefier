#!/bin/sh
cd  /root/redis-stable/src/
./redis-server &
unset http_proxy
Xvfb :10 -ac &
export DISPLAY=:10
cd /root/diversify-statements
sh /root/SMART-GH/run_hopper.sh
sh /root/SMART-GH/run_web.sh &
unset http_proxy


