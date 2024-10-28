package extirpationmod.content;

import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks;
import mindustry.gen.Building;

public class HealingBlock extends Block {

    // Constructor for the healing wall
    public HealingBlock(String name) {
        super(name);
    }

    // Inner class for the building logic
    public class HealingBlockBuild extends BlockBuild {
        
        private static final float HEAL_RATE = 0.5f; // Adjust healing rate as needed

        @Override
        public void updateTile() {
            super.updateTile();

            // If health is below maximum, heal the wall
            if (health < maxHealth) {
                health += HEAL_RATE;
                
                // Cap the health to max health to prevent overhealing
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
        }
    }

    @Override
    public Building createBuilding() {
        return new HealingBlockBuild();
    }
}