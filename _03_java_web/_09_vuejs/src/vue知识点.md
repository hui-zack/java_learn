[官方网站](https://cn.vuejs.org)
    [vue快速流程]:
    [vue常用指令]:
    [vue声明周期]:
    
#[vue快速流程]
|   [vue快速入门](main/webapp/_1_vueFastUsed.html)

    情况说明:
        vue: 
            简述: 一门前端的框架, 用来简化书写
        vue技术特点: 
            基于MVVM(Model-View-ViewModel)思想, 实现数据的双向绑定, 简化dom的操作
    内容:
        1. vue的简单使用流程:
            步骤1: 
                新建html页面, 引入Vue.js文件
                实例:
                    <script src="js/vue.js"></script>
            步骤2:
                在js代码区域, 创建vue核心对象, 进行数据绑定
                实例:
                    new Vue({
                        el: "#app",
                        data(){
                            return {
                                username: ""
                            }
                        }
                    })
            步骤3: 编写视图:
                <div id="app">
                    <input v-model="username"> {{username}}
                </div>

#[vue常用指令]: 
|   [vue常用指令]
        [v-bind v-model](main/webapp/2-vue-v-bind.html)
        [v-on](main/webapp/3-vue-v-on.html)  
        [v-if](main/webapp/4-vue-v-if.html)
        [v-for](main/webapp/5-vue-v-for.html)
        
    情况说明: 
        1. vue指令:
            html标签上带有v-前缀的属性
        2. 常用指令:
            v-bind                    
                为html标签绑定属性值, 该属性值可以在核心对象中动态设置
            v-model                    
                在表单元素上创建双向数据绑定, 绑定后用户输入, 数据自动修改
            v-on                        
                为标签绑定点击时间, 可执行methods中的方法
                
            v-if v-else v-else-if       
                条件性的渲染某元素, 判定为true时渲染, 否则不渲染
            v-show                      
                根据条件展示某元素, 实际上是修改display属性的值
            v-for                       
                v-for遍历时, 会复制所属的标签

#[vue生命周期/发送异步请求]
|   [mounted元素/异步请求](main/webapp/6-vue-生命周期.html) 

    内容:
        1. vue中发送异步请求:
            new Vue({
                el:"#app",
                data(){
                    return {
                        username:"",
                        url:"http://localhost/selectAllServlet",
                        count:3,
                        addrs:["北京","上海","西安"],
                        response_text: "未查询到数据"
                    }
                },
                methods:{
                    show(){
                        alert("我被点了...");
                    }
                },
                mounted:{
        
                }
            });

#[element-ui]
    情况说明:
        element-ui由饿了吗开发
    内容:
        1. 使用element插件:
            步骤1: 复制element-ui文件夹到webapp中
            步骤2: 引入控制样式及代码
                <script src="js/vue.js"></script>                                       <!-- 引入vue -->
                <script src="element-ui/lib/index.js"></script>                         <!-- 引入element-ui/lib/index.js -->
                <link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">     <!-- 引入css文件 -->
        2. Element布局方式:
            Layout布局:
                说明: 
                    通过基础的24分栏, 迅速简便的创建布局, 可兼容不同的
                    
            Container布局容器:
                说明: 用具布局的容器组件, 快速搭建页面的基本结构
      