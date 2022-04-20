package User;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author killua
 */
public class User {
        private String name,gender,vaccine,result;
        private int age;
        
        //Arraylist Implementation
        public static ArrayList<String> name_arr = new ArrayList<String>();
        public static ArrayList<String> gender_arr = new ArrayList<String>();
        public static ArrayList<String> vaccine_arr = new ArrayList<String>();
        public static ArrayList<String> result_arr = new ArrayList<String>();
        public static ArrayList<Integer> age_arr = new ArrayList<Integer>();
        
    /**
     * @return the name
     */
        
    //encapsulation
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the vaccine
     */
    public String getVaccine() {
        return vaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
}
