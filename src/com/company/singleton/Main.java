package com.company.singleton;

import com.company.singleton.Clipboard;

public class Main {

    public static void main(String[] args) {
        Clipboard clipboard1= Clipboard.getInstance();
        Clipboard clipboard2=Clipboard.getInstance();

        clipboard1.copy("ABC");//copy ABC to content var in obj 1
        clipboard1.paste(); //print ABC
        clipboard1.paste();// print ABC
        clipboard2.copy("XYZ");//copy XYZ to content var in obj 2
        clipboard1.paste();//print ABC--XYZ
        clipboard2.paste();//print XYZ--XYZ
        clipboard1.copy("PQR");//copy PQR to content var obj 1
        clipboard2.paste();//print XYZ- PQR
    }
}
