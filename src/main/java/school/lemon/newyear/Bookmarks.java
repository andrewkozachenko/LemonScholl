package school.lemon.newyear;

public enum  Bookmarks {

    GOOGLE("google.com") {
        @Override
        public void santaClause() {
            System.out.println("ho ho Ho! Merry Christmas!");
        }
    },
    YOUTUBE("youtube.com") {
        @Override
        public void santaClause() {
            System.out.println("Christmas song!");
        }
    };


    private String url;

    Bookmarks(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    public abstract void santaClause();
}
