package task09;

import java.util.HashSet;
import java.util.Set;
public class MemberValidator {
    private Set<String> activeStudents = new HashSet<>();

    public MemberValidator() {
        activeStudents.add("STU-01");
        activeStudents.add("STU-02");
    }

    public boolean isActive(String studentId) {
        return activeStudents.contains(studentId);
    }
}