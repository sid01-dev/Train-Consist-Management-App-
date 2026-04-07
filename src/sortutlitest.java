@Test
void testBinarySearch_BogieFound() {
    String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
    assertTrue(SearchUtil.binarySearch(arr, "BG309"));
}

@Test
void testBinarySearch_BogieNotFound() {
    String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
    assertFalse(SearchUtil.binarySearch(arr, "BG999"));
}

@Test
void testBinarySearch_FirstElementMatch() {
    String[] arr = {"BG101","BG205","BG309"};
    assertTrue(SearchUtil.binarySearch(arr, "BG101"));
}

@Test
void testBinarySearch_LastElementMatch() {
    String[] arr = {"BG101","BG205","BG550"};
    assertTrue(SearchUtil.binarySearch(arr, "BG550"));
}

@Test
void testBinarySearch_SingleElementArray() {
    String[] arr = {"BG101"};
    assertTrue(SearchUtil.binarySearch(arr, "BG101"));
}