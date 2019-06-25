package com.eddie;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double bucketsToBuy = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            bucketsToBuy = ((width * height) / areaPerBucket) - extraBuckets;
            return (int) Math.ceil(bucketsToBuy);
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        double bucketsToBuy = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy = ((width * height) / areaPerBucket);
            return (int) Math.ceil(bucketsToBuy);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        double bucketsToBuy = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy = (area / areaPerBucket);
            return (int) Math.ceil(bucketsToBuy);
        }
    }
}
