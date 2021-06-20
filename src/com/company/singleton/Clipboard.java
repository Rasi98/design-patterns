package com.company.singleton;

public class Clipboard {
    private String content;

    private Clipboard(){
        //execute whenever it creates instances from the class (constructor)
        System.out.println("clip board created");
    }
    //create instance within this class.Because it cannot access from outside
    private static Clipboard clipboard=new Clipboard();

    //method to access clipboard from outside
    public static Clipboard getInstance(){

        if(clipboard==null){ //true for the first time
            clipboard=new Clipboard();
        }

        return clipboard;
    }

    //copy
    public void copy(String text){
        this.content=text;
    }
    //paste
    public void paste(){
        System.out.println(this.content);
    }
}
