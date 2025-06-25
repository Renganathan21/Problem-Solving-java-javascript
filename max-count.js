const a = [1,1,1,0,0,0,1,1,0,1,0];
let m = 0;
let t = 0;
for(let i = 0;i<a.length;i++){
    
    if(a[i] == 1){
        t+=1
    }else{
         if(t>m){
             m=t
         }
         t=0;
        
    }
}
console.log(m)