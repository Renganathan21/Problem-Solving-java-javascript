class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        const count = new Map();
        let l = 0;
        let mf = 0;
        let res = 0;
        for(let i =0;i<s.length;i++){
            count.set(s[i],(count.get(s[i]) || 0 ) + 1);
            mf = Math.max(mf,count.get(s[i]))
            while((i-l+1) - mf > k){
                count.set(s[l],count.get(s[l]) - 1);
                l++;
            }
            res = Math.max(res,i-l+1);

        }
        return res;

    }
}
