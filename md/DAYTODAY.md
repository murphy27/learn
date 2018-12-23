##2018-12-17

tips
加入这个包之后, 页面会自动找 static 下面的index.html 文件
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

tips
application.properties和application.yml
可以同时存在两个文件,
不过,如果两个文件中同时存在一个属性,以 .properties下的生效
----------------------------------
##2018-12-20

在 Java 的 File 类中，有一个 createTempFile(String prefix,String suffix)，
调用它后，会在系统默认的临时文件目录中创建一个临时文件。
prefix 表示文件名。
suffix 表示文件的后缀，形如 “.tmp”，注意这里需要包含 “.” 哦！

----------------------------------
##2018-12-22

解释一下CountDownLatch概念?
CountDownLatch 和CyclicBarrier的不同之处?
给出一些CountDownLatch使用的例子?
CountDownLatch 类中主要的方法?

每个学生发一个试卷,做完了后,等全部人都做完了,要交试卷的,
要全部人都交卷了才行,就是CountDownLatch的计数为0(未交卷的人数为0)

CyclicBarrier的话,就是学生做完了试卷就停下笔来,安静坐着(c.wait),
等全部人都做完了大家一起交卷.

----------------------------------
##2018-12-23

学习弄了线程的几个模式, 理解的还是不是很好. 
    

----------------------------------
##2018-12-24


    

----------------------------------
# 个人开发测试
 个人开发测试
