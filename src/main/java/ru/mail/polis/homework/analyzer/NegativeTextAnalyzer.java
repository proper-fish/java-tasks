package ru.mail.polis.homework.analyzer;

public class NegativeTextAnalyzer implements TextAnalyzer {

    @Override
    public boolean isTriggered(String input) {
        if (input.contains(":(") || input.contains(":|") || input.contains("=(")) {
            return true;
        }
        return false;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.NEGATIVE_TEXT;
    }
}
