    public class Person000 {
        public String name;
        public int age;

        public Person000(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {
            Person000 person000 = new Person000("July", 18);
            System.out.println(person000.name + "  " + person000.age);
        }
    }
