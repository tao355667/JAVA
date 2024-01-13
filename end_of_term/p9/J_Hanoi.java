package end_of_term.p9;
/*
汉诺塔问题
塔上有三根柱子和一套直径各不相同的空心圆盘，开始时源柱子上的所有圆盘都按从大到小的顺序排列。
目标是通过每一次移动一个圆盘到另一根柱子上，最终把一堆圆盘移动到目标柱子上，
过程中不允许把较大的圆盘放置在较小的圆盘上；
*/
public class J_Hanoi {
    public static void mb_hanoi(int n, char start, char temp, char end)
    {
        if (n<=1)
            System.out.println("将盘从" + start + "移到" + end);
        else
        {
            mb_hanoi(n-1, start, end, temp);
            System.out.println("将盘从" + start + "移到" + end);
            mb_hanoi(n-1, temp, start, end);
        } // if-else结构结束
    } // 方法mb_hanoi结束

    public static void main(String args[ ])
    {
        mb_hanoi(3, 'S', 'T', 'E');
    }
}
