package model.patterns.BehavioralPattern.StatePattern;

import model.Enrollment;

public interface EnrollmentState {
    void proceed(Enrollment enrollment);
}