#!/bin/sh

./root/redis-stable/src/redis-server
unset http_proxy
sh run_hooper.sh
sh run_web.sh &

