let a = [1,2,3]
const b = [2,3,4,5]

let acopy = a.slice(0,a.length);
console.log(acopy);
const m = a.length;
const n = b.length;
let p1 =0;
let p2 =0;

for(let i=0;i<m+n;i++){
    if( p2>=n || (p1<m && acopy[p1]<b[p2])){
        a[i] = acopy[p1];
        p1++;
    }else{
        a[i] = b[p2];
        p2++
        
    }
    
}
console.log(a);
