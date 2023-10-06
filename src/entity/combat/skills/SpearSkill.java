package entity.combat.skills;

import entity.combat.CombatType;
import entity.combat.Combat_Mastery;
import entity.combat.damage.DamageType;

public class SpearSkill extends Combat_Mastery {

    public SpearSkill(CombatType combatType, DamageType damageType, int skillLevel) {
        super(CombatType.MELEE, DamageType.SHARP, skillLevel);
    }


}
