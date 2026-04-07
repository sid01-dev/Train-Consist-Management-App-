public boolean searchBogieById(String bogieId) {

    // ✅ UC20 - Fail Fast Validation
    if (bogies.isEmpty()) {
        throw new IllegalStateException("Cannot perform search: No bogies in the train.");
    }

    String[] ids = bogies.stream()
            .map(b -> b.getBogieId())
            .toArray(String[]::new);

    return com.train.consist.util.SearchUtil.linearSearch(ids, bogieId);
}