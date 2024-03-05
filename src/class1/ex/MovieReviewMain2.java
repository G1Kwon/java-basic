package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "title";
        inception.review = "Life is endless loop";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 메목: " + review.title + ", 리뷰: " + review.review);
        }

    }
}
