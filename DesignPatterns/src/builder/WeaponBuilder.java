package builder;

import java.util.ArrayList;
import java.util.List;

    public class WeaponBuilder {
        private String type;
        private String name;
        private int damage;
        private long durability;
        private List<String> perks = new ArrayList<>();

        // Configuring methods
        public WeaponBuilder withType(String type) {
            this.type = type;
            return this;
        }
        public WeaponBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public WeaponBuilder withDamage(int damage) {
            this.damage = damage;
            return this;
        }
        public WeaponBuilder withDurability(Long durability) {
            this.durability = durability;
            return this;
        }
        public WeaponBuilder withPerks(List<String> perks) {
            this.perks = perks;
            return this;
        }

        public Weapon build() {
            return new Weapon(type, name, damage, durability, perks);
        }
    }

