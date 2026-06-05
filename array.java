
import java.util.Scanner;

public class array {
    private static Scanner in = new Scanner(System.in);
    
  
    public static void main(String[] args ){
                       
    /**1. Input and Display Array Elements ,Takes N elements as input and display them.*/  
    System.out.println("\nQ1-> Input and Display Array Elements ,Takes N elements as input and display them."); 
    System.out.print("Enter Size of contigous memory block needed (Type int block) : ");
    int arrSize=in.nextInt();
     int []arr= new int[arrSize];
    createArray(arrSize,arr); 
    displayArray(arrSize,arr);

    /*2. Find Sum and Average of Array Elements ,Calculates the sum and average of all elements.*/
    System.out.println("\nQ2-> Find Sum and Average of Array Elements ,Calculates the sum and average of all elements.");
    int sum =arraySumElements(arrSize,arr);
    System.out.println("\nSum of all array elemets : "+sum+"\n Average of all array elements : "+(float)sum/(float)arrSize);
    
    /*3. Find Maximum and Minimum Element  ,Find the largest and smallest element in an array.*/
    System.out.println("\nQ3-> Find Maximum and Minimum Element  ,Finds the largest and smallest element in an array.");
    System.out.println("\nThe largest element in array is : "+arr[arrayMaxPos(arrSize,arr)]);
    System.out.println("The smallest element in array is :"+arr[arrayMinPos(arrSize,arr)]);
    
    /* 4. Count Even and Odd Number ,Count how many even and odd elements are present in the array.*/
    System.out.println("\nQ4-> Count Even and Odd Number ,Counts how many even and odd elements are present in the array.");
    int oddNum = oddNumArray(arrSize,arr);
    int eveNum = eveNumArray(arrSize,arr);
    System.out.println("\nThe number of odd elements in array : "+oddNum+"\n The number of even elements in array :"+(eveNum)+"\nThe number of 0 elemets in array : "+(arrSize-(oddNum+eveNum)));
    
    /*5. Search an Element (Linear Search) ,Check whether a given element exists in the array. */
    System.out.println("\nQ5-> Search an element (Linear Search) ,Checks whether a given element exists in the array. ");
    System.out.print("Enter key element to search : ");
    int key = in.nextInt();
    int flaggedpos= lSearch(arrSize,arr,key);
    if(flaggedpos!=-1){
      System.out.println("Found key element at array position : "+flaggedpos);
    }else{
      System.out.println("ELement occurence : 0 ");
    }
    
    /*6. Reverse an Array ,Print the array in reverse order. */
    System.out.println("\nQ6-> Reverse an Array ,Print the array in reverse order. ");
    System.out.println("\nBefore reverse : \n");
    displayArray(arrSize, arr);
    reverseArray(arrSize,arr);
    System.out.println("\nArray is reversed Succsefully\n");
    displayArray(arrSize, arr);
    
    /*7. Copy One Array to Another ,Create a copy of an existing array.*/
    System.out.println("\nQ7-> Copy One Array to Another ,Creates a copy of an existing array .\n"); 
    int []arrCopy = new int [arrSize];
    copyArray(arrSize,arr,arrCopy);
    System.out.println("Array copied Successfully\nDisplaying copied array ...\n");
    displayArray(arrSize, arrCopy);
    reverseArray(arrSize, arr);
    
    /* 8. Find Second Largest Element ,Find the second largest element without sorting.*/
    System.out.println("\nQ8-> Find Second Largest Element ,Finds the second largest element without sorting.");
    System.out.println("Second largest element present in array : "+arr[_2ndMax_InArray(arrSize,arr)]);
    /*9. Count Positive, Negative, and Zero Elements ,Count how many positive, negative, and zero values are present.*/
    System.out.println("Q9->.\nCount Positive, Negative, and Zero Elements ,Counts how many positive, negative, and zero values are present.");     
    int countPositive=0,countNegative=0;
    for(int i=0;i<arrSize;i++){
      if(arr[i]>0)countPositive++;
      else if(arr[i]<0)countNegative++;
    }
    System.out.println("positive element occurence : "+countPositive+"\nNegative element occurence : "+countNegative+"\nZero element occurence : "+(arrSize-(countPositive+countNegative)));
    
    /*10. Check if Array is Sorted ,Determine whether the array is sorted in ascending order . */    
    System.out.println("\nQ10-> Check if Array is Sorted ,Determines whether the array is sorted in ascending order .");
    
    if(Sorted_acending(arrSize,arr)){
      System.out.println("\nArray is shorted in Asceding order\n");
      displayArray(arrSize, arr);
    }else{
      System.out.println("Array is not sorted in Ascending order");
      displayArray(arrSize, arr);
    }
    
    /*11. Remove Duplicate Elements ,Print only unique elements from the array.*/
    System.out.println("Q11-> Remove Duplicate Elements ,Print only unique elements from the array.");
    System.out.println("\n Array Before : \n");
    displayArray(arrSize, arr);
    System.out.println("\nArray after removing duplicate elements \n-> (Deletion performed on duplicate Array) \n");
    duplicateRemover(arrSize,arr);
    displayArray(arrSize, arr);
    
    /* 12. Frequency of Each Element Count how many times each element appears.*/
    System.out.println("\n12-> Frequency of Each Element ,Counts how many times each element appears.");
    arrayElement_freq(arrSize,arr);
    
    /* 13. Merge Two Arrays ,Take two arrays and merge them into a third array.*/
    System.out.println("\nQ13-> Merge Two Arrays ,Take two arrays and merge them into a third array.\n(Merging used Array and its modified copy)");
    
    System.out.println("\nUsed array 1 \n");
    displayArray(arrSize, arr);
    System.out.println("Used array 2 \n ");
    displayArray(arrSize, arrCopy);

    int mergedArrSize=arrSize+arrSize;
    int [] mergedArray = new int [mergedArrSize];
    arrayMerger(mergedArrSize,arr,arrCopy,mergedArray);
    System.out.println("\nMerged array\n");
    displayArray(mergedArrSize, mergedArray);
    
    /*14. Left Rotate and Right Rotate Array ,Rotate the array by K positions.*/
    System.out.println("\nQ14-> Left Rotate and Right Rotate Array ,Rotates the array by K positions.");
    System.out.println("\nArray before roation");
    displayArray(arrSize,arr);
    System.out.print("Enter value of K  to rotate left (possible 0 -"+arrSize+") : ");
    int K=-1;
    while(K<0||K>arrSize-1){
    K = in.nextInt();
    System.out.println("k->(0-"+arrSize+")");}
  
  arrayRotateLeft(K,arrSize,arr);
  System.out.println("\nArray after "+K+" left rotaion\n"); 
  displayArray(arrSize, arr);
  
  System.out.println("\nArray before Right roation\n");
  displayArray(arrSize,arr);
  System.out.println("Enter value of K to rotate right (possible 0 -"+ arrSize+") : ");
  int Kr=-1;  
  while(Kr<0||Kr>arrSize-1){
    Kr = in.nextInt();
    System.out.println("kr->(0-"+arrSize+")");}

  arrayRotateLeft(arrSize-Kr,arrSize,arr);
  System.out.println("\nArray after "+Kr+" right rotaion\n"); 
  displayArray(arrSize, arr);

  /*15. Find Missing Number ,Given numbers from 1 to N with one missing number, find the missing number. */
  System.out.println("Q15-> Find Missing Number ,Given numbers from 1 to N with one missing number, find the missing number.");
  int [] missingNum={1,2,3,4,5,6,7,8,10};
  int count=1;
  displayArray(missingNum.length,missingNum);
  for(int i=0;i<missingNum.length;i++){
   if(missingNum[i]!=count){
    System.out.println(" Array is missing number : "+count);
    break;
  }
  count++;
}
    in.close();
  }



