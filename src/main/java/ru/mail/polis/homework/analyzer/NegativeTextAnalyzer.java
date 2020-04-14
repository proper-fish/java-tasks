package ru.mail.polis.homework.analyzer;

public class NegativeTextAnalyzer implements TextAnalyzer {

    @Override
    public boolean isTriggered(String text) {
        if (text.contains(":(") || text.contains(":|") || text.contains("=(")) {
            return true;
        }
        return false;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.NEGATIVE_TEXT;
    }
}
