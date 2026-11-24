package com.day4.ExceptionHandling;

public class ResultService {

    // Incident 1
    public void sendResult(String email) {
    	if (email == null) {
    	    System.out.println("No email on file, result not sent.");
    	    return;
    	}

    	try {
    		email.toLowerCase();
    		System.out.println("Result sent to " + email.toLowerCase());
    	} catch (NullPointerException e) {
    		System.out.println("Email cannot be null.");
    	} finally {
    		System.out.println();
    	}
        
    }

    // Incident 2
    public int classAverage(int totalMarks, int studentCount) {
    	try {
    	    return totalMarks / studentCount;
    	} catch (ArithmeticException e) {
    	    System.out.println("No students in this class yet.");
    	    return 0;
    	}

    }

    // Incident 3
    public int readMarks(String input) {
    	try {
    		int mark = Integer.parseInt(input);
    		return mark;
    	} catch (NumberFormatException e) {
    		System.out.println("Marks must be a number, got: " + input);
    		return 0;
    	}
    }

    // Incident 4
    public String getSubject(int index) {
        String[] subjects = {"Maths", "Physics", "Chemistry"};
        try {
        	String subject = subjects[index];
        	return subject;
        } catch (ArrayIndexOutOfBoundsException e) {
        	String error = "Unknown subject";
        	return error;
        }
    }

    // Incidents 5 and 6
    public void recordMarks(Student student, int marks) throws AttendanceShortageException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100, got: " + marks);
        }
        if (student.attendance < 75) {
            throw new AttendanceShortageException(
                student.name + " has " + student.attendance + "% attendance, minimum is 75%");
        }
        student.marks = marks;
    }

}

