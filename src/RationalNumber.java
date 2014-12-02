// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
import java.util.*;
import java.lang.Math;
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber(int numIn,int denomIn)
  {
    num = numIn;
    denom = denomIn;
    if(denom==0)
    {
      denom=1;
    }
  }
  public RationalNumber()
  {
    num=0;
    denom=1;
  }
  public int greatestCommonDivisor(int first, int second) 
  {
    int temp;
    while (second != 0) 
    {
      temp = second;
      second = first % second;
      first = temp;
    }        
    return first;
  }
  public void add(RationalNumber frac2)
  {
    int num2=frac2.getNumerator();
    int denom2=frac2.getDenominator();
    num=num*denom2;
    num2=num2*denom;
    denom=denom*denom2;
    num=num+num2;
  }
  public void subtract(RationalNumber frac2)
  {
    int num2=frac2.getNumerator();
    int denom2=frac2.getDenominator();
    num=num*denom2;
    num2=num2*denom;
    denom=denom*denom2;
    num=num-num2;
  }
  public void multiply(RationalNumber frac2)
  {
    int num2=frac2.getNumerator();
    int denom2=frac2.getDenominator();
    num=num*num2;
    denom=denom*denom2;
  }
  public void divide(RationalNumber frac2)
  {
    int num2=frac2.getNumerator();
    int denom2=frac2.getDenominator();
    num=num*denom2;
    denom=denom*num2;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String out;
    int gcd=greatestCommonDivisor(num,denom);
    num=num/gcd;
    denom=denom/gcd;
    if(denom==1)
    {
      out=Integer.toString(num);
    }
    else
    {
      out=num+"/"+denom;
    }
    return out;
  }
}
