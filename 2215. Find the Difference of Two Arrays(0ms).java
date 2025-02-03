class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return new java.util.AbstractList<List<Integer>>() {
			List<Integer> list1;
			List<Integer> list2;

            @Override
			public int size() {
				return 2;
			}

            @Override
			public List<Integer> get(int index) {
				if (list1 == null || list2 == null) {
					process();
				}
				return index == 0 ? list1 : list2;
			}

            private void process() {
                HashSet<Integer> s1 = Arrays.stream(nums1)
                    .boxed()
                    .collect(Collectors.toCollection(HashSet::new));
                HashSet<Integer> s2 = Arrays.stream(nums2)
                    .boxed()
                    .collect(Collectors.toCollection(HashSet::new));
                list1 = new ArrayList<>();
                list2 = new ArrayList<>();

                for (var i : s1) {
                    if (!s2.contains(i)) {
                        list1.add(i);
                    }
                }
                for (var i : s2) {
                    if (!s1.contains(i)) {
                        list2.add(i);
                    }
                }
            }
        };
    }
}
