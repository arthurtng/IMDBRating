package edu.bristol;


public class IMDBRating
{
    private float currentAverage = 0;
    private int ratingCount = 0;

    public float addNewRating(int newRating)
    {
        float previousTotal = (currentAverage * ratingCount);
        float newTotal = previousTotal + newRating;
        ratingCount++;
        currentAverage = newTotal / ratingCount;
        currentAverage = currentAverage * 10;
        int temp = (int) currentAverage;
        currentAverage = (float) temp / 10;
        return currentAverage;
    }
}
