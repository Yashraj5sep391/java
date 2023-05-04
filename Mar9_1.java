public class Mar9_1 
{
    public static void main(String[] args) {
        TestInter objTestInter = new TestInter();
        System.out.println(objTestInter.sum(12, 17));
        System.out.println(objTestInter.minus(12, 17));
        System.out.println(objTestInter.multiply(1, 2));
    }
}

interface One {
    int sum(int a, int b);

    int minus(int a, int b);
}

interface Two {
    int multiply(int a, int b);
}

// multiple inheritance
class TestInter implements One, Two {
    // method overriding
    public int sum(int a, int b) {
        return a + b;
    }

    // method overriding
    public int minus(int a, int b) {
        return a - b;
    }

    // method overriding
    public int multiply(int a, int b) {
        return a * b;
    }
}