const a = "renga";
let s = a.split('');
console.log(s);
const n = s.length-1
for(let i =0; i<=n/2;i++){
    
    let temp = s[i];
    s[i] = s[n-i];
    s[n-i]=temp;
    
}

console.log(s)