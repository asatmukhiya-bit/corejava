import java.util.*;
public class arraypro{
    Scanner sc;
    int ar[];
    int index;
    public arraypro(){
        sc=new Scanner(System.in);
         System.out.println("enter the size of an array");
         ar= new int[sc.nextInt()];
         index=-1;
    }
    public  boolean isfull(){
        if(index==ar.length-1)
            return true;
        else
            return false;
    }
    public boolean isempty(){
        if(index==-1)
            return true;
        else
            return false;
    }
    public void insertvalues(){
        System.out.println("enter the no. of values you want to add in the array");
        int n=sc.nextInt();
        if(n>ar.length) {
            System.out.println("values are more than the length,hence cannot be added");
        }
        else
        {
            for (int idx = 0; idx <n; idx++) {
                System.out.println("enter the value of the element you want to add");
                ar[idx]=sc.nextInt();  
                index++;
            }
        }
    }
    public void display(){
     for(int i=0;i<=index;i++){
         System.out.print(ar[i]+" ");
     }     
     System.out.println();
    }
    public void atbegin(){
        if(isfull()==false){
            System.out.println("ARRAY BEFORE INSERTION:");
            display();
            for(int i=index+1;i>0;i--){
                ar[i]=ar[i-1];
            }
            System.out.println("enter the new value:");
            ar[0]=sc.nextInt();
            index++;
            System.out.println("ARRAY AFTER INSERTION:");
            display();
        }
        else{
            System.out.println("!!cannot add any value,array is full!!");
        }
    }
     public void atend(){
        if(isfull()){
            System.out.println("!!cannot add elment to array because it is full");
        }
        else{
            System.out.println("ARRAY BEFORE INSERTION:");
            display();
            System.out.println("enter the elemnt you wnat to add");
            ar[++index]=sc.nextInt();
            System.out.println("ARRAY AFTER INSERTION:");
            display();
        }
     }
    public void atpostion(){
        if(isfull()){
            System.out.println("!!cannot add elment to array because it is full");
        }
        else{
            System.out.println("ARRAY BEFORE INSERTION:");
            display();
            System.out.println("enter the position you want to add the element at between 0 &"+(index+1));
            int pos=sc.nextInt();
            if(pos<0 || pos>index+1)
                System.out.println("invalid position");
            else{
                for(int i=index+1;i>=pos;i--){
                    ar[i]=ar[i-1];
                }
                System.out.println("enter the value you want to add at the position");
                ar[pos-1]=sc.nextInt();
                index++;
                 System.out.println("ARRAY AFTER INSERTION:");
                 display();
            }
        }
    } 
    public void exit(){
        System.out.println("------------------THANK YOU---------------");
        System.exit(0);
    }
    public void deleteatend(){
        if(isempty()) System.out.println("ARRAY IS EMPTY NO VALUES FOUND TO DELETE:");
        else{
          System.out.println("ARRAY BEFORE DELETION:");
            display();
            ar[index--]=0;
            System.out.println("ARRAY AFTER DELETION:");
                 display();  
        }
    }
    public void deleteatbegin(){
        if(isempty()) System.out.println("ARRAY IS EMPTY NO VALUES FOUND TO DELETE:");
        else{
            System.out.println("ARRAY BEFORE DELETION:");
            display();
            for(int i=0;i<index;i++){
                ar[i]=ar[i+1];
            }
            ar[index--]=0;
           System.out.println("ARRAY AFTER DELETION:");
             display();  
        }
    }
    public void deletebypos(){
        if(isempty()) System.out.println("ARRAY IS EMPTY NO VALUES FOUND TO DELETE:");
        else{
            System.out.println("ARRAY BEFORE DELETION:");
            display();
            System.out.println("enter the pos you want to delete:");
            int pos=sc.nextInt();
            for(int i=pos-1;i<index;i++){
                ar[i]=ar[i+1];
            }
            ar[index--]=0;
            System.out.println("ARRAY AFTER DELETION:");
            display(); 
        }
    }
    public void linear(int sear){
                        int count=0;
                        for(int i=0;i<=index;i++){
                        if(ar[i]==sear){
                            System.out.println("value found at index position"+i);
                            count++;
                            break;
                                }
                             }
                             if(count==0)System.out.println("value not found Sorry!!");
    }
    public void bubblesort1(){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
                }
            }
        }
    }
    public void bubblesort2(int ar[],int n){
       if(n==1)
        return;
        for(int i=0;i<n-1;i++){
            if(ar[i]>ar[i+1]){
            int temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
        }
    }
     bubblesort2(ar, n-1);
    }
    public void binarysearch(int sear){
    int start=0;
    int  end=ar.length-1;
     while(start<=end){
        int mid=(start+end)/2;
        if(sear==ar[mid]){
            System.out.println("value found in the array");
            break;
        }
        else if(sear>ar[mid])
           start=mid+1;
        else{
            end=mid-1;
        }
     }
    }
    public void selectionsort(){
        for(int i=0;i<ar.length;i++){
            int minindex=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[minindex]){
                    minindex=j;
                }
            }
            int temp=ar[minindex];
            ar[minindex]=ar[i];
            ar[i]=temp;
        }
    }
    public void insertion1(){
     for(int i=0;i<ar.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(ar[j]<ar[j-1]){
                int temp=ar[j];
                ar[j]=ar[j-1];
                ar[j-1]=temp;
            }
        }
     }
    }     
    public void insertion2(int ar[],int n){
    if(n<=1)
        return;
    insertion2(ar, n-1);
    int last=ar[n-1];
    int j=n-2;
    while(j>=0 && ar[j]>last){
        ar[j+1]=ar[j];
        j--;
    }
    ar[j+1]=last;
    }
    public int partition(int ar[],int start,int end){
     int last=ar[end];
     int i=start-1;
     for(int j=start;j<end;j++){
       if(ar[j]>last){
        i++;
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
       }
     }
     i++;
     int temp=ar[i];
     ar[i]=last;
     ar[end]=temp;
     return i;
    }
    public void quicksort(int ar[],int start,int end){
    if(start<end){
        int pivotidx=partition(ar,0,end);
        quicksort(ar,start,pivotidx-1);
        quicksort(ar,pivotidx+1,end);
    }
   }
    public void choice(){
        boolean flag=true;
        do{
        System.out.println("ENTER THE RESPECTIVE KEY FOR THE FOLLOWING OPERATION:");
        System.out.println("1. insertion at end\n 2.insertin at beginning\n 3.insertion by position\n 11.exit\n 4.delete by end\n 5.delete at beginning\n 6.delete by position\n 7.searching\n 8.sorting\n 9.close");
        System.out.println("enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:atend(); break;
            case 2:atbegin(); break;
            case 3:atpostion();break;
            case 11:exit(); break;
            case 4:deleteatend();break;
            case 5:deleteatbegin();break;
            case 6:deletebypos();break;
            case 7:System.out.println("enter the type by which you want to search:\n 1.linear search \n 2.binary search");
                   int a=sc.nextInt();
                   System.out.println("enter the element you want to search in the array");
                   int sear=sc.nextInt();
                   switch(a){
                    case 1: linear(sear);
                             break;
                    case 2: bubblesort1();
                           binarysearch(sear);
                           break;
                    default:System.out.println("invalid choice");
                   }  
                   break;
            case 8:System.out.println("enter the sorting you want to perform\n 1. bubble sort (iterative)\n 2.bubble sort(recursive)\n 3.insertion sort(itertaive)\n 4.insertion sort (recursive)\n 5.selection sort\n 6.quick sort\n");
                          System.out.println("enter your choice");
                          int b=sc.nextInt();
                          switch(b){
                            case 1:bubblesort1();
                             System.out.println("array after sort:");
                             display(); break;
                            case 2:bubblesort2(ar,ar.length);
                                System.out.println("array after sort:");
                                display();
                                break;
                            case 3:insertion1();
                                 System.out.println("array after sort:");
                                display();
                                break;
                            case 4:insertion2(ar,ar.length);
                                System.out.println("array after sort:");
                                display();
                                break;
                            case 5:selectionsort();
                                 System.out.println("array after sort:");
                                display();
                            break;
                            case 6:quicksort(ar,0,ar.length-1);
                                System.out.println("array after sort:");
                                display(); 
                                break;
                            default:System.out.println("invalid choice");
                          }
                          break;
            case 9:flag=false;break;
            default:System.out.println("inavlid choice");
        }
         if(flag!=false){
                     System.out.println("---------------------------------------------------------------------------------------");
                      System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
                     char ch=sc.next().charAt(0);
                       if(ch=='n' || ch=='N'){
                        System.out.println("GOODBYE! THANKS FOR USING SYSTEM");
                      break;}
         }    
        }while(flag!=false);
    }
    public void displaywindow(){
        System.out.println("--------------------WELCOME ASPIRANT-----------------------");
        choice();
    }
    public static void main(String[] args){
        arraypro obj=new arraypro();
        obj.insertvalues();
        obj.displaywindow();
    }
}