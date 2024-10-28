public class extirpationmod extends Mod {

    public static Block healingBlock;

    @Override
    public void loadContent() {
        healingBlock = new HealingBlock("healing-block") {{
            requirements(Category.defense, ItemStack.with(Items.copper, 30));
            health = 600;
            size = 1;
        }};
    }
}