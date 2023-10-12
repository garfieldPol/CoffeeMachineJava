



class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {

        return  this.size == otherArticle.getSize() ?  String.valueOf(getTitle()).compareTo(otherArticle.getTitle()) : Integer.valueOf(getSize()).compareTo(otherArticle.getSize());
        //return String.valueOf(getTitle()).compareTo(otherArticle.getTitle());
        }

    }


