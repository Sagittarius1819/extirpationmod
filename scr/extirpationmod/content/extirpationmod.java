public class extirpationmod extends Mod {

    public static Block healingWall;

    @Override
    public void loadContent() {
        healingWall = new HealingWall("Marbled-Blight-Bulwark") {{
            requirements(Category.defense, ItemStack.with(Items.copper, 30));
            health = 600;
            size = 1;
        }};
    }
}