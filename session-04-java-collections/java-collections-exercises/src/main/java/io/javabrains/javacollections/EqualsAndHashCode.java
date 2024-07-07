package io.javabrains.javacollections;

import java.util.Date;
import java.util.Objects;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

public class EqualsAndHashCode {


    
    class Person{
        private String first;
        private String last;
        private int age;
        private Date lastMod;

        public Person(String first, String last, int age){
            this.first = first;
            this.last = last;
            this.age = age;
            this.lastMod = new Date();
        }
        @Override
        public boolean equals(Object obj){
            if(obj == this){return true;}
            if(obj == null || this.getClass() != obj.getClass()){return false;}
            Person p = (Person) obj;
            return Objects.equals(this.first, p.first) && Objects.equals(this.last, p.last) && this.age == p.age;
        }
        @Override
        public int hashCode(){ 
            return Objects.hash(this.first,this. last,this.age);
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Date getLastMod() {
            return lastMod;
        }

        public void setLastMod(Date lastMOd) {
            this.lastMod = lastMOd;
        }

    }
    
    public static void main(String[] args) {
        String x = "Hello";
        int[] xs = new int[1028];
        String y = new String("Hello");
        y = "Goodbye";
        System.out.println("x == y : " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));
    }
}
 