package ru.mail.polis.homework.analyzer;

public class LinkAnalyzer implements TextAnalyzer {

    @Override
    public boolean isTriggered(String text) {
        return text.contains(".com") || text.contains(".ru") || text.contains(".org")
                || text.contains("http://") || text.contains("www.");
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.LINK;
    }
}
