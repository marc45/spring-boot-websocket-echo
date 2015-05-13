#!/bin/sh
nohup java -Xmx1024m -Djava.net.preferIPv4Stack=true -Djgroups.bind_addr=10.252.118.66 -Djgroups.tcpping.initial_hosts=10.252.113.134[7800],10.252.118.66[7801] -jar adminserver-3.0.0.jar --spring.profiles.active=test --debug 2>&1 >> nohup.out &
echo $! > server.pid 

