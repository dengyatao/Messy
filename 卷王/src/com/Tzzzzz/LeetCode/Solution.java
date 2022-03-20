package com.Tzzzzz.LeetCode;

class Solution {

    int n;
    String s;

    public boolean isAdditiveNumber(String num) {

        s=num;
        n=s.length();
        return backtrack(-1,2);

    }

    public boolean backtrack(int prev_pos,int dots)
    {
        for(int i=prev_pos+1;i<n;i++)
        {
            if(dots==1)
            {
                if(s.charAt(prev_pos+1)=='0' && i-prev_pos>1) return false;
                if(isValid(prev_pos,i)) return true;
            }
            else if(backtrack(i,dots-1)) return true;
        }
        return false;
    }

    public boolean isValid(int first,int second)
    {
        int pre_first=-1;
        while(second<n)
        {
            String num1=s.substring(pre_first+1,first+1);
            String num2=s.substring(first+1, second+1);
            String next=stringAdd(num1,num2);

            int length=next.length();
            if(second==n-1 && pre_first!=-1) return true;
            if(second+length+1<=n && s.substring(second+1, second+length+1).equals(next))
            {
                pre_first=first;
                first=second;
                second=second+length;
            }
            else
                return false;
        }
        return false;
    }

    public String stringAdd(String str1,String str2)
    {
        if(str1.length()<str2.length())
            return stringAdd(str2,str1);

        int size1=str1.length();
        int size2=str2.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size1-size2;i++)
            sb.append('0');
        str2=sb+str2;

        StringBuilder result=new StringBuilder(str1);
        int sgn=0;
        for(int i=size1-1;i>=0;i--)
        {
            int num=str1.charAt(i)-'0'+str2.charAt(i)-'0'+sgn;
            result.setCharAt(i, (char)(num%10+'0'));
            sgn=num/10;
        }
        return sgn==1?"1"+result:new String(result);
    }
}