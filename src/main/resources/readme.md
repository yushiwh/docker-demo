### docker直接打包
查看：https://blog.csdn.net/qq_40298902/article/details/106543208


[root@localhost ~]# firewall-cmd --query-port=6379/tcp  --查看是否开启端口
no
[root@localhost ~]# firewall-cmd --add-port=8888/tcp --permanent   --开启端口
success
[root@localhost ~]# firewall-cmd --query-port=8888/tcp
no
[root@localhost ~]# firewall-cmd --reload  --重新加载防火墙
success


访问：
http://10.2.152.73:8082/test















