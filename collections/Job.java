package com.sangita.collections;


class Job implements Comparable<Job> {
    String name;
    int priority; // Lower = higher priority

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Job: " + name + ", Priority: " + priority;
    }
}

