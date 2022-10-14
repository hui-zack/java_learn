[目录]
    
#Filter
[filterPart1](main/java/web/filterUsed/filterPart1.java)
[filterPart2](main/java/web/filterUsed/filterPart2.java)
    
    情况说明:
        1. Filter: 
            Filter是javaweb三大组件之一(Servlet, Filter, Lister)
            Filter可以拦截请求, 阻止其访问资源
        2. Filter的用处: 
            通常用来完成一些通用的操作, 比如权限控制, 空白字符处理, 统一编码处理, 敏感字符处理等
        3. Filter执行的流程: 
            访问对应资源, 先执行放行前逻辑, 资源访问完成后, 仍然会回到Filter中, 然后开始执行放行后的逻辑
            执行流程: 
                浏览器访问资源 -> 执行放行前逻辑 -> 访问资源 -> 回到Filter执行放行后的逻辑
        4. 过滤器链
            一个web应用, 可以配置多个过滤器, 多个过滤器称为过滤器链
            
    内容:
        1. filter快速流程:
            (1) 定义类: 
                说明: 实现Filter接口, 需重写其所有方法
                Filter接口源码: 
                    @WebFilter("/*")                                    //2. 实现
                    public class FilterDemo implements Filter{          //1. 实现接口
                        public void init (FilterConfig gilterConfig){
                            ...;
                            chain.doFilter(req, resp);                  //3. 放行
                        }
                        public void doFilter(Servletrequest request){
                            ...;
                        }
                        public void destory(){
                            ...;
                        }
                    }
        2. 拦截路径配置
                (1) 拦截具体的资源:   "/index.jsp"   只有访问index.jsp时才会被拦截
                (2) 目录拦截:        "/user/*"      访问/user下的所有资源, 都会被拦截  
                (3) 后缀名拦截:      "*.jsp"        访问后缀名为jsp的资源, 都会被拦截
                (4) 拦截所有         "/*"           访问所有资源, 都会被拦截
            
        3. 过滤器链 
            有多个过滤器, 优先级按照过滤器类名(字符串)的自然排序来排