package ru.mail.polis.homework.analyzer;

public class LinkAnalyzer implements TextAnalyzer {

    @Override
    public boolean isTriggered(String input) {
        return input.contains(".com") || input.contains(".ru") || input.contains(".org")
                || input.contains("http://") || input.contains("www.");
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.LINK;
    }
}
