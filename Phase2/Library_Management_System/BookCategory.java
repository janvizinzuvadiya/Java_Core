public enum BookCategory {
    FICTION("Fiction Literature"),
    SCIENCE("Science & Technology"),
    MYSTERY("Mystery & Suspense"),
    THRILLER("Thriller & Adventure"),
    ROMANCE("Romance"),
    HISTORY("Historical Studies"),
    BIOGRAPHY("Biography & Autobiography"),
    SELF_HELP("Self-Help & Personal Development");
    
    private final String categoryName;

    BookCategory(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName()
    {
        return categoryName;
    }
    
    
}
