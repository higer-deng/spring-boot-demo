# 基础镜像，如果本地没有，会从远程仓库拉取
FROM jdk1.8
# 镜像制作人
MAINTAINER higer
#在容器中创建挂载点，可以多个
VOLUME ["/tmp"]

#声明容器打开的端口并没有实际上将它打开
EXPOSE 8080

# 将本地文件拷贝到镜像中
COPY spring-boot-demo-docker.jar demo-docker.jar

# 指定容器启动时要执行的命令，但如果存在CMD指令，CMD中的参数会被附加到ENTRYPOINT指令的后面
ENTRYPOINT ["java","-jar","demo-docker.jar"]





