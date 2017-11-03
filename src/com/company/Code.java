package com.company;

/**
 * Created by bs666 on 11/2/17.
 */
public class Code {
    private String myCode;
    private  String orgCode;
    private String xString;
    // additional instance variables
    int i = 0;
    public Code(String code)
    {
        myCode = code;
        orgCode = code;
        xString ="";
        for(int i = 0; i < myCode.length(); i++)
            xString = xString + "X";
//possibly additional statements
        //i want to do it
    }
    public String getCode()
    {
        return myCode;
    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Replaces the characters in the code starting at
// position p1 until position p2 - 1 inclusive with an X
    public void hide(int p1, int p2)
    {
// to be implemented
        myCode = orgCode.substring(0,p1) + xString.substring(p1,p2) + orgCode.substring(p2,orgCode.length());


    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Restores to their original values the characters in
// the code starting at position p1 until position
// p2-1 inclusive
    public void recover(int p1, int p2) {
// to be implemented
        myCode = orgCode.substring(0,p1) + orgCode.substring(p1,p2) + orgCode.substring(p2,orgCode.length());

    }
}
