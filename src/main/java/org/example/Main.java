package org.example;

public class Main {

    enum PermissionLevel {
        ADMIN,
        DEVELOPER,
        USER
    }

    ;

    public static class PermissionManager {
        private PermissionLevel mLevel = PermissionLevel.USER;

        public String getCurrentLevel() {
            switch (this.mLevel) {
                case USER:
                    return "USER";
                case ADMIN:
                    return "ADMIN";
                case DEVELOPER:
                    return "DEVELOPER";
                default:
                    break;
            }
            return null;

        }

        public void setCurrentLevel(PermissionLevel level) {
            this.mLevel = level;
        }
    }

    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();
        System.out.println(pm.getCurrentLevel());
        pm.setCurrentLevel(PermissionLevel.ADMIN);
        System.out.println(pm.getCurrentLevel());
        pm.setCurrentLevel(PermissionLevel.USER);
        System.out.println(pm.getCurrentLevel());
        pm.setCurrentLevel(PermissionLevel.DEVELOPER);
    }
}