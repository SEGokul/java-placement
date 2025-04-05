public class Arrayfrequency {
    public static void frequency (int arr[]){
         int maxcount = 0 ;
         int maxelement = arr[0];
         int leastcount=1;
         int leastelement=arr[0];
        int newarray[]=new int[arr.length];
        
        int count = 0 ;
        
        for (int i = 0 ;i<arr.length;i++){
        
        for (int j = 0 ; j<arr.length;j++){
        
        if (arr[i]==newarray[j]){break;}
        
        else if (arr[i]==arr[j]){ count = count + 1; }
        
        }
        if (count != 0){ System.out.println(arr[i]+" "+ count + " "+ "times");}
        if (count>maxcount){maxcount=count;maxelement=arr[i];}
        else if (count<=leastcount){leastcount=count;leastelement=arr[i];}
        count = 0;
        newarray[i]=arr[i];
        }
        System.out.println(maxcount+" "+ maxelement);
        System.out.println(leastcount+" "+leastelement);
}
        public static void main(String args[]){
        int arr [] ={10,5,10,15,10,5};
        frequency(arr);

        }      
}
