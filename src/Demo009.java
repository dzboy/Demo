    public class Demo009 {
        public static void main(String[] args) {
            // 实例化对象并赋值给person变量
            Person person = new Person("July", "男", "会开车");

            // person.name表示调用了Person这个类的具体的对象july的name变量
            // july.name的值是不是就是"July"了？
            // 如果感觉不是的话，那应该再看看上一篇，好好理解理解变量的概念
            String name = person.name;
            String sex = person.sex;
            String skill = person.skill;

            System.out.println(name);
            System.out.println(sex);
            System.out.println(skill);

        }
    }
