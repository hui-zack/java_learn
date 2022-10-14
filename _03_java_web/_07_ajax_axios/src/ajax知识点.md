#ajax:
[ajax原生请求]
    [server端](main/java/web/_1_ajax/_1_ajaxBasic)
    [client端](main/webapp/_1_ajaxBasic.html)
[ajax用户名提示案例]
    [server端](main/java/web/_1_ajax/_2_ajaxCase__loginSelect)
    [client端](main/webapp/_2_register.html)
    
    情况说明:
        1.AJAX的作用: 
            (1) 异步通信:
                与服务器进行数据交换(通过ajax可以给服务器发送请求, 并获取所有服务器响应的数据)
                可以通过Ajax + html 替换jsp页面    
            (2) 异步交互
                可以在不加载整个页面的情况下, 与服务器交换数据并更新部分网页
                如: 搜索联想, 用户名是否可用校验等等
        2. 同步和异步
            同步: 浏览器请求服务器时, 在服务器处理时间内无法操作原页面
            异步: 浏览器请求服务器时, 后台处理请求, 在服务器处理时间内可以操作原界面
    内容:
        1. ajax原生代码发送请求并接收响应
            步骤一 创建ajax核心对象
                var xHttp;
                if (window.XMLHttpRequest) {
                    xHttp = new XMLHttpRequest();
                } else {
                    // code for IE6, IE5
                    xHttp = new ActiveXObject("Microsoft.XMLHTTP");
                }
            步骤二 发送请求
                xHttp.open("POST", "http://localhost/ajaxServlet");
                xHttp.send();
            步骤三 获取响应对象
                xHttp.onreadystatechange = function() {
                    if (this.readyState == 4 && this.status == 200) {
            
                            alert(this.responseText);
                    }
                };
#axios异步框架
[axiosBasic]
    [servlet](main/java/web/_2_axios/_1_axiosBasic/axiosServlet.java)
    [client](main/webapp/_2_1_axios.html)
[case__axiosRegister]
    [servlet](main/java/web/_2_axios/_2_axiosCase__login/axiosLoginServlet.java)
    [client](main/webapp/_2_2_axiosRegister.html)
    
    情况说明:
        * axios:
            axios是对ajax进一步的封装以简化开发流程
    内容:
        1. 原生axios发送请求:
            (0) 引入axios支持文件: 
                <script src="js/axios-0.18.0.js"></script>
                
            (1) 发送get请求:
                axios ({
                    method: "get",
                    url: "http://localhost/axiosServlet?username=admin"
                }).then(function (response) {
                    alert(response.data);
                })
            (2) axios发送post请求:
                axios({
                    method: "post",
                    url: "http://localhost/axiosServlet",
                    data: "username=baby"
                }).then(function (response) {
                    alert(response.data);
                })
        2. axios简化发送请求:
            (0) 引入axios支持文件: 
                <script src="js/axios-0.18.0.js"></script>
            
            (1) 发送get请求
                axios.get("http://localhost/axiosServlet?username=admin").then(function (resp) {
                    alert(resp.data);
                })
    
            (2) 发送post请求(别名)
                axios.post("http://localhost/axiosServlet", "username=baby").then(function (resp) {
                    alert(resp.data)
                })