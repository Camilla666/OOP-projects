package com.company;

public class MyTime {
    int hour = 0;
    int minute = 0;
    int seconds = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public void setTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
       return String.format("%02d:%02d:%02d",hour,minute,seconds);
    }

    public MyTime nextHour(){
        if (this.hour == 23){
            this.hour = 0;
        }else {
            this.hour +=1;
        }
        return this;
    }

    public MyTime nextMinute(){
       if(this.minute == 59){
           this.minute = 0;
           nextHour();
       }else{
           this.minute +=1;
       }
       return this;
    }

    public MyTime nextSecond(){
        if(this.seconds == 59){
            this.seconds = 0;
            nextMinute();
        }else{
            this.seconds += 1;
        }
        return this;
    }

    public MyTime previousHour(){
        if(this.hour == 0){
            this.hour = 23;
        }else{
            this.hour -= 1;
        }
        return this;
    }

    public MyTime previousMinute(){
        if(this.minute == 0){
            this.minute = 59;
            previousHour();
        }else{
            this.minute -=1;
        }
        return this;
    }

    public MyTime previousSecond(){
        if(this.seconds == 0){
            this.seconds = 59;
            previousMinute();
        }else{
            this.seconds -= 1;
        }
        return this;
    }
}
