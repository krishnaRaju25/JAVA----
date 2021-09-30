package com.torryharris.model;

public class Person implements Comparable<Person>{
   private Long adharno;
   private String name;
   private String state;
   private String occupation;

   public Person(Long adharno, String name, String state, String occupation) {
      this.adharno = adharno;
      this.name = name;
      this.state = state;
      this.occupation = occupation;
   }

   public Long getAdharno() {
      return adharno;
   }

   public void setAdharno(Long adharno) {
      this.adharno = adharno;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getOccupation() {
      return occupation;
   }

   public void setOccupation(String occupation) {
      this.occupation = occupation;
   }

   @Override
   public String toString() {
      return "Person{" +
              "adharno=" + adharno +
              ", name='" + name + '\'' +
              ", state='" + state + '\'' +
              ", occupation='" + occupation + '\'' +
              '}';
   }

   @Override
   public int compareTo(Person o) {
      return this.adharno.compareTo(o.adharno);
   }
}
