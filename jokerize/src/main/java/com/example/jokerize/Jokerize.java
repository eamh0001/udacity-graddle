package com.example.jokerize;

import java.util.Random;

public class Jokerize {

    public static String tellJoke() {
        return getJoke(new Random().nextInt(11));
    }

    private static String getJoke(int index) {
        switch (index) {
            case 0:
                return "Your first Android app walks into a hotel and asks for a room with an upright bed. \"Why?\" asks the concierge. \"I haven't implemented my horizontal yet\".";
            case 1:
                return "An Android app walks into a bar. Bartender asks, \"Can I get you a drink?\" The app looks disappointed and says, \"That wasn't my intent.\"";
            case 2:
                return "A fragment walks into a bar and says, \"I'm lost. Can I please speak to the FragmentManager?\"";
            case 3:
                return "A pregnant fragment walks into a bar. The bartender says, \"Whoa! Whoa! We don't support nested fragments here!\"";
            case 4:
                return "A fragment walks into a bar, and the bartender asks for an ID. Fragment says, \"I don't have an ID.\" So the bartender says, \"Okay, I'll make a NullPointerException.\"";
            case 5:
                return "How do paladins get so tan?\n" +
                        "\n" +
                        "They put their face in the light.\n";
            case 6:
                return "What would a Roman Emperor who plays Hunter name his character?\n" +
                        "\n" +
                        "Marksimilian.\n";
            case 7:
                return "What browser do the bronze dragonflight use?\n" +
                        "\n" +
                        "Google Chromie\n";
            case 8:
                return "What software do Lightforged use?\n" +
                        "\n" +
                        "T'paartOS!\n";
            case 9:
                return "Who is the most infamous draenei criminal?\n" +
                        "\n" +
                        "Pablo Exodar.\n";

            default:
                return "Why didn't the undead cross the road?\n" +
                        "He didn't have the guts ";
        }
    }
}
