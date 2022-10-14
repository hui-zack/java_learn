[toc]
    [会话技术]:
    [servlet中设置和获取Cookie]: 
    [cookie对象]:
    
#[会话技术] 

    情况说明:
        * 会话:
            一次请求中包含多次servlet的请求和响应
        * 一次会话:
            从浏览器第一次给服务器发送请求开始, 直到有一方断开为止, 称为一次会话
        * 会话技术的目的:
            在一次会话中共享数据
        * 会话技术分类:
            1. 客户端会话技术: Cookie
            2. 服务器端会话技术: Session
            
[servlet中设置和获取Cookie]  
	使用流程:   
		--> [part1 Cookie快速流程和原理 设置cookie的servlet](_1_cookie_use/_1_cookiePart1.java)
	    --> [part2 Cookie快速流程和原理 接受Cookie的servlet](_1_cookie_use/_2_cookiePart2.java)  
#
    情况说明:  
        * Cookie是客户端会话技术, 可以将数据保存到客户端本地
        * Cookie在servlet中是一个已经定义好的类
        * Cookie原理:
			设置Cookie请求, servlet返回如下响应头要求浏览器本地设置Cookie:
                Set-Cookie:msg=hello             // 浏览器接受后设置Cookie
			之后浏览器的每一次请求都会自动携带设置的Cookie
			    cookie: username=zhanghui; password=123
		* 重点细节:
			1. 设置Cookie的请求中可以同时设置多个Cookie
			2. 默认情况下, Cookie存储在浏览器内存中, 但浏览器关闭时, 内存释放, 则Cookie被销毁
			    
        
    内容:  
        * servlet使用Cookie
            1. 实例化Cookie对象, 绑定需要共享的数据
                Cookie c = new Cookie(String name, String value);
            2. 通过response返回Cookie对象
                resp.addCookie(c);
            3. 在其他请求中指定Cookie, 在第二次请求中获取Cookie数据并遍历
                Cookie[] cs = req.getCookies();
                if (cs != null) {                           // 遍历Cookie数组
                    System.out.println("get-Cookie:");
                    for (Cookie c : cs) {
                        String name = c.getName();
                        String value = c.getValue();
                        System.out.println("    %s:%s".formatted(name, value));
                    }
                }
                
                
        * 设置持久化存储Cookie到用户电脑硬盘:

[cookie对象]     
	使用流程:
        --> [cookie对象 持久化存储-存储中文数据](_1_cookie_use/_1_cookiePart1.java)
#
    情况说明:
        1. cookie存储数据在客户端浏览器:
        2. 浏览器对于单个cookie的大小有限制(4kb), 以及对同一个域名下的总cookie数量也有限制(20个以内)
        3. cookie的作用:
            1) cookie一般用于存储少量的不太敏感的数据
            2) cookie常用于在不登录的情况下, 完成服务器对客户端的身份识别
        4. cookie存活时间:
            默认情况下, Cookie存储在浏览器内存中, 但浏览器关闭时, 内存释放, 则Cookie被销毁
	内容:
	    1. 实例化cookie对象:
	         Cookie c = new Cookie("msg", "hello");
	         
        2. 持久化存储Cookie到用户硬盘
			cookie.setMaxAge(int seconds):
				参数-seconds(默认-1):
					1) 正数: 将Cookie数据写入用户硬盘文件, 持久化存储, seconds后自动删除
					2) 负数: 默认值, 存储到内存, 浏览器关闭, 销毁Cookie
					3) 0: 要求浏览器删除Cookie
                说明:
                    默认情况下, Cookie存储在浏览器内存中, 但浏览器关闭时, 内存释放, 则Cookie被销毁
                    
        3. cookie存储中文数据
            tomcat7及以下:
                说明: 需要将中文数据转码-->一般采用url转码, 浏览器会自动解析        
            在tomcat8之后, cookie支持中文数据
            
        4. 同一服务器项目间共享cookie:
            setPath(String path):
                设置cookie的获取范围, 默认情况下, 设置当前的虚拟目录
                在一个tomcat服务器中, 部署了多个项目, 默认不共享
                参数:
                    cookie.set("/day15")                // 和当前服务器的day15项目共享cookie
                    cookie.set("/")                     // 和当前服务器的所有tomcat项目共享cookie
                    
        5. 不同服务器项目共享cookie
            cookie.domain(".baidu.com")         // 和百度共享cookie
                    /*
                        https://www.news.baidu.com; 
                            .baidu.com  --> 一级域名
                            .news       --> 二级域名
                    */
        
