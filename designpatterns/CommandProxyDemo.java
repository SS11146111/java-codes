package com.sangita.designpatterns;

interface Command {
    void execute();
}

class AdminCommand implements Command {
    public void execute() {
        System.out.println("Admin command executed");
    }
}

class CommandProxyDemo implements Command {
    private boolean isAdmin;
    private Command command;

    public CommandProxyDemo(boolean isAdmin) {
        this.isAdmin = isAdmin;
        this.command = new AdminCommand();
    }

    public void execute() {
        if (isAdmin) {
            command.execute();
        } else {
            System.out.println("Access denied");
        }
    }
}

