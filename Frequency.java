class Frequency {

public static void frequency (int arr[]){

int newarray[]=new int[arr.length];

int count = 0 ;

int k = 0 ;

for (int i = 0 ;i<arr.length;i++){

for (int j = 0 ; j<arr.length;j++){

if (arr[i]==newarray[j]){break;}

else if (arr[i]==arr[j]){ count = count + 1; }

}



System.out.print(arr[i]+" "+ count + " "+ "times");

count = 0;

newarray[i]=arr[i];



}


}

public static void main(String args[]){
int arr [] ={10,5,10,15,10,5};
frequency(arr);
}

}



