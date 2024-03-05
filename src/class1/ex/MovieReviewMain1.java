package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "title";
        inception.review = "Life is endless loop";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 메목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 메목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
