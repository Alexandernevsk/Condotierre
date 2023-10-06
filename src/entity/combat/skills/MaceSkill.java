package entity.combat.skills;

import entity.combat.CombatType;
import entity.combat.Combat_Mastery;
import entity.combat.damage.DamageType;

public class MaceSkill extends Combat_Mastery {


    public MaceSkill(int skillLevel) {
        super(CombatType.MELEE, DamageType.BLUNT, skillLevel);
    }


}
