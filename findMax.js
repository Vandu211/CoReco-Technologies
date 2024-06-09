let arr=[-1, 3, 5, 6, 99, 12, 2];
let arr1=[6,7,8];

let n=arr.length;
console.log("The largest number is",Large(arr,n,0));
console.log("The largest number is",Large(arr1,arr1.length,0));



function Large(arr,n,i)
{
  if(i==n-1)
    {
        return arr[i];
    }

    let max=Large(arr,n,i+1);

    return Math.max(max,arr[i]);

}
