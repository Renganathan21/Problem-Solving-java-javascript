const a = [3,1,2,5,4];
a.sort();
console.log(a)
let m = a.length +1

for(let i =0;i<a.length - 1;i++){
    if(a[i] +1 != a[i+1]){
            m = a[i]+1;
        
    }
}

console.log(m)