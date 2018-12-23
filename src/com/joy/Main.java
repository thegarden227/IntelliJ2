package com.joy;

import com.google.gson.Gson;
import com.joy.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Add bookmark and favorite
 * This is my Main class!
 * command N - Generate code
 * option enter - Intention menu
 * command P - list possible variable in constructor
 * double shift
 * command F
 * shift option R
 * option command L - reformatting
 * F2 - iterate through error in page
 * //add todo
 * optimize import
 * Find in Path
 * Command click
 * Option F7 to show the usage of each member
 * Shift F6 - rename symbol
 * Refactor This - Control T
 * Command D - Duplicate line of code
 * Generify
 * Extract as Method
 * Extract as Constant
 * Inspect code
 * Shift Command N - Scratch file
 * Command F8 - Breakpoint
 * Add variable expression
 * Evaluate Expression
 * Class path - a list of folder where you store dependent code
 * Add Jar file to library of the project
 * libraries/libs
 * right click and add as project library
 * Project structure - Libraries
 * Command Shift Up/Down move statements up and down
 * working with opensource
 * download from Maven
 * Project structure - library - download from maven
 * Documentation - as comment, can use @Param paramName to generate description
 *
 *
 * Tools - generate Java doc
 *             Choose a location to save the doc
*  Documentation supports HTML tags (bold, italic, list)
 *
 *  Create JAR file
 *  Project structure - Artifacts/+/JAR/From menu with dependency
 * Build - Build Artifacts
 * Find the artifacts, run Java -jar
 * Create a local repo
 * VCS/Enable ...
 * View/Tool window/ version control
 * Commit changes - VCS, Git, Commit file
 * Diff window - in Version control, local changes, select the file, command D
 * Share the project on Git
 * New Branch
 *
 */
public class Main {

    private static final String RED = "Red";
    private static final String GREEN = "Green";

    public static void main(String[] args) {
//	 write your code here
        String test = "test";
        Person person = new Person("David", "Smith", 50);
        System.out.println(person);

        Gson gson = new Gson();
        String personGson = gson.toJson(person);
        System.out.println(personGson);

        List<String> colors = new ArrayList();
        colors.add(RED);
        colors.add(GREEN);

        String colorGson = gson.toJson(colors);
        System.out.println(colorGson);


    }


}
