package com.sangita.designpatterns;

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() { System.out.println("Sending Email"); }
}

class SMSNotification implements Notification {
    public void notifyUser() { System.out.println("Sending SMS"); }
}

class FactoryDemo {
    public static Notification getNotification(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
