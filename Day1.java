//IsEven?
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int isEven(int input1){
  if(input1%2==0)
   return 2;
  else
   return 1;
                     
 }
}

//IsOdd?
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int isEven(int input1){
  if(input1%2!=0)
   return 2;
  else
   return 1;
 }
}

//Return the last digit of the given number.
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int lastDigitOf(int input1){
     if(input1<0)
  {
   input1*=-1;
  }
  int n=input1%10;
  return n;
 }
}

//Return the second last digit of the given number.
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int secondLastDigitOf(int input1){
  if(input1>=-9 && input1<=9)
   return -1;
   if(input1<0)
   input1*=-1;
  input1/=10;
  int n=input1%10;
  return n;
 }
}

//Sum of last digits of two given numbers.
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int addLastDigits(int input1,int input2){
    if(input1<0)
   input1*=-1;
  if(input2<0)
   input2*=-1;
  int x=input1%10;
  int y=input2%10;
  int sum = x+y;
  return sum;
 }
}

