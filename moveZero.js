const a = [5,0,0,2,3];
let x = 0;
let y =0;
let t = 0
for(let i =0 ; i<a.length;i++){
    // console.log(y,x)
    
    if(a[y] !=0 ){
        
        a[x] = a[y];
        x++;
        
    }else{
        console.log(a[y])
        
    }
    
    y++;
    // console.log(x,y)
}
console.log(a.fill(0,x,a.length));