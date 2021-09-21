public class Middle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        float[] flarr={0.1f,0.2f,3.3f,3.4f,3.5f};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        float fsum=0.0f;
        for(int i=0;i<flarr.length;i++)
        {
            fsum=fsum+arr[i];
        }
        int avg=sum/(arr.length);
        float favg=fsum/(flarr.length);
        int mid=arr.length/2;
        int fmid=flarr.length/2;
        System.out.println(avg);
        System.out.println(arr[mid]);
        System.out.println("favg "+ favg);
        System.out.println("fmid "+ flarr[mid]);
    }
}
