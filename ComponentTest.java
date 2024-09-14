import org.junit.jupiter.api.Test;


public class ComponentTest {
    
    private Object Assertions;
    
    @Test
    void PortfolioTest() {
        //given
        Portfolio portfolio = new Portfolio();
        portfolio.add(new Account(50L));
        portfolio.add(new Account(100L));
        portfolio.add(new Account(200L));
        //when
        Long result = portfolio.getSum();
        //then
        Assertions.assertEquals(350L, result);
    }

    @Test
    void complexPortfolioTest() {
        //given
        Portfolio portfolioFirstLevel = new Portfolio();
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();

        portfolioFirstLevel.add(portfolioNextLevelOne);
        portfolioFirstLevel.add(portfolioNextLevelTwo);

        portfolioNextLevelOne.add(new Account(50L));
        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));

        portfolioNextLevelTwo.add(new Account(50L));
        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        //when
        Long result = portfolioFirstLevel.getSum();
        //then
        Assertions.assertEquals(700L, result);
    }
}
