package com.craaaaazy.demo026;

public abstract class BaseAction {

    /**
     * 基类的入口方法
     * @param user
     * @param token
     */
    public void action(String user, String token) {
        // 这里仅仅是用md5后的user来模拟token
        if (token.equals(Md5.md5(user))) {
            System.out.println("user is valid, access time is " + System.currentTimeMillis());
        }
        // 这里模拟此操作action是敏感操作，需要验证用户权限
        sensitiveAction(user);
    }

    /**
     * 定义检查权限模板方法，子类去实现
     * @param user
     * @return
     */
    protected abstract boolean checkPermission(String user);

    /**
     * 模拟敏感操作实际逻辑
     * @param user
     */
    private void sensitiveAction(String user) {
        if (checkPermission(user)) {
            System.out.println("do something");
        } else {
            System.err.println("permission denied");
        }
    }

}
