package controller;

import model.Enrollment;

public class EnrollmentController {
    private final Enrollment enrollment;

    public EnrollmentController(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public void proceedEnrollment() {
        enrollment.proceed();
    }
}
