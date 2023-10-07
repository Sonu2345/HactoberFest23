public class MinCoins  
{  
// m is size of coins array (number of different coins)  
public int minNoCoins(int coinsArr[], int m, int Y)  
{  
// handling the base case  
if (Y == 0)  
{  
return 0;  
}  
  
// Initializing the result  
int result = Integer.MAX_VALUE;  
  
// Trying every coin that has smaller value than V  
for (int j = 0; j < m; j++)  
{  
if (coinsArr[j] <= Y)  
{  
int subRes = minNoCoins(coinsArr, m, Y - coinsArr[j]);  
  
// Checking for INT_MAX for avoiding the overflow and see  
// if the result can be minimized  
if (subRes != Integer.MAX_VALUE && subRes + 1 < result)  
{  
result = subRes + 1;  
}  
}  
}  
return result;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class MinCoins  
MinCoins obj = new MinCoins();  
  
int coinsArr[] = {5, 10, 25};  
  
// calculating the size  
int size = coinsArr.length;  
int Y = 30;  
  
// invoking the method minNoCoins()  
int ans = obj.minNoCoins(coinsArr, size, Y);  
  
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(coinsArr[i] + " ");     
}  
  
System.out.println("\n");  
  
// new input  
int coinsArr1[] = {4, 3, 2, 6};  
Y = 15;  
size = coinsArr1.length;  
  
  
ans = obj.minNoCoins(coinsArr1, size, Y);  
  
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(coinsArr1[i] + " ");     
}  
  
}  
}  
