package net.edwinox.monkeykit.datagen;

import net.edwinox.monkeykit.MonkeyKit;
import net.edwinox.monkeykit.item.ModItems;
import net.edwinox.monkeykit.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, MonkeyKit.MOD_ID);
    }
    @Override
    protected void start() {
        add("copper_krona_from_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_husk", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/husk")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_stray", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/stray")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_cave_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/cave_spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_drowned", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/drowned")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_elder_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_enderman", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/enderman")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_endermite", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/endermite")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_evoker", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/evoker")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_vindicator", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vindicator")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_vex", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vex")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_ghast", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ghast")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_hoglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/hoglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_phantom", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/phantom")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_piglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_piglin_brute", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin_brute")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_pillager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/pillager")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_ravager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ravager")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_shulker", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/shulker")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_silverfish", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/silverfish")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_warden", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_witch", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/witch")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_wither_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_zoglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zoglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_zombie_villager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie_villager")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_zoglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zoglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_zoglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zoglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_bone_serpent", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/bone_serpent")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_crocodile", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/crocodile")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_crimson_mosquito", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/crimson_mosquito")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_cave_centipede", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/cave_centipede")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_soul_vulture", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/soul_vulture")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_tarantula_hawk", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/tarantula_hawk")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_void_worm", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexsmobs:entities/void_worm")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_nucleeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/nucleeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_radgill", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/radgill")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_brainiac", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/brainiac")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_gamma_roach", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/gamma_roach")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_deep_one", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/deep_one")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_deep_one_knight", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/deep_one_knight")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_deep_one_mage", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/deep_one_mage")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_watcher", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/watcher")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_underzealot", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/underzealot")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_corrodent", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/corrodent")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_vesper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/vesper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_forsaken", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("alexscaves:entities/forsaken")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_jungle_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/jungle_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_bamboo_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/bamboo_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_desert_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/desert_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_badlands_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/badlands_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_hills_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/hills_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_savannah_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/savannah_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_mushroom_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/mushroom_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_swamp_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/swamp_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_dripstone_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/dripstone_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_cave_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/cave_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_dark_oak_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/dark_oak_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_spruce_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/spruce_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_beach_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/beach_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_snowy_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/snowy_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));

        add("copper_krona_from_ocean_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("creeperoverhaul:entities/ocean_creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.COPPER_KRONA.get()));
        };
    }