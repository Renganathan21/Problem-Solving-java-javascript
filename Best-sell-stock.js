let min = a[0];
let maxp = 0;
for(let i =1;i<a.length;i++){
   if(a[i] - min > maxp){
       maxp = a[i] - min
   }
   if(a[i] < min){
       min = a[i];
   }
   
   
   

}

 console.log(min,maxp)