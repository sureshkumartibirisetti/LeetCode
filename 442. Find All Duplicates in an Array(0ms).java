class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        return new CustomList(nums);
    }
    class CustomList extends ArrayList<Integer> {
        int nums[];
        CustomList(int[] nums) {
            this.nums = nums;
        }
        public int size() {
            customListMethod();
            return super.size();
        }
        public void customListMethod() {
            int size = nums.length;
            int[] temp = new int[size+1];
            for (int i : nums) {
                temp[i-1]++;
            }

            for (int i = 0; i < size; i++) {
                if (temp[i] == 2) {
                    super.add(new Integer(i+1));
                }
            }
        }
        
    }
}
