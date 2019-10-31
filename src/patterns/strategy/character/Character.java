package patterns.strategy.character;

public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public Character() {

    }

    public void fight() {
        if(weaponBehavior != null) {
            weaponBehavior.useWeapon();
        }
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
