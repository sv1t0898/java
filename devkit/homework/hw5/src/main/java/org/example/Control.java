package org.example;

import java.util.Arrays;

public class Control {

    private volatile Boolean[] fork;
    private int coutnForks;
    private int philosopherEat;

    public Control(){
    }

    private void setFork() {
        for (int i = 0; i < coutnForks; i++){
            fork[i] = true;
        }
    }

    public Boolean[] getFork() {
        return fork;
    }

    public void setCoutnForks(int coutnForks) {
        this.coutnForks = coutnForks;
        fork = new Boolean[this.coutnForks];
        setFork();
    }

    public int getCoutnForks() {
        return coutnForks;
    }

    public synchronized Boolean takeFork(int numberFork) {
        if (fork.length != numberFork) {
            if (fork[numberFork]) {
                return !(fork[numberFork] = !fork[numberFork]);
            } else {
                return fork[numberFork];
            }
        } else {
            if (fork[0]) {
                return !(fork[0] = !fork[0]);
            } else {
                return fork[0];
            }
        }
    }

    public synchronized Boolean putFork(int numberFork) {
        if (fork.length != numberFork) {
            if (!fork[numberFork]) {
                return !(fork[numberFork] = !fork[numberFork]);
            } else {
                return fork[numberFork];
            }
        } else {
            if (!fork[0]) {
                return !(fork[0] = !fork[0]);
            } else {
                return fork[0];
            }
        }
    }

    




}
