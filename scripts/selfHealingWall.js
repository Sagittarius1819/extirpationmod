const selfHealingWall = Vars.content.block("extirpation-mod-Marbled-Blight-Bulwark");  // Replace "mod-name" with your mod's name

// Extend the behavior of the wall with custom regeneration
selfHealingWall.update = true;  // Ensure it updates each tick
selfHealingWall.buildType = () => extendContent(Wall.WallBuild, selfHealingWall, {
    updateTile() {
        this.super$updateTile();

        // Define regeneration rate
        const regenRate = 0.5;  // Health per tick

        // Regenerate health if below max
        if (this.health < this.maxHealth) {
            this.health = Math.min(this.health + regenRate, this.maxHealth);
        }
    }
});