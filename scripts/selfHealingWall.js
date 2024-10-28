const selfHealingWall = extendContent(Wall, "self-healing-wall", {
    update(tile) {
        // Define regeneration rate
        const regenRate = 0.5;  // Health per tick
        const block = tile.ent();

        // Ensure the wall's health is below max and needs healing
        if (block.health < block.maxHealth) {
            block.health = Math.min(block.health + regenRate, block.maxHealth);
        }
    }
});

// Define basic properties
selfHealingWall.health = 600;
selfHealingWall.size = 1;
selfHealingWall.armor = 5;
selfHealingWall.buildCostMultiplier = 0.8;

// Register the custom wall block
selfHealingWall.category = Category.defense;
selfHealingWall.requirements = ItemStack.with(
    Items.copper, 10,
    Items.lead, 5
);