[session目录]
    [设置和获取session]:
    [设置和获取Session]:
    [cookie和session的区别]:
    
# 设置和获取Session:
-->[sessionPart1](_1_session_used/_1_sessionPart1.java)    
-->[sessionPart2](_1_session_used/_2_sessionPart2.java)

	情况说明:
		1. 获取Session:
		    服务器会话跟踪技术, 将数据保存到服务端
		2. session原理:
		    保证在一次会话的两个请求间获取的是同一个session
		        设置session的请求: 在定义session键值的时候, servlet会自动返回一个cookie:JSESSIONID=xxx
		        获取session的请求: 自动携带cookie中存储的sessionId, servlet根据sessionId, 从内存中创建/获取对象
		        结论: session的实现基于cookie:    
        3. session的钝化和活化:
            钝化: 服务器正常关闭时, tomcat将session对象到硬盘
                session存储目录: target\tomcat\work\Tomcat\localhost\_\
            活化: 服务器再次开启时, tomcat将session对象写入到内存, 并保持其原先的sessionID
        
    内容:
        1. 设置和获取session
            (1) 获取session对象:
                HttpSession session = req.getSession();		
            (2) session方法:
                1) 存储数据到Session域:
                    void setAttribute(String name, Object o)
                2) 根据key获取value:
                    Object getAtrribute(String name)
                3) 根据key, 删除该键值对:
                    void removeAttribute(String name)
                4) Session销毁:
                    1^ 销毁时间: session销毁时间默认为30分钟, 可以在项目的web.xml或tomcat根目录的conf/web.xml中修改默认销毁时间:
                        <web-app>
                            <display-name>Archetype Created Web Application</display-name>
                            <session-config>
                                <session-timeout>30</session-timeout>           <!-- 设置session默认销毁时间 -->
                            </session-config>
                        </web-app>
                    2^ 使用session对象的invalidate()方法销毁session
                        session.invalidate();  

# cookie和session的区别
    cookie和session都是来完成一次会话内多次请求间数据的
    区别: 
        存储位置:   cookie是间数据存储到客户端, session将数据存储到服务端
        安全性:     cookie不安全, Session安全
        数据大小:   cookie最大3KB, session大小无限制
        存储时间:   cookie可以长期存储, session默认30分钟
        服务器性能: cookie不占服务器资源, session占用服务器资源
        
