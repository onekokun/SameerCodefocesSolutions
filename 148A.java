#include <iostream>

using namespace std;

int main()
{
    int k,l,m,n,d,freq=0;
    cin>>k>>l>>m>>n>>d;

    int arr[d];
    for(int i=0;i<d;++i)
        arr[i]=i+1;

    for(int j=0;j<d;++j)
        if(arr[j]%k==0 || arr[j]%l==0 || arr[j]%m==0 || arr[j]%n==0)
            arr[j]=-1;

    for(int x: arr)
        if(x==-1)
        freq++;

    cout<<freq<<endl;
    return 0;
}
