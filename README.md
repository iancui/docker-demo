# 测试使用docker部署springboot程序

## 安装Docker

[参考文档]: https://blog.csdn.net/weixin_43423864/article/details/109481260

1. 卸载docker旧版本


```shell
yum remove docker \
                   docker-client \
                   docker-client-latest \
                   docker-common \
                   docker-latest \
                   docker-latest-logrotate \
                   docker-logrotate \
                   docker-engine
```

2. 安装yum-utils软件包

   ```shell
   yum install -y yum-utils
   ```

3. 设置Docker仓库（这里使用阿里云地址）

   ```shell
   yum-config-manager \
       --add-repo \
       http://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo
   ```

4. 更新yum软件包索引

   ```shell
   yum makecache fast
   ```

5. 安装最新版本的Docker

   ```shell
   yum install docker-ce docker-ce-cli containerd.io
   ```

   

6. 启动docker

   ```shell
   systemctl start docker
   ```

   

7. 查看docker版本

   ```shell
   docker version
   ```

   

8. 测试运行

   ```shell
   docker run hello-world
   ```

## 使用 Docker 部署 Spring Boot

[参考文档]: https://www.cnblogs.com/ityouknow/p/8599093.html

1. 打包上传到服务器上

![1620883635862](.\1620883635862.png)



2. 执行挂载启动命令

   ```shell
   #打包到docker里
   docker build -t cuihd/docker-demo .
   
   #启动容器 -d后台运行 -p 外部端口:内部端口 -t image的名字 --name 指定容器的名称
   docker run --name docker-demo -d -p 8090:8090 -t cuihd/docker-demo
   
   # 结束
   docker stop docker-demo
   
   # 删除image
   docker rm docker-demo
   ```

   