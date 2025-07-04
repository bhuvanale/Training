public class MediumOfTwoSortedArrays {
    public static void main(String[] args) {
        int nums1[] ={1,2,3,4};
        int nums2[] ={6,7,8,9};
        int merge[] = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;

        while(i<nums1.length && j<nums2.length){
            merge[k++]=(nums1[i]<nums2[j]) ? nums1[i++] : nums2[j++];
        }
        while(i<nums1.length){
            merge[k++]=nums1[i++];
        }
        while(j<nums2.length){
            merge[k++]=nums2[j++];
        }

        int mid=merge.length/2;

        if(merge.length% 2 ==1){
            System.out.println(merge[mid]);
        }
        else{
            System.out.println( (merge[mid]+merge[mid-1])/2.0);
        }
    }
}
