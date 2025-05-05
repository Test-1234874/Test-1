public class Test2 {
    private int top;
    private  int[] arr;

    public Test2(int maxSize){
        top = -1;
        arr = new int[maxSize];
    }

    public void test(int number){
        arr[++top] = number;


    }
    public void getTop(){
        System.out.println("Top value " + top);
    }

    public static void main(String[] args) {
        Test2 t = new Test2(4);
        t.test(1);
        t.test(2);
        t.test(3);
        System.out.println("Hello");

        t.getTop();
    }

}
