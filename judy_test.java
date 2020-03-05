public class judy_test {
    public static void main(String[] args) {
        for (int i = 1;i<=200;i++)
            System.out.println(Fibonacci.of(i));
    }
}
class Fibonacci{
    public static int of(int num) {
        if(num ==1||num == 2) {
            return 1;
        }else {
            return of(num-1)+of(num-2);
        }
    }
}
