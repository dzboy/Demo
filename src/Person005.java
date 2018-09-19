    public class Person005 {

        public void say() {
            String content = "Hello world";
            System.out.println(content);
        }

        public void speak() {
//            System.out.println(content);
        }

        public static void main(String[] args) {
            Person005 person005 = new Person005();
            person005.say();
            person005.speak();
        }
    }
