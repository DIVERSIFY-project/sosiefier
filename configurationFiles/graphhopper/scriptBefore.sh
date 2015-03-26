#!/bin/sh

./root/redis-stable/src/redis-server
unset http_proxy
sh ../SMART-GH/run_hooper.sh
sh ../SMART-GH/run_web.sh &

