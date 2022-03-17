/**
 * @param {number[]} nums
 * @param {number[]} index
 * @return {number[]}
 */

    const createTargetArray = (nums, idx) => {
    let target = []
    for(const i in nums)target.splice(idx[i], 0, nums[i])
    return target
};
