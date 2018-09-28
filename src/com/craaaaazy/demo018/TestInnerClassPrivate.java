    package com.craaaaazy.demo018;

    public class TestInnerClassPrivate {

        private class Inner {
            private String tag = "inner_class";
        }

        private void initInner() {
            Inner inner = new Inner();
            System.out.println(inner.tag);
        }

        public static void main(String[] args) {
            new TestInnerClassPrivate().initInner();
        }
    }
