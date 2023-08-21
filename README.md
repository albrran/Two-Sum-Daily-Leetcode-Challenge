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
<p>Since we're given the target, we can go through the given nums and subtract target - nums which will give us a number in which we can then look through the hashmap to see if it exists. Imagine that we have different sizes of rulers and we have a target ruler of 12 cm. We want to find two rulers that have lengths that add up to 12cm, so we go through our given rulers subtracting their length from our target length and then checking if the resulting length exists within the rulers we have</p>
          
![twosumgif2](https://github.com/albrran/Two-Sum-Daily-Leetcode-Challenge/assets/120284166/ea2079d4-3af2-4243-9531-9ebf5c9d399a)

<h3>Lets break it down into steps</h3>
<ol>
    <li>Initialize HashMap</li>
    <li>Iterate through the given array, declaring two integers: one to keep track of the current position and one to store the target - current value in which we will look for</li>
    <li>We have the difference, so now we want to peer into our populated hashmap to see if our difference exists, if it does, we want to initialize and return a new array containing the indexes of the values within the nums array that add up to our target</li>
  <li>As a default, populate the hashmap</li>
</ol>
<p>Time Complexity: O(n). We're using a hashmap which is O(1) and a for loop which is O(n) resulting in O(n) linear time</p>
<p>Space Complexity: O(n), where n is the number of elements in the nums array.</p>

<h1>Solution 2: Nested for loop</h1>
<p>Imagine you have a shopping list with the prices of various items, and you want to find two items from the list that add up to a specific total budget. The list is represented as an array of prices, and your task is to find the indices of two items in the array whose prices sum up to your budget.</p>

![twosumgif1](https://github.com/albrran/Two-Sum-Daily-Leetcode-Challenge/assets/120284166/b5a0e8b8-5f35-4447-94d9-b17d482fd713)
    <h2>Code Explanation:</h2>
    <p>Suppose you have the following shopping list with item prices:</p>
    <pre><code>
        int[] prices = {20, 30, 40, 50, 60};
        int budget = 90;
    </code></pre>
    <p>You want to find two items from this list whose prices add up to your budget, which is $90.</p>
    <p>The outer loop (indexed by <code>i</code>) goes through the items one by one in the list.</p>
    <p>The inner loop (indexed by <code>j</code>) starts from the item after the current <code>i</code>-th item to avoid choosing the same item twice.</p>
    <p>It checks whether the sum of prices at indices <code>i</code> and <code>j</code> is equal to your budget. If it is, it creates an array <code>array</code> containing <code>i</code> and <code>j</code> and returns this array as the result. In this example, it finds that <code>prices[0] + prices[3]</code> equals 90 (20 + 50), so it returns <code>{0, 3}</code>.</p>
    <p>If it doesn't find a pair of items whose prices add up to your budget within the nested loops, it returns a default array <code>{0, 4}</code> (in your code, <code>pepe</code> is set to <code>{0, 4}</code>).</p>
    <p>So, in this real-world example, for the shopping list <code>{20, 30, 40, 50, 60}</code> and a budget of $90, the function will return <code>{0, 3}</code> because items at indices 0 and 3 (20 and 50) add up to the budget of $90.</p>
    <p>Time Complexity: O(n^2). We're using a nested for loop</p>
<p>Space Complexity: O(n), where n is the number of elements in the nums array.</p>
