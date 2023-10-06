package entity.combat.skills;

import entity.combat.CombatType;
import entity.combat.Combat_Mastery;
import entity.combat.damage.DamageType;

public class Mace extends Combat_Mastery {


    public Mace(int skillLevel) {
        super(CombatType.MELEE, DamageType.BLUNT, skillLevel, new String[]{"Strike", "Stun", "Break"});
    }

    @Override
    public void fight() {

    }

}
