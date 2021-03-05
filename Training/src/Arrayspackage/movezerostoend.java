package Arrayspackage;

import java.util.Arrays;

public class movezerostoend {

public static void main(String[] args) {

int a[] = {4, 0, 5, 23, 0 ,7};
int i = 0;

for( i=a.length-1;i>=0; i--)
{

if(a[i]==0)
{

for(int j = i; j < a.length-1; j++) {
                   if(a[j+1] == 0 || j == a.length-1) {
                       // either at the end of the array, or we've run into another zero near the end
                       break;
                   }
                   else {
                       // bubble up the zero we found one element at a time to push it to the end
                       int temp = a[j+1];
                       a[j+1] = a[j];
                       a[j] = temp;
                   }
               }
           }
       }

       System.out.println(Arrays.toString(a));
   }
}