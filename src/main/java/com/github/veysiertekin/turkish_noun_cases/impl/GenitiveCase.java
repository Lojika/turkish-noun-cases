package com.github.veysiertekin.turkish_noun_cases.impl;

import com.github.veysiertekin.turkish_noun_cases.TurkishNounCase;

import static com.github.veysiertekin.turkish_noun_cases.util.TurkishGrammarUtils.*;

/**
 * Tamlayan eki (-(n)in)
 */
public class GenitiveCase implements TurkishNounCase {
    private String name;

    public GenitiveCase(String name) {
        this.name = name;
    }

    public String combineWithSuffix() {
        String lowerName = name.toLowerCase(TURKISH_LOCALE);
        String addition = definiteAccusativeCaseAddition(lowerName);
        if (isLastCharIsVowel(lowerName)) {
            addition = "n" + addition;
        }
        return name + "'" + addition + "n";
    }
}
