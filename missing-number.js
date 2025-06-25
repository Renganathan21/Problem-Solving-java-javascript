const a = [3,1,2,5,4];
a.sort();
console.log(a)
let m = a.length +1

for(let i =0;i<a.length - 1;i++){
    if(a[i] +1 != a[i+1]){
            m = a[i]+1;
        
    }
}

console.log(m);


const a1 = [3,1,2,5,0];
const n = a1.length;
const s = (n*(n+1))/2;
const ms = a1.reduce((acc,num) => acc+num,0);

console.log(s-ms);