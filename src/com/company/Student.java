/*
*
* Classame : Student
*
*  14 June 2020
*
* Copyright Stavnichuk Dmytro
*
*  Module 2 task 4 Programming patterns. Factory, Builder
*
Develop for your class
1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student/
* */
package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String patronymic;
    private String studLogin;
    private String studPassword;
    private LocalDate birthday;
    private String phoneNumber;
    private String recordBook; // record book number
    private String departmentName;
    private String speciality;
    private int courseNum;
    private int groupNum;
    private boolean isMilitary; // is student conscripted
    private boolean isBachelor; // bachelor or no
    private boolean isMagician; // magician or no
    private boolean hasGrant; // has grant's or no
    private double avgMark;  // average mark
    private boolean hadRetake; // had student exam's retake or no
    private String budgetBasis; // paid or free study


    public Student() {
    }

    public Student(String firstName,
                   String lastName,
                   String studLogin,
                   String studPassword,
                   LocalDate birthday,
                   String phoneNumber,
                   String recordBook,
                   String departmentName,
                   String speciality,
                   int courseNum,
                   int groupNum,
                   boolean isMilitary,
                   boolean isBachelor,
                   boolean isMagician,
                   boolean hasGrant,
                   double avgMark,
                   boolean hadRetake,
                   String budgetBasis,
                   String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studLogin = studLogin;
        this.studPassword = studPassword;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.recordBook = recordBook;
        this.departmentName = departmentName;
        this.speciality = speciality;
        this.courseNum = courseNum;
        this.groupNum = groupNum;
        this.isMilitary = isMilitary;
        this.isBachelor = isBachelor;
        this.isMagician = isMagician;
        this.hasGrant = hasGrant;
        this.avgMark = avgMark;
        this.hadRetake = hadRetake;
        this.budgetBasis = budgetBasis;
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudLogin() {
        return studLogin;
    }

    public void setStudLogin(String studLogin) {
        this.studLogin = studLogin;
    }

    public String getStudPassword() {
        return studPassword;
    }

    public void setStudPassword(String studPassword) {
        this.studPassword = studPassword;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(String recordBook) {
        this.recordBook = recordBook;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public boolean isBachelor() {
        return isBachelor;
    }

    public void setBachelor(boolean bachelor) {
        isBachelor = bachelor;
    }

    public boolean isMagician() {
        return isMagician;
    }

    public void setMagician(boolean magician) {
        isMagician = magician;
    }

    public boolean isHasGrant() {
        return hasGrant;
    }

    public void setHasGrant(boolean hasGrant) {
        this.hasGrant = hasGrant;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    public boolean getHadRetake() {
        return hadRetake;
    }

    public void setHadRetake(boolean hadRetake) {
        this.hadRetake = hadRetake;
    }

    public String getBudgetBasis() {
        return budgetBasis;
    }

    public void setBudgetBasis(String budgetBasis) {
        this.budgetBasis = budgetBasis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getCourseNum() == student.getCourseNum() &&
                getGroupNum() == student.getGroupNum() &&
                isMilitary() == student.isMilitary() &&
                isBachelor() == student.isBachelor() &&
                isMagician() == student.isMagician() &&
                isHasGrant() == student.isHasGrant() &&
                Double.compare(student.getAvgMark(), getAvgMark()) == 0 &&
                getHadRetake() == student.getHadRetake() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                Objects.equals(getStudLogin(), student.getStudLogin()) &&
                Objects.equals(getStudPassword(), student.getStudPassword()) &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getPhoneNumber(), student.getPhoneNumber()) &&
                Objects.equals(getRecordBook(), student.getRecordBook()) &&
                Objects.equals(getDepartmentName(), student.getDepartmentName()) &&
                Objects.equals(getSpeciality(), student.getSpeciality()) &&
                Objects.equals(getBudgetBasis(), student.getBudgetBasis());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(),
                getLastName(),
                getPatronymic(),
                getStudLogin(),
                getStudPassword(),
                getBirthday(),
                getPhoneNumber(),
                getRecordBook(),
                getDepartmentName(),
                getSpeciality(),
                getCourseNum(),
                getGroupNum(),
                isMilitary(),
                isBachelor(),
                isMagician(),
                isHasGrant(),
                getAvgMark(),
                getHadRetake(),
                getBudgetBasis());
    }

    @Override
    public String toString() {
        return "Student{" + "\n" +
                "firstName= '" + firstName + '\'' + "\n" +
                "lastName= '" + lastName + '\'' + "\n" +
                "patronymic= '" + patronymic + '\'' + "\n" +
                "studLogin= '" + studLogin + '\'' + "\n" +
                "studPassword= '" + studPassword + '\'' + "\n" +
                "birthday= " + birthday + "\n" +
                "phoneNumber= '" + phoneNumber + '\'' + "\n" +
                "recordBook= '" + recordBook + '\'' + "\n" +
                "departmentName= '" + departmentName + '\'' + "\n" +
                "speciality= '" + speciality + '\'' + "\n" +
                "courseNum= " + courseNum + "\n" +
                "groupNum= " + groupNum + "\n" +
                "isMilitary= " + isMilitary + "\n" +
                "isBachelor= " + isBachelor + "\n" +
                "isMagician= " + isMagician + "\n" +
                "hasGrant= " + hasGrant + "\n" +
                "avgMark= " + avgMark + "\n" +
                "hadRetake= " + hadRetake + "\n" +
                "budgetBasis= " + budgetBasis + "\n" +
                '}';
    }

    public static class Builder {
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }
        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }
        public Builder setStudLogin(String studLogin){
            studentToBuild.setStudLogin(studLogin);
            return this;
        }
        public Builder setStudPassword(String studPassword){
            studentToBuild.setStudPassword(studPassword);
            return this;
        }
        public Builder setBirthday(LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder setRecordBook(String recordBook){
            studentToBuild.setRecordBook(recordBook);
            return this;
        }
        public Builder setDepartmentName(String departmentName){
            studentToBuild.setDepartmentName(departmentName);
            return this;
        }
        public Builder setSpeciality(String speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }
        public Builder setCourseNum(int courseNum){
            studentToBuild.setCourseNum(courseNum);
            return this;
        }
        public Builder setGroupNum(int groupNum){
            studentToBuild.setGroupNum(groupNum);
            return this;
        }
        public Builder setIsMilitary(boolean isMilitary){
            studentToBuild.setMilitary(isMilitary);
            return this;
        }
        public Builder setBachelor(boolean isBachelor){
            studentToBuild.setBachelor(isBachelor);
            return this;
        }
        public Builder setMagician(boolean magician){
            studentToBuild.setMagician(magician);
            return this;
        }
        public Builder setHasGrant(boolean hasGrant){
            studentToBuild.setHasGrant(hasGrant);
            return this;
        }
        public Builder setAvgMark(double avgMark){
            studentToBuild.setAvgMark(avgMark);
            return this;
        }
        public Builder setHadRetake(boolean hadRetake){
            studentToBuild.setHadRetake(hadRetake);
            return this;
        }
        public Builder setBudgetBasis(String budgetBasis){
            studentToBuild.setBudgetBasis(budgetBasis);
            return this;
        }


        Student build(){
            return studentToBuild;
        }

    }

}
