/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav();
        arjun.name = "Arjun";
        arjun.fightingSkill = true;
        arjun.obedienceLevel = 10;
        arjun.kindnessLevel = 7;

        Kaurav duryodhan = new Kaurav();
        duryodhan.name = "Duryodhan";
        duryodhan.fightingSkill = true;
        duryodhan.crueltyLevel = 10;

        Vikarn vikarn = new Vikarn();
        vikarn.name = "Vikarn";
        vikarn.fightingSkill = true;
        vikarn.noble = true;

        arjun.fight();
        arjun.obey();
        arjun.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
    