package homework.lesson03.studentsVer07;

import java.util.Map;

/**
 * Strategy
 * Общий интерфейс всех стратегий.
 */

public interface StudentType {
    Map<String, Double> learningType(double skill);
}
