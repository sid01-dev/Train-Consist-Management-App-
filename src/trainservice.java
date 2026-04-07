public String[] getSortedBogieNames() {

    String[] names = bogies.stream()
            .map(b -> b.getClass().getSimpleName())
            .toArray(String[]::new);

    // UC17 sorting
    SortUtil.sortBogieNames(names);

    return names;
}