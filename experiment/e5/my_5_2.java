/*
2. 定义一个自己的数学类MyMath。类中提供静态方法max，该方法接收3个同类型的参数(例如整形)，返回其中的最大值。
*/
package experiment;
class Mymath{
    public int max(int a,int b,int c){
        int m=a;
        if(b>m)
            m=b;
        if(c>m)
            m=c;
        return m;
    }
}
public class my_5_2 {
}
