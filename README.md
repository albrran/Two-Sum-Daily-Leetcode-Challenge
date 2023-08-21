# Two-Sum-Daily-Leetcode-Challenge
![1_OathM0PWiIfPfFuJ3wv87A](https://github.com/albrran/Valid-Anagram-Daily-Leetcode-Challenge/assets/120284166/4d831238-d99d-4762-93b5-6311438f469d)
<br>
<h2>Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.  You may assume that each input would have exactly one solution, and you may not use the same element twice.  You can return the answer in any order.</h2>

  <h2>Example 1:</h2>
    <p>Input: nums = [2,7,11,15], target = 9</p>
    <p>Output: [0,1]</p>
    <p>Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].</p>
    <h2>Example 2:</h2>
    <p>Input: nums = [3,2,4], target = 6</p>
    <p>Output: [1,2]</p>
    <h2>Example 3:</h2>
    <p>Input: nums = [3,3], target = 6</p>
    <p>Output: [0,1]</p>
    <h2>Constraints:</h2>
    <ul>
        <li>2 <= nums.length <= 104</li>
        <li>-109 <= nums[i] <= 109</li>
        <li>-109 <= target <= 109</li>
        <li>Only one valid answer exists.</li>
    </ul>
<h1>Solution 1: HashMap</h1>
<p>Since we're given the target, we can go through the given nums and subtract target - nums which will give us a number in which we can then look through the hashmap to see if it exists. Imagine that we have different sizes of rulers and we have a target ruler of 12 cm. We want to find two rulers that have lengths that add up to 12cm, so we go through our given rulers subtracting its length from our target length and then checking if the resulting length exists within the rulers we have</p>
