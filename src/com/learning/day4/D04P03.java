package com.learning.day4;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

// Validator.java
class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicationName())) {
            throw new CatheyBankException("Invalid Applicant Name");
        }
        if (!isValidPost(applicant.getPostApplied())) {
            throw new CatheyBankException("Invalid Post");
        }
        if (!isValidAge(applicant.getApplicantAge())) {
            throw new CatheyBankException("Invalid Age");
        }
    }

    public boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean isValidPost(String post) {
        return post != null && (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer"));
    }

    public boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

// Applicant.java
class Applicant {
    private String applicationName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicationName, String postApplied, int applicantAge) {
        this.applicationName = applicationName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

// Main.java
public class D04P03 {
    public static void main(String[] args) {
        // Example usage
        Validator validator = new Validator();
        try {
           Applicant applicant1 = new Applicant("John Doe", "Probationary Officer", 25);
           validator.validate(applicant1);
           System.out.println("Applicant 1 details are valid");

            Applicant applicant2 = new Applicant("", "Manager", 35);
            validator.validate(applicant2);
            System.out.println("Applicant 2 details are valid");
        } catch (CatheyBankException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}