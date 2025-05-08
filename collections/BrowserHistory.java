package com.sangita.collections;
import java.util.*;

public class BrowserHistory {

    private Deque<String> backStack = new ArrayDeque<>();
    private Deque<String> forwardStack = new ArrayDeque<>();
    private String currentPage;

    public BrowserHistory(String homepage) {
        currentPage = homepage;
    }

    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear(); // once a new page is visited, forward history is reset
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No forward history.");
        }
    }

    public void current() {
        System.out.println("Current page: " + currentPage);
    }
}
