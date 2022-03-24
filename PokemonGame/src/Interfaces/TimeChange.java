package Interfaces;

public class TimeChange extends Thread{

    private final GlobalVariables globalVariables;

    public TimeChange(GlobalVariables globalVariables) {
        this.globalVariables = globalVariables;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.currentThread().sleep(480000);
            } catch (InterruptedException e) {
            }
            if (this.globalVariables.getTime()) {
                this.globalVariables.setNight();
            } else {
                this.globalVariables.setDay();
            }
        }
    }
}
