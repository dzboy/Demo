package com.craaaaazy.demo026;

public class AdminPageAction extends BaseAction {
    @Override
    protected boolean checkPermission(String user) {
        if (user.equals("July")) {
            return true;
        } else {
            return false;
        }
    }
}
