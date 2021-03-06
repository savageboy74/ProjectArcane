package com.woody104.projectarcane.registry;

import com.woody104.projectarcane.armor.arcaneArmor;
import com.woody104.projectarcane.armor.boneArmor;
import com.woody104.projectarcane.armor.darkCrystalArmor;
import com.woody104.projectarcane.food.FoodCookedChickenLeg;
import com.woody104.projectarcane.food.FoodGreenApple;
import com.woody104.projectarcane.food.FoodRawChickenLeg;
import com.woody104.projectarcane.food.FoodSunflowerSeeds;
import com.woody104.projectarcane.items.*;
import com.woody104.projectarcane.tools.*;
import com.woody104.projectarcane.util.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemRegistry
{

    private static int DA1;
    private static int DA2;
    private static int DA3;
    private static int DA4;
    //EmeraldArmorIDs
    private static int EA1;
    private static int EA2;
    private static int EA3;
    private static int EA4;
    //BoneArmorIDs
    private static int FA1;
    private static int FA2;
    private static int FA3;
    private static int FA4;

    public static Item itemArcaneGem = new Item().setUnlocalizedName("itemArcaneGem").setCreativeTab(CreativeTabRegistry.arcaneTab).setTextureName(Reference.MOD_ID + ":" + "itemArcaneGem");
    public static Item emeraldNugget = new Item().setUnlocalizedName("EmeraldNugget").setCreativeTab(CreativeTabRegistry.arcaneTab).setTextureName(Reference.MOD_ID + ":" + "emerald_nugget");
    public static Item itemNickel;
    public static Item itemVanadium;
    public static Item itemCobaltDust = new PAItems().setUnlocalizedName("itemCobaltDust");
    public static Item itemManganese;
    public static Item DirtPickaxe = new DirtPickaxe(MaterialRegistry.Tools.dirt).setUnlocalizedName("dirtPickaxe").setTextureName(Reference.MOD_ID + ":" + "dirt_pickaxe");
    public static Item DirtHoe = new DirtHoe(MaterialRegistry.Tools.dirt).setUnlocalizedName("dirtHoe").setTextureName(Reference.MOD_ID + ":" + "dirt_hoe");
    public static Item DirtSword = new DirtSword(MaterialRegistry.Tools.dirt).setUnlocalizedName("dirtSword").setTextureName(Reference.MOD_ID + ":" + "dirt_sword");
    public static Item DirtAxe = new DirtAxe(MaterialRegistry.Tools.dirt).setUnlocalizedName("dirtAxe").setTextureName(Reference.MOD_ID + ":" + "dirt_axe");
    public static Item DirtSpade = new com.woody104.projectarcane.tools.DirtSpade(MaterialRegistry.Tools.dirt).setUnlocalizedName("dirtSpade").setTextureName(Reference.MOD_ID + ":" + "dirt_shovel");
    public static Item arcanePickaxe = new arcanePickaxe(MaterialRegistry.Tools.arcane).setUnlocalizedName("arcanePickaxe").setTextureName(Reference.MOD_ID + ":" + "arcane_pickaxe");
    public static Item arcaneAxe = new arcaneAxe(MaterialRegistry.Tools.arcane).setUnlocalizedName("arcaneAxe").setTextureName(Reference.MOD_ID + ":" + "arcane_axe");
    public static Item arcaneSword = new arcaneSword(MaterialRegistry.Tools.arcane).setUnlocalizedName("arcaneSword").setTextureName(Reference.MOD_ID + ":" + "arcane_sword");
    public static Item arcaneHoe = new arcaneHoe(MaterialRegistry.Tools.arcane).setUnlocalizedName("arcaneHoe").setTextureName(Reference.MOD_ID + ":" + "arcane_hoe");
    public static Item arcaneSpade = new arcaneSpade(MaterialRegistry.Tools.arcane).setUnlocalizedName("arcaneSpade").setTextureName(Reference.MOD_ID + ":" + "arcane_shovel");
    public static Item ToolDarkCrystalPickaxe = new ToolDarkCrystalPickaxe(MaterialRegistry.Tools.darkCrystal).setUnlocalizedName("darkCrystalPickaxe").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_pickaxe");
    public static Item ToolDarkCrystalSword = new ToolDarkCrystalSword(MaterialRegistry.Tools.darkCrystal).setUnlocalizedName("darkCrystalSword").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_sword");
    public static Item ToolDarkCrystalSpade = new ToolDarkCrystalSpade(MaterialRegistry.Tools.darkCrystal).setUnlocalizedName("darkCrystalShovel").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_shovel");
    public static Item ToolDarkCrystalAxe = new ToolDarkCrystalAxe(MaterialRegistry.Tools.darkCrystal).setUnlocalizedName("darkCrystalAxe").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_axe");
    public static Item ToolDarkCrystalHoe = new ToolDarkCrystalHoe(MaterialRegistry.Tools.darkCrystal).setUnlocalizedName("darkCrystalHoe").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_hoe");
    public static Item CobaltPickaxe = new CobaltPickaxe(MaterialRegistry.Tools.cobalt).setUnlocalizedName("cobaltPickaxe").setTextureName(Reference.MOD_ID + ":" + "cobalt_pickaxe");
    public static Item CobaltSword = new CobaltSword(MaterialRegistry.Tools.cobalt).setUnlocalizedName("cobaltSword").setTextureName(Reference.MOD_ID + ":" + "cobalt_sword");
    public static Item CobaltAxe = new CobaltAxe(MaterialRegistry.Tools.cobalt).setUnlocalizedName("cobaltAxe").setTextureName(Reference.MOD_ID + ":" + "cobalt_axe");
    public static Item CobaltShovel = new CobaltShovel(MaterialRegistry.Tools.cobalt).setUnlocalizedName("cobaltShovel").setTextureName(Reference.MOD_ID + ":" + "cobalt_shovel");
    public static Item CobaltHoe = new CobaltHoe(MaterialRegistry.Tools.cobalt).setUnlocalizedName("cobaltHoe").setTextureName(Reference.MOD_ID + ":" + "cobalt_hoe");
    public static Item itemThunderfury = new ItemThunderfury(MaterialRegistry.Tools.agem, null).setUnlocalizedName("itemThunderfury").setTextureName(Reference.MOD_ID + ":" + "itemThunderfury");
    public static Item arcaneHelmet = new arcaneArmor(MaterialRegistry.Armor.arcaneArmor, DA1, 0).setUnlocalizedName("arcaneHelmet").setTextureName(Reference.MOD_ID + ":" + "arcane_helmet");
    public static Item arcaneChestplate = new arcaneArmor(MaterialRegistry.Armor.arcaneArmor, DA2, 1).setUnlocalizedName("arcaneChestplate").setTextureName(Reference.MOD_ID + ":" + "arcane_chestplate");
    public static Item arcaneLeggings = new arcaneArmor(MaterialRegistry.Armor.arcaneArmor, DA3, 2).setUnlocalizedName("arcaneLeggings").setTextureName(Reference.MOD_ID + ":" + "arcane_leggings");
    public static Item arcaneBoots = new arcaneArmor(MaterialRegistry.Armor.arcaneArmor, DA4, 3).setUnlocalizedName("arcaneBoots").setTextureName(Reference.MOD_ID + ":" + "arcane_boots");
    public static Item DarkCrystalHelmet = new darkCrystalArmor(MaterialRegistry.Armor.darkcrystalArmor, EA1, 0).setUnlocalizedName("darkCrystalHelmet").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_helmet");
    public static Item DarkCrystalChestplate = new darkCrystalArmor(MaterialRegistry.Armor.darkcrystalArmor, EA2, 1).setUnlocalizedName("darkCrystalChestplate").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_chestplate");
    public static Item DarkCrystalLeggings = new darkCrystalArmor(MaterialRegistry.Armor.darkcrystalArmor, EA3, 2).setUnlocalizedName("darkCrystalLeggings").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_leggings");
    public static Item DarkCrystalBoots = new darkCrystalArmor(MaterialRegistry.Armor.darkcrystalArmor, EA4, 3).setUnlocalizedName("darkCrystalBoots").setTextureName(Reference.MOD_ID + ":" + "darkcrystal_boots");
    public static Item BoneHelmet = new boneArmor(MaterialRegistry.Armor.boneArmor, FA1, 0).setUnlocalizedName("boneHelmet").setTextureName(Reference.MOD_ID + ":" + "bone_helmet");
    public static Item BoneChestplate = new boneArmor(MaterialRegistry.Armor.boneArmor, FA2, 1).setUnlocalizedName("boneChestplate").setTextureName(Reference.MOD_ID + ":" + "bone_chestplate");
    public static Item BoneLeggings = new boneArmor(MaterialRegistry.Armor.boneArmor, FA3, 2).setUnlocalizedName("boneLeggings").setTextureName(Reference.MOD_ID + ":" + "bone_leggings");
    public static Item BoneBoots = new boneArmor(MaterialRegistry.Armor.boneArmor, FA4, 3).setUnlocalizedName("boneBoots").setTextureName(Reference.MOD_ID + ":" + "bone_boots");
    public static Item foodGreenApple = new FoodGreenApple(10, true).setTextureName(Reference.MOD_ID + ":" + "foodGreenApple");
    public static Item foodRawChickenLeg = new FoodRawChickenLeg(4, false).setTextureName(Reference.MOD_ID + ":" + "foodRawChickenLeg");
    public static Item foodCookedChickenLeg = new FoodCookedChickenLeg(8, false).setTextureName(Reference.MOD_ID + ":" + "foodCookedChickenLeg");
    public static Item foodSunflowerSeeds = new FoodSunflowerSeeds(2, 0.3F, false);
    public static Item cropStrawberry = new ItemFood(4, 0.5F, false).setUnlocalizedName("strawberry").setTextureName(Reference.MOD_ID + ":" + "foodStrawberry").setCreativeTab(CreativeTabRegistry.arcaneTab);
    public static Item cropStrawberrySeeds = new ItemSeeds(BlockRegistry.cropStrawberryPlant, Blocks.farmland).setUnlocalizedName("strawberrySeeds").setTextureName(Reference.MOD_ID + ":" + "seeds_strawberry").setCreativeTab(CreativeTabRegistry.arcaneTab);
    public static Item cropCantalopeSeeds = new ItemSeeds(BlockRegistry.cropCantalopeStem, Blocks.farmland).setUnlocalizedName("cantalopeSeeds").setTextureName(Reference.MOD_ID + ":" + "cantalopeSeeds").setCreativeTab(CreativeTabRegistry.arcaneTab);
    public static Item cropCantalopeSlices = new ItemFood(6, 0.6F, false).setUnlocalizedName("cantalope").setTextureName(Reference.MOD_ID + ":" + "cantalopeSlice").setCreativeTab(CreativeTabRegistry.arcaneTab);
    public static Item toolSaw = new ToolSaw();
    public static Item toolArcaneChisel = new ToolArcaneChisel();
    public static Item toolArcaneHammer = new ToolArcaneHammer();
    public static Item itemCutter = new ItemCutter().setUnlocalizedName("itemCutter").setTextureName(Reference.MOD_ID + ":" + "itemCutter");
    public static Item itemBlades = new ItemBlades().setUnlocalizedName("itemBlades").setTextureName(Reference.MOD_ID + ":" + "itemBlades");
    public static Item itemHandle = new ItemHandle().setUnlocalizedName("itemHandle").setTextureName(Reference.MOD_ID + ":" + "itemHandle");
    public static Item itemMetalBender = new ItemMetalBender().setUnlocalizedName("itemMetalBender").setTextureName(Reference.MOD_ID + ":" + "itemMetalBender");
    public static Item itemArcaneMetalPlate = new ItemArcaneMetalPlate().setUnlocalizedName("itemArcaneMetalPlate").setTextureName(Reference.MOD_ID + ":" + "itemArcaneMetalPlate");
    public static Item itemArcaneMetal = new ItemArcaneMetal().setTextureName(Reference.MOD_ID + ":" + "itemArcaneMetal");
    public static Item itemEnhancedArcaneMetal = new ItemEnhancedArcaneMetal().setTextureName(Reference.MOD_ID + ":" + "itemEnhancedArcaneMetal");
    public static Item itemDarkCrystal = new ItemDarkCrystal().setTextureName(Reference.MOD_ID + ":" + "itemDarkCrystal");
    public static Item DirtStick = new ItemDirtStick().setTextureName(Reference.MOD_ID + ":" + "dirt_stick");
    public static Item ArcanePlate = new PAMaterial().setUnlocalizedName("arcanePlate");
    public static Item itemChainIngot = new PAMaterial().setUnlocalizedName("itemChainIngot");
    public static Item itemChainLink = new PAMaterial().setUnlocalizedName("itemChainLink");
    public static Item itemChainLink_2 = new PAMaterial().setUnlocalizedName("itemChainLink_2");
    public static Item itemWoodChips = new PAMaterial().setUnlocalizedName("itemWoodChips");
    public static Item itemCobaltIngot = new PAMaterial().setUnlocalizedName("itemCobaltIngot");
    public static Item itemArcaneRod = new PAMaterial().setUnlocalizedName("itemArcaneRod");
    public static Item itemCoalChunk  = new PAMaterial().setUnlocalizedName("coalChunk");
    public static Item toolGoldHammer = new ToolGoldHammer();
    public static Item itemCobaltPlate = new PAMaterial().setUnlocalizedName("cobaltPlate");
    public static Item itemSandDust = new PAItems().setUnlocalizedName("sandDust");

    public static void init()
    {
        GameRegistry.registerItem(cropCantalopeSeeds, "cantalopeSeeds");
        GameRegistry.registerItem(cropStrawberrySeeds, "strawberrySeeds");
        GameRegistry.registerItem(cropStrawberry, "strawberry");
        GameRegistry.registerItem(cropCantalopeSlices, "cantalopeSlice");
        GameRegistry.registerItem(itemArcaneGem, "itemArcaneGem");
        GameRegistry.registerItem(emeraldNugget, "emeraldNugget");
        GameRegistry.registerItem(itemCobaltDust, "itemCobaltDust");
        GameRegistry.registerItem(arcanePickaxe, "arcanePickaxe");
        GameRegistry.registerItem(arcaneAxe, "arcaneAxe");
        GameRegistry.registerItem(arcaneSword, "arcaneSword");
        GameRegistry.registerItem(arcaneHoe, "arcaneHoe");
        GameRegistry.registerItem(arcaneSpade, "arcaneSpade");
        GameRegistry.registerItem(ToolDarkCrystalPickaxe, "emeraldPickaxe");
        GameRegistry.registerItem(ToolDarkCrystalAxe, "emeraldAxe");
        GameRegistry.registerItem(ToolDarkCrystalSword, "emeraldSword");
        GameRegistry.registerItem(ToolDarkCrystalHoe, "emeraldHoe");
        GameRegistry.registerItem(ToolDarkCrystalSpade, "emeraldSpade");
        GameRegistry.registerItem(DirtPickaxe, "dirtPickaxe");
        GameRegistry.registerItem(DirtSword, "dirtSword");
        GameRegistry.registerItem(DirtSpade, "dirtShovel");
        GameRegistry.registerItem(DirtHoe, "dirtHoe");
        GameRegistry.registerItem(DirtAxe, "dirtAxe");
        GameRegistry.registerItem(CobaltPickaxe, "cobaltPickaxe");
        GameRegistry.registerItem(CobaltAxe, "cobaltAxe");
        GameRegistry.registerItem(CobaltSword, "cobaltSword");
        GameRegistry.registerItem(CobaltHoe, "cobaltHoe");
        GameRegistry.registerItem(CobaltShovel, "cobaltShovel");
        GameRegistry.registerItem(arcaneHelmet, "arcaneHelmet");
        GameRegistry.registerItem(arcaneChestplate, "arcaneChestplate");
        GameRegistry.registerItem(arcaneLeggings, "arcaneLeggings");
        GameRegistry.registerItem(arcaneBoots, "arcaneBoots");
        GameRegistry.registerItem(DarkCrystalHelmet, "darkCrystalHelmet");
        GameRegistry.registerItem(DarkCrystalChestplate, "darkCrystalChestplate");
        GameRegistry.registerItem(DarkCrystalLeggings, "darkCrystalLeggings");
        GameRegistry.registerItem(DarkCrystalBoots, "darkCrystalBoots");
        GameRegistry.registerItem(BoneHelmet, "boneHelmet");
        GameRegistry.registerItem(BoneChestplate, "boneChestplate");
        GameRegistry.registerItem(BoneLeggings, "boneLeggings");
        GameRegistry.registerItem(BoneBoots, "boneBoots");
        GameRegistry.registerItem(itemCutter, "itemCutter");
        GameRegistry.registerItem(itemBlades, "itemBlades");
        GameRegistry.registerItem(itemHandle, "itemHandle");
        GameRegistry.registerItem(itemMetalBender, "itemMetalBender");
        GameRegistry.registerItem(itemArcaneMetalPlate, "itemMetalPlate");
        GameRegistry.registerItem(itemArcaneMetal, "itemArcaneMetal");
        GameRegistry.registerItem(itemEnhancedArcaneMetal, "itemEnhancedArcaneMetal");
        GameRegistry.registerItem(itemDarkCrystal, "itemDarkCrystal");
        GameRegistry.registerItem(DirtStick, "dirtStick");
        GameRegistry.registerItem(toolArcaneHammer, "toolAH");
        GameRegistry.registerItem(toolArcaneChisel, "toolArcaneChisel");
        GameRegistry.registerItem(ArcanePlate, "arcanePlate");
        GameRegistry.registerItem(itemChainIngot, "itemChainIngot");
        GameRegistry.registerItem(itemChainLink, "itemChainLink");
        GameRegistry.registerItem(itemChainLink_2, "itemChainLink_2");
        GameRegistry.registerItem(itemWoodChips, "itemWoodChips");
        GameRegistry.registerItem(toolSaw, "toolSaw");
        GameRegistry.registerItem(itemCobaltIngot, "itemCobaltIngot");
        GameRegistry.registerItem(itemArcaneRod, "itemArcaneRod");
        GameRegistry.registerItem(foodGreenApple, "foodHeartHealer");
        GameRegistry.registerItem(foodRawChickenLeg, "foodRawChickenLeg");
        GameRegistry.registerItem(foodCookedChickenLeg, "foodCookedChickenLeg");
        GameRegistry.registerItem(foodSunflowerSeeds, "foodSunflowerSeeds");
        GameRegistry.registerItem(itemCoalChunk, "coalChunk");
        GameRegistry.registerItem(toolGoldHammer, "goldHammer");
        GameRegistry.registerItem(itemCobaltPlate, "cobaltPlate");
        GameRegistry.registerItem(itemSandDust, "sandDust");

    }

}
