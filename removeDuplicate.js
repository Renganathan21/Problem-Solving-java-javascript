let nums = [3,3,3,2,2,4,5];
const val = 4;
let x = 0;
for(let i =0; i<nums.length; i++ ){
    if(nums[i] !== val){
        nums[x] = nums[i];
        x++;
    }
}

console.log(nums);