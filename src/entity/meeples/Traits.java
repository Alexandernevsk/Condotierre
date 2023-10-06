package entity.meeples;

enum Traits {

      BOW_ARCHERY("Is proficient in drawback bows")
    , HORSEBACK("Is experienced with horseback combat"), ARCANE("has knowledge of arcane studies")
    , AMBUSH("Subterfuge and stealth come naturally"), SPEAR("Knows his way with spear-like weapons")
    , CROSSBOW_ARCHERY("Learned how to fight efficiently with the crossbow")
    , SWORDSMANSHIP("Experienced swordsman"), HAGGLER("Knows how to annoy the local townsman for the best prices ")
    , TOUGH("Born with unusual strong constitution, will not fall easily after taking some blows")
    , BRAVE ("Hart of a lion, and master of his fear")
    , KNOWLEDGEABLE ("Owing to his upbringing knows things other don't")
    , HUNTER ("Due to his profession skilled in ranged attacks, and stealth")
    , TACTICIAN ("Natural inclination towards the grand battle plan!")
    , QUICK("Quick-footed and will outrun almost anyway in a race!")
    , EVASIVENESS("With his cat-like reflexes, he will dodge almost all quick-or surprise-attacks coming his way!")
    , SLOW("He might even be called a turtle at this point, but without a cover to retreat to!")
    , SCRAWNY("Sickly constitution or poor diet might explain his meagre appearance")
    , MAD("Character is tormented by his mind, might suffer from mental breaks from time to time.")
    , COWARD("Thinks retreating is always better than fighting, you know, than you can always fight another day (or not)!");
    private final String description;


    Traits(String description) {
        this.description = description;
    }
}