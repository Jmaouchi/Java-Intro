package com.strings.demo;

public class LearnStringMethods {

 public static void main(String[] args) {
  //I am going to create 7 string objects with different names
     String name = "Batman";
     String name2 = "Volibear";
     String name3 = "Tibbers";
     String name4 = "Twitch";
     String name5 = "Sona";
     String name6 = "Xayah";
     String name7 = "Rakan";
     
     //I am going to use different string methods to manipulate the Strings.
     //This will make my Batman all uppercase letters
     System.out.println(name.toUpperCase()); 
     System.out.println(name);

     //This will make my Volibear all lowercase letters
     System.out.println(name2.toLowerCase());

     // There are two ways to concatenate a string.
     // One is by using the + the other is by using the concat method.
     System.out.println("These two are in a relationship " + name6 + " and " + name7);
     System.out.println("These two are in a relationship " + name6.concat(" and      ").concat(name7));

     //Get the length of my string
     System.out.println(name3.length());

     //Get the substring
     System.out.println(name2.substring(0, 4));
     System.out.println(name5.substring(2));

     //See if my String contains a sequence of characters
     System.out.println(name4.contains("witch"));
 }

}
.
word2