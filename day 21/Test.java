/*

// iterators
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator<String> it = colors.iterator();

        while (it.hasNext()) {
String str = it.next();
if(str == "Red")continue;
            System.out.println(str);
        }

System.out.println(colors);
    }
}


//count of number
class Test{
 public static void main(String[] args) {
int cnt=0;
int n = 123456;
int cnt1 = (int) (Math.log10(n) + 1);
System.out.println(cnt1);

while(n >0){
cnt += 1;
n /= 10;
}
System.out.println(cnt);
}
}

//string reverse
class Test{
 public static void main(String[] args) {

String str = "liril";

char carr[]=str.toCharArray();

String rev = "";

for(int i= carr.length-1;i>=0;i--){
//System.out.println("inserting:"+carr[i]);
rev +=carr[i];
}
System.out.println(rev);
}
}


//string reverse
class Test{
 public static void main(String[] args) {

String str = "radha";

String rev = "";

for(int i= str.length()-1;i>=0;i--){

rev +=str.charAt(i);
}
System.out.println(rev);
}
}

//GCD/HCF

class Test{
 public static void main(String[] args) {

  int gcd = 1;
int n1 = 20,n2=15;
for(int i= 1;i<= Math.min(n1,n2);i++){
if(n1%i == 0 && n2%i ==0){
gcd = i;
}
}
System.out.println(gcd);
}
}

//Amstrong number
class Test{
 public static void main(String[] args) {

int num = 13;
int sum = 0;
int og = num;
int n = (int)(Math.log10(num)+1);

while(num >0)
{
int digit= num% 10;
sum += Math.pow(digit,n);
num/= 10;

}
if(sum==og){
System.out.println("amstrong number");
}
else{
System.out.println("not amstrong number");

}
}
}
// sum of numbers
class Test{
 public static void main(String[] args) {

int num = 13;
int sum = 0;
int og = num;
int n = (int)(Math.log10(num)+1);

while(num >0)
{
int digit= num% 10;
sum +=digit;
num/= 10;

}

System.out.println(sum);
}
}

// Print all Divisors of a given Number
class Test{
 public static void main(String[] args) {

int n1 = 20;
for(int i= 1;i<= n1;i++){
if(n1%i == 0 ){
System.out.println(i);
}
}

}
}

 // prime check
class Test{
 public static void main(String[] args) {
int n = 5;
        boolean flag = true;
if(n <=1) {
flag = false;


}else{
for(int i=2;i< Math.sqrt(n);i++){
if(n %i==0)
{
flag = false;
break;
}
}
}
if(flag){
System.out.println("prime");
}
else{
System.out.println("not prime");

}
}
}



// recusion example
class Test{
static int c =0;
public static void print(){

if(c==3)return;
System.out.println(c);
c+=1;
print();
}

 public static void main(String[] args) {
print();

}
}


class Test{
static int c =0;
public static void print(){

if(c==3)return;
System.out.println("radhaKrishna");
c+=1;
print();
}

 public static void main(String[] args) {
print();

}
}


class Test{

public static void print(int i,int n){

if(i>n)return;
System.out.println(i);
i++;
print(i,n);
}

 public static void main(String[] args) {
int n =5;
print(1,n);

}
}

*/

public class Test{

public static void print(int n,int i){

if(i<1)return;
System.out.println(i);
print(n,i-1);
}

public static void main(String[] args) {
int n =5;
print(n,n);

}
}
