package net.asg.games.yokel;

import net.asg.games.yokel.objects.YokelBlock;
import net.asg.games.yokel.objects.YokelBlockEval;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YokelBlockEvalTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    public void printBlockLabel(int block){
        System.out.println(YokelBlockEval.getPowerLabel(block) + " : " + YokelBlockEval.getPowerUseDescriptionLabel(block));
    }

    @Test
    public void descriptionTest() throws Exception {
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MINOR)) + "]Y_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_REGULAR)) + "]Y_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MEGA)) + "]Y_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MINOR)) + "]Y_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_REGULAR)) + "]Y_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println(YokelBlockEval.getPowerUseDescriptionLabel(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MEGA)) + "]Y_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MEGA));

        System.out.println("Offensive Y minor=" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MINOR));

        System.out.println("O_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println("O_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println("O_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("O_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("O_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println("O_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_MEGA));

        System.out.println("K_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println("K_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println("K_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("K_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("K_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println("K_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_MEGA));

        System.out.println("E_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println("E_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println("E_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("E_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("E_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println("E_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_MEGA));

        System.out.println("L_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println("L_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println("L_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("L_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("L_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println("L_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_MEGA));

        System.out.println("EX_BLOCK-(OFFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_MINOR));
        System.out.println("EX_BLOCK-(OFFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_REGULAR));
        System.out.println("EX_BLOCK-(OFFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("EX_BLOCK-(DEFENSIVE_MINOR)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("EX_BLOCK-(DEFENSIVE_REGULAR)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_REGULAR));
        System.out.println("EX_BLOCK-(DEFENSIVE_MEGA)=" + YokelBlockEval.setPowerFlag(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_MEGA));
    }

    private void testBlockPowers(int block, int power){
        System.out.println("block: " + block);
        System.out.println("power: " + power);
        System.out.println("blockk: " + block);

        final int originalBlock = block;
        int powerLevel;
        String powerText;

        switch (power){
            case YokelBlock.OFFENSIVE_MINOR:
                powerText = "OFFENSIVE_MINOR: ";
                powerLevel = 1;
                break;
            case YokelBlock.OFFENSIVE_REGULAR:
                powerText = "OFFENSIVE_REGULAR: ";
                powerLevel = 2;
                break;
            case YokelBlock.OFFENSIVE_MEGA:
                powerText = "OFFENSIVE_MEGA: ";
                powerLevel = 3;
                break;
            case YokelBlock.DEFENSIVE_MINOR:
                powerText = "DEFENSIVE_MINOR: ";
                powerLevel = 1;
                break;
            case YokelBlock.DEFENSIVE_REGULAR:
                powerText = "DEFENSIVE_REGULAR: ";
                powerLevel = 2;
                break;
            case YokelBlock.DEFENSIVE_MEGA:
            default:
                powerText = "DEFENSIVE_MEGA: ";
                powerLevel = 3;
                break;
        }

        block = YokelBlockEval.setPowerFlag(block, power);
        System.out.println(powerText + block);
        System.out.println("CELL: " + YokelBlockEval.getCellFlag(block));
        Assert.assertEquals(originalBlock, YokelBlockEval.getCellFlag(block));

        //test add power flag
        block = YokelBlockEval.addPowerBlockFlag(block);
        System.out.println(powerText + block);
        System.out.println("CELL: " + YokelBlockEval.getCellFlag(block));
        Assert.assertEquals(originalBlock, YokelBlockEval.getCellFlag(block));
        printBlockLabel(block);

        Assert.assertTrue(YokelBlockEval.hasPowerBlockFlag(block));
        Assert.assertEquals(powerLevel, YokelBlockEval.getPowerLevel(block));
        Assert.assertEquals(originalBlock, YokelBlockEval.getCellFlag(block));
    }

    @Test
    public void yokelblock_Y_Test() throws Exception {
        System.out.println("Start yokelblock_Y_Test()");
        int y_block = YokelBlock.Y_BLOCK;
        int block = y_block;
        Assert.assertEquals(YokelBlock.Y_BLOCK, block);

        System.out.println("Y Block: " + YokelBlock.Y_BLOCK);
        printBlockLabel(block);

        //OFFENSIVE_MINOR = 3;
        block = YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MINOR);
        printBlockLabel(block);
        block = YokelBlockEval.addPowerBlockFlag(block);
        printBlockLabel(block);

        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MEGA);

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(y_block));
        y_block = YokelBlockEval.addBrokenFlag(y_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(y_block));
        y_block = YokelBlockEval.removeBrokenFlag(y_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(y_block));

        System.out.println("End yokelblock_Y_Test()");
    }

    @Test
    public void yokelblock_O_Test() throws Exception {
        System.out.println("Start yokelblock_O_Test()");
        int o_block = YokelBlock.A_BLOCK;
        int block = o_block;
        Assert.assertEquals(YokelBlock.A_BLOCK, block);

        System.out.println("O Block: " + YokelBlock.A_BLOCK);
        printBlockLabel(block);

        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.A_BLOCK, YokelBlock.DEFENSIVE_MEGA);

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(o_block));
        o_block = YokelBlockEval.addBrokenFlag(o_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(o_block));
        o_block = YokelBlockEval.removeBrokenFlag(o_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(o_block));

        System.out.println("End yokelblock_O_Test()");
    }

    @Test
    public void yokelblock_K_Test() throws Exception {
        System.out.println("Start yokelblock_K_Test()");
        int k_block = YokelBlock.H_BLOCK;
        int block = k_block;
        Assert.assertEquals(YokelBlock.H_BLOCK, block);

        System.out.println("K Block: " + YokelBlock.H_BLOCK);
        //OFFENSIVE_MINOR = 3;
        block = YokelBlockEval.setPowerFlag(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_MINOR);
        System.out.println("OFFENSIVE_MINOR: " + block);
        printBlockLabel(block);

        //test add power flag
        block = YokelBlockEval.addPowerBlockFlag(block);
        System.out.println("OFFENSIVE_MINOR: " + block);
        System.out.println("CELL: " + YokelBlockEval.getCellFlag(block));
        Assert.assertEquals(YokelBlock.H_BLOCK, YokelBlockEval.getCellFlag(block));
        printBlockLabel(block);

        Assert.assertTrue(YokelBlockEval.hasPowerBlockFlag(block));
        Assert.assertEquals(1, YokelBlockEval.getPowerLevel(block));
        Assert.assertEquals(YokelBlock.H_BLOCK, YokelBlockEval.getCellFlag(block));

        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.H_BLOCK, YokelBlock.DEFENSIVE_MEGA);;

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(k_block));
        k_block = YokelBlockEval.addBrokenFlag(k_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(k_block));
        k_block = YokelBlockEval.removeBrokenFlag(k_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(k_block));
        System.out.println("End yokelblock_K_Test()");
    }

    @Test
    public void yokelblock_E_Test() throws Exception {
        System.out.println("Start yokelblock_E_Test()");
        int e_block = YokelBlock.Op_BLOCK;
        int block = e_block;
        Assert.assertEquals(YokelBlock.Op_BLOCK, block);

        System.out.println("E Block: " + YokelBlock.Op_BLOCK);

        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.Op_BLOCK, YokelBlock.DEFENSIVE_MEGA);

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(e_block));
        e_block = YokelBlockEval.addBrokenFlag(e_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(e_block));
        e_block = YokelBlockEval.removeBrokenFlag(e_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(e_block));
        System.out.println("End yokelblock_E_Test()");
    }

    @Test
    public void yokelblock_L_Test() throws Exception {
        System.out.println("Start yokelblock_L_Test()");
        int l_block = YokelBlock.Oy_BLOCK;
        int block = l_block;
        Assert.assertEquals(YokelBlock.Oy_BLOCK, block);

        System.out.println("L Block: " + YokelBlock.Oy_BLOCK);
        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.Oy_BLOCK, YokelBlock.DEFENSIVE_MEGA);

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(l_block));
        l_block = YokelBlockEval.addBrokenFlag(l_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(l_block));
        l_block = YokelBlockEval.removeBrokenFlag(l_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(l_block));
        System.out.println("End yokelblock_L_Test()");
    }

    @Test
    public void yokelblock_EX_Test() {
        System.out.println("Start yokelblock_EX_Test()");
        int ex_block = YokelBlock.EX_BLOCK;
        int block = ex_block;
        Assert.assertEquals(YokelBlock.EX_BLOCK, block);

        System.out.println("EX Block: " + YokelBlock.EX_BLOCK);
        //OFFENSIVE_MINOR = 3;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_MINOR);

        //OFFENSIVE_REGULAR = 5;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_REGULAR);

        //OFFENSIVE_MEGA = 7;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.OFFENSIVE_MEGA);

        //DEFENSIVE_MINOR = 2;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_MINOR);

        //DEFENSIVE_REGULAR = 4;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_REGULAR);

        //DEFENSIVE_MEGA = 6;
        testBlockPowers(YokelBlock.EX_BLOCK, YokelBlock.DEFENSIVE_MEGA);

        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(ex_block));
        ex_block = YokelBlockEval.addBrokenFlag(ex_block);
        Assert.assertTrue(YokelBlockEval.hasBrokenFlag(ex_block));
        ex_block = YokelBlockEval.removeBrokenFlag(ex_block);
        Assert.assertFalse(YokelBlockEval.hasBrokenFlag(ex_block));
        System.out.println("End yokelblock_EX_Test()");
    }

    @Test
    public void testGetCellFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testSetValueFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testHasAddedByYahooFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testAddArtificialFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testBrokenFlags() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testAddBrokenFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testRemoveBrokenFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testPartnerBreakFlags() {
        System.out.println("Start testPartnerBreakFlag()");
        int block;
        int actual;

        //Normal Blocks
        block = YokelBlock.Y_BLOCK;
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        //block = YokelBlockEval.addPowerBlockFlag(block, YokelBlockEval.OFFENSIVE_MINOR);

        block = YokelBlock.A_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlock.H_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlock.Op_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlock.Oy_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlock.EX_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        //Offensive Blocks
        /*block = YokelBlockEval.addPowerBlockFlag(YokelBlockEval.Y_BLOCK, YokelBlockEval.OFFENSIVE_MINOR);
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlockEval.O_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlockEval.K_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlockEval.E_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlockEval.L_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));

        block = YokelBlockEval.EX_BLOCK;
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.addPartnerBreakFlag(block);
        Assert.assertEquals(true, YokelBlockEval.hasPartnerBreakFlag(actual));
        actual = YokelBlockEval.removePartnerBreakFlag(block);
        Assert.assertEquals(false, YokelBlockEval.hasPartnerBreakFlag(actual));*/
        System.out.println("End testPartnerBreakFlag()");
    }

    @Test
    public void testGetID() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testSetIDFlag() throws Exception {
        int v0 = YokelBlockEval.addPowerBlockFlag(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.OFFENSIVE_MEGA));
        System.out.println("powwah-V0-" + v0);
        int v1= YokelBlockEval.setIDFlag(v0, 1);
        System.out.println("-V1-" + v1);
        int v2 = YokelBlockEval.getID(v1);
        System.out.println("-V2-" + v2);
        int v3 = YokelBlockEval.setValueFlag(v2, v2);
        System.out.println("-V3-" + v3);
        System.out.println("ttm-" + ((v1 & ~0x7f000) | 1 >> 12));

        int v10 = YokelBlockEval.addPowerBlockFlag(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, YokelBlock.DEFENSIVE_MINOR));
        System.out.println("powwah-V0-" + v10);
        int v11= YokelBlockEval.setIDFlag(v10, 2);
        System.out.println("-V1-" + v11);
        int v12 = YokelBlockEval.getID(v11);
        System.out.println("-V2-" + v12);
        int v13 = YokelBlockEval.setValueFlag(v11, v12);
        System.out.println("-V3-" + v13);
    }

    @Test
    public void testGetPowerFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testSetPowerFlag() throws Exception {
        System.out.println("power 8" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, 8));
        System.out.println("power 8" + YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, 1));
        int block = YokelBlockEval.addPowerBlockFlag(YokelBlockEval.setPowerFlag(YokelBlock.Y_BLOCK, 4));
        Assert.assertEquals(YokelBlock.Y_BLOCK, YokelBlockEval.getCellFlag(block));
        System.out.println("power 8" + YokelBlockEval.isOffensive(block));
        System.out.println("power level = " + YokelBlockEval.getPowerLevel(block));

    }

    @Test
    public void testHasSpecialFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testAddSpecialFlag() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testHasPowerBlockFlag() throws Exception {
        int block = YokelBlock.Y_BLOCK;
        int actual = YokelBlockEval.addPowerBlockFlag(block);

        Assert.assertTrue(YokelBlockEval.hasPowerBlockFlag(actual));
        Assert.assertFalse(YokelBlockEval.hasPowerBlockFlag(block));
    }

    @Test
    public void testAddPowerBlockFlag() throws Exception {
        System.out.println("Start testAddPowerBlockFlag()");

        int block;
        int actual;

        //Normal Blocks
        block = YokelBlock.Y_BLOCK;
        actual = YokelBlockEval.addPowerBlockFlag(block);

        System.out.println("BLOCK: " + block);
        System.out.println("POWER_BLOCK: " + actual);
        System.out.println("HAS Block Flag: " + YokelBlockEval.hasPowerBlockFlag(actual));
        System.out.println("BLOCK: " + YokelBlock.A_BLOCK);
        System.out.println("POWER_BLOCK: " + YokelBlockEval.addPowerBlockFlag(YokelBlock.A_BLOCK));

        System.out.println("End testAddPowerBlockFlag()");

        Assert.assertTrue(YokelBlockEval.hasPowerBlockFlag(actual));
        Assert.assertFalse(YokelBlockEval.hasPowerBlockFlag(block));
    }

    @Test
    public void testIsOffensive() throws Exception {
        throw new Exception("Test not implemented.");
    }

    @Test
    public void testGetPowerLevel() throws Exception {
        throw new Exception("Test not implemented.");
    }
}