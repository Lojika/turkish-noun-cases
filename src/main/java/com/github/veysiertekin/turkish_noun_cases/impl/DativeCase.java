package com.github.veysiertekin.turkish_noun_cases.impl;

import com.github.veysiertekin.turkish_noun_cases.TurkishNounCase;

import static com.github.veysiertekin.turkish_noun_cases.util.TurkishGrammarUtils.*;

/**
 * Yonelme hali (-(y)e)
 */
public class DativeCase implements TurkishNounCase {
    private String name;

    public DativeCase(String name) {
        this.name = name;
    }

    public String combineWithSuffix() {
        String lowerName = name.toLowerCase(TURKISH_LOCALE);
        String addition = locativeCaseAddition(lowerName);
        if (isLastCharIsVowel(lowerName)) {
            addition = "y" + addition;
        }
        return name + "'" + addition;
    }
}
