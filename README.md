# 启动参数

## jgroups相关
```
-Djava.net.preferIPv4Stack=true
-Djgroups.tcpping.initial_hosts=192.168.2.3[7800],192.168.2.3[7801]
-Djgroups.bind_addr=192.168.2.3
```

## hotswap
```
-javaagent:./externlib/springloaded-1.2.3.RELEASE.jar
-noverify
```