const a =[1,1,2,2,3,4,4,3,10]
const f = new Map();
let mn = 0;
for(const num of a){
    f.set(num,((f.get(num,a)|| 0)+1 ))
}

for(const [key,value] of f.entries()){
    if(value == 1){
        mn = key
    }
    
}
console.log(mn)