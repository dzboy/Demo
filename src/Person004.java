    public class Person004 {
        /**
         * 技能
         */
        private String skill;
        /**
         * 姓名
         */
        private String name;
        /**
         * 性别
         */
        private String sex;

        /**
         * 年龄
         */
        private int age;

        public Person004() {

        }

        public Person004(String skill, String name, String sex, int age) {
            this.skill = skill;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public void say() {
            System.out.println("我叫" + "，我是" + "孩子，我会" + skill);
        }

        public String writeName() {
            return name;
        }

        public int writeAge() {
            return age;
        }

        public static void main(String[] args) {
            Person004 person004 = new Person004("三头六臂", "哪吒", "男", 5);
            System.out.println("我是" + person004.writeName() + " 我今年" + person004.writeAge() + "岁了");
        }
    }
