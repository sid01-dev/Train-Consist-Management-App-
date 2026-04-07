public boolean searchBogieById(String bogieId) {

    String[] ids = bogies.stream()
            .map(b -> b.getBogieId())
            .toArray(String[]::new);

    return com.train.consist.util.SearchUtil.linearSearch(ids, bogieId);
}