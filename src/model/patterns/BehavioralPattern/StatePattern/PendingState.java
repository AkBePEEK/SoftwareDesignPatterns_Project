package model.patterns.BehavioralPattern.StatePattern;

import model.Enrollment;

public class PendingState implements EnrollmentState {
    @Override
    public void proceed(Enrollment enrollment) {
        enrollment.setState(new ActiveState());
        System.out.println("Enrollment is now active.");
    }
}
