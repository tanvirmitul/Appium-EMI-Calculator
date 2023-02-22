package dataset;

import org.testng.annotations.DataProvider;

public class Dataset {
    @DataProvider(name = "data-provider")
    public Object[][] setData(){
        return new Object[][]{
                {10000, 2.0, 1, 2.0, 842, 108, 200, 10108},
                {20000, 2.0, 2, 1.5, 850, 419, 300, 20419},
                {30000, 1.5, 2, 1.0, 1269, 470, 300, 30470},
                {40000, 2.5, 3, 3.0, 1154, 1560, 1200, 41560}
        };
    }
}
