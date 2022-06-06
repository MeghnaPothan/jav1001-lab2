//Athul Babu
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTools {
    public static void main(String[] args)
     {
        String plainText;
        int shiftValue;
        System.out.println("Enter a string to encrypt: "); 
        Scanner scanner_one = new Scanner(System.in);  
        plainText = scanner_one.nextLine();

        System.out.println("Enter a value to encrypt with: "); 
        Scanner scanner_two = new Scanner(System.in);  
        shiftValue = scanner_two.nextInt();
        String encyptedValue=Caesar_cipher(plainText,shiftValue);
        System.out.println("The encrypted string is: " +encyptedValue);
        System.out.println("Decrypting with " + -shiftValue +"... \n" +Caesar_cipher(encyptedValue,-shiftValue));
        int[] arr = {44, 78, 45, 77, 44, 98, 67, 68, 91, 54};
        System.out.println("Testing methods with " + Arrays.toString(arr));
        System.out.println("The Average is : " + arrayAvg(arr));

        Scanner scanner_three = new Scanner(System.in);  
       
        System.out.println("Enter a value to search for ");
       int searchValue = scanner_three.nextInt();
       if(arraySearch(arr,searchValue)){
           System.out.println("The array contains "+searchValue);
       }else{
        System.out.println("The array do not contains "+searchValue);
       }
       System.out.println("The array reversed is "+Arrays.toString(arrayReverse(arr)));
       
   }

 
    private static int[] arrayReverse(int[] arr) {
int[] result = new int[arr.length];
int j = arr.length;
for (int i = 0; i < arr.length; i++) {
    result[j - 1] = arr[i];
    j = j - 1;
}
        return result;
    }


    private static boolean arraySearch(int[] arr, int searchValue) {
        boolean result=false;
        for(int i=0;i<arr.length;i++){
   
if(searchValue==arr[i]){
    result=true;
    break;
}else{
    result=false;
}
        }
       
        return result;

    }


    public static String Caesar_cipher(String message, int shiftValue) 
    { String alphabet = "abcdefghijklmnopqrstuvwxyz";
        message = message.toLowerCase();
        String cipherText = "";
        int keyVal;
        for (int ii = 0; ii < message.length(); ii++) {
          int charPosition = alphabet.indexOf(message.charAt(ii));
       
           keyVal = ((((shiftValue + charPosition) % 26) + 26) % 26);
         
          
          char replaceVal = alphabet.charAt(keyVal);
          cipherText += replaceVal;
        }
        return cipherText;
    }


    public static double arrayAvg(int[] inputArray)
     {
       
        double sum=0; 
        for(int i=0; i<inputArray.length; i++)
        { 
             sum = sum + inputArray[i];
        }
        
        return  (sum/inputArray.length);
             
        }

}