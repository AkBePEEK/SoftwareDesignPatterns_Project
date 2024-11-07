package model.patterns.BehavioralPattern.StatePattern;

import model.Enrollment;

public class CompletedState implements EnrollmentState {
    @Override
    public void proceed(Enrollment enrollment) {
        System.out.println("Enrollment is already completed.");
    }
}
