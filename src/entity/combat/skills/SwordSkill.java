package entity.combat.skills;

import entity.combat.CombatType;
import entity.combat.Combat_Mastery;
import entity.combat.damage.DamageType;
import entity.combat.damage.WeaponEffects;

public class SwordSkill extends Combat_Mastery {

    public SwordSkill(int skillLevel) {
        super(CombatType.MELEE, DamageType.SHARP, skillLevel);
    }

}
