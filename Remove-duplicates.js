let nums = [1,2,2,2,3,4,4,4,5,6,6];
let x =0;

for(let i = 0 ; i<=nums.length; i++ ){
    if(nums[x]<nums[i]){
        x = x+1;
        nums[x] = nums[i]
    }
}

console.log(nums);
console.log(x)