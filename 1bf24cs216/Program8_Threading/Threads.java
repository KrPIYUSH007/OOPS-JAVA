import java.util.*;
class CollegeThread extends Thread{
    String msg;
    int delay;
    CollegeThread(String msg, int delay){
        this.msg=msg;
        this.delay=delay;
    }
    public void run(){
        try {
            while(true){
                System.out.println(msg);
                Thread.sleep(delay);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }       
        }
        }
public class Threads {
    public static void main(String[] args) {
        CollegeThread t1=new CollegeThread("BMS College of Engineering",10000);
         CollegeThread t2=new CollegeThread("CSE",2000);
        t1.start();
         
        t2.start();
        
      


    }
    
}
