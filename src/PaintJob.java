public class PaintJob
{
    public static void main(String[] args)
    {
            System.out.println(getBucketCount(3.15,2.35,3.5,2));
            System.out.println(getBucketCount(6.15,3.3,2.25));
            System.out.println(getBucketCount(5.36,1.2));
        }
        public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets)
        {
            if(width>0 && height>0 && areaPerBucket>0 && extraBuckets>0){
                double area= width*height;
                double bucketQnty = areaPerBucket*extraBuckets;
                double bucketRem = area-bucketQnty;
                double PaintAr = bucketQnty/areaPerBucket;
                if (PaintAr <= 0) {
                    return 0;
                }else{
                    return (int) Math.ceil(PaintAr);
                }
            } return -1;
        }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width>0 && height>0 && areaPerBucket>0)
        {
            double area=width*height;
            double paintReq=area/areaPerBucket;
            return (int) Math.ceil(paintReq);
        }
        return -1;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area>0 && areaPerBucket>0){
            double paint=area/areaPerBucket;
            return (int) Math.ceil(paint);
        }
        return -1;
    }
}