  public static void createArray(int arrSize, int arr[]){
   
   for(int i=0;i<arrSize;i++){   
   System.out.print("Enter data in memory block : "+i+" -> ");  // Time complexity O(n)
   arr[i]= in.nextInt();
   }
   System.out.println("\n");
  }

  public static void displayArray(int arrSize,int arr [] ){
  for(int i=0;i<arrSize;i++){
   System.out.println("Array data at position : "+i+" -> "+arr[i]);  
  }                                                             // Time complexity O(n)
  System.out.println("\n");
  }
   
  public static int arraySumElements(int arrSize ,int arr []){
   int sum=0;
   for(int i=0;i<arrSize;i++){                                   // Time complexity O(n)
    sum+=arr[i];
   }
    return sum;
  } 
  public static int arrayMaxPos(int arrSize,int arr[]){
    int max=arr[0];
    int maxindex=0;
    for(int i=1;i<arrSize;i++){                                 // Time complexity O(n)
      if(max<arr[i]){
        max=arr[i];
        maxindex=i;
      }
    }
    return maxindex;
  }
  public static int arrayMinPos(int arrSize,int arr[]){
    int min=arr[0];
    int minindex=0;
    for(int i=1;i<arrSize;i++){                                  // Time complexity O(n)
      if(min>arr[i]){   
        min=arr[i];
      minindex=i;
      }
    }
    return minindex;
  }
  public static int oddNumArray(int arrSize,int arr[]){
    int oddcount=0;
    for(int i=0;i<arrSize;i++){
      if((arr[i]&1)==1)oddcount++;    //used bitwise 
    }                                                            // Time complexity O(n)
    return oddcount;  
  }
  public static int eveNumArray(int arrSize,int arr[]){
    int evencount=0;
    for(int i=0;i<arrSize;i++){
      if((arr[i]&1)==0)evencount++;                              // Time complexity O(n)
    }
    return evencount;
  }
  public static int lSearch(int arrSize,int arr[],int key){
    int flaggedpos=-1;
    for(int i=0;i<arrSize;i++){
      if(key==arr[i])
        {flaggedpos=i;  
         break;     }                                             // Time complexity O(n)
    }
  return flaggedpos;
 }
 public static void reverseArray(int arrSize,int arr[]){
  int size=arrSize-1;
  for(int i=0;i<arrSize/2;i++){                                     
   int temp=arr[i];
   arr[i]=arr[size];                                             // Time complexity O(n/2)
   arr[size]=temp;
   size--;
  }
 }
 public static void copyArray(int arrSize,int arr[],int arrCopy[]){
  for(int i=0;i<arrSize;i++){
   arrCopy[i]=arr[i];                                            // Time complexity O(n)
  }
 }
 public static int _2ndMax_InArray(int arrSize,int arr[]){
  int maxpos = arrayMaxPos(arrSize, arr);
  int _2ndmax=0;
  int _2ndmaxindex=0;
if(arrSize==1){return arr[0];}
  if(maxpos==0){
  _2ndmax=arr[maxpos+1];
  _2ndmaxindex=maxpos+1;     // learn this edge case**
}

  else if(maxpos==arrSize-1){
  _2ndmax=arr[maxpos-1];
  _2ndmaxindex=maxpos-1;    // learn this edge case**
}
 
 for(int i=0;i<arrSize;i++){
    if(i!=maxpos && arr[i]>_2ndmax){                              // time Complexity O(n)
      _2ndmax=arr[i];
      _2ndmaxindex = i;
    }  
 }
  return _2ndmaxindex;
 }
 public static boolean Sorted_acending(int arrSize,int arr[]){
 boolean ifSorted=true;
  for(int i=0;i<arrSize-1;i++){
  if(arr[i]>arr[i+1])ifSorted=false;                             // time Complexity O(n)
 }
 if(arr[arrSize-1]<arr[arrSize-2])
  return ifSorted=false;
return ifSorted;
 }
 public static void duplicateRemover(int arrSize,int arr[]){
  boolean isduplicate = false;
  for(int i=0;i<arrSize-1;i++){
   isduplicate=false;
    for(int j=i+1;j<arrSize;j++){                              // time Complexity O(n^2) **
      if(arr[i]==arr[j]){
       isduplicate=true;
       arr[j]=0;
      }
      }if(isduplicate){arr[i]=0;} 
    }
  }
  public static void arrayElement_freq(int arrSize,int arr[]){
   int freq=0,firstoccurence=0;
   boolean run1Time=true;

    for(int i=0;i<arrSize;i++){
      freq=0;                       
      run1Time=true;
    for(int j=0;j<arrSize;j++){                                // time Complexity O(n^2) **
    
      if(arr[i]==arr[j]){
        freq++;
         if(run1Time){firstoccurence=j;
          run1Time=false;
         }
    }
   }if(!(i>firstoccurence))
    System.out.println("frequency occurence of "+arr[i]+" : "+freq);
  }
}
public static void arrayMerger(int mergedArrSize,int arr[],int arrCopy [] ,int mergedArray[]){
int a1size=0,a2size=0;
for(int i=0;i<mergedArrSize;i++ ){
  if(a1size<arr.length){
    mergedArray[i]=arr[a1size];                                // time complexity : O(n)
    a1size++;
  }else{ 
    if(a2size<arrCopy.length)
       mergedArray[i]=arrCopy[a2size];
      a2size++;
}
}
}
public static void arrayRotateLeft(int K,int arrSize,int arr[]){
  int Kcopy=K-1; // edge case**
  for(int i=0;i<K/2;i++){  //Rotates first k elements
    int temp = arr[i];
    arr[i]=arr[Kcopy];
    arr[Kcopy]=temp;
    Kcopy--;
  }                                                           // time complexity : O(n)    
  int size=arrSize-1;                                
  for(int i=K;i<((arrSize+K)/2);i++){ //Rotates last k elements  
    int temp = arr[i];
    arr[i]=arr[size];
    arr[size]=temp;
    size--;
  }
 reverseArray(arrSize, arr); //Reverses all elements 
}

}

