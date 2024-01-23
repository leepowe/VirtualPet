import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet("Sam", "cat", 5, 50, 10);


    @Test
    public void shouldHaveAHungerOf50(){
        int actualHunger = underTest.getHunger();
        assertEquals(50, actualHunger);
    }

    @Test
    public void shouldHaveAHungerOf55(){
        underTest = new VirtualPet("Sam", "cat", 5, 55, 10);
        int actualHunger = underTest.getHunger();
        assertEquals(55, actualHunger);
    }

    @Test
    public void feedingWithFeedValueOf5ShouldDecreaseHungerOf50To45(){
        underTest.feed(5);
        int actualHunger = underTest.getHunger();
        assertEquals(45, actualHunger);
    }

    @Test
    public void feedingWithFeedValueOf3ShouldDecreaseHungerOf50To47(){
        underTest.feed(3);
        int actualHunger = underTest.getHunger();
        assertEquals(47, actualHunger);
    }

    @Test
    public void shouldHaveAThirstOf10(){
        int actualThirst = underTest.getThirst();
        assertEquals(10, actualThirst);
    }

    @Test
    public void shouldHaveAThirstOf9(){
        underTest = new VirtualPet("Sam", "cat", 5, 50, 9);
        int actualThirst = underTest.getThirst();
        assertEquals(9, actualThirst);
    }

    @Test
    public void wateringWithWaterValueOf1ShouldDecreaseThirstOf10to9(){
        underTest.water(1);
        int actualThirst = underTest.getThirst();
        assertEquals(9, actualThirst);
    }

    @Test
    public void wateringWithWaterValueOf2ShouldDecreaseThirstOf10to8(){
        underTest.water(2);
        int actualThirst = underTest.getThirst();
        assertEquals(8, actualThirst);
    }

    @Test
    public void shouldHaveAHappinessOf5(){
        int actualHappiness = underTest.getHappiness();
        assertEquals(5, actualHappiness);
    }

    @Test
    public void shouldHaveAHappinessOf6(){
        underTest = new VirtualPet("Sam", "cat", 6, 50, 10);
        int actualHappiness = underTest.getHappiness();
        assertEquals(6, actualHappiness);
    }

    @Test
    public void playingReturnsHappinessOf6(){
        underTest.play(1);
        int actualHappiness = underTest.getHappiness();
        assertEquals(6, actualHappiness);
    }

    @Test
    public void pettingReturnsHappinessOf6(){
        underTest.pet();
        int actualHappiness = underTest.getHappiness();
        assertEquals(6, actualHappiness);
    }

    @Test
    public void virtualPetHasANameOfSam(){
        String actualName = underTest.getName();
        assertEquals("Sam", actualName);
    }

    @Test
    public void virtualPetHasANameOfSarah(){
        underTest = new VirtualPet("Sarah", "cat", 10, 10, 10);
        String actualName = underTest.getName();
        assertEquals("Sarah", actualName);
    }

    @Test
    public void virtualPetHasASpeciesOfCat(){
        String actualSpecies = underTest.getSpecies();
        assertEquals("cat", actualSpecies);
    }

    @Test
    public void virtualPetHasASpeciesOfDog(){
        underTest = new VirtualPet("Sam", "dog", 1, 1, 1);
        String actualSpecies = underTest.getSpecies();
        assertEquals("dog", actualSpecies);
    }

    @Test
    public void userCanNameVirtualPetBob(){
        underTest = new VirtualPet("", "cat", 3, 4, 12);
        underTest.setName("Bob");
        assertEquals("Bob", underTest.getName());
    }

    @Test
    public void userCanNameVirtualPetHarry(){
        underTest = new VirtualPet("", "cat", 3, 4, 12);
        underTest.setName("Harry");
        assertEquals("Harry", underTest.getName());
    }
}
