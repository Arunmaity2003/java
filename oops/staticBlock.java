class staticBlock {
    static int a = 3;
    static int b = 7;

    static {
        System.out.println("Hey bro i am a static block");
        b = a * b;
    }
    public static void main(String[] args) {
        staticBlock block = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
}