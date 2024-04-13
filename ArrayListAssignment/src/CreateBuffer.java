import java.util.ArrayList;
import java.util.Scanner;

public class CreateBuffer {
    private int sizes;
    private static ArrayList<String> messages;
    private int count;
    CreateBuffer(int size){
        this.sizes =size;
        this.messages = new ArrayList<>(size);
        this.count =0;
    }
    public static void main(String[] args) {
       CreateBuffer createBuffer = new CreateBuffer(6);
       messages.add("Hi");
        messages.add("it is autogenerated message");
        messages.add("The next you enter");
        messages.add("Then the first element will disapper");
        messages.add("Practice");
        messages.add("This module now");
        for(String k:messages){
            System.out.println(k);
        }
        createBuffer.bufferMessage();

    }
    public void bufferMessage(){
        Scanner in = new Scanner(System.in);
        if(messages.size()>=sizes){
            count=count%sizes;
            System.out.print("----> Enter your message : ");
            messages.set(count,in.nextLine());
            count++;
            for (String k: messages){
                System.out.println(k);
            }
            bufferMessage();
        }else {
            System.out.print("----> Enter your message : ");
            messages.add(in.nextLine());
            for (String k : messages){
                System.out.println(k);
            }
            bufferMessage();
        }
    }
}

