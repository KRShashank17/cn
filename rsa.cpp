#include <iostream>
#include<bits/stdc++.h>

using namespace std;
int fune(int d)
{
    int res=2;
    for(int i=2;i<d;i++)
    {
        if(__gcd(i,d)==1)
        {
            res=i;
            break;
        }
    }
    return res;
}
int fund(int e,int n)
{
    int i=1;
    int res=1;
    while(true)
    {
        int temp=i*e;
        if(temp%n==1)
        {
            res=i;
            break;
         }
         i++;
    }
    return res;
}
string enc(string msg,int e,int n)
{
    for(int i=0;i<msg.size();i++)
    {
        int temp=msg[i]-'a';
        
       int k=1; 
       for(int j=0;j<e;j++) 
       { 
         k=k*temp; 
       k=k%n; 
      }
        cout<<k<<" ";
        msg[i]=k+'a';

    }
    return msg;
}
string dec(string msg,int e,int n)
{
    for(int i=0;i<msg.size();i++)
    {
        int temp=msg[i]-'a';
        
       int k=1; 
       for(int j=0;j<e;j++) 
       { 
         k=k*temp; 
       k=k%n; 
      }
        cout<<k<<" ";
        msg[i]=k+'a';
    }
    return msg;
}

int main()
{
    string msg="hello";
    int p=3;
    int q=7;
    int n=p*q;
    int f=(p-1)*(q-1);
    
    int e=fune(f);
    // cout<<"d"<< e<<endl;
    int d=fund(e,n);
    
    for(int i=0;i<msg.size();i++)
    {
        cout<<msg[i]-'a'<<" ";
    }
    cout<<endl<<"d"<< d<<endl;
    string emsg=enc(msg,e,n);
    cout<<emsg<<endl;
    string dmsg=dec(emsg,d,n);
     cout<<dmsg<<endl;

    return 0;
}