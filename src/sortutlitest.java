import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortUtilTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        SortUtil.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        SortUtil.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        SortUtil.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        SortUtil.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        SortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}