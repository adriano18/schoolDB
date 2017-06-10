package com.company.entities;

/**
 * Created by AdrianP on 10.06.2017.
 */
public class Teacher {
    private String firstNameTeacher;
    private String lastNameTeacher;
    private String sexTeacher;
    private String ageTeacher;
    private String personCodeTeacher;
    private String subjectTeacher;
    private String phoneTeacher;
    private String emailTeacher;

    public Teacher(String firstNameTeacher, String lastNameTeacher, String sexTeacher, String ageTeacher, String personCodeTeacher, /*String subjectTeacher, */String phoneTeacher, String emailTeacher) {
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.sexTeacher = sexTeacher;
        this.ageTeacher = ageTeacher;
        this.personCodeTeacher = personCodeTeacher;
        this.subjectTeacher = subjectTeacher;
        this.phoneTeacher = phoneTeacher;
        this.emailTeacher = emailTeacher;
    }
    public String getFirstNameTeacher() {
        return firstNameTeacher;
    }
    public String getLastNameTeacher() {
        return lastNameTeacher;
    }
    public String getSexTeacher() {
        return sexTeacher;
    }
    public String getAgeTeacher() {
        return ageTeacher;
    }
    public String getPersonCodeTeacher() {
        return personCodeTeacher;
    }
    public String getSubjectTeacher() {
        return subjectTeacher;
    }
    public String getPhoneTeacher() {
        return phoneTeacher;
    }
    public String getEmailTeacher() {
        return emailTeacher;
    }

}
