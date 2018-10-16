    package com.craaaaazy.demo025;

    public abstract class Email {
        private String from = "July";
        private String signature = "Java中抽象类的作用";

        private String to;
        private String content;

        /**
         * 设置收件人
         * @return
         */
        public abstract String getTo();

        /**
         * 设置邮件内容
         * @return
         */
        public abstract String getContent();

        public void send() {
            to = getTo();
            content = getContent();
            System.out.printf("From: " + from + "  To " + to
                    + " \r\n\t " + content +
                    " \r\n\r\n" + signature);
        }

    }
