package org.example;
enum PermissionLevel {
    ADMIN, DEVELOPER, USER;
}
public class Main {
    private PermissionLevel mLevel = PermissionLevel.USER;

    public PermissionLevel setLevel(PermissionLevel level) {
        this.mLevel = level;
        return this.mLevel;
    }

    public String getLevel() {
        return switch (this.mLevel) {
            case USER -> "USER";
            case DEVELOPER -> "DEVELOPER";
            case ADMIN -> "ADMIN";
        };
    }
}
