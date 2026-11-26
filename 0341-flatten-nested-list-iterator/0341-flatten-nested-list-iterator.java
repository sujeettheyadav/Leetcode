
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation.
 * interface NestedInteger {
 *     public boolean isInteger();
 *     public Integer getInteger();
 *     public List<NestedInteger> getList();
 * }
 */

public class NestedIterator implements Iterator<Integer> {

    Stack<NestedInteger> st = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            st.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return st.pop().getInteger();
    }

    @Override
    public boolean hasNext() {

        while (!st.isEmpty()) {

            NestedInteger curr = st.peek();

            if (curr.isInteger()) {
                return true;
            }

            st.pop();

            List<NestedInteger> list = curr.getList();

            for (int i = list.size() - 1; i >= 0; i--) {
                st.push(list.get(i));
            }
        }

        return false;
    }
}
