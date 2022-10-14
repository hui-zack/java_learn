package 第1阶段._9_接口.内部类实现接口;
// 一个接口操作方法,  可以实现多个场景
public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();

        //接口使用场景1
        jo.useJumping(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });

        //接口使用场景2
        jo.useJumping(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
