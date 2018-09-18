public class Demo003 {
    public static void main(String[] args) {
        boolean bool = true;

        byte b = 1;

        // 注意char是字符类型，用单引号，并且仅仅接受一个字符
        char c = 'a';
        // 当前接受两个字符会报错
//        char c0 = 'aa';

        // 也可以接收整数
        char c1 = 1000;

        // String是字符串类型，字符串类型使用双引号
        String str = "Hello";

        // 双精度浮点类型，占用64位内存
        double d = 3.1415926;
        // 单精度浮点类型32位，最后要跟上"F"或者"f"字符来标识是float类型
        float f = 1.001F;
        // 没有添加"F"或者"f"报错，因为如果不加"F"或"f"标识那1.001是双精度double类型，double是64位，无法向低位进行转换，因为会损失精度
//        float f0 = 1.001;
        // 但是如果双精度double类型如果加了F或者f，也不会报错，因为double的类型是64位，转成32位并不会有精度丢失问题
        double d1 = 3.1415926f;

        // int long short 都是整型，取值范围和占用内存会有区别
        short s = 10;
        int i = 10;
        long l = 10;

    }
}
