class innerClass {
    static class test{
        String name;
        public test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test t = new test("kunal");
        test m = new test("Anik");

        System.out.println(t.name);
        System.out.println(m.name);
    }
}