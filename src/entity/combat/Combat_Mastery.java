package entity.combat;

import entity.combat.damage.DamageType;

public abstract class Combat_Mastery {
    private CombatType combatType;
    private DamageType damageType;
    private int skillLevel;

    public Combat_Mastery(CombatType combatType, DamageType damageType, int skillLevel) {
        this.combatType = combatType;
        this.damageType = damageType;
        this.skillLevel = skillLevel;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

}
