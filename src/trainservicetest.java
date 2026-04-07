import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainServiceTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        TrainService service = new TrainService();

        assertThrows(IllegalStateException.class, () -> {
            service.searchBogieById("BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        TrainService service = new TrainService();
        service.addBogie(new SleeperBogie("BG101", 30));

        assertDoesNotThrow(() -> {
            service.searchBogieById("BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        TrainService service = new TrainService();
        service.addBogie(new SleeperBogie("BG101", 30));
        service.addBogie(new SleeperBogie("BG205", 30));

        assertTrue(service.searchBogieById("BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        TrainService service = new TrainService();
        service.addBogie(new SleeperBogie("BG101", 30));

        assertFalse(service.searchBogieById("BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        TrainService service = new TrainService();
        service.addBogie(new SleeperBogie("BG101", 30));

        assertTrue(service.searchBogieById("BG101"));
    }
}