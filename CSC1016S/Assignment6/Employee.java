// Name: Modisane Gomolemo
// Student Number: MDSGOM004
// Employee class
// 20 September 2024

import java.util.List;
import java.util.ArrayList;

public class Employee {
    private String name;
    private String UID;
    private CalendarTime current;
    private List<Shift> employeeShifts;

    public Employee(String name, String UID) {
        this.name = name;
        this.UID = UID;
        this.employeeShifts = new ArrayList<>();
    }

    public String name() {
        return this.name;
    }

    public String UID() {
        return this.UID;
    }

    public void signIn(Date d, Time t) {
        if (!present()) {// this is true only when the employee shift is not present in the list of
                         // shifts
            current = new CalendarTime(d, t);// thus will store the current time and calender
        }
    }

    public void signOut(Date d, Time t) {
        if (present()) {
            CalendarTime signOut = new CalendarTime(d, t);// store the time and date the shift ends
            employeeShifts.add(new Shift(current, signOut));// adds the previous(current) and signout time in the as a
                                                            // shift object in an arrayList
            current = null;// we nullify our current is the shift is signed out
        }

    }

    public boolean present() {
        return current != null;// if the current is not null then it means the shift is still thus present
    }

    public List<Shift> get(Week w) {
        ArrayList<Shift> weekShift = new ArrayList<>();// an array list to store shifts that are in the specified week
        for (Shift shift : employeeShifts) {
            if (shift.inWeek(w)) {
                weekShift.add(shift);// adds to the arrayList
            }
        }
        return weekShift;
    }

    public List<Shift> get(Date d) {
        List<Shift> dateShift = new ArrayList<>();// an arrayList to store shifts that are in that specific date
        for (Shift shift : employeeShifts) {
            if (shift.includesDate(d)) {
                dateShift.add(shift);// adds to the arrayList
            }
        }
        return dateShift;
    }

    public Duration hours(Week w) {
        Duration totHours = new Duration(0);// initialized the duration object to zero
        for (Shift shift : get(w)) {// we used the get() to find the shifts that are in a specific week
            totHours = totHours.add(shift.length());// then we used length() function and stored in the duration object
        }
        return totHours;
    }

    public boolean present(Date d) {
        if (current != null && current.date().equals(d)) {// its true only when theres a sign in and the dates of
                                                          // current and d are equal
            return true;
        }
        for (Shift shift : employeeShifts) {// goes through each element
            if (shift.includesDate(d)) {// checks whether date d is in the shifts
                return true;
            }
        }
        return false;// else return false
    }

    public boolean worked(Date d) {
        return !get(d).isEmpty();// checks whether the arraylist for shifts of a particular date is empty, if its
                                 // empty its going to be true thus we have to return false because the person
                                 // did not work
    }

    public boolean worked(Week w) {
        return !get(w).isEmpty();// checks whether the arraylist for shifts of a particular date is empty, if its
                                 // empty its going to be true thus we have to return false because the person
                                 // did not work
    }

}
